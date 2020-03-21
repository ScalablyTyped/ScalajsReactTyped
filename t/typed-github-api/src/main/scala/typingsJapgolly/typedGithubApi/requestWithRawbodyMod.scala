package typingsJapgolly.typedGithubApi

import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/utils/request-with-rawbody", JSImport.Namespace)
@js.native
object requestWithRawbodyMod extends js.Object {
  @js.native
  trait RequestWithRawBody
    extends Request[ParamsDictionary, js.Any, js.Any] {
    var rawBody: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array] = js.native
  }
  
}

