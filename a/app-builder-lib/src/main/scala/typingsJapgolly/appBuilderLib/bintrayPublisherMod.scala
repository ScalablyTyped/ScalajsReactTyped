package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.appBuilderLibStrings.Bintray
import typingsJapgolly.builderUtilRuntime.publishOptionsMod.BintrayOptions
import typingsJapgolly.electronPublish.mod.HttpPublisher
import typingsJapgolly.electronPublish.mod.PublishContext
import typingsJapgolly.electronPublish.mod.PublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/BintrayPublisher", JSImport.Namespace)
@js.native
object bintrayPublisherMod extends js.Object {
  @js.native
  class BintrayPublisher protected () extends HttpPublisher {
    def this(context: PublishContext, info: BintrayOptions, version: String) = this()
    def this(context: PublishContext, info: BintrayOptions, version: String, options: PublishOptions) = this()
    val _versionPromise: js.Any = js.native
    val client: js.Any = js.native
    var init: js.Any = js.native
    val options: js.Any = js.native
    @JSName("providerName")
    val providerName_BintrayPublisher: Bintray = js.native
    val version: js.Any = js.native
    def deleteRelease(): js.Promise[Unit] = js.native
    def deleteRelease(isForce: Boolean): js.Promise[Unit] = js.native
  }
  
}

