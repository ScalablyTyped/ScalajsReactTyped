package typingsJapgolly.semanticUiReact.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesSidebarSidebarMod.SidebarComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesSidebarSidebarMod.SidebarProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Sidebar")
@js.native
open class Sidebar protected ()
  extends Component[SidebarProps, js.Object, Any] {
  def this(props: SidebarProps) = this()
  def this(props: SidebarProps, context: Any) = this()
}
object Sidebar {
  
  inline def apply: SidebarComponent = ^.asInstanceOf[js.Dynamic].selectDynamic("Sidebar").asInstanceOf[SidebarComponent]
}
