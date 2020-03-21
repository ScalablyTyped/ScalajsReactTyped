package typingsJapgolly.powerappsComponentFramework.ComponentFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The resource interface of context.resources
	 */
trait Resources extends js.Object {
  /**
  		 * Gets a resource referenced by the control manifest.
  		 * @param id The resource string identifier.
  		 * @param success The success callback. Resource data is returned in base 64 encoded format.
  		 * @param failure The failure callback.
  		 */
  def getResource(id: String, success: js.Function1[/* data */ String, Unit], failure: js.Function0[Unit]): Unit
  /**
  		 * Get the localized string for the given identifier.
  		 * @param id name of resource in the control manifest.
  		 */
  def getString(id: String): String
}

object Resources {
  @scala.inline
  def apply(
    getResource: (String, js.Function1[/* data */ String, Unit], js.Function0[Unit]) => Callback,
    getString: String => CallbackTo[String]
  ): Resources = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getResource")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Function1[/* data */ java.lang.String, scala.Unit], t2: js.Function0[scala.Unit]) => getResource(t0, t1, t2).runNow()))
    __obj.updateDynamic("getString")(js.Any.fromFunction1((t0: java.lang.String) => getString(t0).runNow()))
    __obj.asInstanceOf[Resources]
  }
}

