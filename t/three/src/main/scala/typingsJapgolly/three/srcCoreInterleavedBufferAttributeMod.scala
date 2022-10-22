package typingsJapgolly.three

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.three.anon.IsInterleavedBufferAttribute
import typingsJapgolly.three.srcCoreBufferAttributeMod.BufferAttribute
import typingsJapgolly.three.srcCoreInterleavedBufferMod.InterleavedBuffer
import typingsJapgolly.three.srcMathMatrix3Mod.Matrix
import typingsJapgolly.three.srcMathMatrix4Mod.Matrix4
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreInterleavedBufferAttributeMod {
  
  @JSImport("three/src/core/InterleavedBufferAttribute", "InterleavedBufferAttribute")
  @js.native
  open class InterleavedBufferAttribute protected () extends StObject {
    def this(interleavedBuffer: InterleavedBuffer, itemSize: Double, offset: Double) = this()
    def this(interleavedBuffer: InterleavedBuffer, itemSize: Double, offset: Double, normalized: Boolean) = this()
    
    def applyMatrix4(m: Matrix4): this.type = js.native
    
    def applyNormalMatrix(matrix: Matrix): this.type = js.native
    
    def array: ArrayLike[Double] = js.native
    
    def clone(data: js.Object): BufferAttribute = js.native
    
    def count: Double = js.native
    
    var data: InterleavedBuffer = js.native
    
    def getW(index: Double): Double = js.native
    
    def getX(index: Double): Double = js.native
    
    def getY(index: Double): Double = js.native
    
    def getZ(index: Double): Double = js.native
    
    val isInterleavedBufferAttribute: `true` = js.native
    
    var itemSize: Double = js.native
    
    /**
      * @default ''
      */
    var name: String = js.native
    
    def needsUpdate_=(value: Boolean): Unit = js.native
    
    /**
      * @default false
      */
    var normalized: Boolean = js.native
    
    var offset: Double = js.native
    
    def setW(index: Double, z: Double): this.type = js.native
    
    def setX(index: Double, x: Double): this.type = js.native
    
    def setXY(index: Double, x: Double, y: Double): this.type = js.native
    
    def setXYZ(index: Double, x: Double, y: Double, z: Double): this.type = js.native
    
    def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): this.type = js.native
    
    def setY(index: Double, y: Double): this.type = js.native
    
    def setZ(index: Double, z: Double): this.type = js.native
    
    def toJSON(): IsInterleavedBufferAttribute = js.native
    def toJSON(data: js.Object): IsInterleavedBufferAttribute = js.native
    
    def transformDirection(matrix: Matrix): this.type = js.native
  }
}
