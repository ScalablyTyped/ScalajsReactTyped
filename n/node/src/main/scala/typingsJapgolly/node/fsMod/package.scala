package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsMod {
  import typingsJapgolly.node.Anon_EncodingFlagMode
  import typingsJapgolly.node.NodeJS.ErrnoException

  type NoParamCallback = js.Function1[/* err */ ErrnoException | Null, Unit]
  /**
    * Valid types for path values in "fs".
    */
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.node.urlMod.URL
  */
  type PathLike = _PathLike | java.lang.String
  type WriteFileOptions = Anon_EncodingFlagMode | java.lang.String | Null
}
