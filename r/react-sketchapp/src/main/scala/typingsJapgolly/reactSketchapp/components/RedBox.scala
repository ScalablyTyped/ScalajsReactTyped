package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsRedBoxMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RedBox {
  
  @JSImport("react-sketchapp", "RedBox")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RedBox.type): Default[typingsJapgolly.reactSketchapp.mod.RedBox] = new Default[typingsJapgolly.reactSketchapp.mod.RedBox](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.mod.RedBox] = new Default[typingsJapgolly.reactSketchapp.mod.RedBox](js.Array(this.component, p.asInstanceOf[js.Any]))
}
