package typingsJapgolly.canvg

import typingsJapgolly.canvg.distDocumentMod.Document
import typingsJapgolly.canvg.distPointMod.Point
import typingsJapgolly.canvg.distPropertyMod.Property
import typingsJapgolly.canvg.distTransformTypesMod.ITransform
import typingsJapgolly.canvg.distTypesMod.MatrixValue
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformMatrixMod {
  
  @JSImport("canvg/dist/Transform/Matrix", "Matrix")
  @js.native
  open class Matrix protected ()
    extends StObject
       with ITransform {
    def this(
      _underscore: Document,
      matrix: String,
      transformOrigin: js.Tuple2[Property[String], Property[String]]
    ) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(ctx: RenderingContext2D): Unit = js.native
    
    /* CompleteClass */
    override def applyToPoint(point: Point): Unit = js.native
    
    /* protected */ var matrix: MatrixValue = js.native
    
    /* private */ val originX: Any = js.native
    
    /* private */ val originY: Any = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    override def unapply(ctx: RenderingContext2D): Unit = js.native
  }
}
