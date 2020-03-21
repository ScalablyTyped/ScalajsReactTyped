package typingsJapgolly.appBuilderLib.pkgOptionsMod

import typingsJapgolly.appBuilderLib.appBuilderLibStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.appBuilderLib.appBuilderLibStrings.tofit
  - typingsJapgolly.appBuilderLib.appBuilderLibStrings.none_
  - typingsJapgolly.appBuilderLib.appBuilderLibStrings.proportional
*/
trait BackgroundScaling extends js.Object

object BackgroundScaling {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def proportional: typingsJapgolly.appBuilderLib.appBuilderLibStrings.proportional = this.cast("proportional")
  @scala.inline
  def tofit: typingsJapgolly.appBuilderLib.appBuilderLibStrings.tofit = this.cast("tofit")
}

