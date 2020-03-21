package typingsJapgolly.mapboxMapboxSdk.tilesetsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.AnonOwnerIdString
import typingsJapgolly.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TilesetsService extends js.Object {
  def listTilesets(config: AnonOwnerIdString): MapiRequest
}

object TilesetsService {
  @scala.inline
  def apply(listTilesets: AnonOwnerIdString => CallbackTo[MapiRequest]): TilesetsService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listTilesets")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonOwnerIdString) => listTilesets(t0).runNow()))
    __obj.asInstanceOf[TilesetsService]
  }
}

