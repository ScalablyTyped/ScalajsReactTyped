package typingsJapgolly.promiseAllsettled

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type PromiseResultTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    */ typingsJapgolly.promiseAllsettled.promiseAllsettledStrings.PromiseResultTuple with T
  type PromiseTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Promise<T[P]>}
    */ typingsJapgolly.promiseAllsettled.promiseAllsettledStrings.PromiseTuple with T
}
