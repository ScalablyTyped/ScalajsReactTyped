package typingsJapgolly.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTCDescBehavior extends StObject {
  
  /* private */ @JSName("MSHTML.HTCDescBehavior_typekey")
  var MSHTMLDotHTCDescBehavior_typekey: HTCDescBehavior
  
  val name: String
  
  val urn: String
}
object HTCDescBehavior {
  
  inline def apply(MSHTMLDotHTCDescBehavior_typekey: HTCDescBehavior, name: String, urn: String): HTCDescBehavior = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCDescBehavior_typekey")(MSHTMLDotHTCDescBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCDescBehavior]
  }
  
  extension [Self <: HTCDescBehavior](x: Self) {
    
    inline def setMSHTMLDotHTCDescBehavior_typekey(value: HTCDescBehavior): Self = StObject.set(x, "MSHTML.HTCDescBehavior_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
  }
}
