package typingsJapgolly.gulpHelp.mod

import typingsJapgolly.gulp.mod.DestMethod
import typingsJapgolly.gulp.mod.SrcMethod
import typingsJapgolly.gulp.mod.WatchMethod
import typingsJapgolly.orchestrator.mod.Orchestrator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpHelp extends Orchestrator {
  var dest: DestMethod = js.native
  var src: SrcMethod = js.native
  var task: TaskMethod = js.native
  var watch: WatchMethod = js.native
}

