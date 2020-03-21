package typingsJapgolly.appBuilderLib.snapStorePublisherMod

import typingsJapgolly.appBuilderLib.appBuilderLibStrings.snapStore
import typingsJapgolly.electronPublish.mod.PublishContext
import typingsJapgolly.electronPublish.mod.Publisher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/SnapStorePublisher", "SnapStorePublisher")
@js.native
class SnapStorePublisher protected () extends Publisher {
  def this(context: PublishContext, options: SnapStoreOptions) = this()
  var options: js.Any = js.native
  @JSName("providerName")
  val providerName_SnapStorePublisher: snapStore = js.native
}

