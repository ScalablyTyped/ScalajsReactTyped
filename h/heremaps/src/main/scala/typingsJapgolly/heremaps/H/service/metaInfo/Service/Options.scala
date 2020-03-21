package typingsJapgolly.heremaps.H.service.metaInfo.Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property type {string=} - the type of the map tile service to communicate with, e.g. 'base' (default), 'aerial', etc. (refer to the Map Tile REST API documentation for
  * available types)
  * @property version {string=} - the map version hash to use for retrieving tiles, default is newest and will be automatically updated
  * @property subDomain {string=} - the sub-domain of the map tile service relative to the platform's base URL, default is 'maps'
  */
trait Options extends js.Object {
  var subDomain: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(subDomain: String = null, `type`: String = null, version: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (subDomain != null) __obj.updateDynamic("subDomain")(subDomain.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

