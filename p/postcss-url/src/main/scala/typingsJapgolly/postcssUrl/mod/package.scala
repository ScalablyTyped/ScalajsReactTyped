package typingsJapgolly.postcssUrl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomFilterFunction = js.Function1[/* file */ java.lang.String, scala.Boolean]
  type CustomHashFunction = js.Function1[/* file */ typingsJapgolly.node.Buffer, java.lang.String]
  type CustomTransformFunction = js.Function2[
    /* asset */ typingsJapgolly.postcssUrl.AnonAbsolutePath, 
    /* dir */ typingsJapgolly.postcssUrl.AnonFile, 
    java.lang.String
  ]
  type Url = typingsJapgolly.postcss.mod.Plugin_[
    typingsJapgolly.postcssUrl.mod.Options | js.Array[typingsJapgolly.postcssUrl.mod.Options]
  ]
}
