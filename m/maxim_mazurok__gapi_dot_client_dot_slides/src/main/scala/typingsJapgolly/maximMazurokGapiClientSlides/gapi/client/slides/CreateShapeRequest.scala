package typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateShapeRequest extends StObject {
  
  /** The element properties for the shape. */
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  
  /**
    * A user-supplied object ID. If you specify an ID, it must be unique among all pages and page elements in the presentation. The ID must start with an alphanumeric character or an
    * underscore (matches regex `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID must not be
    * less than 5 or greater than 50. If empty, a unique identifier will be generated.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /** The shape type. */
  var shapeType: js.UndefOr[String] = js.undefined
}
object CreateShapeRequest {
  
  inline def apply(): CreateShapeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateShapeRequest]
  }
  
  extension [Self <: CreateShapeRequest](x: Self) {
    
    inline def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
    
    inline def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setShapeType(value: String): Self = StObject.set(x, "shapeType", value.asInstanceOf[js.Any])
    
    inline def setShapeTypeUndefined: Self = StObject.set(x, "shapeType", js.undefined)
  }
}
