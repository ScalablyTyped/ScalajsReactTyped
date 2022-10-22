package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullDeclGroup extends StObject {
  
  /* private */ var _decls: Any
  
  def addDecl(decl: PullDecl): Unit
  
  def getDecls(): js.Array[PullDecl]
  
  var name: String
}
object PullDeclGroup {
  
  inline def apply(_decls: Any, addDecl: PullDecl => Callback, getDecls: CallbackTo[js.Array[PullDecl]], name: String): PullDeclGroup = {
    val __obj = js.Dynamic.literal(_decls = _decls.asInstanceOf[js.Any], addDecl = js.Any.fromFunction1((t0: PullDecl) => addDecl(t0).runNow()), getDecls = getDecls.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullDeclGroup]
  }
  
  extension [Self <: PullDeclGroup](x: Self) {
    
    inline def setAddDecl(value: PullDecl => Callback): Self = StObject.set(x, "addDecl", js.Any.fromFunction1((t0: PullDecl) => value(t0).runNow()))
    
    inline def setGetDecls(value: CallbackTo[js.Array[PullDecl]]): Self = StObject.set(x, "getDecls", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def set_decls(value: Any): Self = StObject.set(x, "_decls", value.asInstanceOf[js.Any])
  }
}
