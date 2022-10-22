package typingsJapgolly.semanticUiReact.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesTabTabMod.TabComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesTabTabMod.TabProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Tab")
@js.native
open class Tab protected ()
  extends Component[TabProps, js.Object, Any] {
  def this(props: TabProps) = this()
  def this(props: TabProps, context: Any) = this()
}
object Tab {
  
  inline def apply: TabComponent = ^.asInstanceOf[js.Dynamic].selectDynamic("Tab").asInstanceOf[TabComponent]
}
