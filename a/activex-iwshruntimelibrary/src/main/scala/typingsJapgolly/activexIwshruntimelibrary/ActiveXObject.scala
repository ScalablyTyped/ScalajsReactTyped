package typingsJapgolly.activexIwshruntimelibrary

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshEnvironment
import typingsJapgolly.activexIwshruntimelibrary.activexIwshruntimelibraryStrings.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  @JSName("set")
  def set_Item(obj: WshEnvironment, propertyName: Item, parameterTypes: js.Array[String], newValue: String): Unit
}

object ActiveXObject {
  @scala.inline
  def apply(set: (WshEnvironment, Item, js.Array[String], String) => Callback): ActiveXObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction4((t0: typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshEnvironment, t1: typingsJapgolly.activexIwshruntimelibrary.activexIwshruntimelibraryStrings.Item, t2: js.Array[java.lang.String], t3: java.lang.String) => set(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ActiveXObject]
  }
}

