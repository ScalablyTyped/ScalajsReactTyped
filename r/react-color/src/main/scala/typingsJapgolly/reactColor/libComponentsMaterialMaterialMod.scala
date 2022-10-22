package typingsJapgolly.reactColor

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.anon.PartialClassesMaterialPic
import typingsJapgolly.reactColor.mod.ColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMaterialMaterialMod {
  
  @JSImport("react-color/lib/components/material/Material", JSImport.Default)
  @js.native
  open class default ()
    extends Component[MaterialPickerProps, js.Object, Any]
  
  type MaterialPicker = japgolly.scalajs.react.facade.React.Component[MaterialPickerProps & js.Object, js.Object]
  
  trait MaterialPickerProps
    extends StObject
       with ColorPickerProps[
          japgolly.scalajs.react.facade.React.Component[MaterialPickerProps & js.Object, js.Object]
        ] {
    
    @JSName("styles")
    var styles_MaterialPickerProps: js.UndefOr[PartialClassesMaterialPic] = js.undefined
  }
  object MaterialPickerProps {
    
    inline def apply(): MaterialPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaterialPickerProps]
    }
    
    extension [Self <: MaterialPickerProps](x: Self) {
      
      inline def setStyles(value: PartialClassesMaterialPic): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait MaterialPickerStylesProps extends StObject {
    
    var HEXinput: CSSProperties
    
    var HEXlabel: CSSProperties
    
    var HEXwrap: CSSProperties
    
    var Hex: CSSProperties
    
    var RGBinput: CSSProperties
    
    var RGBlabel: CSSProperties
    
    var RGBwrap: CSSProperties
    
    var material: CSSProperties
    
    var split: CSSProperties
    
    var third: CSSProperties
  }
  object MaterialPickerStylesProps {
    
    inline def apply(
      HEXinput: CSSProperties,
      HEXlabel: CSSProperties,
      HEXwrap: CSSProperties,
      Hex: CSSProperties,
      RGBinput: CSSProperties,
      RGBlabel: CSSProperties,
      RGBwrap: CSSProperties,
      material: CSSProperties,
      split: CSSProperties,
      third: CSSProperties
    ): MaterialPickerStylesProps = {
      val __obj = js.Dynamic.literal(HEXinput = HEXinput.asInstanceOf[js.Any], HEXlabel = HEXlabel.asInstanceOf[js.Any], HEXwrap = HEXwrap.asInstanceOf[js.Any], Hex = Hex.asInstanceOf[js.Any], RGBinput = RGBinput.asInstanceOf[js.Any], RGBlabel = RGBlabel.asInstanceOf[js.Any], RGBwrap = RGBwrap.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any], third = third.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaterialPickerStylesProps]
    }
    
    extension [Self <: MaterialPickerStylesProps](x: Self) {
      
      inline def setHEXinput(value: CSSProperties): Self = StObject.set(x, "HEXinput", value.asInstanceOf[js.Any])
      
      inline def setHEXlabel(value: CSSProperties): Self = StObject.set(x, "HEXlabel", value.asInstanceOf[js.Any])
      
      inline def setHEXwrap(value: CSSProperties): Self = StObject.set(x, "HEXwrap", value.asInstanceOf[js.Any])
      
      inline def setHex(value: CSSProperties): Self = StObject.set(x, "Hex", value.asInstanceOf[js.Any])
      
      inline def setMaterial(value: CSSProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setRGBinput(value: CSSProperties): Self = StObject.set(x, "RGBinput", value.asInstanceOf[js.Any])
      
      inline def setRGBlabel(value: CSSProperties): Self = StObject.set(x, "RGBlabel", value.asInstanceOf[js.Any])
      
      inline def setRGBwrap(value: CSSProperties): Self = StObject.set(x, "RGBwrap", value.asInstanceOf[js.Any])
      
      inline def setSplit(value: CSSProperties): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setThird(value: CSSProperties): Self = StObject.set(x, "third", value.asInstanceOf[js.Any])
    }
  }
}
