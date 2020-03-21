package typingsJapgolly.backboneFetchCache.mod.backboneAugmentingMod

import typingsJapgolly.backbone.mod.Collection
import typingsJapgolly.backbone.mod.Model
import typingsJapgolly.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionWithCache extends Collection[Model] {
  def fetch(options: CollectionFetchWithCacheOptions): JQueryXHR = js.native
}

