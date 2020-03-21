package typingsJapgolly.apolloReactComponents

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.apolloReactComponents.typesMod.SubscriptionComponentOptions
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-components/lib/Subscription", JSImport.Namespace)
@js.native
object subscriptionMod extends js.Object {
  @js.native
  object Subscription extends js.Object {
    def apply[TData, TVariables](props: SubscriptionComponentOptions[TData, TVariables]): Element | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var children: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onSubscriptionComplete: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var onSubscriptionData: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      var shouldResubscribe: Requireable[Boolean | (js.Function1[/* repeated */ _, _])] = js.native
      var subscription: Validator[js.Object] = js.native
      var variables: Requireable[js.Object] = js.native
    }
    
  }
  
}

