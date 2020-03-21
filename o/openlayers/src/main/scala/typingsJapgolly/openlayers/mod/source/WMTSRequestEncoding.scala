package typingsJapgolly.openlayers.mod.source

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request encoding. One of 'KVP', 'REST'.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openlayers.openlayersStrings.KVP
  - typingsJapgolly.openlayers.openlayersStrings.REST
*/
trait WMTSRequestEncoding extends js.Object

object WMTSRequestEncoding {
  @scala.inline
  def KVP: typingsJapgolly.openlayers.openlayersStrings.KVP = this.cast("KVP")
  @scala.inline
  def REST: typingsJapgolly.openlayers.openlayersStrings.REST = this.cast("REST")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

