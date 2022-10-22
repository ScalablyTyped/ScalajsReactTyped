package typingsJapgolly.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxListobjectExpressionDef extends StObject {
  
  var qExpr: String
  
  var qLibraryId: String
}
object NxListobjectExpressionDef {
  
  inline def apply(qExpr: String, qLibraryId: String): NxListobjectExpressionDef = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxListobjectExpressionDef]
  }
  
  extension [Self <: NxListobjectExpressionDef](x: Self) {
    
    inline def setQExpr(value: String): Self = StObject.set(x, "qExpr", value.asInstanceOf[js.Any])
    
    inline def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
  }
}
