package typingsJapgolly.tsNode

import typingsJapgolly.tsNode.mod.TsConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTsconfigSchemaMod {
  
  trait TsConfigSchema extends StObject {
    
    /**
      * ts-node options.  See also: https://typestrong.org/ts-node/docs/configuration
      *
      * ts-node offers TypeScript execution and REPL for node.js, with source map support.
      */
    var `ts-node`: TsConfigOptions
  }
  object TsConfigSchema {
    
    inline def apply(`ts-node`: TsConfigOptions): TsConfigSchema = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("ts-node")(`ts-node`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TsConfigSchema]
    }
    
    extension [Self <: TsConfigSchema](x: Self) {
      
      inline def `setTs-node`(value: TsConfigOptions): Self = StObject.set(x, "ts-node", value.asInstanceOf[js.Any])
    }
  }
}
