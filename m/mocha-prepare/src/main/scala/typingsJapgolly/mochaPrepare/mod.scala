package typingsJapgolly.mochaPrepare

import typingsJapgolly.mocha.Mocha_.Done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha-prepare", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(onPrepare: js.Function1[/* fn */ Done, Unit]): Unit = js.native
  def apply(onPrepare: js.Function1[/* fn */ Done, Unit], onUnprepare: js.Function1[/* fn */ Done, Unit]): Unit = js.native
}

