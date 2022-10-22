package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.LineSegments
import typingsJapgolly.three.srcThreeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmHelpersVertexTangentsHelperMod {
  
  @JSImport("three/examples/jsm/helpers/VertexTangentsHelper", "VertexTangentsHelper")
  @js.native
  open class VertexTangentsHelper protected ()
    extends LineSegments[BufferGeometry, Material | js.Array[Material]] {
    def this(`object`: Object3D[Event]) = this()
    def this(`object`: Object3D[Event], size: Double) = this()
    def this(`object`: Object3D[Event], size: Double, hex: Double) = this()
    def this(`object`: Object3D[Event], size: Unit, hex: Double) = this()
    
    var `object`: Object3D[Event] = js.native
    
    var size: Double = js.native
    
    def update(): Unit = js.native
  }
}
