package typingsJapgolly.schematicsAngular.anon

import typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.Diagnostic
import typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TypeAcquisition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var errors: js.Array[Diagnostic]
  
  var options: TypeAcquisition
}
object Options {
  
  inline def apply(errors: js.Array[Diagnostic], options: TypeAcquisition): Options = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setErrors(value: js.Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Diagnostic*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setOptions(value: TypeAcquisition): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
