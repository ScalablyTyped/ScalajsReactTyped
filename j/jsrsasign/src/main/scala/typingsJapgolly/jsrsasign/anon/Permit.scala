package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign.ExtNameConstraints
import typingsJapgolly.jsrsasign.jsrsasign.GeneralSubtree
import typingsJapgolly.jsrsasign.jsrsasignStrings.nameConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permit
  extends StObject
     with ExtNameConstraints {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: nameConstraints
  
  var permit: js.Array[GeneralSubtree]
}
object Permit {
  
  inline def apply(permit: js.Array[GeneralSubtree]): Permit = {
    val __obj = js.Dynamic.literal(extname = "nameConstraints", permit = permit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permit]
  }
  
  extension [Self <: Permit](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: nameConstraints): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setPermit(value: js.Array[GeneralSubtree]): Self = StObject.set(x, "permit", value.asInstanceOf[js.Any])
    
    inline def setPermitVarargs(value: GeneralSubtree*): Self = StObject.set(x, "permit", js.Array(value*))
  }
}
