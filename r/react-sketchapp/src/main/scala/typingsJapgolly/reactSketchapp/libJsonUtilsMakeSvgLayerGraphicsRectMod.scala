package typingsJapgolly.reactSketchapp

import typingsJapgolly.reactSketchapp.libJsonUtilsMakeSvgLayerGraphicsTypesMod.Point
import typingsJapgolly.reactSketchapp.libJsonUtilsMakeSvgLayerGraphicsTypesMod.Size
import typingsJapgolly.reactSketchapp.reactSketchappStrings.contain
import typingsJapgolly.reactSketchapp.reactSketchappStrings.cover
import typingsJapgolly.reactSketchapp.reactSketchappStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonUtilsMakeSvgLayerGraphicsRectMod {
  
  @JSImport("react-sketchapp/lib/jsonUtils/makeSvgLayer/graphics/rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeBoundingRectFromCommands(commands: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeBoundingRectFromCommands")(commands.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def makeBoundingRectFromPoints(points: js.Array[Point]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeBoundingRectFromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def resize(source: Size, destination: Size, resizingMode: cover | contain | stretch): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], resizingMode.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def scaleRect(
    rect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    scale: Double
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleRect")(rect.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def unionRects(
    rects: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any)*
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unionRects")(rects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
}
