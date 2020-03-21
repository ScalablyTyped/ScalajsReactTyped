package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.TileDotMedia
import typingsJapgolly.fundamentalReact.tileMod.TileMediaProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Tile/Tile.TileMediaProps> & {  displayName  :'Tile.Media'} */
@js.native
trait FunctionComponentTileMedi extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTileMediaProps] = js.native
  var displayName: js.UndefOr[String with TileDotMedia] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTileMedi] = js.native
  def apply(props: PropsWithChildren[TileMediaProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[TileMediaProps], context: js.Any): Element | Null = js.native
}

