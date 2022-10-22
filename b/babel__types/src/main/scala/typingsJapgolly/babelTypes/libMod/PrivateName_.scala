package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.PrivateName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateName_
  extends StObject
     with BaseNode
     with Node
     with Private
     with Standardized {
  
  var id: Identifier_
  
  @JSName("type")
  var type_PrivateName_ : PrivateName
}
object PrivateName_ {
  
  inline def apply(id: Identifier_): PrivateName_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[PrivateName_]
  }
  
  extension [Self <: PrivateName_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: PrivateName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
