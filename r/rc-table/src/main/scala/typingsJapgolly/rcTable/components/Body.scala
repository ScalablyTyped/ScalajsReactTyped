package typingsJapgolly.rcTable.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rcTable.anon.FnCall
import typingsJapgolly.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Body {
  
  @JSImport("rc-table/lib/Body", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Body.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ComponentPropsWithRef[FnCall]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
