package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ContactChanged event. */
trait ContactChangedEventArgs extends StObject {
  
  /**
    * Gets the ContactChangedDeferral object to use for asynchronous operations.
    * @return The deferral object to use for asynchronous operations.
    */
  def getDeferral(): ContactChangedDeferral
}
object ContactChangedEventArgs {
  
  inline def apply(getDeferral: CallbackTo[ContactChangedDeferral]): ContactChangedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[ContactChangedEventArgs]
  }
  
  extension [Self <: ContactChangedEventArgs](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[ContactChangedDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
