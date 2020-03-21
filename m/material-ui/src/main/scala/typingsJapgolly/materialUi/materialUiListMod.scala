package typingsJapgolly.materialUi

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.materialUi.MaterialUI.List.ListItemProps
import typingsJapgolly.materialUi.MaterialUI.List.ListProps
import typingsJapgolly.materialUi.MaterialUI.List.SelectableProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui/List", JSImport.Namespace)
@js.native
object materialUiListMod extends js.Object {
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @js.native
  class ListItem ()
    extends Component[ListItemProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[ListProps, js.Object, js.Any]
  
  def makeSelectable[P /* <: js.Object */](component: ComponentClassP[P with js.Object]): ComponentClassP[P with SelectableProps with js.Object] = js.native
}

