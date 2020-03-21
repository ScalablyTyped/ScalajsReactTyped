package typingsJapgolly.openlayers.mod.control.ScaleLine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Units for the scale line. Supported values are `'degrees'`, `'imperial'`,
  * `'nautical'`, `'metric'`, `'us'`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openlayers.openlayersStrings.degrees
  - typingsJapgolly.openlayers.openlayersStrings.imperial
  - typingsJapgolly.openlayers.openlayersStrings.nautical
  - typingsJapgolly.openlayers.openlayersStrings.metric
  - typingsJapgolly.openlayers.openlayersStrings.us
*/
trait Units extends js.Object

object Units {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def degrees: typingsJapgolly.openlayers.openlayersStrings.degrees = this.cast("degrees")
  @scala.inline
  def imperial: typingsJapgolly.openlayers.openlayersStrings.imperial = this.cast("imperial")
  @scala.inline
  def metric: typingsJapgolly.openlayers.openlayersStrings.metric = this.cast("metric")
  @scala.inline
  def nautical: typingsJapgolly.openlayers.openlayersStrings.nautical = this.cast("nautical")
  @scala.inline
  def us: typingsJapgolly.openlayers.openlayersStrings.us = this.cast("us")
}

