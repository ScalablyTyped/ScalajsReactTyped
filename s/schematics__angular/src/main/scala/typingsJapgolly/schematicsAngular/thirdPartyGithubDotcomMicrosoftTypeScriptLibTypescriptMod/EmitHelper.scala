package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScopedEmitHelper
  - typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.UnscopedEmitHelper
*/
trait EmitHelper extends StObject
object EmitHelper {
  
  inline def ScopedEmitHelper(
    name: java.lang.String,
    text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
  ): typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScopedEmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = true, text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScopedEmitHelper]
  }
  
  inline def UnscopedEmitHelper(name: java.lang.String, text: java.lang.String): typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.UnscopedEmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = false, text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.UnscopedEmitHelper]
  }
}
