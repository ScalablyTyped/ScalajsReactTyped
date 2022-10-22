package typingsJapgolly.three

import typingsJapgolly.three.srcCamerasCameraMod.Camera
import typingsJapgolly.three.srcConstantsMod.ShadowMapType
import typingsJapgolly.three.srcLightsLightMod.Light
import typingsJapgolly.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typingsJapgolly.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import typingsJapgolly.three.srcRenderersWebglWebGLObjectsMod.WebGLObjects
import typingsJapgolly.three.srcScenesSceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLShadowMapMod {
  
  @JSImport("three/src/renderers/webgl/WebGLShadowMap", "WebGLShadowMap")
  @js.native
  open class WebGLShadowMap protected () extends StObject {
    def this(_renderer: WebGLRenderer, _objects: WebGLObjects, _capabilities: WebGLCapabilities) = this()
    
    /**
      * @default true
      */
    var autoUpdate: Boolean = js.native
    
    /**
      * @deprecated Use {@link Material#shadowSide} instead.
      */
    var cullFace: Any = js.native
    
    /**
      * @default false
      */
    var enabled: Boolean = js.native
    
    /**
      * @default false
      */
    var needsUpdate: Boolean = js.native
    
    def render(shadowsArray: js.Array[Light], scene: Scene, camera: Camera): Unit = js.native
    
    /**
      * @default THREE.PCFShadowMap
      */
    var `type`: ShadowMapType = js.native
  }
}
