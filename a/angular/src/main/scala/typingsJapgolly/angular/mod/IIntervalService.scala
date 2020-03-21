package typingsJapgolly.angular.mod

import typingsJapgolly.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// IntervalService
// see http://docs.angularjs.org/api/ng.$interval
///////////////////////////////////////////////////////////////////////////
@js.native
trait IIntervalService extends js.Object {
  def apply(func: Function, delay: Double): IPromise[_] = js.native
  def apply(func: Function, delay: Double, count: Double): IPromise[_] = js.native
  def apply(func: Function, delay: Double, count: Double, invokeApply: Boolean, args: js.Any*): IPromise[_] = js.native
  def cancel(promise: IPromise[_]): Boolean = js.native
}

