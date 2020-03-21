package typingsJapgolly.semanticUiReact.listListMod

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.listContentMod.ListContentProps
import typingsJapgolly.semanticUiReact.listDescriptionMod.ListDescriptionProps
import typingsJapgolly.semanticUiReact.listHeaderMod.ListHeaderProps
import typingsJapgolly.semanticUiReact.listIconMod.ListIconProps
import typingsJapgolly.semanticUiReact.listItemMod.ListItemProps
import typingsJapgolly.semanticUiReact.listListListMod.ListListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComponent extends FunctionComponent[ListProps] {
  var Content: StatelessComponent[ListContentProps] = js.native
  var Description: StatelessComponent[ListDescriptionProps] = js.native
  var Header: StatelessComponent[ListHeaderProps] = js.native
  var Icon: StatelessComponent[ListIconProps] = js.native
  var Item: StatelessComponent[ListItemProps] = js.native
  var List: StatelessComponent[ListListProps] = js.native
}

