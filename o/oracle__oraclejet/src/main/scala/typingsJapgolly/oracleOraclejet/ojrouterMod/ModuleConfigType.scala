package typingsJapgolly.oracleOraclejet.ojrouterMod

import typingsJapgolly.knockout.KnockoutObservable
import typingsJapgolly.oracleOraclejet.AnonAttached
import typingsJapgolly.oracleOraclejet.AnonOjRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ModuleConfigType extends js.Object {
  var lifecycleListener: AnonAttached = js.native
  @JSName("name")
  var name_Original: KnockoutObservable[String] = js.native
  var params: AnonOjRouter = js.native
  def name(): String = js.native
  def name(value: String): Unit = js.native
}

