package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.checkpointResponseMod.CheckpointResponse
import typingsJapgolly.instagramPrivateApi.igResponseErrorMod.IgResponseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-checkpoint.error", JSImport.Namespace)
@js.native
object igCheckpointErrorMod extends js.Object {
  @js.native
  class IgCheckpointError () extends IgResponseError[CheckpointResponse] {
    def apiUrl(): String = js.native
    def url(): String = js.native
  }
  
}

