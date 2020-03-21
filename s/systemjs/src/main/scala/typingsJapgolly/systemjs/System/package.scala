package typingsJapgolly.systemjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object System {
  type DeclareFn = js.Function2[
    /* _export */ typingsJapgolly.systemjs.System.ExportFn, 
    /* _context */ typingsJapgolly.systemjs.System.Context, 
    typingsJapgolly.systemjs.System.Declare
  ]
  type ExecuteFn = js.Function0[js.Any]
  type GetFn = typingsJapgolly.systemjs.System.GetFnModule | typingsJapgolly.systemjs.System.GetFnGeneric
  // tslint:disable-next-line no-unnecessary-generics
  type GetFnGeneric = js.Function1[/* moduleId */ java.lang.String, js.Any]
  type GetFnModule = js.Function1[/* moduleId */ java.lang.String, typingsJapgolly.systemjs.System.Module]
  // tslint:disable-next-line no-unnecessary-generics
  type ImportFn = js.Function2[
    /* moduleId */ java.lang.String, 
    /* parentUrl */ js.UndefOr[java.lang.String], 
    js.Promise[typingsJapgolly.systemjs.System.Module]
  ]
  type SetterFn = js.Function1[/* moduleValue */ typingsJapgolly.systemjs.System.Module, js.Any]
  type UpdateModuleFn = js.Function0[scala.Unit]
}
