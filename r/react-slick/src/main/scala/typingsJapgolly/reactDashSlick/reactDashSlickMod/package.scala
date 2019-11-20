package typingsJapgolly.reactDashSlick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSlickMod {
  import japgolly.scalajs.react.raw.React.ComponentClassP
  import typingsJapgolly.react.reactMod.StatelessComponent

  type ComponentConstructor[TProps] = (ComponentClassP[TProps with js.Object]) | StatelessComponent[TProps]
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashSlick.reactDashSlickStrings.left
    - typings.reactDashSlick.reactDashSlickStrings.down
    - typings.reactDashSlick.reactDashSlickStrings.right
    - typings.reactDashSlick.reactDashSlickStrings.up
    - java.lang.String
  */
  type SwipeDirection = _SwipeDirection | String
}
