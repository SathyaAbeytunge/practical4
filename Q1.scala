object Q1{
    var itemNames: Array[String] = Array("apple","orange","banana")
    var itemQuantity: Array[Int] = Array(20,15,30)

    def displayInventory(): Unit = {
        println("Inventory")
        for(i <- itemNames.indices ){
            println(s"${itemNames(i)} : ${itemQuantity(i)}" )
        }
    }

    def restockItem(itemName: String, quantity:Int): Unit ={
        val index = itemNames.indexOf(itemName)
        if(index>=0)
        {
            itemQuantity(index)+= quantity
            println(s"$quantity $itemName(s) restocked. New quantity:${itemQuantity(index)}")
        }
        else
        {
                println(s"Item '$itemName' not found in inventory.")
        }
    }

    def sellItem(itemName: String, quantity:Int): Unit ={
        val index = itemNames.indexOf(itemName)
        if(index>=0)
        {
            if(itemQuantity(index)-quantity>=0)
            {
                itemQuantity(index)-= quantity
                println(s"$quantity $itemName(s) sold. New quantity:${itemQuantity(index)}")
            }
            else
            {
                println(s"No enough stock.")
            }    
        }
        else
        {
                println(s"Item '$itemName' not found in inventory.")
        }
    }

    def main (args : Array[String]): Unit={
            displayInventory()
            restockItem("apple",5)
            sellItem("banana",10)
            sellItem("orange",20)
    }
    
}