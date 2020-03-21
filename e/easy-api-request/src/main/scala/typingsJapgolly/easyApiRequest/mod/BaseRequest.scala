package typingsJapgolly.easyApiRequest.mod

import typingsJapgolly.bunyan.mod.^
import typingsJapgolly.easyApiRequest.AnonCb
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.request.mod.Request
import typingsJapgolly.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseRequest extends js.Object {
  var base: Request = js.native
  var jSend: Boolean = js.native
  var log: ^ = js.native
  var replyCookies: js.Array[String] = js.native
  var req: Request_[ParamsDictionary] = js.native
  def _do(args: IArguments): js.Any = js.native
  def _do(args: IArguments, `type`: String): js.Any = js.native
  def _parseOptions(args: IArguments, `type`: String): AnonCb = js.native
  def _request(): js.Any = js.native
  def _request(opts: js.Any): js.Any = js.native
  def _request(opts: js.Any, cb: js.Any): js.Any = js.native
  def del(): js.Any = js.native
  def del(url: js.Any): js.Any = js.native
  def del(url: js.Any, opts: js.Any): js.Any = js.native
  def del(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
  def get(): js.Any = js.native
  def get(url: js.Any): js.Any = js.native
  def get(url: js.Any, opts: js.Any): js.Any = js.native
  def get(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
  def patch(): js.Any = js.native
  def patch(url: js.Any): js.Any = js.native
  def patch(url: js.Any, opts: js.Any): js.Any = js.native
  def patch(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
  def post(): js.Any = js.native
  def post(url: js.Any): js.Any = js.native
  def post(url: js.Any, opts: js.Any): js.Any = js.native
  def post(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
}

