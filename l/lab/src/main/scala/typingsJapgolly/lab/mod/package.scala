package typingsJapgolly.lab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncCallback = js.Function1[/* done */ typingsJapgolly.lab.mod.DoneFunction, scala.Unit]
  type AsyncPromise = js.Function0[js.Promise[js.Any]]
  type CleanupFunction = js.Function1[/* func */ js.Function1[/* next */ js.Function, scala.Unit], scala.Unit]
  type DoneFunction = js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]
  type EmptyCallback = js.Function0[scala.Unit]
  type ExperimentArgs = js.Function2[
    /* desc */ java.lang.String, 
    /* cb */ typingsJapgolly.lab.mod.EmptyCallback, 
    js.Object
  ]
  type ExperimentWithOptionsArgs = js.Function3[
    /* desc */ java.lang.String, 
    /* options */ typingsJapgolly.lab.mod.ExperimentOptions, 
    /* cb */ typingsJapgolly.lab.mod.EmptyCallback, 
    js.Object
  ]
  type TestArgs = js.Function2[
    /* desc */ java.lang.String, 
    /* cb */ typingsJapgolly.lab.mod.TestCallback, 
    js.Object
  ]
  type TestCallback = js.Function2[
    /* done */ typingsJapgolly.lab.mod.DoneFunction with typingsJapgolly.lab.mod.DoneNote, 
    /* onCleanup */ js.UndefOr[typingsJapgolly.lab.mod.CleanupFunction], 
    scala.Unit
  ]
  type TestPromise = js.Function0[js.Promise[js.Any]]
  type TestWithOptionsArgs = js.Function3[
    /* desc */ java.lang.String, 
    /* options */ typingsJapgolly.lab.mod.TestOptions, 
    /* cb */ typingsJapgolly.lab.mod.TestCallback, 
    js.Object
  ]
}
