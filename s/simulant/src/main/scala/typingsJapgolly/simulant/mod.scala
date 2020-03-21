package typingsJapgolly.simulant

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import typingsJapgolly.std.Event_
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simulant", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(eventName: String): Event_ = js.native
  def apply(eventName: String, payload: StringDictionary[js.Any]): Event_ = js.native
  def apply(window: Window_, eventName: String): Event_ = js.native
  def apply(window: Window_, eventName: String, payload: StringDictionary[js.Any]): Event_ = js.native
  def fire(el: Node, e: String): Unit = js.native
  def fire(el: Node, e: String, payload: StringDictionary[js.Any]): Unit = js.native
  def fire(el: Node, e: Event_): Unit = js.native
}

