package typingsJapgolly.json2csv.json2csvbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object json2csv {
  type FieldValueCallback[T] = typingsJapgolly.json2csv.json2csvbaseMod.json2csv.FieldValueCallbackWithoutField[T] | typingsJapgolly.json2csv.json2csvbaseMod.json2csv.FieldValueCallbackWithField[T]
  type FieldValueCallbackWithField[T] = js.Function2[
    /* row */ T, 
    /* field */ typingsJapgolly.json2csv.json2csvbaseMod.json2csv.FieldValueCallbackInfo, 
    js.Any
  ]
  type FieldValueCallbackWithoutField[T] = js.Function1[/* row */ T, js.Any]
}
