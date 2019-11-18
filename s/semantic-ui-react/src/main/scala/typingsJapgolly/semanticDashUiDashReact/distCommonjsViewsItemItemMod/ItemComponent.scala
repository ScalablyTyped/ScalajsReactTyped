package typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.reactMod.FunctionComponent
import typingsJapgolly.react.reactMod.StatelessComponent
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemContentMod.ItemContentProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemDescriptionMod.ItemDescriptionProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemExtraMod.ItemExtraProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemGroupMod.ItemGroupProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemHeaderMod.ItemHeaderProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemImageMod.ItemImageProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsItemItemMetaMod.ItemMetaProps
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

