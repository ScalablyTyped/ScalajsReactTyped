package typingsJapgolly.memFsEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* err */ js.Any, js.Any]
  type Contents = java.lang.String | typingsJapgolly.node.Buffer
  type ProcessingFunc = js.Function2[
    /* contents */ typingsJapgolly.node.Buffer, 
    /* path */ java.lang.String, 
    typingsJapgolly.memFsEditor.mod.Contents
  ]
  type ReplacerFunc = js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]
  type Space = java.lang.String | scala.Double
}
