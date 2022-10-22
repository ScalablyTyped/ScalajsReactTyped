package typingsJapgolly.three

import typingsJapgolly.std.DOMHighResTimeStamp
import typingsJapgolly.three.srcThreeMod.DirectionalLight
import typingsJapgolly.three.srcThreeMod.Group
import typingsJapgolly.three.srcThreeMod.LightProbe
import typingsJapgolly.three.srcThreeMod.Texture
import typingsJapgolly.three.srcThreeMod.WebGLRenderer
import typingsJapgolly.webxr.XRFrame
import typingsJapgolly.webxr.XRFrameRequestCallback
import typingsJapgolly.webxr.XRWebGLBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmWebxrXrestimatedlightMod {
  
  @JSImport("three/examples/jsm/webxr/XREstimatedLight", "SessionLightProbe")
  @js.native
  open class SessionLightProbe protected () extends StObject {
    def this(
      xrLight: XREstimatedLight,
      renderer: WebGLRenderer,
      lightProbe: LightProbe,
      environmentEstimation: Boolean,
      estimationStartCallback: js.Function0[Unit]
    ) = this()
    
    def dispose(): Unit = js.native
    
    def estimationStartCallback(): Unit = js.native
    
    def frameCallback(time: Double, xrFrame: XRFrame): Unit = js.native
    
    var lightProbe: LightProbe = js.native
    
    def onXRFrame(time: DOMHighResTimeStamp, frame: XRFrame): Unit = js.native
    @JSName("onXRFrame")
    var onXRFrame_Original: XRFrameRequestCallback = js.native
    
    var renderer: WebGLRenderer = js.native
    
    def updateReflection(): Unit = js.native
    
    var xrLight: XREstimatedLight = js.native
    
    var xrWebGLBinding: XRWebGLBinding | Null = js.native
  }
  
  @JSImport("three/examples/jsm/webxr/XREstimatedLight", "XREstimatedLight")
  @js.native
  open class XREstimatedLight protected () extends Group {
    def this(renderer: WebGLRenderer) = this()
    def this(renderer: WebGLRenderer, environmentEstimation: Boolean) = this()
    
    var directionalLight: DirectionalLight = js.native
    
    var environment: Texture = js.native
    
    var lightProbe: LightProbe = js.native
  }
}
