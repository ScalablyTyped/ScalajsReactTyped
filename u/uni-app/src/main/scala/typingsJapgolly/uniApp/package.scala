package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uniApp {
  type AnyObject = typingsJapgolly.std.Record[java.lang.String, js.Any]
  type KVInfer[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typingsJapgolly.uniApp.uniAppStrings.KVInfer with T
  type Void[T] = js.UndefOr[T | scala.Null]
}
