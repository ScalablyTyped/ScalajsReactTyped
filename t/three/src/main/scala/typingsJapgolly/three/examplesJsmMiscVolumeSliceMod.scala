package typingsJapgolly.three

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.three.examplesJsmMiscVolumeMod.Volume
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Matrix3
import typingsJapgolly.three.srcThreeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMiscVolumeSliceMod {
  
  @JSImport("three/examples/jsm/misc/VolumeSlice", "VolumeSlice")
  @js.native
  open class VolumeSlice protected () extends StObject {
    def this(volume: Volume) = this()
    def this(volume: Volume, index: Double) = this()
    def this(volume: Volume, index: Double, axis: String) = this()
    def this(volume: Volume, index: Unit, axis: String) = this()
    
    var axis: String = js.native
    
    var canvas: HTMLCanvasElement = js.native
    
    var canvasBuffer: HTMLCanvasElement = js.native
    
    var ctx: CanvasRenderingContext2D = js.native
    
    var ctxBuffer: CanvasRenderingContext2D = js.native
    
    var geometryNeedsUpdate: Boolean = js.native
    
    var iLength: Double = js.native
    
    var index: Double = js.native
    
    var jLength: Double = js.native
    
    var matrix: Matrix3 = js.native
    
    var mesh: Mesh[BufferGeometry, Material | js.Array[Material]] = js.native
    
    def repaint(): Unit = js.native
    
    var sliceAccess: Double = js.native
    
    def updateGeometry(): Unit = js.native
  }
}
