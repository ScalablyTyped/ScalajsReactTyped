package typingsJapgolly.hyperformula.anon

import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentType extends StObject {
  
  var argumentType: ArgumentTypes
}
object ArgumentType {
  
  inline def apply(argumentType: ArgumentTypes): ArgumentType = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentType]
  }
  
  extension [Self <: ArgumentType](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
  }
}
