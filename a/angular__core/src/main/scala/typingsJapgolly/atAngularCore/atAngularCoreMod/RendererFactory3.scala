package typingsJapgolly.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererFactory3 extends js.Object {
  var begin: js.UndefOr[js.Function0[Unit]] = js.native
  var end: js.UndefOr[js.Function0[Unit]] = js.native
  def createRenderer(): Renderer3 = js.native
  def createRenderer(hostElement: Null, rendererType: RendererType2): Renderer3 = js.native
  def createRenderer(hostElement: RElement): Renderer3 = js.native
  def createRenderer(hostElement: RElement, rendererType: RendererType2): Renderer3 = js.native
}

