package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactBootstrap.clearfixMod.ClearfixProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Clearfix {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.clearfixMod.Clearfix] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.clearfixMod.Clearfix] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null,
    visibleLgBlock: js.UndefOr[Boolean] = js.undefined,
    visibleMdBlock: js.UndefOr[Boolean] = js.undefined,
    visibleSmBlock: js.UndefOr[Boolean] = js.undefined,
    visibleXsBlock: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ClearfixProps, typingsJapgolly.reactBootstrap.mod.Clearfix, Unit, ClearfixProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleLgBlock)) __obj.updateDynamic("visibleLgBlock")(visibleLgBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleMdBlock)) __obj.updateDynamic("visibleMdBlock")(visibleMdBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleSmBlock)) __obj.updateDynamic("visibleSmBlock")(visibleSmBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleXsBlock)) __obj.updateDynamic("visibleXsBlock")(visibleXsBlock.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.clearfixMod.ClearfixProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.Clearfix](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.clearfixMod.ClearfixProps])(children: _*)
  }
  @JSImport("react-bootstrap", "Clearfix")
  @js.native
  object componentImport extends js.Object
  
}

