package typingsJapgolly.typesettable

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.typesettable.canvasMod.ICanvasFontStyle
import typingsJapgolly.typesettable.contextsMod.ITypesetterContext
import typingsJapgolly.typesettable.measurersMod.CacheMeasurer
import typingsJapgolly.typesettable.wrappersMod.Wrapper
import typingsJapgolly.typesettable.writerMod.IWriteOptions
import typingsJapgolly.typesettable.writersMod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/typesetter", JSImport.Namespace)
@js.native
object typesetterMod extends js.Object {
  @js.native
  class Typesetter protected () extends js.Object {
    def this(context: ITypesetterContext[_]) = this()
    var context: js.Any = js.native
    var measurer: CacheMeasurer = js.native
    var wrapper: Wrapper = js.native
    var writer: Writer = js.native
    /**
      * Clears the `Measurer`'s CacheMeasurer.
      *
      * Call this if your font style changee in SVG.
      */
    def clearMeasurerCache(): Unit = js.native
    /**
      * Wraps the given string into the width/height and writes it into the
      * canvas or SVG (depending on context).
      *
      * Delegates to `Writer.write` using the internal `ITypesetterContext`.
      */
    def write(text: String, width: Double, height: Double): Unit = js.native
    def write(text: String, width: Double, height: Double, options: IWriteOptions): Unit = js.native
    def write(text: String, width: Double, height: Double, options: IWriteOptions, into: js.Any): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Typesetter extends js.Object {
    def canvas(ctx: CanvasRenderingContext2D): Typesetter = js.native
    def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double): Typesetter = js.native
    def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle): Typesetter = js.native
    def html(element: HTMLElement): Typesetter = js.native
    def html(element: HTMLElement, className: String): Typesetter = js.native
    def html(element: HTMLElement, className: String, addTitle: Boolean): Typesetter = js.native
    def svg(element: SVGElement): Typesetter = js.native
    def svg(element: SVGElement, className: String): Typesetter = js.native
    def svg(element: SVGElement, className: String, addTitleElement: Boolean): Typesetter = js.native
  }
  
}

