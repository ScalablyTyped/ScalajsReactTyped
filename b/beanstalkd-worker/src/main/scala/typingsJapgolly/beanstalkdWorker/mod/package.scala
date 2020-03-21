package typingsJapgolly.beanstalkdWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JobPollHandler = js.Function1[/* state */ typingsJapgolly.beanstalkd.mod.BeanstalkdJobState, js.Any]
  type JobStatus = typingsJapgolly.beanstalkd.mod.BeanstalkdJobState | typingsJapgolly.beanstalkdWorker.beanstalkdWorkerStrings.success
  type TubeHandler = js.ThisFunction1[
    /* this */ typingsJapgolly.beanstalkdWorker.mod.WatcherJob, 
    /* payload */ js.UndefOr[js.Any], 
    js.Any
  ]
}
