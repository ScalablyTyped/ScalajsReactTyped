package typingsJapgolly.reactNavigationStack

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import typingsJapgolly.reactNative.mod.Animated.AnimatedComponent
import typingsJapgolly.reactNative.mod.Text
import typingsJapgolly.reactNavigation.mod.SupportedThemes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/Header/HeaderTitle", JSImport.Namespace)
@js.native
object headerTitleMod extends js.Object {
  @js.native
  trait HeaderTitle
    extends Component[ComponentProps[AnimatedComponent[Text]], js.Object, js.Any] {
    @JSName("context")
    var context_HeaderTitle: ContextType[Context[SupportedThemes]] = js.native
  }
  
  @js.native
  class default () extends HeaderTitle
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
  }
  
}

