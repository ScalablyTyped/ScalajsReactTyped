package typingsJapgolly.oktaOktaVue.mod

import typingsJapgolly.oktaOktaVue.AnonAuthRedirectGuard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object vueTypesVueAugmentingMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$auth")
    var $auth: AnonAuthRedirectGuard = js.native
  }
  
}

