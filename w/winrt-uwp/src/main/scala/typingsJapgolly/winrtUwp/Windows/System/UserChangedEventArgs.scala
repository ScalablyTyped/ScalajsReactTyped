package typingsJapgolly.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a user changed event. */
trait UserChangedEventArgs extends StObject {
  
  /** Gets the user. */
  var user: User
}
object UserChangedEventArgs {
  
  inline def apply(user: User): UserChangedEventArgs = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserChangedEventArgs]
  }
  
  extension [Self <: UserChangedEventArgs](x: Self) {
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
