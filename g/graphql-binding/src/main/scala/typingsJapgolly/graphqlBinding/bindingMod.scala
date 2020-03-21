package typingsJapgolly.graphqlBinding

import typingsJapgolly.graphqlBinding.delegateMod.Delegate
import typingsJapgolly.graphqlBinding.distTypesMod.BindingOptions
import typingsJapgolly.graphqlBinding.distTypesMod.MutationMap
import typingsJapgolly.graphqlBinding.distTypesMod.QueryMap
import typingsJapgolly.graphqlBinding.distTypesMod.QueryOrMutation
import typingsJapgolly.graphqlBinding.distTypesMod.SubscriptionMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/Binding", JSImport.Namespace)
@js.native
object bindingMod extends js.Object {
  @js.native
  class Binding protected () extends Delegate {
    def this(hasSchemaFragmentReplacementsBeforeDisableCache: BindingOptions) = this()
    var mutation: MutationMap = js.native
    var query: QueryMap = js.native
    var subscription: SubscriptionMap = js.native
    def buildMethods(): js.Any = js.native
    def buildQueryMethods(operation: QueryOrMutation): QueryMap = js.native
    def buildSubscriptionMethods(): SubscriptionMap = js.native
  }
  
}

