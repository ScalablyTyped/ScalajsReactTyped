package typingsJapgolly.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageUploadResponse extends StObject {
  
  var Error: String
  
  var Height: Double
  
  var Type: String
  
  var Vector: Boolean
  
  var Width: Double
}
object ImageUploadResponse {
  
  inline def apply(Error: String, Height: Double, Type: String, Vector: Boolean, Width: Double): ImageUploadResponse = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Vector = Vector.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUploadResponse]
  }
  
  extension [Self <: ImageUploadResponse](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVector(value: Boolean): Self = StObject.set(x, "Vector", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
