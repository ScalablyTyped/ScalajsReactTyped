package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.appBuilderLibStrings.Spaces
import typingsJapgolly.appBuilderLib.baseS3PublisherMod.BaseS3Publisher
import typingsJapgolly.builderUtilRuntime.publishOptionsMod.SpacesOptions
import typingsJapgolly.electronPublish.mod.PublishContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/s3/spacesPublisher", JSImport.Namespace)
@js.native
object spacesPublisherMod extends js.Object {
  @js.native
  trait SpacesPublisher extends BaseS3Publisher {
    val info: js.Any = js.native
    @JSName("providerName")
    val providerName_SpacesPublisher: Spaces = js.native
  }
  
  @js.native
  class default protected () extends SpacesPublisher {
    def this(context: PublishContext, info: SpacesOptions) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def checkAndResolveOptions(options: SpacesOptions, channelFromAppVersion: String, errorIfCannot: Boolean): js.Promise[Unit] = js.native
    def checkAndResolveOptions(options: SpacesOptions, channelFromAppVersion: Null, errorIfCannot: Boolean): js.Promise[Unit] = js.native
  }
  
}

