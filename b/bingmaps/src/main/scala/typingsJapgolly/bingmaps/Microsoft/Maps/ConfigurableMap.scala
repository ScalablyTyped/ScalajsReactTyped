package typingsJapgolly.bingmaps.Microsoft.Maps

import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.ConfigurableMap")
@js.native
class ConfigurableMap () extends js.Object

/* static members */
@JSGlobal("Microsoft.Maps.ConfigurableMap")
@js.native
object ConfigurableMap extends js.Object {
  /**
    * A static function that loads a map using a JSON configuraiton file.
    * @param element The parent element of the map as a CSS selector string or HTMLElement.
    * @param configFileUrl The Url to download the JSON configuration file from. This should JSON file should contain a IConfigurableMapOptions object.
    * @param withCredentials Creates the config file request with the setwithcredentials property.
    * @param requestHeaders Set of headers that need to be added to config file request.
    * @param callback Callback that is triggered when the map loads successfully.
    * @param errorCallback Callback that is triggered when an error occurs when loading the map.
    */
  def createFromConfig(element: String, configFileUrl: String, withCredentials: Boolean): Unit = js.native
  def createFromConfig(
    element: String,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String]
  ): Unit = js.native
  def createFromConfig(
    element: String,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String],
    callback: js.Function1[/* map */ Map, Unit]
  ): Unit = js.native
  def createFromConfig(
    element: String,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String],
    callback: js.Function1[/* map */ Map, Unit],
    errorCallback: js.Function1[/* errorMsg */ String, Unit]
  ): Unit = js.native
  def createFromConfig(element: HTMLElement, configFileUrl: String, withCredentials: Boolean): Unit = js.native
  def createFromConfig(
    element: HTMLElement,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String]
  ): Unit = js.native
  def createFromConfig(
    element: HTMLElement,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String],
    callback: js.Function1[/* map */ Map, Unit]
  ): Unit = js.native
  def createFromConfig(
    element: HTMLElement,
    configFileUrl: String,
    withCredentials: Boolean,
    requestHeaders: IDictionary[String],
    callback: js.Function1[/* map */ Map, Unit],
    errorCallback: js.Function1[/* errorMsg */ String, Unit]
  ): Unit = js.native
}

