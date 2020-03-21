package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerProps
import typingsJapgolly.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerStyleProps
import typingsJapgolly.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerStyles
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GroupSpacer {
  def apply(
    count: Double,
    indentWidth: Int | Double = null,
    styles: IStyleFunctionOrObject[IGroupSpacerStyleProps, IGroupSpacerStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IGroupSpacerProps, 
    MountedWithRawType[IGroupSpacerProps, js.Object, RawMounted[IGroupSpacerProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
  
      if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "GroupSpacer")
  @js.native
  object componentImport extends js.Object
  
}

