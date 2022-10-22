package typingsJapgolly.winrtUwp.Windows.ApplicationModel

import typingsJapgolly.winrtUwp.Windows.Foundation.Size
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an application's name, description, and logo. */
trait AppDisplayInfo extends StObject {
  
  /** Gets the application's description. */
  var description: String
  
  /** Gets the application's display name. */
  var displayName: String
  
  /**
    * Get the application's logo.
    * @param size The size of the rectangle in which the logo must fit.
    * @return The largest logo in your Package.appxmanifest file that will fit in the specified Size.
    */
  def getLogo(size: Size): RandomAccessStreamReference
}
object AppDisplayInfo {
  
  inline def apply(description: String, displayName: String, getLogo: Size => RandomAccessStreamReference): AppDisplayInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], getLogo = js.Any.fromFunction1(getLogo))
    __obj.asInstanceOf[AppDisplayInfo]
  }
  
  extension [Self <: AppDisplayInfo](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setGetLogo(value: Size => RandomAccessStreamReference): Self = StObject.set(x, "getLogo", js.Any.fromFunction1(value))
  }
}
