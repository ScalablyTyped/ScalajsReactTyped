package typingsJapgolly.angularResource.mod.angularAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularResource.mod.angularAugmentingMod.resource.IResourceServiceFactoryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extensions to base ng based on using angular-resource */
trait IModule extends js.Object {
  /** creating a resource service factory */
  def factory(name: String, resourceServiceFactoryFunction: IResourceServiceFactoryFunction[_]): IModule
}

object IModule {
  @scala.inline
  def apply(factory: (String, IResourceServiceFactoryFunction[js.Any]) => CallbackTo[IModule]): IModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("factory")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.angularResource.mod.angularAugmentingMod.resource.IResourceServiceFactoryFunction[js.Any]) => factory(t0, t1).runNow()))
    __obj.asInstanceOf[IModule]
  }
}

