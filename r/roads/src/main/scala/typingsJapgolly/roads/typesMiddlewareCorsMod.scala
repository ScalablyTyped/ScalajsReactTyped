package typingsJapgolly.roads

import typingsJapgolly.roads.anon.CacheMaxAge
import typingsJapgolly.roads.typesCoreRoadMod.Context
import typingsJapgolly.roads.typesCoreRoadMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMiddlewareCorsMod {
  
  @JSImport("roads/types/middleware/cors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(options: CacheMaxAge): Middleware[Context] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[Context]]
}
