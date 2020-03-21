package typingsJapgolly.reactWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GridItemKeySelector = js.Function1[
    /* params */ typingsJapgolly.reactWindow.AnonColumnIndex, 
    typingsJapgolly.react.mod.Key
  ]
  type ListItemKeySelector = js.Function2[/* index */ scala.Double, /* data */ js.Any, typingsJapgolly.react.mod.Key]
  type ReactElementType = typingsJapgolly.react.mod.FunctionComponent[js.Any] | (japgolly.scalajs.react.raw.React.ComponentClassP[js.Any with js.Object]) | java.lang.String
}
