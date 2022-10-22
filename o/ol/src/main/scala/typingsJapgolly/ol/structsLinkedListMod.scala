package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structsLinkedListMod {
  
  @JSImport("ol/structs/LinkedList", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with LinkedList {
    def this(opt_circular: Boolean) = this()
    
    /**
      * Concatenates two lists.
      */
    /* CompleteClass */
    override def concat(list: LinkedList): Unit = js.native
    
    /**
      * Sets the cursor to the first item, and returns the associated data.
      */
    /* CompleteClass */
    override def firstItem(): Any = js.native
    
    /**
      * Returns the current item's data.
      */
    /* CompleteClass */
    override def getCurrItem(): Any = js.native
    
    /**
      * Returns the current length of the list.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      * Returns the next item's data without moving the cursor.
      */
    /* CompleteClass */
    override def getNextItem(): Any = js.native
    
    /**
      * Returns the previous item's data without moving the cursor.
      */
    /* CompleteClass */
    override def getPrevItem(): Any = js.native
    
    /**
      * Inserts an item into the linked list right after the current one.
      */
    /* CompleteClass */
    override def insertItem(data: Any): Unit = js.native
    
    /**
      * Sets the cursor to the last item, and returns the associated data.
      */
    /* CompleteClass */
    override def lastItem(): Any = js.native
    
    /**
      * Sets the cursor to the next item, and returns the associated data.
      */
    /* CompleteClass */
    override def nextItem(): Any = js.native
    
    /**
      * Sets the cursor to the previous item, and returns the associated data.
      */
    /* CompleteClass */
    override def prevItem(): Any = js.native
    
    /**
      * Removes the current item from the list. Sets the cursor to the next item,
      * if possible.
      */
    /* CompleteClass */
    override def removeItem(): Unit = js.native
    
    /**
      * Sets the first item of the list. This only works for circular lists, and sets
      * the last item accordingly.
      */
    /* CompleteClass */
    override def setFirstItem(): Unit = js.native
  }
  
  trait Item extends StObject {
    
    var data: Any
    
    var next: js.UndefOr[Item] = js.undefined
    
    var prev: js.UndefOr[Item] = js.undefined
  }
  object Item {
    
    inline def apply(data: Any): Item = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setNext(value: Item): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrev(value: Item): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    }
  }
  
  trait LinkedList extends StObject {
    
    /**
      * Concatenates two lists.
      */
    def concat(list: LinkedList): Unit
    
    /**
      * Sets the cursor to the first item, and returns the associated data.
      */
    def firstItem(): Any
    
    /**
      * Returns the current item's data.
      */
    def getCurrItem(): Any
    
    /**
      * Returns the current length of the list.
      */
    def getLength(): Double
    
    /**
      * Returns the next item's data without moving the cursor.
      */
    def getNextItem(): Any
    
    /**
      * Returns the previous item's data without moving the cursor.
      */
    def getPrevItem(): Any
    
    /**
      * Inserts an item into the linked list right after the current one.
      */
    def insertItem(data: Any): Unit
    
    /**
      * Sets the cursor to the last item, and returns the associated data.
      */
    def lastItem(): Any
    
    /**
      * Sets the cursor to the next item, and returns the associated data.
      */
    def nextItem(): Any
    
    /**
      * Sets the cursor to the previous item, and returns the associated data.
      */
    def prevItem(): Any
    
    /**
      * Removes the current item from the list. Sets the cursor to the next item,
      * if possible.
      */
    def removeItem(): Unit
    
    /**
      * Sets the first item of the list. This only works for circular lists, and sets
      * the last item accordingly.
      */
    def setFirstItem(): Unit
  }
  object LinkedList {
    
    inline def apply(
      concat: LinkedList => Callback,
      firstItem: CallbackTo[Any],
      getCurrItem: CallbackTo[Any],
      getLength: CallbackTo[Double],
      getNextItem: CallbackTo[Any],
      getPrevItem: CallbackTo[Any],
      insertItem: Any => Callback,
      lastItem: CallbackTo[Any],
      nextItem: CallbackTo[Any],
      prevItem: CallbackTo[Any],
      removeItem: Callback,
      setFirstItem: Callback
    ): LinkedList = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1((t0: LinkedList) => concat(t0).runNow()), firstItem = firstItem.toJsFn, getCurrItem = getCurrItem.toJsFn, getLength = getLength.toJsFn, getNextItem = getNextItem.toJsFn, getPrevItem = getPrevItem.toJsFn, insertItem = js.Any.fromFunction1((t0: Any) => insertItem(t0).runNow()), lastItem = lastItem.toJsFn, nextItem = nextItem.toJsFn, prevItem = prevItem.toJsFn, removeItem = removeItem.toJsFn, setFirstItem = setFirstItem.toJsFn)
      __obj.asInstanceOf[LinkedList]
    }
    
    extension [Self <: LinkedList](x: Self) {
      
      inline def setConcat(value: LinkedList => Callback): Self = StObject.set(x, "concat", js.Any.fromFunction1((t0: LinkedList) => value(t0).runNow()))
      
      inline def setFirstItem(value: CallbackTo[Any]): Self = StObject.set(x, "firstItem", value.toJsFn)
      
      inline def setGetCurrItem(value: CallbackTo[Any]): Self = StObject.set(x, "getCurrItem", value.toJsFn)
      
      inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
      
      inline def setGetNextItem(value: CallbackTo[Any]): Self = StObject.set(x, "getNextItem", value.toJsFn)
      
      inline def setGetPrevItem(value: CallbackTo[Any]): Self = StObject.set(x, "getPrevItem", value.toJsFn)
      
      inline def setInsertItem(value: Any => Callback): Self = StObject.set(x, "insertItem", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setLastItem(value: CallbackTo[Any]): Self = StObject.set(x, "lastItem", value.toJsFn)
      
      inline def setNextItem(value: CallbackTo[Any]): Self = StObject.set(x, "nextItem", value.toJsFn)
      
      inline def setPrevItem(value: CallbackTo[Any]): Self = StObject.set(x, "prevItem", value.toJsFn)
      
      inline def setRemoveItem(value: Callback): Self = StObject.set(x, "removeItem", value.toJsFn)
      
      inline def setSetFirstItem(value: Callback): Self = StObject.set(x, "setFirstItem", value.toJsFn)
    }
  }
}
