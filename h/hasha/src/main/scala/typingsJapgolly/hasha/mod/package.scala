package typingsJapgolly.hasha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AlgorithmName = typingsJapgolly.typeFest.mod.LiteralUnion[
    typingsJapgolly.hasha.hashaStrings.md5 | typingsJapgolly.hasha.hashaStrings.sha1 | typingsJapgolly.hasha.hashaStrings.sha256 | typingsJapgolly.hasha.hashaStrings.sha512, 
    java.lang.String
  ]
  type HashaInput = typingsJapgolly.node.Buffer | java.lang.String | (js.Array[typingsJapgolly.node.Buffer | java.lang.String])
}
