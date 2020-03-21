package typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceManagerStatics extends js.Object {
  var current: ResourceManager
  def isResourceReference(resourceReference: String): Boolean
}

object IResourceManagerStatics {
  @scala.inline
  def apply(current: ResourceManager, isResourceReference: String => CallbackTo[Boolean]): IResourceManagerStatics = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.updateDynamic("isResourceReference")(js.Any.fromFunction1((t0: java.lang.String) => isResourceReference(t0).runNow()))
    __obj.asInstanceOf[IResourceManagerStatics]
  }
}

