package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.TileDotContent
import typingsJapgolly.fundamentalReact.tileMod.TileContentProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Tile/Tile.TileContentProps> & {  displayName  :'Tile.Content'} */
@js.native
trait FunctionComponentTileCont extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTileContentProps] = js.native
  var displayName: js.UndefOr[String with TileDotContent] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTileCont] = js.native
  def apply(props: PropsWithChildren[TileContentProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[TileContentProps], context: js.Any): Element | Null = js.native
}

