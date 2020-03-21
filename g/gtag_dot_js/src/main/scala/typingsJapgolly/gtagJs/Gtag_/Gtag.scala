package typingsJapgolly.gtagJs.Gtag_

import typingsJapgolly.gtagJs.gtagJsStrings.config
import typingsJapgolly.gtagJs.gtagJsStrings.event
import typingsJapgolly.gtagJs.gtagJsStrings.js_
import typingsJapgolly.gtagJs.gtagJsStrings.set
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gtag extends js.Object {
  def apply(command: config, targetId: String): Unit = js.native
  def apply(command: config, targetId: String, config: ControlParams): Unit = js.native
  def apply(command: config, targetId: String, config: CustomParams): Unit = js.native
  def apply(command: config, targetId: String, config: EventParams): Unit = js.native
  def apply(command: event, eventName: String): Unit = js.native
  def apply(command: event, eventName: String, eventParams: ControlParams): Unit = js.native
  def apply(command: event, eventName: String, eventParams: CustomParams): Unit = js.native
  def apply(command: event, eventName: String, eventParams: EventParams): Unit = js.native
  def apply(command: event, eventName: EventNames): Unit = js.native
  def apply(command: event, eventName: EventNames, eventParams: ControlParams): Unit = js.native
  def apply(command: event, eventName: EventNames, eventParams: CustomParams): Unit = js.native
  def apply(command: event, eventName: EventNames, eventParams: EventParams): Unit = js.native
  def apply(command: js_, config: Date): Unit = js.native
  def apply(command: set, config: CustomParams): Unit = js.native
}

