package typingsJapgolly.appleMapkitJsBrowser.mapkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initialization options for MapKit JS.
  */
trait MapKitInitOptions extends StObject {
  
  /**
    * A callback function that obtains a token.
    *
    * @param done A function that completes the MapKit JS token request. Called
    * after creating a new token.
    */
  def authorizationCallback(done: js.Function1[/* token */ String, Unit]): Unit
  
  /**
    * An ID that indicates the preferred language in which to display map
    * labels, controls, directions, and other text.
    */
  var language: js.UndefOr[String] = js.undefined
}
object MapKitInitOptions {
  
  inline def apply(authorizationCallback: js.Function1[/* token */ String, Unit] => Callback): MapKitInitOptions = {
    val __obj = js.Dynamic.literal(authorizationCallback = js.Any.fromFunction1((t0: js.Function1[/* token */ String, Unit]) => authorizationCallback(t0).runNow()))
    __obj.asInstanceOf[MapKitInitOptions]
  }
  
  extension [Self <: MapKitInitOptions](x: Self) {
    
    inline def setAuthorizationCallback(value: js.Function1[/* token */ String, Unit] => Callback): Self = StObject.set(x, "authorizationCallback", js.Any.fromFunction1((t0: js.Function1[/* token */ String, Unit]) => value(t0).runNow()))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
