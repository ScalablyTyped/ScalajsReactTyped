package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountIds
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var accountIds: js.Array[String]
}
object AccountIds {
  
  inline def apply(accountIds: js.Array[String]): AccountIds = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountIds]
  }
  
  extension [Self <: AccountIds](x: Self) {
    
    inline def setAccountIds(value: js.Array[String]): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: String*): Self = StObject.set(x, "accountIds", js.Array(value*))
  }
}
