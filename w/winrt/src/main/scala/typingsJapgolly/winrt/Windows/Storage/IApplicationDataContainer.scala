package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationDataContainer extends js.Object {
  var containers: IMapView[String, ApplicationDataContainer]
  var locality: ApplicationDataLocality
  var name: String
  var values: IPropertySet
  def createContainer(name: String, disposition: ApplicationDataCreateDisposition): ApplicationDataContainer
  def deleteContainer(name: String): Unit
}

object IApplicationDataContainer {
  @scala.inline
  def apply(
    containers: IMapView[String, ApplicationDataContainer],
    createContainer: (String, ApplicationDataCreateDisposition) => CallbackTo[ApplicationDataContainer],
    deleteContainer: String => Callback,
    locality: ApplicationDataLocality,
    name: String,
    values: IPropertySet
  ): IApplicationDataContainer = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("createContainer")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.Storage.ApplicationDataCreateDisposition) => createContainer(t0, t1).runNow()))
    __obj.updateDynamic("deleteContainer")(js.Any.fromFunction1((t0: java.lang.String) => deleteContainer(t0).runNow()))
    __obj.asInstanceOf[IApplicationDataContainer]
  }
}

