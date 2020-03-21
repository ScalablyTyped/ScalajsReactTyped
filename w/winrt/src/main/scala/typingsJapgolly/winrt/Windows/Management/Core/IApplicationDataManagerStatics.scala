package typingsJapgolly.winrt.Windows.Management.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.ApplicationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationDataManagerStatics extends js.Object {
  def createForPackageFamily(packageFamilyName: String): ApplicationData
}

object IApplicationDataManagerStatics {
  @scala.inline
  def apply(createForPackageFamily: String => CallbackTo[ApplicationData]): IApplicationDataManagerStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createForPackageFamily")(js.Any.fromFunction1((t0: java.lang.String) => createForPackageFamily(t0).runNow()))
    __obj.asInstanceOf[IApplicationDataManagerStatics]
  }
}

