package typingsJapgolly.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardMultiValuePart extends StObject {
  
  val ID: Any
  
  val Value: Any
}
object IMetadataCardMultiValuePart {
  
  inline def apply(ID: Any, Value: Any): IMetadataCardMultiValuePart = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardMultiValuePart]
  }
  
  extension [Self <: IMetadataCardMultiValuePart](x: Self) {
    
    inline def setID(value: Any): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
