package typingsJapgolly.reactDashSlick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSlickMod {
  import typingsJapgolly.react.reactMod.ComponentClass
  import typingsJapgolly.react.reactMod.ComponentState
  import typingsJapgolly.react.reactMod.StatelessComponent

  type ComponentConstructor[TProps] = (ComponentClass[TProps, ComponentState]) | StatelessComponent[TProps]
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashSlick.reactDashSlickStrings.left
    - typings.reactDashSlick.reactDashSlickStrings.down
    - typings.reactDashSlick.reactDashSlickStrings.right
    - typings.reactDashSlick.reactDashSlickStrings.up
    - java.lang.String
  */
  type SwipeDirection = _SwipeDirection | String
}
