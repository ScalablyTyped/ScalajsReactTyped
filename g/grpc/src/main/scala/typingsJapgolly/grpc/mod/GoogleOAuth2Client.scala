package typingsJapgolly.grpc.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleOAuth2Client extends js.Object {
  def getRequestMetadata(optUri: String, metadataCallback: js.Function2[/* err */ js.Error, /* headers */ js.Any, Unit]): Unit
}

object GoogleOAuth2Client {
  @scala.inline
  def apply(
    getRequestMetadata: (String, js.Function2[/* err */ js.Error, /* headers */ js.Any, Unit]) => Callback
  ): GoogleOAuth2Client = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRequestMetadata")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* err */ js.Error, /* headers */ js.Any, scala.Unit]) => getRequestMetadata(t0, t1).runNow()))
    __obj.asInstanceOf[GoogleOAuth2Client]
  }
}

