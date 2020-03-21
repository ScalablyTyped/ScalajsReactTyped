package typingsJapgolly.winrt.Windows.UI.StartScreen

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISecondaryTileFactory extends js.Object {
  def createTile(
    tileId: String,
    shortName: String,
    displayName: String,
    arguments: String,
    tileOptions: TileOptions,
    logoReference: Uri
  ): SecondaryTile
  def createWideTile(
    tileId: String,
    shortName: String,
    displayName: String,
    arguments: String,
    tileOptions: TileOptions,
    logoReference: Uri,
    wideLogoReference: Uri
  ): SecondaryTile
  def createWithId(tileId: String): SecondaryTile
}

object ISecondaryTileFactory {
  @scala.inline
  def apply(
    createTile: (String, String, String, String, TileOptions, Uri) => CallbackTo[SecondaryTile],
    createWideTile: (String, String, String, String, TileOptions, Uri, Uri) => CallbackTo[SecondaryTile],
    createWithId: String => CallbackTo[SecondaryTile]
  ): ISecondaryTileFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createTile")(js.Any.fromFunction6((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: typingsJapgolly.winrt.Windows.UI.StartScreen.TileOptions, t5: typingsJapgolly.winrt.Windows.Foundation.Uri) => createTile(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("createWideTile")(js.Any.fromFunction7((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: typingsJapgolly.winrt.Windows.UI.StartScreen.TileOptions, t5: typingsJapgolly.winrt.Windows.Foundation.Uri, t6: typingsJapgolly.winrt.Windows.Foundation.Uri) => createWideTile(t0, t1, t2, t3, t4, t5, t6).runNow()))
    __obj.updateDynamic("createWithId")(js.Any.fromFunction1((t0: java.lang.String) => createWithId(t0).runNow()))
    __obj.asInstanceOf[ISecondaryTileFactory]
  }
}

