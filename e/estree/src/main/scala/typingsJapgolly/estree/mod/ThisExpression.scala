package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThisExpression
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_ThisExpression: typingsJapgolly.estree.estreeStrings.ThisExpression
}
object ThisExpression {
  
  inline def apply(): ThisExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[ThisExpression]
  }
  
  extension [Self <: ThisExpression](x: Self) {
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.ThisExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
