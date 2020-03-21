package typingsJapgolly.popmotion

import typingsJapgolly.popmotion.chainableMod.default
import typingsJapgolly.popmotion.observerTypesMod.ObserverCandidate
import typingsJapgolly.popmotion.typesMod.ActionInit
import typingsJapgolly.popmotion.typesMod.ActionProps
import typingsJapgolly.popmotion.typesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/action", JSImport.Namespace)
@js.native
object actionMod extends js.Object {
  @js.native
  class Action () extends default[Action] {
    def create(props: ActionProps): Action = js.native
    def start(): ColdSubscription = js.native
    def start(observerCandidate: ObserverCandidate): ColdSubscription = js.native
  }
  
  def default(init: ActionInit): Action = js.native
}

