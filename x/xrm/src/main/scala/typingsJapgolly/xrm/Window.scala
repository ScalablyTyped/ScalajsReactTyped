package typingsJapgolly.xrm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.GlobalContext
import typingsJapgolly.xrm.Xrm.XrmStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Xrm: XrmStatic
  def GetGlobalContext(): GlobalContext
}

object Window {
  @scala.inline
  def apply(GetGlobalContext: CallbackTo[GlobalContext], Xrm: XrmStatic): Window = {
    val __obj = js.Dynamic.literal(Xrm = Xrm.asInstanceOf[js.Any])
    __obj.updateDynamic("GetGlobalContext")(GetGlobalContext.toJsFn)
    __obj.asInstanceOf[Window]
  }
}

