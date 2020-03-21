package typingsJapgolly.csvStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* err */ js.UndefOr[scala.Null | js.Error], 
    /* output */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type Cast[T] = js.Function2[
    /* value */ T, 
    /* context */ typingsJapgolly.csvStringify.mod.CastingContext, 
    java.lang.String
  ]
  type Input = js.Array[js.Any]
  type PlainObject[T] = typingsJapgolly.std.Record[java.lang.String, T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.node.Buffer
    - typingsJapgolly.csvStringify.csvStringifyStrings.auto
    - typingsJapgolly.csvStringify.csvStringifyStrings.unix
    - typingsJapgolly.csvStringify.csvStringifyStrings.mac
    - typingsJapgolly.csvStringify.csvStringifyStrings.windows
    - typingsJapgolly.csvStringify.csvStringifyStrings.ascii
    - typingsJapgolly.csvStringify.csvStringifyStrings.unicode
  */
  type RecordDelimiter = typingsJapgolly.csvStringify.mod._RecordDelimiter | java.lang.String | typingsJapgolly.node.Buffer
}
