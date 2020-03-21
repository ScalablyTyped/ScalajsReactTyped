package typingsJapgolly.semanticUiReact.itemItemMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.itemContentMod.ItemContentProps
import typingsJapgolly.semanticUiReact.itemDescriptionMod.ItemDescriptionProps
import typingsJapgolly.semanticUiReact.itemExtraMod.ItemExtraProps
import typingsJapgolly.semanticUiReact.itemGroupMod.ItemGroupProps
import typingsJapgolly.semanticUiReact.itemHeaderMod.ItemHeaderProps
import typingsJapgolly.semanticUiReact.itemImageMod.ItemImageProps
import typingsJapgolly.semanticUiReact.itemMetaMod.ItemMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemComponent extends FunctionComponent[ItemProps] {
  var Content: ComponentClassP[ItemContentProps with js.Object] = js.native
  var Description: StatelessComponent[ItemDescriptionProps] = js.native
  var Extra: StatelessComponent[ItemExtraProps] = js.native
  var Group: StatelessComponent[ItemGroupProps] = js.native
  var Header: StatelessComponent[ItemHeaderProps] = js.native
  var Image: StatelessComponent[ItemImageProps] = js.native
  var Meta: StatelessComponent[ItemMetaProps] = js.native
}

