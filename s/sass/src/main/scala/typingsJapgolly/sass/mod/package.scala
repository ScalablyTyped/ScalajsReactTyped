package typingsJapgolly.sass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Importer = js.Function3[
    /* url */ java.lang.String, 
    /* prev */ java.lang.String, 
    /* done */ js.Function1[/* data */ typingsJapgolly.sass.mod.ImporterReturnType, scala.Unit], 
    typingsJapgolly.sass.mod.ImporterReturnType | scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sass.AnonFile
    - typingsJapgolly.sass.AnonContents
    - typingsJapgolly.std.Error
    - scala.Null
  */
  type ImporterReturnType = typingsJapgolly.sass.mod._ImporterReturnType | js.Error | scala.Null
}
