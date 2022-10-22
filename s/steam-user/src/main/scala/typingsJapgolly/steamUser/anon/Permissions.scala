package typingsJapgolly.steamUser.anon

import typingsJapgolly.steamUser.mod.EChatPermission
import typingsJapgolly.steamUser.mod.EClanRank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permissions extends StObject {
  
  var permissions: EChatPermission
  
  var rank: EClanRank
}
object Permissions {
  
  inline def apply(permissions: EChatPermission, rank: EClanRank): Permissions = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permissions]
  }
  
  extension [Self <: Permissions](x: Self) {
    
    inline def setPermissions(value: EChatPermission): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setRank(value: EClanRank): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
  }
}
