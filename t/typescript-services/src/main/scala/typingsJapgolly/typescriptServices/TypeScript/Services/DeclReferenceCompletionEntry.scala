package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.PullDecl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclReferenceCompletionEntry
  extends StObject
     with CachedCompletionEntryDetails {
  
  var decl: PullDecl
  
  /* private */ var hasBeenResolved: Any
  
  def resolve(`type`: String, fullSymbolName: String, docComments: String): Unit
}
object DeclReferenceCompletionEntry {
  
  inline def apply(
    decl: PullDecl,
    docComment: String,
    fullSymbolName: String,
    hasBeenResolved: Any,
    isResolved: CallbackTo[Boolean],
    kind: String,
    kindModifiers: String,
    name: String,
    resolve: (String, String, String) => Callback,
    `type`: String
  ): DeclReferenceCompletionEntry = {
    val __obj = js.Dynamic.literal(decl = decl.asInstanceOf[js.Any], docComment = docComment.asInstanceOf[js.Any], fullSymbolName = fullSymbolName.asInstanceOf[js.Any], hasBeenResolved = hasBeenResolved.asInstanceOf[js.Any], isResolved = isResolved.toJsFn, kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resolve = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (resolve(t0, t1, t2)).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclReferenceCompletionEntry]
  }
  
  extension [Self <: DeclReferenceCompletionEntry](x: Self) {
    
    inline def setDecl(value: PullDecl): Self = StObject.set(x, "decl", value.asInstanceOf[js.Any])
    
    inline def setHasBeenResolved(value: Any): Self = StObject.set(x, "hasBeenResolved", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: (String, String, String) => Callback): Self = StObject.set(x, "resolve", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
  }
}
