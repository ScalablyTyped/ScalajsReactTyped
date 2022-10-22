package typingsJapgolly.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.featureMod.FeatureLike
import typingsJapgolly.ol.renderCanvasBuilderTypeMod.BuilderType
import typingsJapgolly.ol.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasExecutorGroupMod {
  
  @JSImport("ol/render/canvas/ExecutorGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/render/canvas/ExecutorGroup", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ExecutorGroup {
    def this(
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      allInstructions: StringDictionary[
            /* import warning: importer.ImportType#apply Failed type conversion: {[ key in ol.ol/render/canvas/BuilderType.BuilderType ]: ol.ol/render/canvas.SerializableInstructions} */ js.Any
          ]
    ) = this()
    def this(
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      allInstructions: StringDictionary[
            /* import warning: importer.ImportType#apply Failed type conversion: {[ key in ol.ol/render/canvas/BuilderType.BuilderType ]: ol.ol/render/canvas.SerializableInstructions} */ js.Any
          ],
      opt_renderBuffer: Double
    ) = this()
  }
  
  inline def getPixelIndexArray(radius: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPixelIndexArray")(radius.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @js.native
  trait ExecutorGroup extends StObject {
    
    def clip(context: CanvasRenderingContext2D, transform: Transform): Unit = js.native
    
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      opt_builderTypes: js.Array[BuilderType]
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      opt_builderTypes: js.Array[BuilderType],
      opt_declutterTree: typingsJapgolly.rbush.mod.default[Any]
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      opt_builderTypes: Unit,
      opt_declutterTree: typingsJapgolly.rbush.mod.default[Any]
    ): Unit = js.native
    
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      resolution: Double,
      rotation: Double,
      hitTolerance: Double,
      callback: js.Function3[
          /* p0 */ FeatureLike, 
          /* p1 */ typingsJapgolly.ol.geomSimpleGeometryMod.default, 
          /* p2 */ Double, 
          T
        ],
      declutteredFeatures: js.Array[FeatureLike]
    ): js.UndefOr[T] = js.native
    
    def getClipCoords(transform: Transform): js.Array[Double] = js.native
    
    def hasExecutors(executors: js.Array[BuilderType]): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
  }
}
