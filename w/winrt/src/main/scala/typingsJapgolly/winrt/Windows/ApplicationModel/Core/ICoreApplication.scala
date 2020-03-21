package typingsJapgolly.winrt.Windows.ApplicationModel.Core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.IGetActivationFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreApplication extends js.Object {
  var id: String
  var onresuming: js.Any
  var onsuspending: js.Any
  var properties: IPropertySet
  def getCurrentView(): CoreApplicationView
  def run(viewSource: IFrameworkViewSource): Unit
  def runWithActivationFactories(activationFactoryCallback: IGetActivationFactory): Unit
}

object ICoreApplication {
  @scala.inline
  def apply(
    getCurrentView: CallbackTo[CoreApplicationView],
    id: String,
    onresuming: js.Any,
    onsuspending: js.Any,
    properties: IPropertySet,
    run: IFrameworkViewSource => Callback,
    runWithActivationFactories: IGetActivationFactory => Callback
  ): ICoreApplication = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onresuming = onresuming.asInstanceOf[js.Any], onsuspending = onsuspending.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("getCurrentView")(getCurrentView.toJsFn)
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.ApplicationModel.Core.IFrameworkViewSource) => run(t0).runNow()))
    __obj.updateDynamic("runWithActivationFactories")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.IGetActivationFactory) => runWithActivationFactories(t0).runNow()))
    __obj.asInstanceOf[ICoreApplication]
  }
}

