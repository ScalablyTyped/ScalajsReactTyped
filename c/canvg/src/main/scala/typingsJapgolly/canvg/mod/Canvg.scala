package typingsJapgolly.canvg.mod

import typingsJapgolly.canvg.distCanvgMod.DOMDocument
import typingsJapgolly.canvg.distCanvgMod.IOptions
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "Canvg")
@js.native
open class Canvg protected ()
  extends typingsJapgolly.canvg.distCanvgMod.Canvg {
  /**
    * Main constructor.
    * @param ctx - Rendering context.
    * @param svg - SVG Document.
    * @param options - Rendering options.
    */
  def this(ctx: RenderingContext2D, svg: DOMDocument) = this()
  def this(ctx: RenderingContext2D, svg: DOMDocument, options: IOptions) = this()
}
/* static members */
object Canvg {
  
  @JSImport("canvg", "Canvg")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create Canvg instance from SVG source string or URL.
    * @param ctx - Rendering context.
    * @param svg - SVG source string or URL.
    * @param options - Rendering options.
    * @returns Canvg instance.
    */
  inline def from(ctx: RenderingContext2D, svg: String): js.Promise[typingsJapgolly.canvg.distCanvgMod.Canvg] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(ctx.asInstanceOf[js.Any], svg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.canvg.distCanvgMod.Canvg]]
  inline def from(ctx: RenderingContext2D, svg: String, options: IOptions): js.Promise[typingsJapgolly.canvg.distCanvgMod.Canvg] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(ctx.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.canvg.distCanvgMod.Canvg]]
  
  /**
    * Create Canvg instance from SVG source string.
    * @param ctx - Rendering context.
    * @param svg - SVG source string.
    * @param options - Rendering options.
    * @returns Canvg instance.
    */
  inline def fromString(ctx: RenderingContext2D, svg: String): typingsJapgolly.canvg.distCanvgMod.Canvg = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(ctx.asInstanceOf[js.Any], svg.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.canvg.distCanvgMod.Canvg]
  inline def fromString(ctx: RenderingContext2D, svg: String, options: IOptions): typingsJapgolly.canvg.distCanvgMod.Canvg = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(ctx.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.canvg.distCanvgMod.Canvg]
}
