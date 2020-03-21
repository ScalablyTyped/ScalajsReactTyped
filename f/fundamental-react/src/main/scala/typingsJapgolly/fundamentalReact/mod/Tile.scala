package typingsJapgolly.fundamentalReact.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.FunctionComponentTileActi
import typingsJapgolly.fundamentalReact.FunctionComponentTileCont
import typingsJapgolly.fundamentalReact.FunctionComponentTileMedi
import typingsJapgolly.fundamentalReact.PartialTileProps
import typingsJapgolly.fundamentalReact.WeakValidationMapTileProp
import typingsJapgolly.fundamentalReact.tileMod.TileProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "Tile")
@js.native
object Tile extends js.Object {
  var Actions: FunctionComponentTileActi = js.native
  var Content: FunctionComponentTileCont = js.native
  var Media: FunctionComponentTileMedi = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTileProps] = js.native
  var displayName: js.UndefOr[String | typingsJapgolly.fundamentalReact.fundamentalReactStrings.Tile] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTileProp] = js.native
  def apply(props: PropsWithChildren[TileProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[TileProps], context: js.Any): Element | Null = js.native
}

