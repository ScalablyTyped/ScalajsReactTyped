package typingsJapgolly.rename

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FilePath = java.lang.String | typingsJapgolly.rename.mod.Specification
  type Transformer = (js.Function1[
    /* spec */ typingsJapgolly.rename.mod.FileObject, 
    typingsJapgolly.rename.mod.FilePath
  ]) | typingsJapgolly.rename.mod.FilePath
}
