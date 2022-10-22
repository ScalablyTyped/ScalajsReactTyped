package typingsJapgolly.schematicsAngular.anon

import typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.CommonJS
import typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.ESNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImpliedNodeFormat extends StObject {
  
  var impliedNodeFormat: js.UndefOr[ESNext | CommonJS] = js.undefined
}
object ImpliedNodeFormat {
  
  inline def apply(): ImpliedNodeFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImpliedNodeFormat]
  }
  
  extension [Self <: ImpliedNodeFormat](x: Self) {
    
    inline def setImpliedNodeFormat(value: ESNext | CommonJS): Self = StObject.set(x, "impliedNodeFormat", value.asInstanceOf[js.Any])
    
    inline def setImpliedNodeFormatUndefined: Self = StObject.set(x, "impliedNodeFormat", js.undefined)
  }
}
