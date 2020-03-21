package typingsJapgolly.tanemSvgInjector

import org.scalajs.dom.raw.Element
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector/dist/clone-svg", JSImport.Namespace)
@js.native
object cloneSvgMod extends js.Object {
  def default(sourceSvg: HTMLElement): Element = js.native
  def default(sourceSvg: SVGSVGElement): Element = js.native
}

