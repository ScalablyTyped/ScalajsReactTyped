package typingsJapgolly.tsJest.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object jestTypesAugmentingMod {
  
  object Config {
    
    trait ConfigGlobals extends StObject {
      
      var `ts-jest`: TsJestGlobalOptions
    }
    object ConfigGlobals {
      
      inline def apply(`ts-jest`: TsJestGlobalOptions): ConfigGlobals = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("ts-jest")(`ts-jest`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConfigGlobals]
      }
      
      extension [Self <: ConfigGlobals](x: Self) {
        
        inline def `setTs-jest`(value: TsJestGlobalOptions): Self = StObject.set(x, "ts-jest", value.asInstanceOf[js.Any])
      }
    }
  }
}
