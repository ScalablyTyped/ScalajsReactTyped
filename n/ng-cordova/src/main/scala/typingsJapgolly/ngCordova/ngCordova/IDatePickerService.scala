package typingsJapgolly.ngCordova.ngCordova

import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePickerService extends js.Object {
  def show(): IPromise[js.Date] = js.native
  def show(options: DatePickerOptions): IPromise[js.Date] = js.native
}

