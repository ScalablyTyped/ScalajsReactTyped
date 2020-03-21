package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.BackgroundColorProperty
import typingsJapgolly.csstype.mod.VerticalAlignProperty
import typingsJapgolly.mjmlReact.mod.BorderProps
import typingsJapgolly.mjmlReact.mod.ClassNameProps
import typingsJapgolly.mjmlReact.mod.MjmlColumnProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import typingsJapgolly.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlColumn {
  def apply(
    backgroundColor: BackgroundColorProperty = null,
    border: String = null,
    borderBottom: String = null,
    borderLeft: String = null,
    borderRadius: String | Double = null,
    borderRight: String = null,
    borderTop: String = null,
    cssClass: String = null,
    padding: String | Double = null,
    paddingBottom: String | Double = null,
    paddingLeft: String | Double = null,
    paddingRight: String | Double = null,
    paddingTop: String | Double = null,
    verticalAlign: VerticalAlignProperty[String | Double] = null,
    width: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RequiredChildrenProps with MjmlColumnProps with PaddingProps with ClassNameProps with BorderProps, 
    typingsJapgolly.mjmlReact.mod.MjmlColumn, 
    Unit, 
    RequiredChildrenProps with MjmlColumnProps with PaddingProps with ClassNameProps with BorderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.mod.RequiredChildrenProps with typingsJapgolly.mjmlReact.mod.MjmlColumnProps with typingsJapgolly.mjmlReact.mod.PaddingProps with typingsJapgolly.mjmlReact.mod.ClassNameProps with typingsJapgolly.mjmlReact.mod.BorderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.mod.MjmlColumn](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.mod.RequiredChildrenProps with typingsJapgolly.mjmlReact.mod.MjmlColumnProps with typingsJapgolly.mjmlReact.mod.PaddingProps with typingsJapgolly.mjmlReact.mod.ClassNameProps with typingsJapgolly.mjmlReact.mod.BorderProps])(children: _*)
  }
  @JSImport("mjml-react", "MjmlColumn")
  @js.native
  object componentImport extends js.Object
  
}

