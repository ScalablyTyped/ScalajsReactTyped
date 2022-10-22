package typingsJapgolly.atvlegacycontentkit

import japgolly.scalajs.react.Callback
import typingsJapgolly.atvlegacycontentkit.atv.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The event type used for onNavigate and onRefresh.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVNavigateEvent extends StObject {
  
  /**
    * Loading the page failed, so show an error message to the user.
    * @param errorMessage The error message to show to the user.
    */
  def failure(errorMessage: String): Unit
  
  /**
    * The ID of the navigation item to navigate to.
    */
  var navigationItemId: String
  
  /**
    * The loading of the page to navigate to was successful, so load it.
    * @param document The document to load.
    */
  def success(document: Document): Unit
}
object ATVNavigateEvent {
  
  inline def apply(failure: String => Callback, navigationItemId: String, success: Document => Callback): ATVNavigateEvent = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1((t0: String) => failure(t0).runNow()), navigationItemId = navigationItemId.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: Document) => success(t0).runNow()))
    __obj.asInstanceOf[ATVNavigateEvent]
  }
  
  extension [Self <: ATVNavigateEvent](x: Self) {
    
    inline def setFailure(value: String => Callback): Self = StObject.set(x, "failure", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setNavigationItemId(value: String): Self = StObject.set(x, "navigationItemId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Document => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Document) => value(t0).runNow()))
  }
}
