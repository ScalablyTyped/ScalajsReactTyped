package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libTabPaneMod.TabPaneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pane {
  
  @JSImport("react-bootstrap/lib/Tab", "Pane")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Pane.type): SharedBuilder_TabPaneProps1024747231[typingsJapgolly.reactBootstrap.libTabMod.Pane] = new SharedBuilder_TabPaneProps1024747231[typingsJapgolly.reactBootstrap.libTabMod.Pane](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabPaneProps): SharedBuilder_TabPaneProps1024747231[typingsJapgolly.reactBootstrap.libTabMod.Pane] = new SharedBuilder_TabPaneProps1024747231[typingsJapgolly.reactBootstrap.libTabMod.Pane](js.Array(this.component, p.asInstanceOf[js.Any]))
}
