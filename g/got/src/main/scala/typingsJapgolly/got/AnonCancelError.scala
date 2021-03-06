package typingsJapgolly.got

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.got.mod.GotBodyOptions
import typingsJapgolly.got.mod.GotEmitter
import typingsJapgolly.got.mod.GotExtend
import typingsJapgolly.got.mod.GotFormOptions
import typingsJapgolly.got.mod.GotJSONOptions
import typingsJapgolly.got.mod.GotOptions
import typingsJapgolly.got.mod.GotStreamFn
import typingsJapgolly.got.mod.GotUrl
import typingsJapgolly.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelError extends js.Object {
  var CancelError: Instantiable0[typingsJapgolly.got.mod.CancelError] = js.native
  var HTTPError: Instantiable0[typingsJapgolly.got.mod.HTTPError] = js.native
  var MaxRedirectsError: Instantiable0[typingsJapgolly.got.mod.MaxRedirectsError] = js.native
  var ParseError: Instantiable0[typingsJapgolly.got.mod.ParseError] = js.native
  var ReadError: Instantiable0[typingsJapgolly.got.mod.ReadError] = js.native
  var RequestError: Instantiable0[typingsJapgolly.got.mod.RequestError] = js.native
  var TimeoutError: Instantiable0[typingsJapgolly.got.mod.TimeoutError] = js.native
  var UnsupportedProtocolError: Instantiable0[typingsJapgolly.got.mod.UnsupportedProtocolError] = js.native
  @JSName("extend")
  var extend_Original: GotExtend = js.native
  @JSName("stream")
  var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
  def extend(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
  def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
  def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
  @JSName("extend")
  def extend_GotInstanceGotBodyFnnull(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
  @JSName("extend")
  def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
  def stream(url: GotUrl): GotEmitter with Duplex = js.native
  def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
}

