package typingsJapgolly.three

import typingsJapgolly.three.anon.Radius
import typingsJapgolly.three.srcThreeMod.IcosahedronGeometry
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.ShaderMaterial
import typingsJapgolly.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmObjectsGroundProjectedEnvMod {
  
  @JSImport("three/examples/jsm/objects/GroundProjectedEnv", "GroundProjectedEnv")
  @js.native
  open class GroundProjectedEnv protected () extends Mesh[IcosahedronGeometry, ShaderMaterial] {
    def this(texture: Texture) = this()
    def this(texture: Texture, options: Radius) = this()
    
    def height: Double = js.native
    def height_=(height: Double): Unit = js.native
    
    def radius: Double = js.native
    def radius_=(radius: Double): Unit = js.native
  }
}
