package typingsJapgolly.oracleOraclejet.ojdataproviderMod

import typingsJapgolly.oracleOraclejet.ojdataproviderMod.AttributeFilterOperator.AttributeOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeFilterOperator[D] extends StObject {
  
  var attribute: String
  
  var op: AttributeOperator
  
  var value: Any
}
object AttributeFilterOperator {
  
  inline def apply[D](attribute: String, op: AttributeOperator, value: Any): AttributeFilterOperator[D] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeFilterOperator[D]]
  }
  
  extension [Self <: AttributeFilterOperator[?], D](x: Self & AttributeFilterOperator[D]) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setOp(value: AttributeOperator): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$co
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$eq
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$ew
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$pr
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$gt
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$ge
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$lt
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$le
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$ne
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$regex
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$sw
  */
  trait AttributeOperator extends StObject
  object AttributeOperator {
    
    inline def $co: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$co = "$co".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$co]
    
    inline def $eq: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$eq = "$eq".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$eq]
    
    inline def $ew: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$ew = "$ew".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$ew]
    
    inline def $ge: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$ge = "$ge".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$ge]
    
    inline def $gt: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$gt = "$gt".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$gt]
    
    inline def $le: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$le = "$le".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$le]
    
    inline def $lt: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$lt = "$lt".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$lt]
    
    inline def $ne: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$ne = "$ne".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$ne]
    
    inline def $pr: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$pr = "$pr".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$pr]
    
    inline def $regex: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$regex = "$regex".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$regex]
    
    inline def $sw: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$sw = "$sw".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.$sw]
  }
}
