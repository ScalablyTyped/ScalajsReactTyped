package typingsJapgolly.appleMapkitJs.mapkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialization options for MapKit JS.
  */
trait MapKitInitOptions extends js.Object {
  /**
    * An ID that indicates the preferred language in which to display map
    * labels, controls, directions, and other text.
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * A callback function that obtains a token.
    *
    * @param done A function that completes the MapKit JS token request. Called
    * after creating a new token.
    */
  def authorizationCallback(done: js.Function1[/* token */ String, Unit]): Unit
}

object MapKitInitOptions {
  @scala.inline
  def apply(authorizationCallback: js.Function1[/* token */ String, Unit] => Callback, language: String = null): MapKitInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorizationCallback")(js.Any.fromFunction1((t0: js.Function1[/* token */ java.lang.String, scala.Unit]) => authorizationCallback(t0).runNow()))
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapKitInitOptions]
  }
}

