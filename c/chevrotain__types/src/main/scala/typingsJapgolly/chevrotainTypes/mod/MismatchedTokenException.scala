package typingsJapgolly.chevrotainTypes.mod

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.chevrotainTypes.mod.IRecognitionException because var conflicts: message, name. Inlined token, resyncedTokens, context */ @JSImport("@chevrotain/types", "MismatchedTokenException")
@js.native
open class MismatchedTokenException protected ()
  extends StObject
     with Error {
  def this(message: String, token: IToken, previousToken: IToken) = this()
  
  var context: IRecognizerContext = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var previousToken: IToken = js.native
  
  var resyncedTokens: js.Array[IToken] = js.native
  
  var token: IToken = js.native
}
