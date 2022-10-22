package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsViewMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object View {
  
  @JSImport("react-sketchapp", "View")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: View.type): Default[typingsJapgolly.reactSketchapp.mod.View] = new Default[typingsJapgolly.reactSketchapp.mod.View](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.mod.View] = new Default[typingsJapgolly.reactSketchapp.mod.View](js.Array(this.component, p.asInstanceOf[js.Any]))
}
