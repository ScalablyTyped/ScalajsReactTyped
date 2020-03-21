package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.BackgroundColorProperty
import typingsJapgolly.mjmlReact.mjmlReactStrings.left
import typingsJapgolly.mjmlReact.mjmlReactStrings.right
import typingsJapgolly.mjmlReact.mod.ClassNameProps
import typingsJapgolly.mjmlReact.mod.MjmlAccordionElementProps
import typingsJapgolly.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlAccordionElement {
  def apply(
    backgroundColor: BackgroundColorProperty = null,
    cssClass: String = null,
    fontFamily: String = null,
    iconAlign: String = null,
    iconHeight: String = null,
    iconPosition: left | right = null,
    iconUnwrappedAlt: String = null,
    iconUnwrappedUrl: String = null,
    iconWidth: String = null,
    iconWrappedAlt: String = null,
    iconWrappedUrl: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RequiredChildrenProps with MjmlAccordionElementProps with ClassNameProps, 
    typingsJapgolly.mjmlReact.mod.MjmlAccordionElement, 
    Unit, 
    RequiredChildrenProps with MjmlAccordionElementProps with ClassNameProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (iconAlign != null) __obj.updateDynamic("iconAlign")(iconAlign.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconPosition != null) __obj.updateDynamic("iconPosition")(iconPosition.asInstanceOf[js.Any])
    if (iconUnwrappedAlt != null) __obj.updateDynamic("iconUnwrappedAlt")(iconUnwrappedAlt.asInstanceOf[js.Any])
    if (iconUnwrappedUrl != null) __obj.updateDynamic("iconUnwrappedUrl")(iconUnwrappedUrl.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (iconWrappedAlt != null) __obj.updateDynamic("iconWrappedAlt")(iconWrappedAlt.asInstanceOf[js.Any])
    if (iconWrappedUrl != null) __obj.updateDynamic("iconWrappedUrl")(iconWrappedUrl.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.mod.RequiredChildrenProps with typingsJapgolly.mjmlReact.mod.MjmlAccordionElementProps with typingsJapgolly.mjmlReact.mod.ClassNameProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.mod.MjmlAccordionElement](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.mod.RequiredChildrenProps with typingsJapgolly.mjmlReact.mod.MjmlAccordionElementProps with typingsJapgolly.mjmlReact.mod.ClassNameProps])(children: _*)
  }
  @JSImport("mjml-react", "MjmlAccordionElement")
  @js.native
  object componentImport extends js.Object
  
}

