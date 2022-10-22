package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.distCameraInterfacesMod.ICamera
import typingsJapgolly.antvGLite.distCssInterfacesMod.StyleValueRegistry
import typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObjectPool
import typingsJapgolly.antvGLite.distServicesRenderingServiceMod.RenderingPlugin
import typingsJapgolly.antvGLite.distTypesMod.CanvasConfig
import typingsJapgolly.manaSyringe.libContributionMod.Contribution.Provider
import typingsJapgolly.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesMod {
  
  @JSImport("@antv/g-lite/dist/services", "CircleUpdater")
  @js.native
  open class CircleUpdater ()
    extends typingsJapgolly.antvGLite.distServicesAabbMod.CircleUpdater
  
  @JSImport("@antv/g-lite/dist/services", "ContextService")
  @js.native
  val ContextService: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "DefaultSceneGraphSelector")
  @js.native
  open class DefaultSceneGraphSelector ()
    extends typingsJapgolly.antvGLite.distServicesSceneGraphSelectorMod.DefaultSceneGraphSelector
  
  @JSImport("@antv/g-lite/dist/services", "DefaultSceneGraphService")
  @js.native
  open class DefaultSceneGraphService protected ()
    extends typingsJapgolly.antvGLite.distServicesSceneGraphServiceMod.DefaultSceneGraphService {
    def this(sceneGraphSelectorFactory: js.Function0[typingsJapgolly.antvGLite.distServicesSceneGraphSelectorMod.SceneGraphSelector]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/services", "EllipseUpdater")
  @js.native
  open class EllipseUpdater ()
    extends typingsJapgolly.antvGLite.distServicesAabbMod.EllipseUpdater
  
  @JSImport("@antv/g-lite/dist/services", "EventService")
  @js.native
  open class EventService protected ()
    extends typingsJapgolly.antvGLite.distServicesEventServiceMod.EventService {
    def this(
      renderingContext: typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderingContext,
      contextService: typingsJapgolly.antvGLite.distServicesContextServiceMod.ContextService[Any],
      canvasConfig: CanvasConfig,
      displayObjectPool: DisplayObjectPool
    ) = this()
  }
  
  @JSImport("@antv/g-lite/dist/services", "GeometryAABBUpdater")
  @js.native
  val GeometryAABBUpdater: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "GeometryUpdaterFactory")
  @js.native
  val GeometryUpdaterFactory: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "LineUpdater")
  @js.native
  open class LineUpdater ()
    extends typingsJapgolly.antvGLite.distServicesAabbMod.LineUpdater
  
  @JSImport("@antv/g-lite/dist/services", "OffscreenCanvasCreator")
  @js.native
  open class OffscreenCanvasCreator ()
    extends typingsJapgolly.antvGLite.distServicesOffscreenCanvasCreatorMod.OffscreenCanvasCreator
  
  @JSImport("@antv/g-lite/dist/services", "PathUpdater")
  @js.native
  open class PathUpdater ()
    extends typingsJapgolly.antvGLite.distServicesAabbMod.PathUpdater
  
  @JSImport("@antv/g-lite/dist/services", "PolylineUpdater")
  @js.native
  open class PolylineUpdater ()
    extends typingsJapgolly.antvGLite.distServicesAabbMod.PolylineUpdater
  
  @JSImport("@antv/g-lite/dist/services", "RectUpdater")
  @js.native
  open class RectUpdater ()
    extends typingsJapgolly.antvGLite.distServicesAabbMod.RectUpdater
  
  @JSImport("@antv/g-lite/dist/services", "RenderReason")
  @js.native
  object RenderReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderReason & Double] = js.native
    
    /* 0 */ val CAMERA_CHANGED: typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderReason.CAMERA_CHANGED & Double = js.native
    
    /* 1 */ val DISPLAY_OBJECT_CHANGED: typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderReason.DISPLAY_OBJECT_CHANGED & Double = js.native
    
    /* 2 */ val NONE: typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderReason.NONE & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/services", "RenderingContext")
  @js.native
  val RenderingContext: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "RenderingPluginContribution")
  @js.native
  val RenderingPluginContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "RenderingService")
  @js.native
  open class RenderingService protected ()
    extends typingsJapgolly.antvGLite.distServicesRenderingServiceMod.RenderingService {
    def this(
      renderingPluginProvider: Provider[RenderingPlugin],
      canvasConfig: CanvasConfig,
      renderingContext: typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderingContext,
      sceneGraphService: typingsJapgolly.antvGLite.distServicesInterfacesMod.SceneGraphService,
      styleValueRegistry: StyleValueRegistry,
      camera: ICamera
    ) = this()
  }
  
  @JSImport("@antv/g-lite/dist/services", "SceneGraphSelector")
  @js.native
  val SceneGraphSelector: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "SceneGraphSelectorFactory")
  @js.native
  val SceneGraphSelectorFactory: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "SceneGraphService")
  @js.native
  val SceneGraphService: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services", "TextService")
  @js.native
  open class TextService protected ()
    extends typingsJapgolly.antvGLite.distServicesTextServiceMod.TextService {
    def this(offscreenCanvas: typingsJapgolly.antvGLite.distServicesOffscreenCanvasCreatorMod.OffscreenCanvasCreator) = this()
  }
  
  @JSImport("@antv/g-lite/dist/services", "TextUpdater")
  @js.native
  open class TextUpdater protected ()
    extends typingsJapgolly.antvGLite.distServicesAabbMod.TextUpdater {
    def this(textService: typingsJapgolly.antvGLite.distServicesTextServiceMod.TextService) = this()
  }
}
