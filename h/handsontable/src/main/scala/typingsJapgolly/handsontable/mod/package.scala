package typingsJapgolly.handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handsontable = typingsJapgolly.handsontable.mod._Handsontable.Core
  /**
    * @internal
    * Omit properties K from T
    */
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  type default = typingsJapgolly.handsontable.mod.default_
}
