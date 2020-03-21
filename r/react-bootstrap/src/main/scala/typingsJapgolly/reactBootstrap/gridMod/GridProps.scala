package typingsJapgolly.reactBootstrap.gridMod

import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends AllHTMLAttributes[Grid]
     with ClassAttributes[Grid] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  var fluid: js.UndefOr[Boolean] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Grid] = null,
    ClassAttributes: ClassAttributes[Grid] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null,
    fluid: js.UndefOr[Boolean] = js.undefined
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
}

