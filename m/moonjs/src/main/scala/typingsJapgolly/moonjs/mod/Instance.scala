package typingsJapgolly.moonjs.mod

import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance[Data] extends js.Object {
  @JSName("$data")
  var $data: Data = js.native
  def build(): Unit = js.native
  def callMethod[K /* <: String */](methodName: K): js.Any = js.native
  def callMethod[K /* <: String */](methodName: K, params: js.Array[_]): js.Any = js.native
  def destroy(): Unit = js.native
  def emit(eventName: String): Unit = js.native
  def emit(eventName: String, data: js.Any): Unit = js.native
  def get[K /* <: String */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: Data[K] */ js.Any = js.native
  def mount(selector: String): Unit = js.native
  def off(): Unit = js.native
  def off(eventName: String): Unit = js.native
  def off(eventName: String, listener: js.Function1[/* event */ Event_, Unit]): Unit = js.native
  def on(eventName: String, listener: js.Function1[/* event */ Event_, Unit]): Unit = js.native
  def set[K /* <: String */](
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: Data[K] */ js.Any
  ): Unit = js.native
}

