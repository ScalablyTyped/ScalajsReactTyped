package typingsJapgolly.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Immutable extends StObject {
  
  var immutable: js.UndefOr[Boolean] = js.undefined
  
  var keyExpr: js.UndefOr[String | js.Array[String]] = js.undefined
}
object Immutable {
  
  inline def apply(): Immutable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Immutable]
  }
  
  extension [Self <: Immutable](x: Self) {
    
    inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
    
    inline def setKeyExpr(value: String | js.Array[String]): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setKeyExprVarargs(value: String*): Self = StObject.set(x, "keyExpr", js.Array(value*))
  }
}
