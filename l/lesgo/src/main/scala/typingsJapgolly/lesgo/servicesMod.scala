package typingsJapgolly.lesgo

import typingsJapgolly.lesgo.servicesJwtserviceMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesMod {
  
  @JSImport("lesgo/services", JSImport.Default)
  @js.native
  open class default[TDecoded /* <: js.Object | String */] protected ()
    extends typingsJapgolly.lesgo.servicesJwtserviceMod.default[TDecoded] {
    def this(token: String, config: Config[TDecoded]) = this()
  }
  
  @JSImport("lesgo/services", "LogLevels")
  @js.native
  object LogLevels extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.lesgo.servicesLoggerServiceMod.LogLevels & Double] = js.native
    
    /* 3 */ val debug: typingsJapgolly.lesgo.servicesLoggerServiceMod.LogLevels.debug & Double = js.native
    
    /* 0 */ val error: typingsJapgolly.lesgo.servicesLoggerServiceMod.LogLevels.error & Double = js.native
    
    /* 2 */ val info: typingsJapgolly.lesgo.servicesLoggerServiceMod.LogLevels.info & Double = js.native
    
    /* 1 */ val warn: typingsJapgolly.lesgo.servicesLoggerServiceMod.LogLevels.warn & Double = js.native
  }
}
