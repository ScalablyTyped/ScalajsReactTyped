package typingsJapgolly.antvGLite.mod

import typingsJapgolly.antvGLite.distCameraInterfacesMod.ICamera
import typingsJapgolly.antvGLite.distCssInterfacesMod.StyleValueRegistry
import typingsJapgolly.antvGLite.distServicesRenderingServiceMod.RenderingPlugin
import typingsJapgolly.manaSyringe.libContributionMod.Contribution.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "RenderingService")
@js.native
open class RenderingService protected ()
  extends typingsJapgolly.antvGLite.distServicesMod.RenderingService {
  def this(
    renderingPluginProvider: Provider[RenderingPlugin],
    canvasConfig: typingsJapgolly.antvGLite.distTypesMod.CanvasConfig,
    renderingContext: typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderingContext,
    sceneGraphService: typingsJapgolly.antvGLite.distServicesInterfacesMod.SceneGraphService,
    styleValueRegistry: StyleValueRegistry,
    camera: ICamera
  ) = this()
}
