package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.colorPickerTypesMod.IColorPicker
import typingsJapgolly.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps
import typingsJapgolly.officeUiFabricReact.colorPickerTypesMod.IColorPickerStrings
import typingsJapgolly.officeUiFabricReact.colorPickerTypesMod.IColorPickerStyleProps
import typingsJapgolly.officeUiFabricReact.colorPickerTypesMod.IColorPickerStyles
import typingsJapgolly.officeUiFabricReact.interfacesMod.IColor
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColorPickerBase {
  def apply(
    color: IColor | String,
    alphaLabel: String = null,
    alphaSliderHidden: js.UndefOr[Boolean] = js.undefined,
    blueLabel: String = null,
    className: String = null,
    componentRef: IRefObject[IColorPicker] = null,
    greenLabel: String = null,
    hexLabel: String = null,
    onChange: (/* ev */ ReactEventFrom[HTMLElement], /* color */ IColor) => Callback = null,
    redLabel: String = null,
    showPreview: js.UndefOr[Boolean] = js.undefined,
    strings: IColorPickerStrings = null,
    styles: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IColorPickerProps, 
    typingsJapgolly.officeUiFabricReact.mod.ColorPickerBase, 
    Unit, 
    IColorPickerProps
  ] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
      if (alphaLabel != null) __obj.updateDynamic("alphaLabel")(alphaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(alphaSliderHidden)) __obj.updateDynamic("alphaSliderHidden")(alphaSliderHidden.asInstanceOf[js.Any])
    if (blueLabel != null) __obj.updateDynamic("blueLabel")(blueLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (greenLabel != null) __obj.updateDynamic("greenLabel")(greenLabel.asInstanceOf[js.Any])
    if (hexLabel != null) __obj.updateDynamic("hexLabel")(hexLabel.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* ev */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* color */ typingsJapgolly.officeUiFabricReact.interfacesMod.IColor) => onChange(t0, t1).runNow()))
    if (redLabel != null) __obj.updateDynamic("redLabel")(redLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreview)) __obj.updateDynamic("showPreview")(showPreview.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.ColorPickerBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "ColorPickerBase")
  @js.native
  object componentImport extends js.Object
  
}

