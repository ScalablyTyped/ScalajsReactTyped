package typingsJapgolly.roads

import typingsJapgolly.roads.typesCoreRoadMod.Context
import typingsJapgolly.roads.typesCoreRoadMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMiddlewareParseBodyMod {
  
  @JSImport("roads/types/middleware/parseBody", "middleware")
  @js.native
  val middleware: Middleware[Context] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait ParseBodyContext[BodyType] extends StObject {
    
    var body: js.UndefOr[BodyType] = js.undefined
  }
  object ParseBodyContext {
    
    inline def apply[BodyType](): ParseBodyContext[BodyType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseBodyContext[BodyType]]
    }
    
    extension [Self <: ParseBodyContext[?], BodyType](x: Self & ParseBodyContext[BodyType]) {
      
      inline def setBody(value: BodyType): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    }
  }
}
