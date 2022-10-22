package typingsJapgolly.tsNode.anon

import typingsJapgolly.tsNode.mod.RegisterOptions
import typingsJapgolly.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<ts-node.ts-node.Service, std.Extract<'config' | 'options' | 'projectLocalResolveHelper', keyof ts-node.ts-node.Service>> */
trait PickServiceExtractconfigo extends StObject {
  
  var config: ParsedCommandLine
  
  var options: RegisterOptions
}
object PickServiceExtractconfigo {
  
  inline def apply(config: ParsedCommandLine, options: RegisterOptions): PickServiceExtractconfigo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickServiceExtractconfigo]
  }
  
  extension [Self <: PickServiceExtractconfigo](x: Self) {
    
    inline def setConfig(value: ParsedCommandLine): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RegisterOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
