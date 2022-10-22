package typingsJapgolly.canvg

import typingsJapgolly.canvg.distDocumentMod.Document
import typingsJapgolly.canvg.distDocumentMod.Element
import typingsJapgolly.canvg.distPropertyMod.Property
import typingsJapgolly.canvg.distTransformTransformMod.ITransformConstructor
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformMod {
  
  @JSImport("canvg/dist/Transform", "Matrix")
  @js.native
  open class Matrix protected ()
    extends typingsJapgolly.canvg.distTransformMatrixMod.Matrix {
    def this(
      _underscore: Document,
      matrix: String,
      transformOrigin: js.Tuple2[Property[String], Property[String]]
    ) = this()
  }
  
  @JSImport("canvg/dist/Transform", "Rotate")
  @js.native
  open class Rotate protected ()
    extends typingsJapgolly.canvg.distTransformRotateMod.Rotate {
    def this(document: Document, rotate: String, transformOrigin: js.Tuple2[Property[String], Property[String]]) = this()
  }
  
  @JSImport("canvg/dist/Transform", "Scale")
  @js.native
  open class Scale protected ()
    extends typingsJapgolly.canvg.distTransformScaleMod.Scale {
    def this(
      _underscore: Document,
      scale: String,
      transformOrigin: js.Tuple2[Property[String], Property[String]]
    ) = this()
  }
  
  @JSImport("canvg/dist/Transform", "Skew")
  @js.native
  open class Skew protected ()
    extends typingsJapgolly.canvg.distTransformSkewMod.Skew {
    def this(document: Document, skew: String, transformOrigin: js.Tuple2[Property[String], Property[String]]) = this()
  }
  
  @JSImport("canvg/dist/Transform", "SkewX")
  @js.native
  open class SkewX protected ()
    extends typingsJapgolly.canvg.distTransformSkewXMod.SkewX {
    def this(document: Document, skew: String, transformOrigin: js.Tuple2[Property[String], Property[String]]) = this()
  }
  
  @JSImport("canvg/dist/Transform", "SkewY")
  @js.native
  open class SkewY protected ()
    extends typingsJapgolly.canvg.distTransformSkewYMod.SkewY {
    def this(document: Document, skew: String, transformOrigin: js.Tuple2[Property[String], Property[String]]) = this()
  }
  
  @JSImport("canvg/dist/Transform", "Transform")
  @js.native
  open class Transform protected ()
    extends typingsJapgolly.canvg.distTransformTransformMod.Transform {
    def this(
      document: Document,
      transform: String,
      transformOrigin: js.Tuple2[Property[String], Property[String]]
    ) = this()
  }
  /* static members */
  object Transform {
    
    @JSImport("canvg/dist/Transform", "Transform")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromElement(document: Document, element: Element): typingsJapgolly.canvg.distTransformTransformMod.Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(document.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.canvg.distTransformTransformMod.Transform]
    
    @JSImport("canvg/dist/Transform", "Transform.transformTypes")
    @js.native
    def transformTypes: Record[String, ITransformConstructor] = js.native
    inline def transformTypes_=(x: Record[String, ITransformConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("canvg/dist/Transform", "Translate")
  @js.native
  open class Translate protected ()
    extends typingsJapgolly.canvg.distTransformTranslateMod.Translate {
    def this(_underscore: Document, point: String) = this()
  }
}
