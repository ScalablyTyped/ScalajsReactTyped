package typingsJapgolly.powerbiVisualsTools.mod

import typingsJapgolly.powerbiVisualsTools.mod.data.DataRepetitionSelector
import typingsJapgolly.powerbiVisualsTools.mod.data.ISQExpr
import typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates the identity of a data scope in a DataView. */
trait DataViewScopeIdentity
  extends StObject
     with DataRepetitionSelector {
  
  /** Predicate expression that identifies the scope. */
  var expr: ISQExpr
  
  /** Key string that identifies the DataViewScopeIdentity to a string, which can be used for equality comparison. */
  var key: String
  
  var kind: `1`
}
object DataViewScopeIdentity {
  
  inline def apply(expr: ISQExpr, key: String): DataViewScopeIdentity = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = 1)
    __obj.asInstanceOf[DataViewScopeIdentity]
  }
  
  extension [Self <: DataViewScopeIdentity](x: Self) {
    
    inline def setExpr(value: ISQExpr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `1`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
