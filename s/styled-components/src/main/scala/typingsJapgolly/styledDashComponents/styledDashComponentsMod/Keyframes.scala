package typingsJapgolly.styledDashComponents.styledDashComponentsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyframes extends _InterpolationValue {
  def getName(): String
}

object Keyframes {
  @scala.inline
  def apply(getName: CallbackTo[String]): Keyframes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.asInstanceOf[Keyframes]
  }
}

@JSImport("styled-components", "keyframes")
@js.native
object keyframes extends js.Object {
  def apply(strings: TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes = js.native
  def apply(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes = js.native
}

