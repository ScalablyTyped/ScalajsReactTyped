package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcLightsLightMod.Light
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcObjectsLineSegmentsMod.LineSegments
import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersSpotLightHelperMod {
  
  @JSImport("three/src/helpers/SpotLightHelper", "SpotLightHelper")
  @js.native
  open class SpotLightHelper protected () extends Object3D[Event] {
    def this(light: Light) = this()
    def this(light: Light, color: ColorRepresentation) = this()
    
    var color: js.UndefOr[ColorRepresentation] = js.native
    
    var cone: LineSegments[BufferGeometry, Material | js.Array[Material]] = js.native
    
    def dispose(): Unit = js.native
    
    var light: Light = js.native
    
    def update(): Unit = js.native
  }
}
