package typingsJapgolly.pdfjsDist.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pdfjsDist.AnonCMapData
import typingsJapgolly.pdfjsDist.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMapReader extends js.Object {
  def fetch(params: AnonName): js.Promise[AnonCMapData]
}

object CMapReader {
  @scala.inline
  def apply(fetch: AnonName => CallbackTo[js.Promise[AnonCMapData]]): CMapReader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: typingsJapgolly.pdfjsDist.AnonName) => fetch(t0).runNow()))
    __obj.asInstanceOf[CMapReader]
  }
}

