package typingsJapgolly.three

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.three.anon.Buffer
import typingsJapgolly.three.anon.Count
import typingsJapgolly.three.srcConstantsMod.Usage
import typingsJapgolly.three.srcCoreInterleavedBufferAttributeMod.InterleavedBufferAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreInterleavedBufferMod {
  
  @JSImport("three/src/core/InterleavedBuffer", "InterleavedBuffer")
  @js.native
  open class InterleavedBuffer protected () extends StObject {
    def this(array: ArrayLike[Double], stride: Double) = this()
    
    var array: ArrayLike[Double] = js.native
    
    def clone(data: js.Object): InterleavedBuffer = js.native
    
    def copy(source: InterleavedBuffer): this.type = js.native
    
    def copyAt(index1: Double, attribute: InterleavedBufferAttribute, index2: Double): InterleavedBuffer = js.native
    
    /**
      * @default 0
      */
    var count: Double = js.native
    
    var length: Double = js.native
    
    var needsUpdate: Boolean = js.native
    
    def set(value: ArrayLike[Double], index: Double): InterleavedBuffer = js.native
    
    def setUsage(usage: Usage): InterleavedBuffer = js.native
    
    var stride: Double = js.native
    
    def toJSON(data: js.Object): Buffer = js.native
    
    /**
      * @default { offset: number; count: number }
      */
    var updateRange: Count = js.native
    
    /**
      * @default THREE.StaticDrawUsage
      */
    var usage: Usage = js.native
    
    var uuid: String = js.native
    
    /**
      * @default 0
      */
    var version: Double = js.native
  }
}
