package typingsJapgolly.jestEnvironment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JestMockFn = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jestMock.fn */ js.Any
  type JestMockSpyOn = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jestMock.spyOn */ js.Any
  type Module = typingsJapgolly.node.NodeModule
  type ModuleWrapper = js.Function8[
    /* module */ typingsJapgolly.jestEnvironment.mod.Module, 
    /* import warning: importer.ImportType#apply Failed type conversion: @jest/environment.@jest/environment.Module['exports'] */ /* exports */ js.Any, 
    /* require */ typingsJapgolly.node.NodeJS.Require with (js.Function1[/* id */ java.lang.String, _]), 
    /* __dirname */ java.lang.String, 
    /* __filename */ java.lang.String, 
    /* global */ typingsJapgolly.jestTypes.globalMod.Global, 
    /* jest */ typingsJapgolly.jestEnvironment.mod.Jest, 
    js.UndefOr[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any
    ], 
    js.Any
  ]
}
