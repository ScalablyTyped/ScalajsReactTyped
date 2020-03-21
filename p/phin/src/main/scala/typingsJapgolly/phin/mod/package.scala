package typingsJapgolly.phin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ICallback[T] = js.Function2[
    /* error */ scala.Null, 
    /* response */ typingsJapgolly.std.NonNullable[T], 
    scala.Unit
  ]
  // NOTE: Typescript cannot infer type of union callback on the consumer side
  // https://github.com/Microsoft/TypeScript/pull/17819#issuecomment-363636904
  type IErrorCallback = js.Function2[/* error */ js.Error | java.lang.String, /* response */ scala.Null, scala.Unit]
  // Form and data property has been written this way so they're mutually exclusive.
  type IWithData[T /* <: js.Object */] = T with typingsJapgolly.phin.AnonData
  type IWithForm[T /* <: js.Object */] = T with typingsJapgolly.phin.AnonForm
}
