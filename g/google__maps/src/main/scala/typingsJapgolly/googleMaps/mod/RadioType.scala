package typingsJapgolly.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleMaps.googleMapsStrings.lte
  - typingsJapgolly.googleMaps.googleMapsStrings.gsm
  - typingsJapgolly.googleMaps.googleMapsStrings.cdma
  - typingsJapgolly.googleMaps.googleMapsStrings.wcdma
*/
trait RadioType extends js.Object

object RadioType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cdma: typingsJapgolly.googleMaps.googleMapsStrings.cdma = this.cast("cdma")
  @scala.inline
  def gsm: typingsJapgolly.googleMaps.googleMapsStrings.gsm = this.cast("gsm")
  @scala.inline
  def lte: typingsJapgolly.googleMaps.googleMapsStrings.lte = this.cast("lte")
  @scala.inline
  def wcdma: typingsJapgolly.googleMaps.googleMapsStrings.wcdma = this.cast("wcdma")
}

