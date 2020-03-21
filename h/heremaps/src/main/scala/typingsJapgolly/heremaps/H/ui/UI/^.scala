package typingsJapgolly.heremaps.H.ui.UI

import typingsJapgolly.heremaps.H.Map_
import typingsJapgolly.heremaps.H.service.DefaultLayers
import typingsJapgolly.heremaps.H.service.Platform.MapTypes
import typingsJapgolly.heremaps.H.ui.i18n.Localization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("H.ui.UI")
@js.native
object ^ extends js.Object {
  def createDefault(map: Map_, mapTypes: DefaultLayers): typingsJapgolly.heremaps.H.ui.UI = js.native
  def createDefault(map: Map_, mapTypes: DefaultLayers, opt_locale: String): typingsJapgolly.heremaps.H.ui.UI = js.native
  def createDefault(map: Map_, mapTypes: DefaultLayers, opt_locale: Localization): typingsJapgolly.heremaps.H.ui.UI = js.native
  /**
    * This function creates the default UI including the zoom control,
    * map settings control and scalebar and panorama discovery control.
    * The default controls will be assigned the following values:
    *
    * Zoom control:
    *     id: 'zoom'
    *     alignment: 'right-middle'
    * Map settings control:
    *     id: 'mapsettings'
    *     alignment: 'bottom-right'
    * Scalebar:
    *     id: 'scalebar'
    *     alignment: 'bottom-right'
    * Pano:
    *     id: 'panorama'
    *     alignment: 'top-right'
    *
    * @param map {H.Map} - The map instance to which to append the UI
    * @param mapTypes {Object<H.service.MapType>} - The map types to use
    * @param opt_locale {(H.ui.i18n.Localization | string)=} - the language to use (or a full localization object).
    * @returns {H.ui.UI} - the UI instance configured with the default controls
    */
  def createDefault(map: Map_, mapTypes: MapTypes): typingsJapgolly.heremaps.H.ui.UI = js.native
  def createDefault(map: Map_, mapTypes: MapTypes, opt_locale: String): typingsJapgolly.heremaps.H.ui.UI = js.native
  def createDefault(map: Map_, mapTypes: MapTypes, opt_locale: Localization): typingsJapgolly.heremaps.H.ui.UI = js.native
}

