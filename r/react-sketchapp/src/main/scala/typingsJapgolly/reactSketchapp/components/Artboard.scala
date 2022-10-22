package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsArtboardMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Artboard {
  
  @JSImport("react-sketchapp", "Artboard")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Artboard.type): Default[typingsJapgolly.reactSketchapp.mod.Artboard] = new Default[typingsJapgolly.reactSketchapp.mod.Artboard](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.mod.Artboard] = new Default[typingsJapgolly.reactSketchapp.mod.Artboard](js.Array(this.component, p.asInstanceOf[js.Any]))
}
