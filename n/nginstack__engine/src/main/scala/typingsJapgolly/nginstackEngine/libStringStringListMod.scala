package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStringStringListMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/string/StringList", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with StringList {
    
    /* CompleteClass */
    override def add(string: Any): Unit = js.native
    
    /* CompleteClass */
    override def addObject(string: Any, `object`: Any): Unit = js.native
    
    /* CompleteClass */
    override def addStringList(stringList: Any): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var count: Any = js.native
    
    /* CompleteClass */
    override def deleteItem(index: Any): Unit = js.native
    
    /* CompleteClass */
    var duplicates: Any = js.native
    
    /* CompleteClass */
    var elements: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def exchange(index1: Any, index2: Any): Unit = js.native
    
    /* CompleteClass */
    override def find(string: Any): js.Array[Double | Boolean] = js.native
    
    /* CompleteClass */
    override def findObjectsByString(string: Any): Any = js.native
    
    /* CompleteClass */
    override def getAllObjects(): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def getText(separator: Any): String = js.native
    
    /* CompleteClass */
    override def indexOf(string: Any): Double = js.native
    
    /* CompleteClass */
    override def indexOfObject(`object`: Any): Double = js.native
    
    /* CompleteClass */
    override def insert(index: Any, string: Any): Unit = js.native
    
    /* CompleteClass */
    override def insertObject(index: Any, string: Any, `object`: Any): Unit = js.native
    
    /* CompleteClass */
    override def objects(index: Any): Any = js.native
    
    /* CompleteClass */
    override def setObject(index: Any, `object`: Any): Unit = js.native
    
    /* CompleteClass */
    override def setString(index: Any, string: Any): Unit = js.native
    
    /* CompleteClass */
    override def sort(compareFunction: Any): Unit = js.native
    
    /* CompleteClass */
    var sorted: Boolean = js.native
    
    /* CompleteClass */
    override def strings(index: Any): Any = js.native
  }
  @JSImport("@nginstack/engine/lib/string/StringList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait StringList extends StObject {
    
    def add(string: Any): Unit
    
    def addObject(string: Any, `object`: Any): Unit
    
    def addStringList(stringList: Any): Unit
    
    def clear(): Unit
    
    var count: Any
    
    def deleteItem(index: Any): Unit
    
    var duplicates: Any
    
    var elements: js.Array[Any]
    
    def exchange(index1: Any, index2: Any): Unit
    
    def find(string: Any): js.Array[Double | Boolean]
    
    def findObjectsByString(string: Any): Any
    
    def getAllObjects(): js.Array[Any]
    
    def getText(separator: Any): String
    
    def indexOf(string: Any): Double
    
    def indexOfObject(`object`: Any): Double
    
    def insert(index: Any, string: Any): Unit
    
    def insertObject(index: Any, string: Any, `object`: Any): Unit
    
    def objects(index: Any): Any
    
    def setObject(index: Any, `object`: Any): Unit
    
    def setString(index: Any, string: Any): Unit
    
    def sort(compareFunction: Any): Unit
    
    var sorted: Boolean
    
    def strings(index: Any): Any
  }
  object StringList {
    
    inline def apply(
      add: Any => Callback,
      addObject: (Any, Any) => Callback,
      addStringList: Any => Callback,
      clear: Callback,
      count: Any,
      deleteItem: Any => Callback,
      duplicates: Any,
      elements: js.Array[Any],
      exchange: (Any, Any) => Callback,
      find: Any => js.Array[Double | Boolean],
      findObjectsByString: Any => Any,
      getAllObjects: CallbackTo[js.Array[Any]],
      getText: Any => String,
      indexOf: Any => Double,
      indexOfObject: Any => Double,
      insert: (Any, Any) => Callback,
      insertObject: (Any, Any, Any) => Callback,
      objects: Any => Any,
      setObject: (Any, Any) => Callback,
      setString: (Any, Any) => Callback,
      sort: Any => Callback,
      sorted: Boolean,
      strings: Any => Any
    ): StringList = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: Any) => add(t0).runNow()), addObject = js.Any.fromFunction2((t0: Any, t1: Any) => (addObject(t0, t1)).runNow()), addStringList = js.Any.fromFunction1((t0: Any) => addStringList(t0).runNow()), clear = clear.toJsFn, count = count.asInstanceOf[js.Any], deleteItem = js.Any.fromFunction1((t0: Any) => deleteItem(t0).runNow()), duplicates = duplicates.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], exchange = js.Any.fromFunction2((t0: Any, t1: Any) => (exchange(t0, t1)).runNow()), find = js.Any.fromFunction1(find), findObjectsByString = js.Any.fromFunction1(findObjectsByString), getAllObjects = getAllObjects.toJsFn, getText = js.Any.fromFunction1(getText), indexOf = js.Any.fromFunction1(indexOf), indexOfObject = js.Any.fromFunction1(indexOfObject), insert = js.Any.fromFunction2((t0: Any, t1: Any) => (insert(t0, t1)).runNow()), insertObject = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (insertObject(t0, t1, t2)).runNow()), objects = js.Any.fromFunction1(objects), setObject = js.Any.fromFunction2((t0: Any, t1: Any) => (setObject(t0, t1)).runNow()), setString = js.Any.fromFunction2((t0: Any, t1: Any) => (setString(t0, t1)).runNow()), sort = js.Any.fromFunction1((t0: Any) => sort(t0).runNow()), sorted = sorted.asInstanceOf[js.Any], strings = js.Any.fromFunction1(strings))
      __obj.asInstanceOf[StringList]
    }
    
    extension [Self <: StringList](x: Self) {
      
      inline def setAdd(value: Any => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setAddObject(value: (Any, Any) => Callback): Self = StObject.set(x, "addObject", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setAddStringList(value: Any => Callback): Self = StObject.set(x, "addStringList", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setCount(value: Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDeleteItem(value: Any => Callback): Self = StObject.set(x, "deleteItem", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setDuplicates(value: Any): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      inline def setElements(value: js.Array[Any]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: Any*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setExchange(value: (Any, Any) => Callback): Self = StObject.set(x, "exchange", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setFind(value: Any => js.Array[Double | Boolean]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindObjectsByString(value: Any => Any): Self = StObject.set(x, "findObjectsByString", js.Any.fromFunction1(value))
      
      inline def setGetAllObjects(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getAllObjects", value.toJsFn)
      
      inline def setGetText(value: Any => String): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
      
      inline def setIndexOf(value: Any => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setIndexOfObject(value: Any => Double): Self = StObject.set(x, "indexOfObject", js.Any.fromFunction1(value))
      
      inline def setInsert(value: (Any, Any) => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setInsertObject(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "insertObject", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setObjects(value: Any => Any): Self = StObject.set(x, "objects", js.Any.fromFunction1(value))
      
      inline def setSetObject(value: (Any, Any) => Callback): Self = StObject.set(x, "setObject", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSetString(value: (Any, Any) => Callback): Self = StObject.set(x, "setString", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSort(value: Any => Callback): Self = StObject.set(x, "sort", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      inline def setStrings(value: Any => Any): Self = StObject.set(x, "strings", js.Any.fromFunction1(value))
    }
  }
}
