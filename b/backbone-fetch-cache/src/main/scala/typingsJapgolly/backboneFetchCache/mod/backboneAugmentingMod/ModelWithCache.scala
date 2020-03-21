package typingsJapgolly.backboneFetchCache.mod.backboneAugmentingMod

import typingsJapgolly.backbone.mod.Model
import typingsJapgolly.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelWithCache extends Model {
  def fetch(options: ModelFetchWithCacheOptions): JQueryXHR = js.native
}

