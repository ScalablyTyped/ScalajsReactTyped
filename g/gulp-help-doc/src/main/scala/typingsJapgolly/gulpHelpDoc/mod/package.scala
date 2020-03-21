package typingsJapgolly.gulpHelpDoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Usage = js.Function2[
    /* gulp */ typingsJapgolly.gulp.mod.Gulp, 
    /* options */ js.UndefOr[typingsJapgolly.gulpHelpDoc.mod.UsageOptions], 
    js.Promise[js.Any]
  ]
}
