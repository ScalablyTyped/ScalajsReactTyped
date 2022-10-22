package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsPageMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  @JSImport("react-sketchapp", "Page")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Page.type): Default[typingsJapgolly.reactSketchapp.mod.Page] = new Default[typingsJapgolly.reactSketchapp.mod.Page](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.mod.Page] = new Default[typingsJapgolly.reactSketchapp.mod.Page](js.Array(this.component, p.asInstanceOf[js.Any]))
}
