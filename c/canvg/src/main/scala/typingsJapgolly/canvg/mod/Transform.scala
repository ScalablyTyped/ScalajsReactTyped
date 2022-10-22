package typingsJapgolly.canvg.mod

import typingsJapgolly.canvg.distTransformTransformMod.ITransformConstructor
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "Transform")
@js.native
open class Transform protected ()
  extends typingsJapgolly.canvg.distTransformMod.Transform {
  def this(
    document: typingsJapgolly.canvg.distDocumentMod.Document,
    transform: String,
    transformOrigin: js.Tuple2[
        typingsJapgolly.canvg.distPropertyMod.Property[String], 
        typingsJapgolly.canvg.distPropertyMod.Property[String]
      ]
  ) = this()
}
/* static members */
object Transform {
  
  @JSImport("canvg", "Transform")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromElement(
    document: typingsJapgolly.canvg.distDocumentMod.Document,
    element: typingsJapgolly.canvg.distDocumentMod.Element
  ): typingsJapgolly.canvg.distTransformTransformMod.Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(document.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.canvg.distTransformTransformMod.Transform]
  
  @JSImport("canvg", "Transform.transformTypes")
  @js.native
  def transformTypes: Record[String, ITransformConstructor] = js.native
  inline def transformTypes_=(x: Record[String, ITransformConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformTypes")(x.asInstanceOf[js.Any])
}
