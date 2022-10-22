package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputLossBehavior extends StObject {
  
  /**
    * Documentation update needed
    */
  var BlackFrameMsec: js.UndefOr[integerMin0Max1000000] = js.undefined
  
  /**
    * When input loss image type is "color" this field specifies the color to use. Value: 6 hex characters representing the values of RGB.
    */
  var InputLossImageColor: js.UndefOr[stringMin6Max6] = js.undefined
  
  /**
    * When input loss image type is "slate" these fields specify the parameters for accessing the slate.
    */
  var InputLossImageSlate: js.UndefOr[InputLocation] = js.undefined
  
  /**
    * Indicates whether to substitute a solid color or a slate into the output after input loss exceeds blackFrameMsec.
    */
  var InputLossImageType: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.InputLossImageType] = js.undefined
  
  /**
    * Documentation update needed
    */
  var RepeatFrameMsec: js.UndefOr[integerMin0Max1000000] = js.undefined
}
object InputLossBehavior {
  
  inline def apply(): InputLossBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLossBehavior]
  }
  
  extension [Self <: InputLossBehavior](x: Self) {
    
    inline def setBlackFrameMsec(value: integerMin0Max1000000): Self = StObject.set(x, "BlackFrameMsec", value.asInstanceOf[js.Any])
    
    inline def setBlackFrameMsecUndefined: Self = StObject.set(x, "BlackFrameMsec", js.undefined)
    
    inline def setInputLossImageColor(value: stringMin6Max6): Self = StObject.set(x, "InputLossImageColor", value.asInstanceOf[js.Any])
    
    inline def setInputLossImageColorUndefined: Self = StObject.set(x, "InputLossImageColor", js.undefined)
    
    inline def setInputLossImageSlate(value: InputLocation): Self = StObject.set(x, "InputLossImageSlate", value.asInstanceOf[js.Any])
    
    inline def setInputLossImageSlateUndefined: Self = StObject.set(x, "InputLossImageSlate", js.undefined)
    
    inline def setInputLossImageType(value: InputLossImageType): Self = StObject.set(x, "InputLossImageType", value.asInstanceOf[js.Any])
    
    inline def setInputLossImageTypeUndefined: Self = StObject.set(x, "InputLossImageType", js.undefined)
    
    inline def setRepeatFrameMsec(value: integerMin0Max1000000): Self = StObject.set(x, "RepeatFrameMsec", value.asInstanceOf[js.Any])
    
    inline def setRepeatFrameMsecUndefined: Self = StObject.set(x, "RepeatFrameMsec", js.undefined)
  }
}
