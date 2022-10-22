package typingsJapgolly.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalPermission extends StObject {
  
  /** Permission value. */
  var permission: js.UndefOr[String] = js.undefined
}
object GlobalPermission {
  
  inline def apply(): GlobalPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalPermission]
  }
  
  extension [Self <: GlobalPermission](x: Self) {
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
