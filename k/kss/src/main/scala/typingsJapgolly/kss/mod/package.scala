package typingsJapgolly.kss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackFn = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* styleguide */ typingsJapgolly.kss.mod.KssStyleguide, 
    scala.Unit
  ]
}
