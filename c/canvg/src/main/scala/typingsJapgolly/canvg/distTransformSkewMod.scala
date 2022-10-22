package typingsJapgolly.canvg

import typingsJapgolly.canvg.distDocumentMod.Document
import typingsJapgolly.canvg.distPropertyMod.Property
import typingsJapgolly.canvg.distTransformMatrixMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformSkewMod {
  
  @JSImport("canvg/dist/Transform/Skew", "Skew")
  @js.native
  open class Skew protected () extends Matrix {
    def this(document: Document, skew: String, transformOrigin: js.Tuple2[Property[String], Property[String]]) = this()
    
    /* protected */ val angle: Property[Any] = js.native
  }
}
