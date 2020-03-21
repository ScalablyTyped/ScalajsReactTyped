package typingsJapgolly.gulpUglify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object composerMod {
  type Composer = js.Function2[
    /* uglify */ typingsJapgolly.gulpUglify.composerMod.Uglify, 
    /* log */ typingsJapgolly.gulpUglify.composerMod.Logger, 
    js.Function1[
      /* options */ js.UndefOr[typingsJapgolly.gulpUglify.mod.Options], 
      typingsJapgolly.node.NodeJS.ReadWriteStream
    ]
  ]
}
