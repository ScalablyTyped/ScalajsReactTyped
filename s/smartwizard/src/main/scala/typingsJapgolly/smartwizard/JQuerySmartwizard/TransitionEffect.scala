package typingsJapgolly.smartwizard.JQuerySmartwizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.smartwizard.smartwizardStrings.none
  - typingsJapgolly.smartwizard.smartwizardStrings.slide
  - typingsJapgolly.smartwizard.smartwizardStrings.fade
*/
trait TransitionEffect extends js.Object

object TransitionEffect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fade: typingsJapgolly.smartwizard.smartwizardStrings.fade = this.cast("fade")
  @scala.inline
  def none: typingsJapgolly.smartwizard.smartwizardStrings.none = this.cast("none")
  @scala.inline
  def slide: typingsJapgolly.smartwizard.smartwizardStrings.slide = this.cast("slide")
}

