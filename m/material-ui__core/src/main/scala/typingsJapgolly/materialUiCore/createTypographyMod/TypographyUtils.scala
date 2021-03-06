package typingsJapgolly.materialUiCore.createTypographyMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypographyUtils extends js.Object {
  def pxToRem(px: Double): String = js.native
}

object TypographyUtils {
  @scala.inline
  def apply(pxToRem: Double => CallbackTo[String]): TypographyUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pxToRem")(js.Any.fromFunction1((t0: scala.Double) => pxToRem(t0).runNow()))
    __obj.asInstanceOf[TypographyUtils]
  }
}

