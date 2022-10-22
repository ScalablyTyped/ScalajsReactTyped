package typingsJapgolly.wixStyleReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.distTypesListItemSectionMod.ListItemSectionProps
import typingsJapgolly.wixStyleReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("wix-style-react", "ListItemSection")
@js.native
open class ListItemSection protected ()
  extends Component[ListItemSectionProps, js.Object, Any] {
  def this(props: ListItemSectionProps) = this()
  def this(props: ListItemSectionProps, context: Any) = this()
}
object ListItemSection {
  
  inline def apply: ComponentClassP[ListItemSectionProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("ListItemSection").asInstanceOf[ComponentClassP[ListItemSectionProps & js.Object]]
}
