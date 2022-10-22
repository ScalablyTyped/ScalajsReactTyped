package typingsJapgolly.reactBootstrapDaterangepicker.components

import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactBootstrapDaterangepicker.mod.Props
import typingsJapgolly.reactBootstrapDaterangepicker.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBootstrapDaterangepicker {
  
  @JSImport("react-bootstrap-daterangepicker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactBootstrapDaterangepicker.type): SharedBuilder_PropsWithChildren_181469469[default] = new SharedBuilder_PropsWithChildren_181469469[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[Props]): SharedBuilder_PropsWithChildren_181469469[default] = new SharedBuilder_PropsWithChildren_181469469[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
