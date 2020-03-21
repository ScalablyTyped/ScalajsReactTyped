package typingsJapgolly.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.webNavigation.getAllFrames")
@js.native
object getAllFrames extends js.Object {
  def apply(
    details: typingsJapgolly.chrome.chrome.webNavigation.GetAllFrameDetails,
    callback: js.Function1[
      /* details */ js.Array[typingsJapgolly.chrome.chrome.webNavigation.GetAllFrameResultDetails] | Null, 
      Unit
    ]
  ): Unit = js.native
}

