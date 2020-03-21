package typingsJapgolly.angularResource.mod.angularAugmentingMod.auto

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularResource.angularResourceStrings.$resource
import typingsJapgolly.angularResource.mod.angularAugmentingMod.resource.IResourceService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInjectorService extends js.Object {
  @JSName("get")
  def get_resource(name: $resource): IResourceService
}

object IInjectorService {
  @scala.inline
  def apply(get: $resource => CallbackTo[IResourceService]): IInjectorService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.angularResource.angularResourceStrings.$resource) => get(t0).runNow()))
    __obj.asInstanceOf[IInjectorService]
  }
}

