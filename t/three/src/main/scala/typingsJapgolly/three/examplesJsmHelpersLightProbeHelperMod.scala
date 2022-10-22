package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.LightProbe
import typingsJapgolly.three.srcThreeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmHelpersLightProbeHelperMod {
  
  @JSImport("three/examples/jsm/helpers/LightProbeHelper", "LightProbeHelper")
  @js.native
  open class LightProbeHelper protected ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(lightProbe: LightProbe, size: Double) = this()
    
    def dispose(): Unit = js.native
    
    var lightProbe: LightProbe = js.native
    
    var size: Double = js.native
  }
}
