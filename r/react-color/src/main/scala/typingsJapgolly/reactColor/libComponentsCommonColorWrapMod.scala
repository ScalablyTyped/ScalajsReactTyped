package typingsJapgolly.reactColor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorChangeHandler
import typingsJapgolly.reactColor.mod.ColorResult
import typingsJapgolly.reactColor.mod.HSLColor
import typingsJapgolly.reactColor.mod.RGBColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCommonColorWrapMod {
  
  @JSImport("react-color/lib/components/common/ColorWrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A](component: ComponentClassP[A & InjectedColorProps & js.Object]): ComponentClassP[A & ExportedColorProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[A & ExportedColorProps & js.Object]]
  inline def default[A](component: FunctionComponent[A & InjectedColorProps]): ComponentClassP[A & ExportedColorProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[A & ExportedColorProps & js.Object]]
  
  type ColorWrapChangeHandler = js.Function1[/* color */ Color | ColorResult, Unit]
  
  trait ExportedColorProps extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var onChange: js.UndefOr[ColorChangeHandler] = js.undefined
    
    var onChangeComplete: js.UndefOr[ColorChangeHandler] = js.undefined
  }
  object ExportedColorProps {
    
    inline def apply(): ExportedColorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportedColorProps]
    }
    
    extension [Self <: ExportedColorProps](x: Self) {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOnChange(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeComplete(value: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeCompleteUndefined: Self = StObject.set(x, "onChangeComplete", js.undefined)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  trait InjectedColorProps extends StObject {
    
    var hex: js.UndefOr[String] = js.undefined
    
    var hsl: js.UndefOr[HSLColor] = js.undefined
    
    var onChange: js.UndefOr[ColorWrapChangeHandler] = js.undefined
    
    var rgb: js.UndefOr[RGBColor] = js.undefined
  }
  object InjectedColorProps {
    
    inline def apply(): InjectedColorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InjectedColorProps]
    }
    
    extension [Self <: InjectedColorProps](x: Self) {
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
      
      inline def setHsl(value: HSLColor): Self = StObject.set(x, "hsl", value.asInstanceOf[js.Any])
      
      inline def setHslUndefined: Self = StObject.set(x, "hsl", js.undefined)
      
      inline def setOnChange(value: /* color */ Color | ColorResult => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* color */ Color | ColorResult) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRgb(value: RGBColor): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
      
      inline def setRgbUndefined: Self = StObject.set(x, "rgb", js.undefined)
    }
  }
}
