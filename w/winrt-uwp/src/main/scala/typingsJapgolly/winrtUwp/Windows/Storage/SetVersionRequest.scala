package typingsJapgolly.winrtUwp.Windows.Storage

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app sets the version of the application data in its app data store. */
trait SetVersionRequest extends StObject {
  
  /** Gets the current version. */
  var currentVersion: Double
  
  /** Gets the requested version. */
  var desiredVersion: Double
  
  /**
    * Requests that the set version request be delayed.
    * @return The set version deferral.
    */
  def getDeferral(): SetVersionDeferral
}
object SetVersionRequest {
  
  inline def apply(currentVersion: Double, desiredVersion: Double, getDeferral: CallbackTo[SetVersionDeferral]): SetVersionRequest = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], desiredVersion = desiredVersion.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[SetVersionRequest]
  }
  
  extension [Self <: SetVersionRequest](x: Self) {
    
    inline def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setDesiredVersion(value: Double): Self = StObject.set(x, "desiredVersion", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[SetVersionDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
