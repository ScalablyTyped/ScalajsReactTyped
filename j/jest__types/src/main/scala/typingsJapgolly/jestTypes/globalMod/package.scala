package typingsJapgolly.jestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object globalMod {
  type ArrayTable = typingsJapgolly.jestTypes.globalMod.Table | typingsJapgolly.jestTypes.globalMod.Row
  type BlockFn = js.Function0[scala.Unit]
  type BlockName = java.lang.String
  type Col = js.Any
  type DoneFn = js.Function1[/* reason */ js.UndefOr[java.lang.String | js.Error], scala.Unit]
  type Each = js.Function2[
    /* table */ typingsJapgolly.jestTypes.globalMod.EachTable, 
    /* repeated */ js.Any, 
    js.Function3[
      /* title */ java.lang.String, 
      /* test */ typingsJapgolly.jestTypes.globalMod.EachTestFn, 
      /* timeout */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ]
  type EachTable = typingsJapgolly.jestTypes.globalMod.ArrayTable | typingsJapgolly.jestTypes.globalMod.TemplateTable
  type EachTestFn = js.Function1[/* repeated */ js.Any, js.UndefOr[js.Promise[js.Any] | scala.Unit]]
  type ItConcurrentBase = js.Function3[
    /* testName */ java.lang.String, 
    /* testFn */ js.Function0[js.Promise[js.Any]], 
    /* timeout */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type Row = js.Array[typingsJapgolly.jestTypes.globalMod.Col]
  type Table = js.Array[typingsJapgolly.jestTypes.globalMod.Row]
  type TemplateData = js.Array[js.Any]
  type TemplateTable = typingsJapgolly.std.TemplateStringsArray
  type TestFn = js.Function1[
    /* done */ js.UndefOr[typingsJapgolly.jestTypes.globalMod.DoneFn], 
    js.UndefOr[js.Promise[js.Any] | scala.Unit]
  ]
  type TestName = java.lang.String
}
