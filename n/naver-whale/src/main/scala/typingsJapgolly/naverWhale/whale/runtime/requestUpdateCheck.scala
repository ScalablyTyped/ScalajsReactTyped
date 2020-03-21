package typingsJapgolly.naverWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.requestUpdateCheck")
@js.native
object requestUpdateCheck extends js.Object {
  def apply(
    callback: js.Function2[
      /* status */ typingsJapgolly.chrome.chrome.runtime.RequestUpdateCheckStatus, 
      /* details */ js.UndefOr[typingsJapgolly.chrome.chrome.runtime.UpdateCheckDetails], 
      Unit
    ]
  ): Unit = js.native
}

