package typingsJapgolly.three

import typingsJapgolly.three.srcCamerasCameraMod.Camera
import typingsJapgolly.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import typingsJapgolly.three.srcLightsLightShadowMod.LightShadow
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsSpotLightShadowMod {
  
  @JSImport("three/src/lights/SpotLightShadow", "SpotLightShadow")
  @js.native
  open class SpotLightShadow protected () extends LightShadow {
    def this(camera: Camera) = this()
    
    @JSName("camera")
    var camera_SpotLightShadow: PerspectiveCamera = js.native
    
    /**
      * @default 1
      */
    var focus: Double = js.native
    
    val isSpotLightShadow: `true` = js.native
  }
}
