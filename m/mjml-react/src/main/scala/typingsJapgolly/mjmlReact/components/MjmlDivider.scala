package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.BackgroundColorProperty
import typingsJapgolly.csstype.mod.BorderColorProperty
import typingsJapgolly.csstype.mod.BorderStyleProperty
import typingsJapgolly.mjmlReact.mod.ClassNameProps
import typingsJapgolly.mjmlReact.mod.MjmlDividerProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlDivider {
  def apply(
    borderColor: BorderColorProperty = null,
    borderStyle: BorderStyleProperty = null,
    borderWidth: String | Double = null,
    containerBackgroundColor: BackgroundColorProperty = null,
    cssClass: String = null,
    padding: String | Double = null,
    paddingBottom: String | Double = null,
    paddingLeft: String | Double = null,
    paddingRight: String | Double = null,
    paddingTop: String | Double = null,
    width: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MjmlDividerProps with ClassNameProps with PaddingProps, 
    typingsJapgolly.mjmlReact.mod.MjmlDivider, 
    Unit, 
    MjmlDividerProps with ClassNameProps with PaddingProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.mod.MjmlDividerProps with typingsJapgolly.mjmlReact.mod.ClassNameProps with typingsJapgolly.mjmlReact.mod.PaddingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.mod.MjmlDivider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.mod.MjmlDividerProps with typingsJapgolly.mjmlReact.mod.ClassNameProps with typingsJapgolly.mjmlReact.mod.PaddingProps])(children: _*)
  }
  @JSImport("mjml-react", "MjmlDivider")
  @js.native
  object componentImport extends js.Object
  
}

