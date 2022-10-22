package typingsJapgolly.reactColor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactColor.anon.PartialClassesany
import typingsJapgolly.reactColor.libComponentsAlphaAlphaMod.default
import typingsJapgolly.reactColor.libComponentsCommonColorWrapMod.ExportedColorProps
import typingsJapgolly.reactColor.libComponentsCommonColorWrapMod.InjectedColorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-color", "AlphaPicker")
  @js.native
  open class AlphaPicker () extends default
  
  @JSImport("react-color", "BlockPicker")
  @js.native
  open class BlockPicker ()
    extends typingsJapgolly.reactColor.libComponentsBlockBlockMod.default
  
  @JSImport("react-color", "Checkboard")
  @js.native
  open class Checkboard ()
    extends typingsJapgolly.reactColor.libComponentsCommonCheckboardMod.default
  
  @JSImport("react-color", "ChromePicker")
  @js.native
  open class ChromePicker ()
    extends typingsJapgolly.reactColor.libComponentsChromeChromeMod.default
  
  @JSImport("react-color", "CirclePicker")
  @js.native
  open class CirclePicker ()
    extends typingsJapgolly.reactColor.libComponentsCircleCircleMod.default
  
  @JSImport("react-color", "CompactPicker")
  @js.native
  open class CompactPicker ()
    extends typingsJapgolly.reactColor.libComponentsCompactCompactMod.default
  
  inline def CustomPicker[A](component: ComponentClassP[A & InjectedColorProps & js.Object]): ComponentClassP[A & ExportedColorProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomPicker")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[A & ExportedColorProps & js.Object]]
  inline def CustomPicker[A](component: FunctionComponent[A & InjectedColorProps]): ComponentClassP[A & ExportedColorProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomPicker")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[A & ExportedColorProps & js.Object]]
  
  @JSImport("react-color", "GithubPicker")
  @js.native
  open class GithubPicker ()
    extends typingsJapgolly.reactColor.libComponentsGithubGithubMod.default
  
  @JSImport("react-color", "HuePicker")
  @js.native
  open class HuePicker ()
    extends typingsJapgolly.reactColor.libComponentsHueHueMod.default
  
  @JSImport("react-color", "MaterialPicker")
  @js.native
  open class MaterialPicker ()
    extends typingsJapgolly.reactColor.libComponentsMaterialMaterialMod.default
  
  @JSImport("react-color", "PhotoshopPicker")
  @js.native
  open class PhotoshopPicker ()
    extends typingsJapgolly.reactColor.libComponentsPhotoshopPhotoshopMod.default
  
  @JSImport("react-color", "SketchPicker")
  @js.native
  open class SketchPicker ()
    extends typingsJapgolly.reactColor.libComponentsSketchSketchMod.default
  
  @JSImport("react-color", "SliderPicker")
  @js.native
  open class SliderPicker ()
    extends typingsJapgolly.reactColor.libComponentsSliderSliderMod.default
  
  @JSImport("react-color", "SwatchesPicker")
  @js.native
  open class SwatchesPicker ()
    extends typingsJapgolly.reactColor.libComponentsSwatchesSwatchesMod.default
  
  @JSImport("react-color", "TwitterPicker")
  @js.native
  open class TwitterPicker ()
    extends typingsJapgolly.reactColor.libComponentsTwitterTwitterMod.default
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.reactColor.mod.HSLColor
    - typingsJapgolly.reactColor.mod.RGBColor
  */
  type Color = _Color | String
  
  type ColorChangeHandler = js.Function2[/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement], Unit]
  
  trait ColorPickerProps[A]
    extends StObject
       with ClassAttributes[A] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var onChange: js.UndefOr[ColorChangeHandler] = js.undefined
    
    var onChangeComplete: js.UndefOr[ColorChangeHandler] = js.undefined
    
    var styles: js.UndefOr[PartialClassesany] = js.undefined
  }
  object ColorPickerProps {
    
    inline def apply[A](): ColorPickerProps[A] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPickerProps[A]]
    }
    
    extension [Self <: ColorPickerProps[?], A](x: Self & ColorPickerProps[A]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOnChange(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeComplete(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeCompleteUndefined: Self = StObject.set(x, "onChangeComplete", js.undefined)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStyles(value: PartialClassesany): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait ColorResult extends StObject {
    
    var hex: String
    
    var hsl: HSLColor
    
    var rgb: RGBColor
  }
  object ColorResult {
    
    inline def apply(hex: String, hsl: HSLColor, rgb: RGBColor): ColorResult = {
      val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorResult]
    }
    
    extension [Self <: ColorResult](x: Self) {
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHsl(value: HSLColor): Self = StObject.set(x, "hsl", value.asInstanceOf[js.Any])
      
      inline def setRgb(value: RGBColor): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomPickerProps[A]
    extends StObject
       with ClassAttributes[A] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var onChange: ColorChangeHandler
    
    var pointer: js.UndefOr[Node] = js.undefined
    
    var styles: js.UndefOr[PartialClassesany] = js.undefined
  }
  object CustomPickerProps {
    
    inline def apply[A](onChange: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): CustomPickerProps[A] = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (onChange(t0, t1)).runNow()))
      __obj.asInstanceOf[CustomPickerProps[A]]
    }
    
    extension [Self <: CustomPickerProps[?], A](x: Self & CustomPickerProps[A]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOnChange(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
      
      inline def setPointer(value: VdomNode): Self = StObject.set(x, "pointer", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPointerNull: Self = StObject.set(x, "pointer", null)
      
      inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
      
      inline def setPointerVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "pointer", js.Array(value*))
      
      inline def setPointerVdomElement(value: VdomElement): Self = StObject.set(x, "pointer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyles(value: PartialClassesany): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait HSLColor
    extends StObject
       with _Color {
    
    var a: js.UndefOr[Double] = js.undefined
    
    var h: Double
    
    var l: Double
    
    var s: Double
  }
  object HSLColor {
    
    inline def apply(h: Double, l: Double, s: Double): HSLColor = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSLColor]
    }
    
    extension [Self <: HSLColor](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait RGBColor
    extends StObject
       with _Color {
    
    var a: js.UndefOr[Double] = js.undefined
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGBColor {
    
    inline def apply(b: Double, g: Double, r: Double): RGBColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBColor]
    }
    
    extension [Self <: RGBColor](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Color extends StObject
  object _Color {
    
    inline def HSLColor(h: Double, l: Double, s: Double): typingsJapgolly.reactColor.mod.HSLColor = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactColor.mod.HSLColor]
    }
    
    inline def RGBColor(b: Double, g: Double, r: Double): typingsJapgolly.reactColor.mod.RGBColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactColor.mod.RGBColor]
    }
  }
}
