package typingsJapgolly.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Class extends StObject {
  
  /* private */ @JSName("Access.Class_typekey")
  var AccessDotClass_typekey: Class
}
object Class {
  
  inline def apply(AccessDotClass_typekey: Class): Class = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Access.Class_typekey")(AccessDotClass_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  
  extension [Self <: Class](x: Self) {
    
    inline def setAccessDotClass_typekey(value: Class): Self = StObject.set(x, "Access.Class_typekey", value.asInstanceOf[js.Any])
  }
}
