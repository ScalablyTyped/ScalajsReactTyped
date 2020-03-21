package typingsJapgolly.reactNativeSafeArea.mod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.contentInset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-safe-area", "withSafeArea")
@js.native
object withSafeArea_contentInset extends js.Object {
  def apply[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: contentInset,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = js.native
}

