package typingsJapgolly.crumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SkipFunction = js.Function2[
    /* request */ js.UndefOr[typingsJapgolly.hapi.mod.Request], 
    /* h */ js.UndefOr[typingsJapgolly.hapi.mod.ResponseToolkit], 
    scala.Boolean
  ]
}
