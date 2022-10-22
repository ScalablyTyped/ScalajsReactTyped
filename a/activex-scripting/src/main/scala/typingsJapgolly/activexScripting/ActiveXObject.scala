package typingsJapgolly.activexScripting

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexScripting.Scripting.Dictionary
import typingsJapgolly.activexScripting.activexScriptingStrings.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObject extends StObject {
  
  @JSName("set")
  def set_Item[TKey, TValue](
    obj: Dictionary[TKey, TValue],
    propertyName: Item,
    parameterTypes: js.Array[TKey],
    newValue: TValue
  ): Unit
}
object ActiveXObject {
  
  inline def apply(set: (Dictionary[Any, Any], Item, js.Array[Any], Any) => Callback): ActiveXObject = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction4((t0: Dictionary[Any, Any], t1: Item, t2: js.Array[Any], t3: Any) => (set(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[ActiveXObject]
  }
  
  extension [Self <: ActiveXObject](x: Self) {
    
    inline def setSet(value: (Dictionary[Any, Any], Item, js.Array[Any], Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction4((t0: Dictionary[Any, Any], t1: Item, t2: js.Array[Any], t3: Any) => (value(t0, t1, t2, t3)).runNow()))
  }
}
