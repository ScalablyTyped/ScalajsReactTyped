package typingsJapgolly.promiseHash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type PromiseHash = js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof any ]: std.PromiseLike<any[P]> | any[P]}
    */ /* promiseHash */ typingsJapgolly.promiseHash.promiseHashStrings.PromiseHash with js.Any, 
    js.Promise[js.Any]
  ]
}
