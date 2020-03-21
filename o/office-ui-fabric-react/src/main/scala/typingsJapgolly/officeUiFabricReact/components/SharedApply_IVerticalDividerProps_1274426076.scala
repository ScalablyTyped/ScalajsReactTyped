package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerClassNames
import typingsJapgolly.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerProps
import typingsJapgolly.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerPropsStyles
import typingsJapgolly.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerStyles
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IVerticalDividerProps_1274426076 () {
  val componentImport: js.Any
  def apply(
    className: String = null,
    getClassNames: /* theme */ ITheme => CallbackTo[IVerticalDividerClassNames] = null,
    styles: IStyleFunctionOrObject[IVerticalDividerPropsStyles, IVerticalDividerStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IVerticalDividerProps, 
    MountedWithRawType[IVerticalDividerProps, js.Object, RawMounted[IVerticalDividerProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction1((t0: /* theme */ typingsJapgolly.uifabricStyling.ithemeMod.ITheme) => getClassNames(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerProps])(children: _*)
  }
}

