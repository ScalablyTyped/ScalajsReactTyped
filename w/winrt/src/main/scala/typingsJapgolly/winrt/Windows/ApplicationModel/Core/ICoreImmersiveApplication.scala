package typingsJapgolly.winrt.Windows.ApplicationModel.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreImmersiveApplication extends js.Object {
  var mainView: CoreApplicationView
  var views: IVectorView[CoreApplicationView]
  def createNewView(runtimeType: String, entryPoint: String): CoreApplicationView
}

object ICoreImmersiveApplication {
  @scala.inline
  def apply(
    createNewView: (String, String) => CallbackTo[CoreApplicationView],
    mainView: CoreApplicationView,
    views: IVectorView[CoreApplicationView]
  ): ICoreImmersiveApplication = {
    val __obj = js.Dynamic.literal(mainView = mainView.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.updateDynamic("createNewView")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => createNewView(t0, t1).runNow()))
    __obj.asInstanceOf[ICoreImmersiveApplication]
  }
}

