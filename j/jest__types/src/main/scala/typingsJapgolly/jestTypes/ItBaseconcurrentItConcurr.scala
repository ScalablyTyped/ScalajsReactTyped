package typingsJapgolly.jestTypes

import typingsJapgolly.jestTypes.globalMod.Each
import typingsJapgolly.jestTypes.globalMod.EachTable
import typingsJapgolly.jestTypes.globalMod.EachTestFn
import typingsJapgolly.jestTypes.globalMod.ItConcurrentBase
import typingsJapgolly.jestTypes.globalMod.TestFn
import typingsJapgolly.jestTypes.globalMod.TestName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @jest/types.@jest/types/build/Global.ItBase & {  concurrent ? :@jest/types.@jest/types/build/Global.ItConcurrentBase} */
@js.native
trait ItBaseconcurrentItConcurr extends js.Object {
  var concurrent: js.UndefOr[ItConcurrentBase] = js.native
  @JSName("each")
  var each_Original: Each = js.native
  def apply(testName: TestName, fn: TestFn): Unit = js.native
  def apply(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  def each(table: EachTable, taggedTemplateData: js.Any*): js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit] = js.native
}

