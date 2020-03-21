package typingsJapgolly.typesettable.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.typesettable.canvasMod.ICanvasFontStyle
import typingsJapgolly.typesettable.contextsMod.ITypesetterContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "Typesetter")
@js.native
class Typesetter protected ()
  extends typingsJapgolly.typesettable.typesetterMod.Typesetter {
  def this(context: ITypesetterContext[_]) = this()
}

/* static members */
@JSImport("typesettable", "Typesetter")
@js.native
object Typesetter extends js.Object {
  def canvas(ctx: CanvasRenderingContext2D): typingsJapgolly.typesettable.typesetterMod.Typesetter = js.native
  def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double): typingsJapgolly.typesettable.typesetterMod.Typesetter = js.native
  def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle): typingsJapgolly.typesettable.typesetterMod.Typesetter = js.native
  def html(element: HTMLElement): typingsJapgolly.typesettable.typesetterMod.Typesetter = js.native
  def html(element: HTMLElement, className: String): typingsJapgolly.typesettable.typesetterMod.Typesetter = js.native
  def html(element: HTMLElement, className: String, addTitle: Boolean): typingsJapgolly.typesettable.typesetterMod.Typesetter = js.native
  def svg(element: SVGElement): typingsJapgolly.typesettable.typesetterMod.Typesetter = js.native
  def svg(element: SVGElement, className: String): typingsJapgolly.typesettable.typesetterMod.Typesetter = js.native
  def svg(element: SVGElement, className: String, addTitleElement: Boolean): typingsJapgolly.typesettable.typesetterMod.Typesetter = js.native
}

