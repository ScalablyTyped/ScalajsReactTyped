package typingsJapgolly.sanctuary

import typingsJapgolly.sanctuary.mod.ChainRec
import typingsJapgolly.sanctuary.mod.Either
import typingsJapgolly.sanctuary.mod.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallF extends js.Object {
  def apply[A, B](f: Fn[A, ChainRec[Either[A, B]]]): js.Function1[/* x */ A, ChainRec[B]] = js.native
}

