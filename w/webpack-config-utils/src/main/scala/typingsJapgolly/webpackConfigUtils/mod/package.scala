package typingsJapgolly.webpackConfigUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefinedObjKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] extends undefined? never : P}[keyof T] */ js.Any
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.webpackConfigUtils.webpackConfigUtilsBooleans.`false`
    - typingsJapgolly.webpackConfigUtils.webpackConfigUtilsStrings._empty
    - typingsJapgolly.webpackConfigUtils.webpackConfigUtilsStrings.`false`
    - `js.undefined`
    - scala.Null
    - typingsJapgolly.webpackConfigUtils.webpackConfigUtilsNumbers.`0`
  */
  type Falsy = js.UndefOr[typingsJapgolly.webpackConfigUtils.mod._Falsy | scala.Null]
  type NonEmptyObject[T, P /* <: typingsJapgolly.webpackConfigUtils.mod.DefinedObjKeys[T] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ PP in P ]: T[PP]}
    */ typingsJapgolly.webpackConfigUtils.webpackConfigUtilsStrings.NonEmptyObject with T
}
