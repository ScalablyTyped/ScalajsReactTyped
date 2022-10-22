package typingsJapgolly.bunyanWinstonAdapter

import typingsJapgolly.winston.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bunyan-winston-adapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAdapter(logger: Logger): typingsJapgolly.bunyan.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createAdapter")(logger.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bunyan.mod.^]
  inline def createAdapter(logger: Logger, mapping: Any): typingsJapgolly.bunyan.mod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createAdapter")(logger.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bunyan.mod.^]
}
