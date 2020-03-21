package typingsJapgolly.gulpNunitRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NUnit = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.gulpNunitRunner.mod.Options], 
    typingsJapgolly.node.NodeJS.ReadWriteStream
  ]
}
