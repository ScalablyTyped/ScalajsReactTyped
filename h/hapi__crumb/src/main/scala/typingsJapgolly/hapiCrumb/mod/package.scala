package typingsJapgolly.hapiCrumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SkipFunction = js.Function2[
    /* request */ js.UndefOr[typingsJapgolly.hapiHapi.mod.Request], 
    /* h */ js.UndefOr[typingsJapgolly.hapiHapi.mod.ResponseToolkit], 
    scala.Boolean
  ]
}
