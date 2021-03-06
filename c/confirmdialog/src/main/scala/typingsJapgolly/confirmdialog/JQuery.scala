package typingsJapgolly.confirmdialog

import typingsJapgolly.confirmdialog.options.confirmOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * confirm alert
    *  {any} pMessage
    */
  def alert(): js.Any = js.native
  def alert(pMessage: js.Any): js.Any = js.native
  def alert(pMessage: js.Any, title: String): js.Any = js.native
  def confirm(pOtions: String): js.Any = js.native
  def confirm(pOtions: String, title: String): js.Any = js.native
  /**
    * confirm Dialog
    *  {confirmOptions} pOtions
    */
  def confirm(pOtions: confirmOptions): js.Any = js.native
  def confirm(pOtions: confirmOptions, title: String): js.Any = js.native
  /**
    * confirm Dialog
    *  {any} pMessage
    */
  def dialog(pOtions: confirmOptions): js.Any = js.native
}

