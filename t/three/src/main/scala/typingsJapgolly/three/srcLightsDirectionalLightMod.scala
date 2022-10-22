package typingsJapgolly.three

import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcLightsDirectionalLightShadowMod.DirectionalLightShadow
import typingsJapgolly.three.srcLightsLightMod.Light
import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsDirectionalLightMod {
  
  @JSImport("three/src/lights/DirectionalLight", "DirectionalLight")
  @js.native
  open class DirectionalLight () extends Light {
    def this(color: ColorRepresentation) = this()
    def this(color: Unit, intensity: Double) = this()
    def this(color: ColorRepresentation, intensity: Double) = this()
    
    val isDirectionalLight: `true` = js.native
    
    /**
      * @default new THREE.DirectionalLightShadow()
      */
    @JSName("shadow")
    var shadow_DirectionalLight: DirectionalLightShadow = js.native
    
    /**
      * Target used for shadow camera orientation.
      * @default new THREE.Object3D()
      */
    var target: Object3D[Event] = js.native
  }
}
