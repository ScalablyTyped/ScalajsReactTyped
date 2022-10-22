package typingsJapgolly.nodeZendesk.mod.Users

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/users#update-user|Zendesk Users Update}
  */
trait UpdateModel
  extends StObject
     with BaseModel {
  
  var name: js.UndefOr[String] = js.undefined
}
object UpdateModel {
  
  inline def apply(): UpdateModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateModel]
  }
  
  extension [Self <: UpdateModel](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
