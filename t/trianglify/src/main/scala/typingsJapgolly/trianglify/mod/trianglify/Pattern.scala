package typingsJapgolly.trianglify.mod.trianglify

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern extends js.Object {
  var opts: Options = js.native
  var polys: js.Any = js.native
  def canvas(): HTMLCanvasElement = js.native
  def canvas(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
  def png(): String = js.native
  def svg(): SVGElement = js.native
  def svg(opts: SVGOptions): SVGElement = js.native
}

