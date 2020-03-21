package typingsJapgolly.reactToolbox

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.libListListMod.ListProps
import typingsJapgolly.reactToolbox.listListCheckboxMod.ListCheckboxProps
import typingsJapgolly.reactToolbox.listListDividerMod.ListDividerProps
import typingsJapgolly.reactToolbox.listListItemActionMod.ListItemActionProps
import typingsJapgolly.reactToolbox.listListItemActionsMod.ListItemActionsProps
import typingsJapgolly.reactToolbox.listListItemContentMod.ListItemContentProps
import typingsJapgolly.reactToolbox.listListItemLayoutMod.ListItemLayoutProps
import typingsJapgolly.reactToolbox.listListItemMod.ListItemProps
import typingsJapgolly.reactToolbox.listListItemTextMod.ListItemTextProps
import typingsJapgolly.reactToolbox.listListSubHeaderMod.ListSubHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/list", JSImport.Namespace)
@js.native
object libListMod extends js.Object {
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @js.native
  class ListCheckbox ()
    extends Component[ListCheckboxProps, js.Object, js.Any]
  
  @js.native
  class ListDivider ()
    extends Component[ListDividerProps, js.Object, js.Any]
  
  @js.native
  class ListItem ()
    extends Component[ListItemProps with ListItemLayoutProps, js.Object, js.Any]
  
  @js.native
  class ListItemAction ()
    extends Component[ListItemActionProps, js.Object, js.Any]
  
  @js.native
  class ListItemActions ()
    extends Component[ListItemActionsProps, js.Object, js.Any]
  
  @js.native
  class ListItemContent ()
    extends Component[ListItemContentProps, js.Object, js.Any]
  
  @js.native
  class ListItemLayout ()
    extends Component[ListItemLayoutProps, js.Object, js.Any]
  
  @js.native
  class ListItemText ()
    extends Component[ListItemTextProps, js.Object, js.Any]
  
  @js.native
  class ListSubHeader ()
    extends Component[ListSubHeaderProps, js.Object, js.Any]
  
}

