package typingsJapgolly.canvg

import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.canvg.distDocumentMod.Document
import typingsJapgolly.canvg.distDocumentMod.Element
import typingsJapgolly.canvg.distPointMod.Point
import typingsJapgolly.canvg.distPropertyMod.Property
import typingsJapgolly.canvg.distTransformTypesMod.ITransform
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformTransformMod {
  
  @JSImport("canvg/dist/Transform/Transform", "Transform")
  @js.native
  open class Transform protected () extends StObject {
    def this(
      document: Document,
      transform: String,
      transformOrigin: js.Tuple2[Property[String], Property[String]]
    ) = this()
    
    @JSName("apply")
    def apply(ctx: RenderingContext2D): Unit = js.native
    
    def applyToPoint(point: Point): Unit = js.native
    
    /* private */ val document: Any = js.native
    
    /* private */ val transforms: Any = js.native
    
    def unapply(ctx: RenderingContext2D): Unit = js.native
  }
  /* static members */
  object Transform {
    
    @JSImport("canvg/dist/Transform/Transform", "Transform")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromElement(document: Document, element: Element): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(document.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Transform]
    
    @JSImport("canvg/dist/Transform/Transform", "Transform.transformTypes")
    @js.native
    def transformTypes: Record[String, ITransformConstructor] = js.native
    inline def transformTypes_=(x: Record[String, ITransformConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITransformConstructor
    extends StObject
       with Instantiable3[
          /* document */ Document, 
          /* value */ String, 
          /* transformOrigin */ js.Tuple2[Property[String], Property[String]], 
          ITransform
        ]
}
