package typingsJapgolly.geobuf

import typingsJapgolly.geojson.mod.GeoJSON
import typingsJapgolly.pbf.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geobuf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def decode(pbf: ^): GeoJSON = js.native
  def encode(obj: GeoJSON, pbf: ^): scala.scalajs.js.typedarray.Uint8Array = js.native
}

