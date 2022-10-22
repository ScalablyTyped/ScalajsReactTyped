package typingsJapgolly.wixStyleReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.distTypesListItemSelectMod.ListItemSelectProps
import typingsJapgolly.wixStyleReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("wix-style-react", "ListItemSelect")
@js.native
open class ListItemSelect protected ()
  extends Component[ListItemSelectProps, js.Object, Any] {
  def this(props: ListItemSelectProps) = this()
  def this(props: ListItemSelectProps, context: Any) = this()
}
object ListItemSelect {
  
  inline def apply: ComponentClassP[ListItemSelectProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("ListItemSelect").asInstanceOf[ComponentClassP[ListItemSelectProps & js.Object]]
}
