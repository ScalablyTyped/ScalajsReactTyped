package typingsJapgolly.reactDashNavigationDashStack

import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod.ComponentProps
import typingsJapgolly.react.reactMod.Context
import typingsJapgolly.react.reactMod.ContextType
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.SupportedThemes
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderTitleMod.HeaderTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/Header/HeaderTitle", JSImport.Namespace)
@js.native
object libTypescriptViewsHeaderHeaderTitleMod extends js.Object {
  @js.native
  trait HeaderTitle
    extends Component[ComponentProps[js.Any], js.Object, js.Any] {
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

