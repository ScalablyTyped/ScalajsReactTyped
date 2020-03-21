package typingsJapgolly.uiBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object boxTypesMod {
  type Is[P] = japgolly.scalajs.react.raw.React.ElementType
  type RefType[T] = /* import warning: importer.ImportType#apply Failed type conversion: T['prototype'] */ js.Any
  type Without[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  /**
    * Remove box props from object `T` if they're present
    * @template T Object
    */
  type WithoutBoxProps[T] = typingsJapgolly.uiBox.boxTypesMod.Without[
    T, 
    typingsJapgolly.uiBox.uiBoxStrings.is | typingsJapgolly.uiBox.uiBoxStrings.innerRef
  ]
}
