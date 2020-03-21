package typingsJapgolly.gulp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Globs = java.lang.String | js.Array[java.lang.String]
  /**
    * @deprecated - Now use `TaskFunction`.
    */
  type TaskCallback = typingsJapgolly.gulp.mod.TaskFunction
  type TaskFunction = typingsJapgolly.undertaker.mod.TaskFunction
}
