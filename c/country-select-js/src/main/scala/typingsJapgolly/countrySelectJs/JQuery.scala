package typingsJapgolly.countrySelectJs

import typingsJapgolly.countrySelectJs.CountrySelectJs.CountryData
import typingsJapgolly.countrySelectJs.CountrySelectJs.Options
import typingsJapgolly.countrySelectJs.countrySelectJsStrings.destroy
import typingsJapgolly.countrySelectJs.countrySelectJsStrings.getSelectedCountryData
import typingsJapgolly.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * initialize the plugin with optional options.
    */
  def countrySelect(): JQueryDeferred[Any] = js.native
  def countrySelect(method: String, value: String): Unit = js.native
  def countrySelect(options: Options): JQueryDeferred[Any] = js.native
  /**
    * Remove the plugin from the input, and unbind any event listeners.
    */
  @JSName("countrySelect")
  def countrySelect_destroy(method: destroy): Unit = js.native
  /**
    * Get the country data for the currently selected flag.
    */
  @JSName("countrySelect")
  def countrySelect_getSelectedCountryData(method: getSelectedCountryData): CountryData = js.native
}
