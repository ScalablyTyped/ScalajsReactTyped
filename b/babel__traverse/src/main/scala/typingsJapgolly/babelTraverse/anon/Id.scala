package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.`var`
import typingsJapgolly.babelTraverse.babelTraverseStrings.const
import typingsJapgolly.babelTraverse.babelTraverseStrings.let
import typingsJapgolly.babelTypes.mod.Expression
import typingsJapgolly.babelTypes.mod.LVal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: LVal
  
  var init: js.UndefOr[Expression] = js.undefined
  
  var kind: js.UndefOr[`var` | let | const] = js.undefined
  
  var unique: js.UndefOr[Boolean] = js.undefined
}
object Id {
  
  inline def apply(id: LVal): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: LVal): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setKind(value: `var` | let | const): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
