package typingsJapgolly.gulpChanged

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IComparator = js.Function4[
    /* stream */ typingsJapgolly.node.streamMod.Transform, 
    /* callback */ js.Function, 
    /* sourceFile */ typingsJapgolly.vinyl.mod.File, 
    /* destPath */ java.lang.String, 
    scala.Unit
  ]
  type IDestination = js.Function1[/* file */ java.lang.String | typingsJapgolly.node.Buffer, java.lang.String]
}
