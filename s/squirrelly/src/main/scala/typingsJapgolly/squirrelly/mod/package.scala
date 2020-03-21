package typingsJapgolly.squirrelly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Blocks = typingsJapgolly.std.Record[java.lang.String, js.Function0[java.lang.String]]
  type SqrlFn = js.Function2[
    /* options */ typingsJapgolly.squirrelly.mod.TemplateOptions, 
    /* Sqrl */ js.Any, 
    java.lang.String
  ]
  type TemplateOptions = typingsJapgolly.std.Record[java.lang.String, java.lang.String | scala.Double]
}
