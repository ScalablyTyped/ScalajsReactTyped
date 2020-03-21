package typingsJapgolly.electronPublish.mod

import typingsJapgolly.builderUtil.archMod.Arch
import typingsJapgolly.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-publish", "HttpPublisher")
@js.native
abstract class HttpPublisher protected () extends Publisher {
  protected def this(context: PublishContext) = this()
  protected def this(context: PublishContext, useSafeArtifactName: Boolean) = this()
  val useSafeArtifactName: js.Any = js.native
  /* protected */ def doUpload(
    fileName: String,
    arch: Arch,
    dataLength: Double,
    requestProcessor: js.Function2[
      /* request */ ClientRequest, 
      /* reject */ js.Function1[/* error */ js.Error, Unit], 
      Unit
    ]
  ): js.Promise[_] = js.native
  /* protected */ def doUpload(
    fileName: String,
    arch: Arch,
    dataLength: Double,
    requestProcessor: js.Function2[
      /* request */ ClientRequest, 
      /* reject */ js.Function1[/* error */ js.Error, Unit], 
      Unit
    ],
    file: String
  ): js.Promise[_] = js.native
}

