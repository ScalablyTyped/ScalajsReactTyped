package typingsJapgolly.reactNativeMaterialKit.mod

import typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.`100`
import typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.`200`
import typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.`300`
import typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.`400`
import typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.`500`
import typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.`600`
import typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.`700`
import typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.`800`
import typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.`900`
import typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.bold
import typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.italic
import typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MKPropTypes {
  
  trait dimen extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object dimen {
    
    inline def apply(): dimen = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[dimen]
    }
    
    extension [Self <: dimen](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait font extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontStyle: js.UndefOr[normal | italic] = js.undefined
    
    var fontWeight: js.UndefOr[
        normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
      ] = js.undefined
  }
  object font {
    
    inline def apply(): font = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[font]
    }
    
    extension [Self <: font](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: normal | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.tapLocation
    - typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.center
  */
  trait rippleLocation extends StObject
  object rippleLocation {
    
    inline def center: typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.center = "center".asInstanceOf[typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.center]
    
    inline def tapLocation: typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.tapLocation = "tapLocation".asInstanceOf[typingsJapgolly.reactNativeMaterialKit.reactNativeMaterialKitStrings.tapLocation]
  }
}
