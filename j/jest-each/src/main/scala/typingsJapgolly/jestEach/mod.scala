package typingsJapgolly.jestEach

import typingsJapgolly.jestEach.bindMod.GlobalCallback
import typingsJapgolly.jestTypes.globalMod.EachTable
import typingsJapgolly.jestTypes.globalMod.EachTestFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-each", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def bind(cb: GlobalCallback): js.Function2[
    /* table */ EachTable, 
    /* repeated */ js.Any, 
    js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit]
  ] = js.native
  def bind(cb: GlobalCallback, supportsDone: Boolean): js.Function2[
    /* table */ EachTable, 
    /* repeated */ js.Any, 
    js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit]
  ] = js.native
  @js.native
  object default extends js.Object {
    def apply(table: EachTable, data: js.Any*): AnonDescribe = js.native
    def withGlobal(g: typingsJapgolly.jestTypes.globalMod.Global): js.Function2[/* table */ EachTable, /* repeated */ js.Any, AnonDescribe] = js.native
  }
  
  type Global = typingsJapgolly.jestTypes.globalMod.Global
}

