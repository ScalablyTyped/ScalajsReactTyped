package typingsJapgolly.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.webNavigation.getFrame")
@js.native
object getFrame extends js.Object {
  def apply(
    details: typingsJapgolly.chrome.chrome.webNavigation.GetFrameDetails,
    callback: js.Function1[
      /* details */ typingsJapgolly.chrome.chrome.webNavigation.GetFrameResultDetails | Null, 
      Unit
    ]
  ): Unit = js.native
}

