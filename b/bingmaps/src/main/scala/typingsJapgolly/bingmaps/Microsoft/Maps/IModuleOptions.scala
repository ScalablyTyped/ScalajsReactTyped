package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModuleOptions extends js.Object {
  /** 
    * @deprecated
    * A callback function that is fired after the module has loaded.
    * It is recommended that the Bing Maps key be set as a URL parameter of the Bing Maps script reference.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** A Bing Maps key that is used with the module when the module is loaded without a map. */
  var credentials: js.UndefOr[String] = js.undefined
  /** A function that is called if there is an error loading the module. */
  var errorCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IModuleOptions {
  @scala.inline
  def apply(
    callback: js.UndefOr[Callback] = js.undefined,
    credentials: String = null,
    errorCallback: js.UndefOr[Callback] = js.undefined
  ): IModuleOptions = {
    val __obj = js.Dynamic.literal()
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    errorCallback.foreach(p => __obj.updateDynamic("errorCallback")(p.toJsFn))
    __obj.asInstanceOf[IModuleOptions]
  }
}

