package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsMod {
  type NoParamCallback = js.Function1[/* err */ typingsJapgolly.node.NodeJS.ErrnoException | scala.Null, scala.Unit]
  /**
    * Valid types for path values in "fs".
    */
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.node.Buffer
    - typingsJapgolly.node.urlMod.URL_
  */
  type PathLike = typingsJapgolly.node.fsMod._PathLike | java.lang.String
  type WriteFileOptions = typingsJapgolly.node.AnonMode | java.lang.String | scala.Null
}
