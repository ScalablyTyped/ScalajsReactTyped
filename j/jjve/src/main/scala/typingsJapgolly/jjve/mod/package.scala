package typingsJapgolly.jjve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Env = js.Function3[
    /* schema */ js.Object, 
    /* data */ js.Any, 
    /* errors */ typingsJapgolly.jjv.mod.Errors, 
    js.Array[typingsJapgolly.jjve.mod.Issue]
  ]
}
