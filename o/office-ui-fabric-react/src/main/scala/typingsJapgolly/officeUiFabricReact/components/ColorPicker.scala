package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPicker
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPickerStrings
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPickerStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPickerStyles
import typingsJapgolly.officeUiFabricReact.libUtilitiesColorInterfacesMod.IColor
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.none
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPicker {
  
  inline def apply(color: IColor | String): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IColorPickerProps]))
  }
  
  @JSImport("office-ui-fabric-react", "ColorPicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def alphaLabel(value: String): this.type = set("alphaLabel", value.asInstanceOf[js.Any])
    
    inline def alphaSliderHidden(value: Boolean): this.type = set("alphaSliderHidden", value.asInstanceOf[js.Any])
    
    inline def alphaType(value: alpha | transparency | none): this.type = set("alphaType", value.asInstanceOf[js.Any])
    
    inline def blueLabel(value: String): this.type = set("blueLabel", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IColorPicker]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IColorPicker | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IColorPicker | Null) => value(t0).runNow()))
    
    inline def greenLabel(value: String): this.type = set("greenLabel", value.asInstanceOf[js.Any])
    
    inline def hexLabel(value: String): this.type = set("hexLabel", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* ev */ ReactEventFrom[HTMLElement], /* color */ IColor) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* ev */ ReactEventFrom[HTMLElement], t1: /* color */ IColor) => (value(t0, t1)).runNow()))
    
    inline def redLabel(value: String): this.type = set("redLabel", value.asInstanceOf[js.Any])
    
    inline def showPreview(value: Boolean): this.type = set("showPreview", value.asInstanceOf[js.Any])
    
    inline def strings(value: IColorPickerStrings): this.type = set("strings", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IColorPickerStyleProps => DeepPartial[IColorPickerStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IColorPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
