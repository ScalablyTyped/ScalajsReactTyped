package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsDocumentMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Document {
  
  @JSImport("react-sketchapp", "Document")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Document.type): Default[typingsJapgolly.reactSketchapp.mod.Document] = new Default[typingsJapgolly.reactSketchapp.mod.Document](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.mod.Document] = new Default[typingsJapgolly.reactSketchapp.mod.Document](js.Array(this.component, p.asInstanceOf[js.Any]))
}
