package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "AxesViewer")
@js.native
open class AxesViewer protected ()
  extends typingsJapgolly.babylonjs.debugIndexMod.AxesViewer {
  /**
    * Creates a new AxesViewer
    * @param scene defines the hosting scene
    * @param scaleLines defines a number used to scale line length (1 by default)
    * @param renderingGroupId defines a number used to set the renderingGroupId of the meshes (2 by default)
    * @param xAxis defines the node hierarchy used to render the x-axis
    * @param yAxis defines the node hierarchy used to render the y-axis
    * @param zAxis defines the node hierarchy used to render the z-axis
    * @param lineThickness The line thickness to use when creating the arrow. defaults to 1.
    */
  def this(
    scene: js.UndefOr[typingsJapgolly.babylonjs.sceneMod.Scene],
    scaleLines: js.UndefOr[Double],
    renderingGroupId: js.UndefOr[Nullable[Double]],
    xAxis: js.UndefOr[typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode],
    yAxis: js.UndefOr[typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode],
    zAxis: js.UndefOr[typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode],
    lineThickness: js.UndefOr[Double]
  ) = this()
}
/* static members */
object AxesViewer {
  
  @JSImport("babylonjs/index", "AxesViewer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/index", "AxesViewer._SetRenderingGroupId")
  @js.native
  def _SetRenderingGroupId: Any = js.native
  inline def _SetRenderingGroupId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SetRenderingGroupId")(x.asInstanceOf[js.Any])
}
