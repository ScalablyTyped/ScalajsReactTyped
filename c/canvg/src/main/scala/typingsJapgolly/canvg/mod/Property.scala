package typingsJapgolly.canvg.mod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "Property")
@js.native
open class Property[T] protected ()
  extends typingsJapgolly.canvg.distPropertyMod.Property[T] {
  def this(document: typingsJapgolly.canvg.distDocumentMod.Document, name: String, value: T) = this()
}
/* static members */
object Property {
  
  @JSImport("canvg", "Property")
  @js.native
  val ^ : js.Any = js.native
  
  inline def empty(document: typingsJapgolly.canvg.distDocumentMod.Document): typingsJapgolly.canvg.distPropertyMod.Property[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(document.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.canvg.distPropertyMod.Property[String]]
  
  @JSImport("canvg", "Property.textBaselineMapping")
  @js.native
  val textBaselineMapping: Record[String, String] = js.native
}
