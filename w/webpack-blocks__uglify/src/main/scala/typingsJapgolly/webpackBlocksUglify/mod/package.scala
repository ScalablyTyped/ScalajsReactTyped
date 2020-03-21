package typingsJapgolly.webpackBlocksUglify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExtractCommentsFunction = js.Function2[
    /* node */ js.Any, 
    /* comment */ js.Any, 
    scala.Boolean | typingsJapgolly.webpackBlocksUglify.mod.ExtractCommentsObject
  ]
  type FileNameFunction = js.Function1[/* file */ java.lang.String, java.lang.String]
  type TestType = java.lang.String | js.RegExp
}
