package typingsJapgolly.ejWebAll.ej

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableModel extends StObject {
  
  def bindTo(element: Any): Unit
  
  def get(index: Double): Unit
  
  def getChanges(): Changes
  
  def insert(json: Any): Unit
  
  def isDirty(): Boolean
  
  def length(): Double
  
  def off(eventName: String, handler: Any): Unit
  
  def on(eventName: String, handler: Any): Unit
  
  def rejectChanges(): Unit
  
  def remove(key: String): Unit
  
  def saveChanges(): Unit
  
  def setDataManager(dataManager: DataManager): Unit
  
  def setDirty(dirty: Any, model: Any): Unit
  
  def toArray(): js.Array[Any]
  
  def update(value: Any): Unit
}
object TableModel {
  
  inline def apply(
    bindTo: Any => Callback,
    get: Double => Callback,
    getChanges: CallbackTo[Changes],
    insert: Any => Callback,
    isDirty: CallbackTo[Boolean],
    length: CallbackTo[Double],
    off: (String, Any) => Callback,
    on: (String, Any) => Callback,
    rejectChanges: Callback,
    remove: String => Callback,
    saveChanges: Callback,
    setDataManager: DataManager => Callback,
    setDirty: (Any, Any) => Callback,
    toArray: CallbackTo[js.Array[Any]],
    update: Any => Callback
  ): TableModel = {
    val __obj = js.Dynamic.literal(bindTo = js.Any.fromFunction1((t0: Any) => bindTo(t0).runNow()), get = js.Any.fromFunction1((t0: Double) => get(t0).runNow()), getChanges = getChanges.toJsFn, insert = js.Any.fromFunction1((t0: Any) => insert(t0).runNow()), isDirty = isDirty.toJsFn, length = length.toJsFn, off = js.Any.fromFunction2((t0: String, t1: Any) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: Any) => (on(t0, t1)).runNow()), rejectChanges = rejectChanges.toJsFn, remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), saveChanges = saveChanges.toJsFn, setDataManager = js.Any.fromFunction1((t0: DataManager) => setDataManager(t0).runNow()), setDirty = js.Any.fromFunction2((t0: Any, t1: Any) => (setDirty(t0, t1)).runNow()), toArray = toArray.toJsFn, update = js.Any.fromFunction1((t0: Any) => update(t0).runNow()))
    __obj.asInstanceOf[TableModel]
  }
  
  extension [Self <: TableModel](x: Self) {
    
    inline def setBindTo(value: Any => Callback): Self = StObject.set(x, "bindTo", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGet(value: Double => Callback): Self = StObject.set(x, "get", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setGetChanges(value: CallbackTo[Changes]): Self = StObject.set(x, "getChanges", value.toJsFn)
    
    inline def setInsert(value: Any => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setIsDirty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirty", value.toJsFn)
    
    inline def setLength(value: CallbackTo[Double]): Self = StObject.set(x, "length", value.toJsFn)
    
    inline def setOff(value: (String, Any) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setOn(value: (String, Any) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setRejectChanges(value: Callback): Self = StObject.set(x, "rejectChanges", value.toJsFn)
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSaveChanges(value: Callback): Self = StObject.set(x, "saveChanges", value.toJsFn)
    
    inline def setSetDataManager(value: DataManager => Callback): Self = StObject.set(x, "setDataManager", js.Any.fromFunction1((t0: DataManager) => value(t0).runNow()))
    
    inline def setSetDirty(value: (Any, Any) => Callback): Self = StObject.set(x, "setDirty", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setToArray(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "toArray", value.toJsFn)
    
    inline def setUpdate(value: Any => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
