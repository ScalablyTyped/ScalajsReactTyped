package typingsJapgolly.kiwicomOrbitDesignTokens.mod

import typingsJapgolly.kiwicomOrbitDesignTokens.anon.PartialCloudColor
import typingsJapgolly.kiwicomOrbitDesignTokens.anon.PartialInkColor
import typingsJapgolly.kiwicomOrbitDesignTokens.anon.PartialProductColor
import typingsJapgolly.kiwicomOrbitDesignTokens.anon.PartialSocialColor
import typingsJapgolly.kiwicomOrbitDesignTokens.anon.PartialStatusColor
import typingsJapgolly.kiwicomOrbitDesignTokens.anon.PartialWhiteColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPalette extends StObject {
  
  var blue: js.UndefOr[PartialStatusColor] = js.undefined
  
  var cloud: js.UndefOr[PartialCloudColor] = js.undefined
  
  var green: js.UndefOr[PartialStatusColor] = js.undefined
  
  var ink: js.UndefOr[PartialInkColor] = js.undefined
  
  var orange: js.UndefOr[PartialStatusColor] = js.undefined
  
  var product: js.UndefOr[PartialProductColor] = js.undefined
  
  var red: js.UndefOr[PartialStatusColor] = js.undefined
  
  var social: js.UndefOr[PartialSocialColor] = js.undefined
  
  var white: js.UndefOr[PartialWhiteColor] = js.undefined
}
object CustomPalette {
  
  inline def apply(): CustomPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPalette]
  }
  
  extension [Self <: CustomPalette](x: Self) {
    
    inline def setBlue(value: PartialStatusColor): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
    
    inline def setCloud(value: PartialCloudColor): Self = StObject.set(x, "cloud", value.asInstanceOf[js.Any])
    
    inline def setCloudUndefined: Self = StObject.set(x, "cloud", js.undefined)
    
    inline def setGreen(value: PartialStatusColor): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    inline def setInk(value: PartialInkColor): Self = StObject.set(x, "ink", value.asInstanceOf[js.Any])
    
    inline def setInkUndefined: Self = StObject.set(x, "ink", js.undefined)
    
    inline def setOrange(value: PartialStatusColor): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
    
    inline def setOrangeUndefined: Self = StObject.set(x, "orange", js.undefined)
    
    inline def setProduct(value: PartialProductColor): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setRed(value: PartialStatusColor): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
    
    inline def setSocial(value: PartialSocialColor): Self = StObject.set(x, "social", value.asInstanceOf[js.Any])
    
    inline def setSocialUndefined: Self = StObject.set(x, "social", js.undefined)
    
    inline def setWhite(value: PartialWhiteColor): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    
    inline def setWhiteUndefined: Self = StObject.set(x, "white", js.undefined)
  }
}
