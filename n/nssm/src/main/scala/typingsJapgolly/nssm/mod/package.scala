package typingsJapgolly.nssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackFn = js.Function2[
    /* error */ js.UndefOr[java.lang.String], 
    /* result */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type NssmCatch[T] = js.Function1[
    /* onrejected */ js.UndefOr[
      (js.Function2[
        /* reason */ js.Error, 
        /* stderr */ java.lang.String, 
        scala.Nothing | js.Thenable[scala.Nothing]
      ]) | scala.Null
    ], 
    typingsJapgolly.nssm.mod.NssmPromise[T | scala.Nothing]
  ]
  type NssmCommandFn = typingsJapgolly.nssm.mod.ZeroArgCommandFn with typingsJapgolly.nssm.mod.OneArgCommandFn with typingsJapgolly.nssm.mod.TwoArgCommandFn with typingsJapgolly.nssm.mod.PromiseCommandFn
  type NssmThen[T] = js.Function2[
    /* onfulfilled */ js.UndefOr[(js.Function1[/* value */ T, T | js.Thenable[T]]) | scala.Null], 
    /* onrejected */ js.UndefOr[
      (js.Function2[
        /* reason */ js.Error, 
        /* stderr */ java.lang.String, 
        scala.Nothing | js.Thenable[scala.Nothing]
      ]) | scala.Null
    ], 
    typingsJapgolly.nssm.mod.NssmPromise[T | scala.Nothing]
  ]
  type OneArgCommandFn = js.Function2[
    /* arg1 */ java.lang.String, 
    /* callback */ typingsJapgolly.nssm.mod.CallbackFn, 
    scala.Unit
  ]
  type PromiseCommandFn = js.Function2[
    /* arg1 */ js.UndefOr[java.lang.String], 
    /* arg2 */ js.UndefOr[java.lang.String], 
    typingsJapgolly.nssm.mod.NssmPromise[java.lang.String]
  ]
  type TwoArgCommandFn = js.Function3[
    /* arg1 */ java.lang.String, 
    /* arg2 */ java.lang.String, 
    /* callback */ typingsJapgolly.nssm.mod.CallbackFn, 
    scala.Unit
  ]
  type ZeroArgCommandFn = js.Function1[/* callback */ typingsJapgolly.nssm.mod.CallbackFn, scala.Unit]
}
