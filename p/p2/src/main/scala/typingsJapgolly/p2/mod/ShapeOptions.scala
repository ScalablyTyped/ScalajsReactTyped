package typingsJapgolly.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeOptions
  extends StObject
     with SharedShapeOptions {
  
  var `type`: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Shape.CIRCLE */ Any
  ] = js.undefined
}
object ShapeOptions {
  
  inline def apply(): ShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeOptions]
  }
  
  extension [Self <: ShapeOptions](x: Self) {
    
    inline def setType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Shape.CIRCLE */ Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
