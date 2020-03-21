package typingsJapgolly.reactNativeSafeArea.mod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.margin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-safe-area", "withSafeArea")
@js.native
object withSafeArea_margin extends js.Object {
  def apply[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: margin,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = js.native
}

