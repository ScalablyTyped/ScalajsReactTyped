package typingsJapgolly.jsrsasign.jsrsasign

import typingsJapgolly.jsrsasign.jsrsasignStrings.subjectKeyIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtSubjectKeyIdentifier
  extends StObject
     with ExtParam {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: subjectKeyIdentifier
  
  var kid: Hex
}
object ExtSubjectKeyIdentifier {
  
  inline def apply(kid: Hex): ExtSubjectKeyIdentifier = {
    val __obj = js.Dynamic.literal(extname = "subjectKeyIdentifier", kid = kid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtSubjectKeyIdentifier]
  }
  
  extension [Self <: ExtSubjectKeyIdentifier](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: subjectKeyIdentifier): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setKid(value: Hex): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
  }
}
