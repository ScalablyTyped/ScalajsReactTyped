package typingsJapgolly.devexpressUtils

import typingsJapgolly.devexpressUtils.libGeometryInterfacesMod.IOffsets
import typingsJapgolly.devexpressUtils.libTypesMod.IEquatable
import typingsJapgolly.devexpressUtils.libTypesMod.ISupportConverting
import typingsJapgolly.devexpressUtils.libTypesMod.ISupportCopyFrom
import typingsJapgolly.devexpressUtils.libTypesMod.SimpleConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryOffsetsMod {
  
  @JSImport("@devexpress/utils/lib/geometry/offsets", "Offsets")
  @js.native
  open class Offsets protected ()
    extends StObject
       with IEquatable[Offsets]
       with ISupportCopyFrom[Offsets]
       with ISupportConverting[Double]
       with IOffsets {
    def this(left: Double, right: Double, top: Double, bottom: Double) = this()
    
    /* CompleteClass */
    override def applyConverter(converter: SimpleConverter[Double]): this.type = js.native
    
    /* CompleteClass */
    var bottom: Double = js.native
    
    def copyFrom(obj: IOffsets): Unit = js.native
    /* CompleteClass */
    override def copyFrom(obj: Offsets): Unit = js.native
    
    def equals(obj: IOffsets): Boolean = js.native
    
    def horizontal: Double = js.native
    
    def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    var left: Double = js.native
    
    def multiply(multHoriz: Double, multVert: Double): this.type = js.native
    def multiply(multLeft: Double, multRight: Double, multTop: Double, multBottom: Double): this.type = js.native
    def multiply(mult: Double): this.type = js.native
    
    def normalize(): this.type = js.native
    
    def offset(offset: IOffsets): this.type = js.native
    
    /* CompleteClass */
    var right: Double = js.native
    
    /* CompleteClass */
    var top: Double = js.native
    
    def vertical: Double = js.native
  }
  /* static members */
  object Offsets {
    
    @JSImport("@devexpress/utils/lib/geometry/offsets", "Offsets")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): Offsets = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Offsets]
    
    inline def fromNumber(offset: Double): Offsets = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(offset.asInstanceOf[js.Any]).asInstanceOf[Offsets]
    
    inline def fromOffsets(offsets: IOffsets): Offsets = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOffsets")(offsets.asInstanceOf[js.Any]).asInstanceOf[Offsets]
    
    inline def fromSide(horizontal: Double, vertical: Double): Offsets = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSide")(horizontal.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any])).asInstanceOf[Offsets]
  }
}
