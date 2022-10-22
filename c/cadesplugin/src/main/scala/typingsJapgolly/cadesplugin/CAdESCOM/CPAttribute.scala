package typingsJapgolly.cadesplugin.CAdESCOM

import typingsJapgolly.cadesplugin.CADESCommon.ValuesOf
import typingsJapgolly.cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPAttribute extends StObject {
  
  var Name: ValuesOf[CADESCOM_ATTRIBUTE]
  
  var Value: Any
  
  var ValueEncoding: ValuesOf[CAPICOM_ENCODING_TYPE]
}
object CPAttribute {
  
  inline def apply(Name: ValuesOf[CADESCOM_ATTRIBUTE], Value: Any, ValueEncoding: ValuesOf[CAPICOM_ENCODING_TYPE]): CPAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueEncoding = ValueEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPAttribute]
  }
  
  extension [Self <: CPAttribute](x: Self) {
    
    inline def setName(value: ValuesOf[CADESCOM_ATTRIBUTE]): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueEncoding(value: ValuesOf[CAPICOM_ENCODING_TYPE]): Self = StObject.set(x, "ValueEncoding", value.asInstanceOf[js.Any])
  }
}
