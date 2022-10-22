package typingsJapgolly.pixiJs.mod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.pixiGraphics.anon.TypeofArcUtils
import typingsJapgolly.pixiGraphics.anon.TypeofBezierUtils
import typingsJapgolly.pixiGraphics.anon.TypeofQuadraticUtils
import typingsJapgolly.pixiGraphics.mod.IShapeBuildCommand
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphicsUtils {
  
  @JSImport("pixi.js", "graphicsUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "graphicsUtils.ArcUtils")
  @js.native
  open class ArcUtils ()
    extends StObject
       with typingsJapgolly.pixiGraphics.mod.ArcUtils
  @JSImport("pixi.js", "graphicsUtils.ArcUtils")
  @js.native
  def ArcUtils: TypeofArcUtils & Instantiable0[typingsJapgolly.pixiGraphics.mod.ArcUtils] = js.native
  inline def ArcUtils_=(x: TypeofArcUtils & Instantiable0[typingsJapgolly.pixiGraphics.mod.ArcUtils]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArcUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.BATCH_POOL")
  @js.native
  def BATCH_POOL: js.Array[typingsJapgolly.pixiGraphics.mod.BatchPart] = js.native
  inline def BATCH_POOL_=(x: js.Array[typingsJapgolly.pixiGraphics.mod.BatchPart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCH_POOL")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "graphicsUtils.BatchPart")
  @js.native
  open class BatchPart ()
    extends StObject
       with typingsJapgolly.pixiGraphics.mod.BatchPart
  @JSImport("pixi.js", "graphicsUtils.BatchPart")
  @js.native
  def BatchPart: Instantiable0[typingsJapgolly.pixiGraphics.mod.BatchPart] = js.native
  inline def BatchPart_=(x: Instantiable0[typingsJapgolly.pixiGraphics.mod.BatchPart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BatchPart")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "graphicsUtils.BezierUtils")
  @js.native
  open class BezierUtils ()
    extends StObject
       with typingsJapgolly.pixiGraphics.mod.BezierUtils
  @JSImport("pixi.js", "graphicsUtils.BezierUtils")
  @js.native
  def BezierUtils: TypeofBezierUtils & Instantiable0[typingsJapgolly.pixiGraphics.mod.BezierUtils] = js.native
  inline def BezierUtils_=(x: TypeofBezierUtils & Instantiable0[typingsJapgolly.pixiGraphics.mod.BezierUtils]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BezierUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.DRAW_CALL_POOL")
  @js.native
  def DRAW_CALL_POOL: js.Array[typingsJapgolly.pixiCore.mod.BatchDrawCall] = js.native
  inline def DRAW_CALL_POOL_=(x: js.Array[typingsJapgolly.pixiCore.mod.BatchDrawCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAW_CALL_POOL")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.FILL_COMMANDS")
  @js.native
  def FILL_COMMANDS: Record[typingsJapgolly.pixiMath.mod.SHAPES, IShapeBuildCommand] = js.native
  inline def FILL_COMMANDS_=(x: Record[typingsJapgolly.pixiMath.mod.SHAPES, IShapeBuildCommand]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILL_COMMANDS")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "graphicsUtils.QuadraticUtils")
  @js.native
  open class QuadraticUtils ()
    extends StObject
       with typingsJapgolly.pixiGraphics.mod.QuadraticUtils
  @JSImport("pixi.js", "graphicsUtils.QuadraticUtils")
  @js.native
  def QuadraticUtils: TypeofQuadraticUtils & Instantiable0[typingsJapgolly.pixiGraphics.mod.QuadraticUtils] = js.native
  inline def QuadraticUtils_=(x: TypeofQuadraticUtils & Instantiable0[typingsJapgolly.pixiGraphics.mod.QuadraticUtils]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QuadraticUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.buildCircle")
  @js.native
  def buildCircle: IShapeBuildCommand = js.native
  inline def buildCircle_=(x: IShapeBuildCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildCircle")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.buildLine")
  @js.native
  def buildLine: js.Function2[
    /* graphicsData */ typingsJapgolly.pixiGraphics.mod.GraphicsData, 
    /* graphicsGeometry */ typingsJapgolly.pixiGraphics.mod.GraphicsGeometry, 
    Unit
  ] = js.native
  inline def buildLine(
    graphicsData: typingsJapgolly.pixiGraphics.mod.GraphicsData,
    graphicsGeometry: typingsJapgolly.pixiGraphics.mod.GraphicsGeometry
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLine")(graphicsData.asInstanceOf[js.Any], graphicsGeometry.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def buildLine_=(
    x: js.Function2[
      /* graphicsData */ typingsJapgolly.pixiGraphics.mod.GraphicsData, 
      /* graphicsGeometry */ typingsJapgolly.pixiGraphics.mod.GraphicsGeometry, 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildLine")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.buildPoly")
  @js.native
  def buildPoly: IShapeBuildCommand = js.native
  inline def buildPoly_=(x: IShapeBuildCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildPoly")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.buildRectangle")
  @js.native
  def buildRectangle: IShapeBuildCommand = js.native
  inline def buildRectangle_=(x: IShapeBuildCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildRectangle")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.buildRoundedRectangle")
  @js.native
  def buildRoundedRectangle: IShapeBuildCommand = js.native
  inline def buildRoundedRectangle_=(x: IShapeBuildCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildRoundedRectangle")(x.asInstanceOf[js.Any])
}
