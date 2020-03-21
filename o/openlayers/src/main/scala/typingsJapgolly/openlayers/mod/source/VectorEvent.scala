package typingsJapgolly.openlayers.mod.source

import typingsJapgolly.openlayers.mod.Feature
import typingsJapgolly.openlayers.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Events emitted by {@link ol.source.Vector} instances are instances of this
  * type.
  *
  * @param type Type.
  * @param opt_feature Feature.
  */
@JSImport("openlayers", "source.VectorEvent")
@js.native
class VectorEvent protected () extends Event {
  /**
    * @classdesc
    * Events emitted by {@link ol.source.Vector} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param opt_feature Feature.
    */
  def this(`type`: String) = this()
  def this(`type`: String, opt_feature: Feature) = this()
  /**
    * The feature being added or removed.
    * @api stable
    */
  var feature: Feature = js.native
}

