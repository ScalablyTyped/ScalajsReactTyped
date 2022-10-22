package typingsJapgolly.kafkajs.anon

import typingsJapgolly.kafkajs.mod.AclEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acl extends StObject {
  
  var acl: js.Array[AclEntry]
}
object Acl {
  
  inline def apply(acl: js.Array[AclEntry]): Acl = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acl]
  }
  
  extension [Self <: Acl](x: Self) {
    
    inline def setAcl(value: js.Array[AclEntry]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclVarargs(value: AclEntry*): Self = StObject.set(x, "acl", js.Array(value*))
  }
}
