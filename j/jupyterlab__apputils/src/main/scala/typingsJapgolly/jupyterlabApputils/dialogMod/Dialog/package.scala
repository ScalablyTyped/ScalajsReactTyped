package typingsJapgolly.jupyterlabApputils.dialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Dialog {
  /**
    * The body input types.
    */
  type Body[T] = typingsJapgolly.jupyterlabApputils.dialogMod.Dialog.IBodyWidget[T] | japgolly.scalajs.react.raw.React.Element | java.lang.String
  /**
    * The header input types.
    */
  type Header = japgolly.scalajs.react.raw.React.Element | java.lang.String
}
