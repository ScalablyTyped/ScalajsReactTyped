package typingsJapgolly.winrtUwp.Windows.Security.EnterpriseData

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when content protection is being suspended. */
trait ProtectedAccessSuspendingEventArgs extends StObject {
  
  /** DateTime at which content protection will be suspended. The app can subtract DateTime.Now from this value to determine how much time there is to perform any processing before the suspension occurs. */
  var deadline: js.Date
  
  /**
    * Gets the Deferral object that manages the protection suspension. The app must call Deferral.Complete before it returns from the event handler.
    * @return The Deferral object.
    */
  def getDeferral(): Deferral
  
  /** Contains the enterprise identities for which content protection is being suspended. */
  var identities: IVectorView[String]
}
object ProtectedAccessSuspendingEventArgs {
  
  inline def apply(deadline: js.Date, getDeferral: CallbackTo[Deferral], identities: IVectorView[String]): ProtectedAccessSuspendingEventArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, identities = identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedAccessSuspendingEventArgs]
  }
  
  extension [Self <: ProtectedAccessSuspendingEventArgs](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[Deferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setIdentities(value: IVectorView[String]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
  }
}
