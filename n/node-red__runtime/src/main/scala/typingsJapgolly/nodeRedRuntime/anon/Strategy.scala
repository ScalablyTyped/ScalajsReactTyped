package typingsJapgolly.nodeRedRuntime.anon

import typingsJapgolly.nodeRedRuntime.mod.UsernamePermissions
import typingsJapgolly.nodeRedRuntime.nodeRedRuntimeStrings.strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Strategy extends StObject {
  
  var strategy: Icon
  
  var `type`: strategy
  
  var users: js.Array[UsernamePermissions]
}
object Strategy {
  
  inline def apply(strategy: Icon, users: js.Array[UsernamePermissions]): Strategy = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("strategy")
    __obj.asInstanceOf[Strategy]
  }
  
  extension [Self <: Strategy](x: Self) {
    
    inline def setStrategy(value: Icon): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setType(value: strategy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: js.Array[UsernamePermissions]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: UsernamePermissions*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
