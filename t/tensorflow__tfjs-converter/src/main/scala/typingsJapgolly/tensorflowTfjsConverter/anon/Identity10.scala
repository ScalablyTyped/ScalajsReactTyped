package typingsJapgolly.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identity10 extends StObject {
  
  @JSName("Identity:0")
  var IdentityColon0: TensorShape
  
  @JSName("Identity_1:0")
  var Identity_1Colon0: TensorShape
  
  @JSName("Identity_2:0")
  var Identity_2Colon0: TensorShape
}
object Identity10 {
  
  inline def apply(IdentityColon0: TensorShape, Identity_1Colon0: TensorShape, Identity_2Colon0: TensorShape): Identity10 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Identity:0")(IdentityColon0.asInstanceOf[js.Any])
    __obj.updateDynamic("Identity_1:0")(Identity_1Colon0.asInstanceOf[js.Any])
    __obj.updateDynamic("Identity_2:0")(Identity_2Colon0.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity10]
  }
  
  extension [Self <: Identity10](x: Self) {
    
    inline def setIdentityColon0(value: TensorShape): Self = StObject.set(x, "Identity:0", value.asInstanceOf[js.Any])
    
    inline def setIdentity_1Colon0(value: TensorShape): Self = StObject.set(x, "Identity_1:0", value.asInstanceOf[js.Any])
    
    inline def setIdentity_2Colon0(value: TensorShape): Self = StObject.set(x, "Identity_2:0", value.asInstanceOf[js.Any])
  }
}
