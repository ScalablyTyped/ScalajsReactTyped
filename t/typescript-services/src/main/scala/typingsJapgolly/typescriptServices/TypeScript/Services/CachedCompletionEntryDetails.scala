package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CachedCompletionEntryDetails
  extends StObject
     with CompletionEntryDetails {
  
  def isResolved(): Boolean
}
object CachedCompletionEntryDetails {
  
  inline def apply(
    docComment: String,
    fullSymbolName: String,
    isResolved: CallbackTo[Boolean],
    kind: String,
    kindModifiers: String,
    name: String,
    `type`: String
  ): CachedCompletionEntryDetails = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], fullSymbolName = fullSymbolName.asInstanceOf[js.Any], isResolved = isResolved.toJsFn, kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedCompletionEntryDetails]
  }
  
  extension [Self <: CachedCompletionEntryDetails](x: Self) {
    
    inline def setIsResolved(value: CallbackTo[Boolean]): Self = StObject.set(x, "isResolved", value.toJsFn)
  }
}
