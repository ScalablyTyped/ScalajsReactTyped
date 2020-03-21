package typingsJapgolly.kue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DoneCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], scala.Unit]
  type JobCallback = js.Function2[
    /* err */ js.UndefOr[js.Any], 
    /* job */ js.UndefOr[typingsJapgolly.kue.mod.Job], 
    scala.Unit
  ]
  type ProcessCallback = (js.Function2[
    /* job */ typingsJapgolly.kue.mod.Job, 
    /* cb */ typingsJapgolly.kue.mod.DoneCallback, 
    scala.Unit
  ]) | (js.Function3[
    /* job */ typingsJapgolly.kue.mod.Job, 
    /* ctx */ typingsJapgolly.kue.mod.WorkerCtx, 
    /* cb */ typingsJapgolly.kue.mod.DoneCallback, 
    scala.Unit
  ])
}
