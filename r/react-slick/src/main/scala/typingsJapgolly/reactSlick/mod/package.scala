package typingsJapgolly.reactSlick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentConstructor[TProps] = (japgolly.scalajs.react.raw.React.ComponentClassP[TProps with js.Object]) | typingsJapgolly.react.mod.StatelessComponent[TProps]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactSlick.reactSlickStrings.left
    - typingsJapgolly.reactSlick.reactSlickStrings.down
    - typingsJapgolly.reactSlick.reactSlickStrings.right
    - typingsJapgolly.reactSlick.reactSlickStrings.up
    - java.lang.String
  */
  type SwipeDirection = typingsJapgolly.reactSlick.mod._SwipeDirection | java.lang.String
}
