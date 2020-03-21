package typingsJapgolly.reactRouterNavigationCore.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRouterNavigationCore.mod.CardStackProps
import typingsJapgolly.reactRouterNavigationCore.mod.CardsRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardStack {
  def apply(
    render: CardsRendererProps => CallbackTo[Node],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] = null
  ): UnmountedWithRoot[
    CardStackProps, 
    typingsJapgolly.reactRouterNavigationCore.mod.CardStack, 
    Unit, 
    CardStackProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.reactRouterNavigationCore.mod.CardsRendererProps) => render(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouterNavigationCore.mod.CardStackProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactRouterNavigationCore.mod.CardStack](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouterNavigationCore.mod.CardStackProps])
  }
  @JSImport("react-router-navigation-core", "CardStack")
  @js.native
  object componentImport extends js.Object
  
}

