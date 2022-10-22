package typingsJapgolly.devexpressUtils

import typingsJapgolly.devexpressUtils.libGeometryInterfacesMod.ISize
import typingsJapgolly.devexpressUtils.libTypesMod.ICloneable
import typingsJapgolly.devexpressUtils.libTypesMod.IEquatable
import typingsJapgolly.devexpressUtils.libTypesMod.ISupportCopyFrom
import typingsJapgolly.devexpressUtils.libTypesMod.SimpleConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometrySizeMod {
  
  @JSImport("@devexpress/utils/lib/geometry/size", "Size")
  @js.native
  open class Size protected ()
    extends StObject
       with ISize
       with ICloneable[Size]
       with ISupportCopyFrom[Size]
       with IEquatable[ISize] {
    def this(width: Double, height: Double) = this()
    
    def applyConverter(conv: SimpleConverter[Double]): this.type = js.native
    
    /* CompleteClass */
    override def copyFrom(obj: Size): Unit = js.native
    
    /* CompleteClass */
    var height: Double = js.native
    
    def isEmpty(): Boolean = js.native
    
    def multiply(multiplierW: Double, multiplierH: Double): this.type = js.native
    
    def nonNegativeSize(): this.type = js.native
    
    def offset(offsetWidth: Double, offsetHeight: Double): this.type = js.native
    
    /* CompleteClass */
    var width: Double = js.native
  }
  /* static members */
  object Size {
    
    @JSImport("@devexpress/utils/lib/geometry/size", "Size")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Size]
    
    inline def equals(a: ISize, b: ISize): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromNumber(num: Double): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(num.asInstanceOf[js.Any]).asInstanceOf[Size]
    
    inline def initByCommonAction(
      action: js.Function2[
          /* directAdp */ js.Function1[/* s */ ISize, Double], 
          /* reverseAdp */ js.Function1[/* s */ ISize, Double], 
          Double
        ]
    ): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("initByCommonAction")(action.asInstanceOf[js.Any]).asInstanceOf[Size]
  }
}
