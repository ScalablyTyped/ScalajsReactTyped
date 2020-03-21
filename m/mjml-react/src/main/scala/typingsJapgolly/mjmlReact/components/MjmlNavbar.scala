package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.ColorProperty
import typingsJapgolly.mjmlReact.mjmlReactStrings.hamburger
import typingsJapgolly.mjmlReact.mod.MjmlNavbarProps
import typingsJapgolly.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlNavbar {
  def apply(
    align: String = null,
    baseUrl: String = null,
    hamburger: hamburger = null,
    icoAlign: String = null,
    icoClose: String = null,
    icoColor: ColorProperty = null,
    icoFontSize: String = null,
    icoLineHeight: String = null,
    icoOpen: String = null,
    icoPadding: String = null,
    icoPaddingBottom: String = null,
    icoPaddingLeft: String = null,
    icoPaddingRight: String = null,
    icoPaddingTop: String = null,
    icoTextDecoration: String = null,
    icoTextTransform: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MjmlNavbarProps with RequiredChildrenProps, 
    typingsJapgolly.mjmlReact.mod.MjmlNavbar, 
    Unit, 
    MjmlNavbarProps with RequiredChildrenProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (hamburger != null) __obj.updateDynamic("hamburger")(hamburger.asInstanceOf[js.Any])
    if (icoAlign != null) __obj.updateDynamic("icoAlign")(icoAlign.asInstanceOf[js.Any])
    if (icoClose != null) __obj.updateDynamic("icoClose")(icoClose.asInstanceOf[js.Any])
    if (icoColor != null) __obj.updateDynamic("icoColor")(icoColor.asInstanceOf[js.Any])
    if (icoFontSize != null) __obj.updateDynamic("icoFontSize")(icoFontSize.asInstanceOf[js.Any])
    if (icoLineHeight != null) __obj.updateDynamic("icoLineHeight")(icoLineHeight.asInstanceOf[js.Any])
    if (icoOpen != null) __obj.updateDynamic("icoOpen")(icoOpen.asInstanceOf[js.Any])
    if (icoPadding != null) __obj.updateDynamic("icoPadding")(icoPadding.asInstanceOf[js.Any])
    if (icoPaddingBottom != null) __obj.updateDynamic("icoPaddingBottom")(icoPaddingBottom.asInstanceOf[js.Any])
    if (icoPaddingLeft != null) __obj.updateDynamic("icoPaddingLeft")(icoPaddingLeft.asInstanceOf[js.Any])
    if (icoPaddingRight != null) __obj.updateDynamic("icoPaddingRight")(icoPaddingRight.asInstanceOf[js.Any])
    if (icoPaddingTop != null) __obj.updateDynamic("icoPaddingTop")(icoPaddingTop.asInstanceOf[js.Any])
    if (icoTextDecoration != null) __obj.updateDynamic("icoTextDecoration")(icoTextDecoration.asInstanceOf[js.Any])
    if (icoTextTransform != null) __obj.updateDynamic("icoTextTransform")(icoTextTransform.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.mod.MjmlNavbarProps with typingsJapgolly.mjmlReact.mod.RequiredChildrenProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.mod.MjmlNavbar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.mod.MjmlNavbarProps with typingsJapgolly.mjmlReact.mod.RequiredChildrenProps])(children: _*)
  }
  @JSImport("mjml-react", "MjmlNavbar")
  @js.native
  object componentImport extends js.Object
  
}

