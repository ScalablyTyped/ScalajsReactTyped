package typingsJapgolly.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPGroup extends StObject {
  
  var mids: js.Array[String]
  
  var semantics: String
}
object SDPGroup {
  
  inline def apply(mids: js.Array[String], semantics: String): SDPGroup = {
    val __obj = js.Dynamic.literal(mids = mids.asInstanceOf[js.Any], semantics = semantics.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPGroup]
  }
  
  extension [Self <: SDPGroup](x: Self) {
    
    inline def setMids(value: js.Array[String]): Self = StObject.set(x, "mids", value.asInstanceOf[js.Any])
    
    inline def setMidsVarargs(value: String*): Self = StObject.set(x, "mids", js.Array(value*))
    
    inline def setSemantics(value: String): Self = StObject.set(x, "semantics", value.asInstanceOf[js.Any])
  }
}
