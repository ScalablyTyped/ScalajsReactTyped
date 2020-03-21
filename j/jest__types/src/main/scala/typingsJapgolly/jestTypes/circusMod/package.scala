package typingsJapgolly.jestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object circusMod {
  type AsyncFn = typingsJapgolly.jestTypes.circusMod.TestFn | typingsJapgolly.jestTypes.circusMod.HookFn
  type BlockFn = typingsJapgolly.jestTypes.globalMod.BlockFn
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typingsJapgolly.jestTypes.jestTypesStrings.skip
    - typingsJapgolly.jestTypes.jestTypesStrings.only
    - typingsJapgolly.jestTypes.jestTypesStrings.todo
  */
  type BlockMode = typingsJapgolly.jestTypes.circusMod._BlockMode | scala.Unit
  type BlockName = typingsJapgolly.jestTypes.globalMod.BlockName
  type DoneFn = typingsJapgolly.jestTypes.globalMod.DoneFn
  type EventHandler = js.Function2[
    /* event */ typingsJapgolly.jestTypes.circusMod.Event, 
    /* state */ typingsJapgolly.jestTypes.circusMod.State, 
    scala.Unit
  ]
  type Exception = js.Any
  type FormattedError = java.lang.String
  type HookFn = js.Function1[
    /* done */ js.UndefOr[typingsJapgolly.jestTypes.circusMod.DoneFn], 
    js.UndefOr[js.Promise[js.Any] | scala.Null]
  ]
  type Process = typingsJapgolly.node.NodeJS.Process
  type TestContext = typingsJapgolly.std.Record[java.lang.String, js.Any]
  type TestError = typingsJapgolly.jestTypes.circusMod.Exception | (js.Array[
    js.Tuple2[
      js.UndefOr[typingsJapgolly.jestTypes.circusMod.Exception], 
      typingsJapgolly.jestTypes.circusMod.Exception
    ]
  ])
  type TestFn = typingsJapgolly.jestTypes.globalMod.TestFn
  type TestMode = typingsJapgolly.jestTypes.circusMod.BlockMode
  type TestName = typingsJapgolly.jestTypes.globalMod.TestName
  type TestResults = js.Array[typingsJapgolly.jestTypes.circusMod.TestResult]
}
