package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import typingsJapgolly.schematicsAngular.schematicsAngularStrings.retrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Signals that this signature help request came from typing a character or moving the cursor.
  * This should only occur if a signature help session was already active and the editor needs to see if it should adjust.
  * The language service will unconditionally attempt to provide a result.
  * `triggerCharacter` can be `undefined` for a retrigger caused by a cursor move.
  */
trait SignatureHelpRetriggeredReason
  extends StObject
     with SignatureHelpTriggerReason {
  
  var kind: retrigger
  
  /**
    * Character that was responsible for triggering signature help.
    */
  var triggerCharacter: js.UndefOr[SignatureHelpRetriggerCharacter] = js.undefined
}
object SignatureHelpRetriggeredReason {
  
  inline def apply(): SignatureHelpRetriggeredReason = {
    val __obj = js.Dynamic.literal(kind = "retrigger")
    __obj.asInstanceOf[SignatureHelpRetriggeredReason]
  }
  
  extension [Self <: SignatureHelpRetriggeredReason](x: Self) {
    
    inline def setKind(value: retrigger): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTriggerCharacter(value: SignatureHelpRetriggerCharacter): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
    
    inline def setTriggerCharacterUndefined: Self = StObject.set(x, "triggerCharacter", js.undefined)
  }
}
