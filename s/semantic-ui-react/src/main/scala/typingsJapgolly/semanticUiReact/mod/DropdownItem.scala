package typingsJapgolly.semanticUiReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "DropdownItem")
@js.native
open class DropdownItem protected ()
  extends Component[DropdownItemProps, js.Object, Any] {
  def this(props: DropdownItemProps) = this()
  def this(props: DropdownItemProps, context: Any) = this()
}
object DropdownItem {
  
  inline def apply: ComponentClassP[DropdownItemProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("DropdownItem").asInstanceOf[ComponentClassP[DropdownItemProps & js.Object]]
}
