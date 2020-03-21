package typingsJapgolly.meteor.meteorMod.Meteor

import typingsJapgolly.meteor.Blaze.TemplateInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventHandlerFunction
  extends js.Function {
  def apply(): Unit = js.native
  def apply(event: Event): Unit = js.native
  def apply(event: Event, templateInstance: TemplateInstance): Unit = js.native
}

