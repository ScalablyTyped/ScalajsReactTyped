package typingsJapgolly.async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncAutoTask[R1, R /* <: typingsJapgolly.async.mod.Dictionary[_] */, E] = (typingsJapgolly.async.mod.AsyncAutoTaskFunctionWithoutDependencies[R1, E]) | (js.Array[java.lang.String | (typingsJapgolly.async.mod.AsyncAutoTaskFunction[R1, R, E])])
  type AsyncAutoTaskFunction[R1, R /* <: typingsJapgolly.async.mod.Dictionary[_] */, E] = js.Function2[
    /* results */ R, 
    /* cb */ (typingsJapgolly.async.mod.AsyncResultCallback[R1, E]) | typingsJapgolly.async.mod.ErrorCallback[E], 
    scala.Unit
  ]
  type AsyncAutoTaskFunctionWithoutDependencies[R1, E] = js.Function1[
    /* cb */ (typingsJapgolly.async.mod.AsyncResultCallback[R1, E]) | typingsJapgolly.async.mod.ErrorCallback[E], 
    scala.Unit
  ]
  type AsyncAutoTasks[R /* <: typingsJapgolly.async.mod.Dictionary[_] */, E] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof R ]: async.async.AsyncAutoTask<R[K], R, E>}
    */ typingsJapgolly.async.asyncStrings.AsyncAutoTasks with R
  type AsyncBooleanIterator[T, E] = js.Function2[
    /* item */ T, 
    /* callback */ typingsJapgolly.async.mod.AsyncBooleanResultCallback[E], 
    scala.Unit
  ]
  type AsyncBooleanResultCallback[E] = js.Function2[
    /* err */ js.UndefOr[E | scala.Null], 
    /* truthValue */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type AsyncForEachOfIterator[T, E] = js.Function3[
    /* item */ T, 
    /* key */ scala.Double | java.lang.String, 
    /* callback */ typingsJapgolly.async.mod.ErrorCallback[E], 
    scala.Unit
  ]
  type AsyncFunction[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E | scala.Null], /* result */ js.UndefOr[T], scala.Unit], 
    scala.Unit
  ]
  type AsyncFunctionEx[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E | scala.Null], /* repeated */ T, scala.Unit], 
    scala.Unit
  ]
  type AsyncIterator[T, E] = js.Function2[/* item */ T, /* callback */ typingsJapgolly.async.mod.ErrorCallback[E], scala.Unit]
  type AsyncMemoIterator[T, R, E] = js.Function3[
    /* memo */ js.UndefOr[R], 
    /* item */ T, 
    /* callback */ typingsJapgolly.async.mod.AsyncResultCallback[R, E], 
    scala.Unit
  ]
  type AsyncResultArrayCallback[T, E] = js.Function2[
    /* err */ js.UndefOr[E | scala.Null], 
    /* results */ js.UndefOr[js.Array[js.UndefOr[T]]], 
    scala.Unit
  ]
  type AsyncResultCallback[T, E] = js.Function2[/* err */ js.UndefOr[E | scala.Null], /* result */ js.UndefOr[T], scala.Unit]
  type AsyncResultIterator[T, R, E] = js.Function2[
    /* item */ T, 
    /* callback */ typingsJapgolly.async.mod.AsyncResultCallback[R, E], 
    scala.Unit
  ]
  type AsyncResultObjectCallback[T, E] = js.Function2[
    /* err */ js.UndefOr[E], 
    /* results */ typingsJapgolly.async.mod.Dictionary[js.UndefOr[T]], 
    scala.Unit
  ]
  type AsyncVoidFunction[E] = js.Function1[/* callback */ typingsJapgolly.async.mod.ErrorCallback[E], scala.Unit]
  type AsyncWorker[T, E] = js.Function2[/* task */ T, /* callback */ typingsJapgolly.async.mod.ErrorCallback[E], scala.Unit]
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ErrorCallback[E] = js.Function1[/* err */ js.UndefOr[E | scala.Null], scala.Unit]
  type IterableCollection[T] = js.Array[T] | typingsJapgolly.std.IterableIterator[T] | typingsJapgolly.async.mod.Dictionary[T]
}
