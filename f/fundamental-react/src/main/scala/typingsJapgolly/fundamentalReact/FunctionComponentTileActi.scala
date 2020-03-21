package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.TileDotActions
import typingsJapgolly.fundamentalReact.tileMod.TileActionsProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Tile/Tile.TileActionsProps> & {  displayName  :'Tile.Actions'} */
@js.native
trait FunctionComponentTileActi extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTileActionsProps] = js.native
  var displayName: js.UndefOr[String with TileDotActions] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTileActi] = js.native
  def apply(props: PropsWithChildren[TileActionsProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[TileActionsProps], context: js.Any): Element | Null = js.native
}

