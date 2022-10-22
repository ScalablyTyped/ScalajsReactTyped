package typingsJapgolly.activexIwshruntimelibrary

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshEnvironment
import typingsJapgolly.activexIwshruntimelibrary.activexIwshruntimelibraryStrings.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObject extends StObject {
  
  @JSName("set")
  def set_Item(obj: WshEnvironment, propertyName: Item, parameterTypes: js.Array[String], newValue: String): Unit
}
object ActiveXObject {
  
  inline def apply(set: (WshEnvironment, Item, js.Array[String], String) => Callback): ActiveXObject = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction4((t0: WshEnvironment, t1: Item, t2: js.Array[String], t3: String) => (set(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[ActiveXObject]
  }
  
  extension [Self <: ActiveXObject](x: Self) {
    
    inline def setSet(value: (WshEnvironment, Item, js.Array[String], String) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction4((t0: WshEnvironment, t1: Item, t2: js.Array[String], t3: String) => (value(t0, t1, t2, t3)).runNow()))
  }
}
