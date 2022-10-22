package typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsCommonVehicle extends StObject {
  
  /**
    * Vehicle color name, eg. black
    * Optional.
    */
  var colorName: js.UndefOr[String] = js.undefined
  
  /**
    * URL to a photo of the vehicle.
    * The photo will be displayed at approximately 256x256px.
    * Must be a jpg or png.
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  
  /**
    * Vehicle license plate number (e.g. \"1ABC234\").
    * Required.
    */
  var licensePlate: js.UndefOr[String] = js.undefined
  
  /**
    * Vehicle make (e.g. \"Honda\").
    * This is displayed to the user and must be localized.
    * Required.
    */
  var make: js.UndefOr[String] = js.undefined
  
  /**
    * Vehicle model (e.g. \"Grom\").
    * This is displayed to the user and must be localized.
    * Required.
    */
  var model: js.UndefOr[String] = js.undefined
}
object GoogleActionsOrdersV3VerticalsCommonVehicle {
  
  inline def apply(): GoogleActionsOrdersV3VerticalsCommonVehicle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsCommonVehicle]
  }
  
  extension [Self <: GoogleActionsOrdersV3VerticalsCommonVehicle](x: Self) {
    
    inline def setColorName(value: String): Self = StObject.set(x, "colorName", value.asInstanceOf[js.Any])
    
    inline def setColorNameUndefined: Self = StObject.set(x, "colorName", js.undefined)
    
    inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLicensePlate(value: String): Self = StObject.set(x, "licensePlate", value.asInstanceOf[js.Any])
    
    inline def setLicensePlateUndefined: Self = StObject.set(x, "licensePlate", js.undefined)
    
    inline def setMake(value: String): Self = StObject.set(x, "make", value.asInstanceOf[js.Any])
    
    inline def setMakeUndefined: Self = StObject.set(x, "make", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
