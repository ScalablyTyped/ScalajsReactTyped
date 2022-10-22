package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Color
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.Texture
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmObjectsLensflareMod {
  
  @JSImport("three/examples/jsm/objects/Lensflare", "Lensflare")
  @js.native
  open class Lensflare ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    
    def addElement(element: LensflareElement): Unit = js.native
    
    def dispose(): Unit = js.native
    
    val isLensflare: `true` = js.native
  }
  
  @JSImport("three/examples/jsm/objects/Lensflare", "LensflareElement")
  @js.native
  open class LensflareElement protected () extends StObject {
    def this(texture: Texture) = this()
    def this(texture: Texture, size: Double) = this()
    def this(texture: Texture, size: Double, distance: Double) = this()
    def this(texture: Texture, size: Unit, distance: Double) = this()
    def this(texture: Texture, size: Double, distance: Double, color: Color) = this()
    def this(texture: Texture, size: Double, distance: Unit, color: Color) = this()
    def this(texture: Texture, size: Unit, distance: Double, color: Color) = this()
    def this(texture: Texture, size: Unit, distance: Unit, color: Color) = this()
    
    var color: Color = js.native
    
    var distance: Double = js.native
    
    var size: Double = js.native
    
    var texture: Texture = js.native
  }
}
