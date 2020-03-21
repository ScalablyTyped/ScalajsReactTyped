package typingsJapgolly.themeUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.styledSystem.mod.RequiredTheme
import typingsJapgolly.styledSystem.mod.ResponsiveValue
import typingsJapgolly.styledSystem.mod.ThemeValue
import typingsJapgolly.themeUiComponents.mod.FieldProps
import typingsJapgolly.themeUiComponents.themeUiComponentsStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Field {
  def apply[T /* <: ElementType */](
    label: String,
    name: String,
    as: T = null,
    m: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    margin: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    marginBottom: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    marginLeft: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    marginRight: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    marginTop: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    mb: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    ml: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    mr: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    mt: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    mx: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    my: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    FieldProps[T], 
    MountedWithRawType[FieldProps[T], js.Object, RawMounted[FieldProps[T], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
      if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.themeUiComponents.mod.FieldProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.themeUiComponents.mod.FieldProps[T]])(children: _*)
  }
  @JSImport("theme-ui", "Field")
  @js.native
  object componentImport extends js.Object
  
}

