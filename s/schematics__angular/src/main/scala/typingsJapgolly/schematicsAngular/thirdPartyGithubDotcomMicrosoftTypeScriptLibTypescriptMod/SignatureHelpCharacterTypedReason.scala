package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import typingsJapgolly.schematicsAngular.schematicsAngularStrings.characterTyped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Signals that the signature help request came from a user typing a character.
  * Depending on the character and the syntactic context, the request may or may not be served a result.
  */
trait SignatureHelpCharacterTypedReason
  extends StObject
     with SignatureHelpTriggerReason {
  
  var kind: characterTyped
  
  /**
    * Character that was responsible for triggering signature help.
    */
  var triggerCharacter: SignatureHelpTriggerCharacter
}
object SignatureHelpCharacterTypedReason {
  
  inline def apply(triggerCharacter: SignatureHelpTriggerCharacter): SignatureHelpCharacterTypedReason = {
    val __obj = js.Dynamic.literal(kind = "characterTyped", triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpCharacterTypedReason]
  }
  
  extension [Self <: SignatureHelpCharacterTypedReason](x: Self) {
    
    inline def setKind(value: characterTyped): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTriggerCharacter(value: SignatureHelpTriggerCharacter): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
  }
}
