package typingsJapgolly.reactMdl.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactMdl.mod.CellProps
import typingsJapgolly.reactMdl.mod.CustomRenderedComponent
import typingsJapgolly.reactMdl.mod.ShadowedComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cell {
  def apply(
    col: Double,
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    CustomRenderedComponent: CustomRenderedComponent = null,
    ShadowedComponent: ShadowedComponent = null,
    align: String = null,
    hideDesktop: js.UndefOr[Boolean] = js.undefined,
    hidePhone: js.UndefOr[Boolean] = js.undefined,
    hideTablet: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    offsetDesktop: Int | Double = null,
    offsetPhone: Int | Double = null,
    offsetTablet: Int | Double = null,
    phone: Int | Double = null,
    tablet: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CellProps, typingsJapgolly.reactMdl.mod.Cell, Unit, CellProps] = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any])
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (CustomRenderedComponent != null) js.Dynamic.global.Object.assign(__obj, CustomRenderedComponent)
    if (ShadowedComponent != null) js.Dynamic.global.Object.assign(__obj, ShadowedComponent)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDesktop)) __obj.updateDynamic("hideDesktop")(hideDesktop.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePhone)) __obj.updateDynamic("hidePhone")(hidePhone.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTablet)) __obj.updateDynamic("hideTablet")(hideTablet.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (offsetDesktop != null) __obj.updateDynamic("offsetDesktop")(offsetDesktop.asInstanceOf[js.Any])
    if (offsetPhone != null) __obj.updateDynamic("offsetPhone")(offsetPhone.asInstanceOf[js.Any])
    if (offsetTablet != null) __obj.updateDynamic("offsetTablet")(offsetTablet.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (tablet != null) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMdl.mod.CellProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMdl.mod.Cell](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMdl.mod.CellProps])(children: _*)
  }
  @JSImport("react-mdl", "Cell")
  @js.native
  object componentImport extends js.Object
  
}

