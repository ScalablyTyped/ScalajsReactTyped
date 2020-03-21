package typingsJapgolly.twilio.mod

import typingsJapgolly.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.twilio.mod.Resource because Already inherited
- typingsJapgolly.twilio.mod.ListableResource because var conflicts: get_Original. Inlined list, list, list, list_Original */ @js.native
trait ServiceResource extends CreatableMappedResource[ServiceInstance] {
  @JSName("list")
  var list_Original: RestMethod = js.native
  def list(args: js.Any): Promise[_] = js.native
  def list(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def list(callback: RequestCallback): Promise[_] = js.native
}

