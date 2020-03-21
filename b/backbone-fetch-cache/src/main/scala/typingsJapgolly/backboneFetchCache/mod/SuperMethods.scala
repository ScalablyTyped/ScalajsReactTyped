package typingsJapgolly.backboneFetchCache.mod

import typingsJapgolly.backbone.mod.CollectionFetchOptions
import typingsJapgolly.backbone.mod.ModelFetchOptions
import typingsJapgolly.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuperMethods extends js.Object {
  def collectionFetch(): JQueryXHR = js.native
  def collectionFetch(options: CollectionFetchOptions): JQueryXHR = js.native
  def modelFetch(): JQueryXHR = js.native
  def modelFetch(options: ModelFetchOptions): JQueryXHR = js.native
  def modelSync(arg: js.Any*): JQueryXHR = js.native
}

