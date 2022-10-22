package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedObjectBorder extends StObject {
  
  /** The color of the border. */
  var color: js.UndefOr[OptionalColor] = js.undefined
  
  /** The dash style of the border. */
  var dashStyle: js.UndefOr[String] = js.undefined
  
  /** The property state of the border property. */
  var propertyState: js.UndefOr[String] = js.undefined
  
  /** The width of the border. */
  var width: js.UndefOr[Dimension] = js.undefined
}
object EmbeddedObjectBorder {
  
  inline def apply(): EmbeddedObjectBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectBorder]
  }
  
  extension [Self <: EmbeddedObjectBorder](x: Self) {
    
    inline def setColor(value: OptionalColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
    
    inline def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
    
    inline def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
