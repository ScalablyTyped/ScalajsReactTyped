package typingsJapgolly.lonaSvgModel

import typingsJapgolly.lonaSvgModel.anon.ConvertQuadraticsToCubics
import typingsJapgolly.lonaSvgModel.libElementsMod.SVGWithoutQuadratics
import typingsJapgolly.lonaSvgModel.libElementsMod.SVG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAsyncMod {
  
  @JSImport("@lona/svg-model/lib/async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(svg: String): js.Promise[SVG_] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(svg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SVG_]]
  inline def convert(svg: String, options: js.Object): js.Promise[SVG_] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SVG_]]
  inline def convert(svg: String, options: ConvertQuadraticsToCubics): js.Promise[SVGWithoutQuadratics] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SVGWithoutQuadratics]]
}
