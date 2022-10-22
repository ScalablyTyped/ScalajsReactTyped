package typingsJapgolly.quickPicker.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.quickPicker.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QuickPicker {
  
  @JSImport("quick-picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: QuickPicker.type): Default[default] = new Default[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
