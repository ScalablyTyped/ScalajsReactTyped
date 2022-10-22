package typingsJapgolly.reactSketchapp

import typingsJapgolly.reactSketchapp.anon.Data
import typingsJapgolly.reactSketchapp.reactSketchappInts.`0`
import typingsJapgolly.reactSketchapp.reactSketchappInts.`1`
import typingsJapgolly.reactSketchapp.reactSketchappInts.`2`
import typingsJapgolly.reactSketchapp.reactSketchappStrings.butt
import typingsJapgolly.reactSketchapp.reactSketchappStrings.round
import typingsJapgolly.reactSketchapp.reactSketchappStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleJsonUtilsMakeSvgLayerGraphicsPathMod {
  
  @JSImport("react-sketchapp/lib/module/jsonUtils/makeSvgLayer/graphics/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeLineCapStyle(strokeLineCap: butt | round | square): `0` | `1` | `2` = ^.asInstanceOf[js.Dynamic].applyDynamic("makeLineCapStyle")(strokeLineCap.asInstanceOf[js.Any]).asInstanceOf[`0` | `1` | `2`]
  
  inline def makePathsFromCommands(
    commands: js.Array[Data],
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any
  ): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("makePathsFromCommands")(commands.asInstanceOf[js.Any], frame.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  
  /* Inlined std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.ShapePath * / any, 'isClosed' | 'points'> */
  trait Path extends StObject {
    
    var isClosed: js.UndefOr[Any] = js.undefined
    
    var points: js.UndefOr[Any] = js.undefined
  }
  object Path {
    
    inline def apply(): Path = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setIsClosed(value: Any): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
      
      inline def setIsClosedUndefined: Self = StObject.set(x, "isClosed", js.undefined)
      
      inline def setPoints(value: Any): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    }
  }
}
