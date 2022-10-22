package typingsJapgolly.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationQueryOptions extends StObject {
  
  var exaggerated: Boolean
}
object ElevationQueryOptions {
  
  inline def apply(exaggerated: Boolean): ElevationQueryOptions = {
    val __obj = js.Dynamic.literal(exaggerated = exaggerated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationQueryOptions]
  }
  
  extension [Self <: ElevationQueryOptions](x: Self) {
    
    inline def setExaggerated(value: Boolean): Self = StObject.set(x, "exaggerated", value.asInstanceOf[js.Any])
  }
}
