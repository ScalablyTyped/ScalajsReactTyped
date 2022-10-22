package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the deferral process. */
trait EmailMailboxChangedEventArgs extends StObject {
  
  /**
    * Gets the deferral object.
    * @return The deferral object.
    */
  def getDeferral(): EmailMailboxChangedDeferral
}
object EmailMailboxChangedEventArgs {
  
  inline def apply(getDeferral: CallbackTo[EmailMailboxChangedDeferral]): EmailMailboxChangedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[EmailMailboxChangedEventArgs]
  }
  
  extension [Self <: EmailMailboxChangedEventArgs](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[EmailMailboxChangedDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
