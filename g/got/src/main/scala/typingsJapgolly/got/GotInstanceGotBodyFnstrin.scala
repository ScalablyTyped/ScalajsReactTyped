package typingsJapgolly.got

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.got.mod.GotBodyFn
import typingsJapgolly.got.mod.GotBodyOptions
import typingsJapgolly.got.mod.GotEmitter
import typingsJapgolly.got.mod.GotExtend
import typingsJapgolly.got.mod.GotFormOptions
import typingsJapgolly.got.mod.GotJSONOptions
import typingsJapgolly.got.mod.GotOptions
import typingsJapgolly.got.mod.GotPromise
import typingsJapgolly.got.mod.GotStreamFn
import typingsJapgolly.got.mod.GotUrl
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined got.got.GotInstance<got.got.GotBodyFn<string>> */
@js.native
trait GotInstanceGotBodyFnstrin extends js.Object {
  var CancelError: Instantiable0[typingsJapgolly.got.mod.CancelError] = js.native
  var HTTPError: Instantiable0[typingsJapgolly.got.mod.HTTPError] = js.native
  var MaxRedirectsError: Instantiable0[typingsJapgolly.got.mod.MaxRedirectsError] = js.native
  var ParseError: Instantiable0[typingsJapgolly.got.mod.ParseError] = js.native
  var ReadError: Instantiable0[typingsJapgolly.got.mod.ReadError] = js.native
  var RequestError: Instantiable0[typingsJapgolly.got.mod.RequestError] = js.native
  var TimeoutError: Instantiable0[typingsJapgolly.got.mod.TimeoutError] = js.native
  var UnsupportedProtocolError: Instantiable0[typingsJapgolly.got.mod.UnsupportedProtocolError] = js.native
  @JSName("delete")
  var delete_Original: GotBodyFn[String] = js.native
  @JSName("extend")
  var extend_Original: GotExtend = js.native
  @JSName("get")
  var get_Original: GotBodyFn[String] = js.native
  @JSName("head")
  var head_Original: GotBodyFn[String] = js.native
  @JSName("patch")
  var patch_Original: GotBodyFn[String] = js.native
  @JSName("post")
  var post_Original: GotBodyFn[String] = js.native
  @JSName("put")
  var put_Original: GotBodyFn[String] = js.native
  @JSName("stream")
  var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
  def apply(url: GotUrl): GotPromise[String | Buffer] = js.native
  def apply(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
  def delete(url: GotUrl): GotPromise[String | Buffer] = js.native
  def delete(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
  def extend(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
  def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
  def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
  @JSName("extend")
  def extend_GotInstanceGotBodyFnnull(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
  @JSName("extend")
  def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
  def get(url: GotUrl): GotPromise[String | Buffer] = js.native
  def get(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
  def head(url: GotUrl): GotPromise[String | Buffer] = js.native
  def head(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
  def patch(url: GotUrl): GotPromise[String | Buffer] = js.native
  def patch(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
  def post(url: GotUrl): GotPromise[String | Buffer] = js.native
  def post(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
  def put(url: GotUrl): GotPromise[String | Buffer] = js.native
  def put(url: GotUrl, options: GotBodyOptions[String]): GotPromise[String | Buffer] = js.native
  def stream(url: GotUrl): GotEmitter with Duplex = js.native
  def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
}

