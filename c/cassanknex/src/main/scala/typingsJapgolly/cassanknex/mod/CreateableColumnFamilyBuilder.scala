package typingsJapgolly.cassanknex.mod

import typingsJapgolly.cassanknex.cassanknexStrings.asc
import typingsJapgolly.cassanknex.cassanknexStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateableColumnFamilyBuilder[T] extends js.Object {
  def withCaching(): this.type = js.native
  @JSName("withClusteringOrderBy")
  def withClusteringOrderBy_asc[K /* <: String */](value: K, direction: asc): this.type = js.native
  @JSName("withClusteringOrderBy")
  def withClusteringOrderBy_desc[K /* <: String */](value: K, direction: desc): this.type = js.native
  def withCompaction(): this.type = js.native
  def withCompression(): this.type = js.native
}

