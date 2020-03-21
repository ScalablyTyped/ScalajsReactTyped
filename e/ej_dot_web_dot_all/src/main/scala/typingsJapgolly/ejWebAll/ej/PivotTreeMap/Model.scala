package typingsJapgolly.ejWebAll.ej.PivotTreeMap

import japgolly.scalajs.react.Callback
import typingsJapgolly.ejWebAll.ej.Pivot.OperationalMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers when it reaches client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.undefined
  /** Triggers before any AJAX request is passed from PivotTreeMap to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.undefined
  /** Specifies the CSS class to PivotTreeMap to achieve custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Object utilized to pass additional information between client-end and service-end.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** Initializes the data source for the PivotTreeMap widget, when it functions completely on client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
  /** Triggers when drill up/down happens in PivotTreeMap control. And it returns the outer HTML of PivotTreeMap control.
    */
  var drillSuccess: js.UndefOr[js.Function1[/* e */ DrillSuccessEventArgs, Unit]] = js.undefined
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.undefined
  /** Allows the user to enable PivotTreeMapâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Triggers when PivotTreeMap starts to render.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Sets the mode for the PivotTreeMap widget for binding data source either in server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.undefined
  /** Triggers when PivotTreeMap widget completes all operations at client-side after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
  /** Triggers when any error occurred during AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.undefined
  /** Triggers when PivotTreeMap successfully reaches client-side after any AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.undefined
  /** Allows the user to set custom name for the methods at service-end, communicated on AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.undefined
  /** Connects the service using the specified URL for any server updates.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    afterServiceInvoke: /* e */ AfterServiceInvokeEventArgs => Callback = null,
    beforeServiceInvoke: /* e */ BeforeServiceInvokeEventArgs => Callback = null,
    cssClass: String = null,
    customObject: js.Any = null,
    dataSource: DataSource = null,
    drillSuccess: /* e */ DrillSuccessEventArgs => Callback = null,
    enableXHRCredentials: js.UndefOr[Boolean] = js.undefined,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    load: /* e */ LoadEventArgs => Callback = null,
    locale: String = null,
    operationalMode: OperationalMode | String = null,
    renderComplete: /* e */ RenderCompleteEventArgs => Callback = null,
    renderFailure: /* e */ RenderFailureEventArgs => Callback = null,
    renderSuccess: /* e */ RenderSuccessEventArgs => Callback = null,
    serviceMethodSettings: ServiceMethodSettings = null,
    url: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (afterServiceInvoke != null) __obj.updateDynamic("afterServiceInvoke")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotTreeMap.AfterServiceInvokeEventArgs) => afterServiceInvoke(t0).runNow()))
    if (beforeServiceInvoke != null) __obj.updateDynamic("beforeServiceInvoke")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotTreeMap.BeforeServiceInvokeEventArgs) => beforeServiceInvoke(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customObject != null) __obj.updateDynamic("customObject")(customObject.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (drillSuccess != null) __obj.updateDynamic("drillSuccess")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotTreeMap.DrillSuccessEventArgs) => drillSuccess(t0).runNow()))
    if (!js.isUndefined(enableXHRCredentials)) __obj.updateDynamic("enableXHRCredentials")(enableXHRCredentials.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotTreeMap.LoadEventArgs) => load(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (operationalMode != null) __obj.updateDynamic("operationalMode")(operationalMode.asInstanceOf[js.Any])
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotTreeMap.RenderCompleteEventArgs) => renderComplete(t0).runNow()))
    if (renderFailure != null) __obj.updateDynamic("renderFailure")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotTreeMap.RenderFailureEventArgs) => renderFailure(t0).runNow()))
    if (renderSuccess != null) __obj.updateDynamic("renderSuccess")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PivotTreeMap.RenderSuccessEventArgs) => renderSuccess(t0).runNow()))
    if (serviceMethodSettings != null) __obj.updateDynamic("serviceMethodSettings")(serviceMethodSettings.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

