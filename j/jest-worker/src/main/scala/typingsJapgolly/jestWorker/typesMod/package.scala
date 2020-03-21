package typingsJapgolly.jestWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ChildMessage = typingsJapgolly.jestWorker.typesMod.ChildMessageInitialize | typingsJapgolly.jestWorker.typesMod.ChildMessageCall | typingsJapgolly.jestWorker.typesMod.ChildMessageEnd
  type ChildMessageCall = js.Tuple4[
    typingsJapgolly.jestWorker.jestWorkerNumbers.`1`, 
    scala.Boolean, 
    java.lang.String, 
    js.Array[js.Any]
  ]
  type ChildMessageEnd = js.Tuple2[typingsJapgolly.jestWorker.jestWorkerNumbers.`2`, scala.Boolean]
  type ChildMessageInitialize = js.Tuple5[
    typingsJapgolly.jestWorker.jestWorkerNumbers.`0`, 
    scala.Boolean, 
    java.lang.String, 
    js.UndefOr[// file
  js.Array[js.Any]], 
    js.UndefOr[// setupArgs
  typingsJapgolly.jestWorker.typesMod.MessagePort]
  ]
  type OnEnd = js.Function2[/* err */ js.Error | scala.Null, /* result */ js.Any, scala.Unit]
  type OnStart = js.Function1[/* worker */ typingsJapgolly.jestWorker.typesMod.WorkerInterface, scala.Unit]
  type ParentMessage = typingsJapgolly.jestWorker.typesMod.ParentMessageOk | typingsJapgolly.jestWorker.typesMod.ParentMessageError
  type ParentMessageError = js.Tuple5[
    typingsJapgolly.jestWorker.typesMod.PARENT_MESSAGE_ERROR, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    js.Any
  ]
  type ParentMessageOk = js.Tuple2[typingsJapgolly.jestWorker.jestWorkerNumbers.`0`, js.Any]
}
