package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.userResource
  **/
trait IUserResource extends StObject {
  
  def disableUser(userId: Double): Unit
}
object IUserResource {
  
  inline def apply(disableUser: Double => Callback): IUserResource = {
    val __obj = js.Dynamic.literal(disableUser = js.Any.fromFunction1((t0: Double) => disableUser(t0).runNow()))
    __obj.asInstanceOf[IUserResource]
  }
  
  extension [Self <: IUserResource](x: Self) {
    
    inline def setDisableUser(value: Double => Callback): Self = StObject.set(x, "disableUser", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
