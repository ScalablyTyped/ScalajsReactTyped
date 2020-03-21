package typingsJapgolly.lifeomicAxiosFetch

import typingsJapgolly.axios.mod.AxiosInstance
import typingsJapgolly.axios.mod.AxiosTransformer
import typingsJapgolly.nodeFetch.mod.RequestInfo
import typingsJapgolly.nodeFetch.mod.RequestInit
import typingsJapgolly.nodeFetch.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lifeomic/axios-fetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def buildAxiosFetch(axios: AxiosInstance): js.Function2[/* url */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]] = js.native
  def buildAxiosFetch(axios: AxiosInstance, transformer: AxiosTransformer): js.Function2[/* url */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]] = js.native
}

