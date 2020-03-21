package typingsJapgolly.parcelBundler.mod

import typingsJapgolly.expressServeStaticCore.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.parcelBundler.parcelBundlerBooleans.`false`
import typingsJapgolly.parcelBundler.parcelBundlerBooleans.`true`
import typingsJapgolly.parcelBundler.parcelBundlerStrings.buildEnd
import typingsJapgolly.parcelBundler.parcelBundlerStrings.buildError
import typingsJapgolly.parcelBundler.parcelBundlerStrings.buildStart
import typingsJapgolly.parcelBundler.parcelBundlerStrings.bundled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParcelBundler extends js.Object {
  def addAssetType(extension: String, path: String): Unit = js.native
  def addPackager(`type`: String, packager: String): Unit = js.native
  def bundle(): js.Promise[ParcelBundle] = js.native
  def middleware(): js.Function3[
    /* req */ Request[ParamsDictionary, _, _], 
    /* res */ Response[_], 
    /* next */ NextFunction, 
    _
  ] = js.native
  @JSName("off")
  def off_buildEnd(name: buildEnd, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_buildError(name: buildError, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_buildStart(name: buildStart, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_bundled(name: bundled, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_buildEnd(name: buildEnd, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_buildError(name: buildError, cb: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  @JSName("on")
  def on_buildStart(name: buildStart, cb: js.Function1[/* entryPoints */ js.Array[String], Unit]): Unit = js.native
  @JSName("on")
  def on_bundled(name: bundled, cb: js.Function1[/* bundle */ ParcelBundle, Unit]): Unit = js.native
  def serve(): js.Promise[Server | typingsJapgolly.node.httpsMod.Server] = js.native
  def serve(port: Double): js.Promise[Server | typingsJapgolly.node.httpsMod.Server] = js.native
  def serve(port: Double, https: HttpsOptions): js.Promise[Server | typingsJapgolly.node.httpsMod.Server] = js.native
  def serve(port: Double, https: HttpsOptions, host: String): js.Promise[Server | typingsJapgolly.node.httpsMod.Server] = js.native
  @JSName("serve")
  def serve_false(port: Double, https: `false`): js.Promise[Server | typingsJapgolly.node.httpsMod.Server] = js.native
  @JSName("serve")
  def serve_false(port: Double, https: `false`, host: String): js.Promise[Server | typingsJapgolly.node.httpsMod.Server] = js.native
  @JSName("serve")
  def serve_true(port: Double, https: `true`): js.Promise[Server | typingsJapgolly.node.httpsMod.Server] = js.native
  @JSName("serve")
  def serve_true(port: Double, https: `true`, host: String): js.Promise[Server | typingsJapgolly.node.httpsMod.Server] = js.native
}

