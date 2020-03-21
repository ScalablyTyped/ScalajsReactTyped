package typingsJapgolly.senchaTouch.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.data.IConnection
import typingsJapgolly.senchaTouch.Ext.data.IModel
import typingsJapgolly.senchaTouch.Ext.dom.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel
  extends typingsJapgolly.senchaTouch.Ext.IPanel {
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.undefined
  /** [Method] A convenient method to disable all fields in this form
  		* @param newDisabled Object
  		* @returns Ext.form.Panel This form.
  		*/
  var doSetDisabled: js.UndefOr[js.Function1[/* newDisabled */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var enableSubmissionForm: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var enctype: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of api
  		* @returns Object
  		*/
  var getApi: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of baseParams
  		* @returns Object
  		*/
  var getBaseParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of enableSubmissionForm
  		* @returns Boolean
  		*/
  var getEnableSubmissionForm: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of enctype
  		* @returns Object
  		*/
  var getEnctype: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of method
  		* @returns String
  		*/
  var getMethod: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of multipartDetection
  		* @returns Boolean
  		*/
  var getMultipartDetection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of paramOrder
  		* @returns String/String[]
  		*/
  var getParamOrder: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of paramsAsHash
  		* @returns Boolean
  		*/
  var getParamsAsHash: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of standardSubmit
  		* @returns Boolean
  		*/
  var getStandardSubmit: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of submitOnAction
  		* @returns Object
  		*/
  var getSubmitOnAction: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of trackResetOnLoad
  		* @returns Boolean
  		*/
  var getTrackResetOnLoad: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns an object containing the value of each field in the form keyed to the field s name
  		* @param enabled Boolean true to return only enabled fields.
  		* @param all Boolean true to return all fields even if they don't have a name configured.
  		* @returns Object Object mapping field name to its value.
  		*/
  var getValues: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[Boolean], /* all */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Hides a previously shown wait mask See showMask
  		* @returns Ext.form.Panel this
  		*/
  var hideMask: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Performs an Ajax or Ext Direct call to load values for this form
  		* @param options Object The configuration when loading this form. The following are the configurations when loading via Ajax only:
  		* @returns Ext.data.Connection The request object.
  		*/
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IConnection]] = js.undefined
  /** [Method] Loads matching fields from a model instance into this form
  		* @param record Ext.data.Model The model instance.
  		* @returns Ext.form.Panel This form.
  		*/
  var loadModel: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], this.type]] = js.undefined
  /** [Method] Loads matching fields from a model instance into this form
  		* @param record Ext.data.Model The model instance.
  		* @returns Ext.form.Panel This form.
  		*/
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], this.type]] = js.undefined
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var multipartDetection: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.undefined
  /** [Method] Resets all fields in the form back to their original values
  		* @returns Ext.form.Panel This form.
  		*/
  var reset: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Sets the value of api
  		* @param api Object The new value.
  		*/
  var setApi: js.UndefOr[js.Function1[/* api */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of baseParams
  		* @param baseParams Object The new value.
  		*/
  var setBaseParams: js.UndefOr[js.Function1[/* baseParams */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of enableSubmissionForm
  		* @param enableSubmissionForm Boolean The new value.
  		*/
  var setEnableSubmissionForm: js.UndefOr[js.Function1[/* enableSubmissionForm */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of enctype
  		* @param enctype Object The new value.
  		*/
  var setEnctype: js.UndefOr[js.Function1[/* enctype */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of method
  		* @param method String The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of multipartDetection
  		* @param multipartDetection Boolean The new value.
  		*/
  var setMultipartDetection: js.UndefOr[js.Function1[/* multipartDetection */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of paramOrder
  		* @param paramOrder String/String[] The new value.
  		*/
  var setParamOrder: js.UndefOr[js.Function1[/* paramOrder */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of paramsAsHash
  		* @param paramsAsHash Boolean The new value.
  		*/
  var setParamsAsHash: js.UndefOr[js.Function1[/* paramsAsHash */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of standardSubmit
  		* @param standardSubmit Boolean The new value.
  		*/
  var setStandardSubmit: js.UndefOr[js.Function1[/* standardSubmit */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of submitOnAction
  		* @param submitOnAction Object The new value.
  		*/
  var setSubmitOnAction: js.UndefOr[js.Function1[/* submitOnAction */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of trackResetOnLoad
  		* @param trackResetOnLoad Boolean The new value.
  		*/
  var setTrackResetOnLoad: js.UndefOr[js.Function1[/* trackResetOnLoad */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the values of form fields in bulk
  		* @param values Object field name => value mapping object.
  		* @returns Ext.form.Panel This form.
  		*/
  var setValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Shows a generic custom mask over a designated Element
  		* @param cfg String/Object Either a string message or a configuration object supporting the following options: {  message : 'Please Wait',  cls : 'form-mask' }
  		* @param target Object
  		* @returns Ext.form.Panel This form
  		*/
  var showMask: js.UndefOr[
    js.Function2[/* cfg */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var standardSubmit: js.UndefOr[Boolean] = js.undefined
  /** [Method] Performs a Ajax based submission of form values if standardSubmit is false or otherwise executes a standard HTML Fo
  		* @param options Object The configuration when submitting this form. The following are the configurations when submitting via Ajax only:
  		* @returns Ext.data.Connection The request object if the standardSubmit config is false. If the standardSubmit config is true, then the return value is undefined.
  		*/
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IConnection]] = js.undefined
  /** [Config Option] (Object) */
  var submitOnAction: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var trackResetOnLoad: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
  /** [Config Option] (Ext.dom.Element) */
  var waitMsgTarget: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (Ext.XTemplate/String/String[]) */
  var waitTpl: js.UndefOr[js.Any] = js.undefined
}

object IPanel {
  @scala.inline
  def apply(
    IPanel: typingsJapgolly.senchaTouch.Ext.IPanel = null,
    api: js.Any = null,
    baseParams: js.Any = null,
    doSetDisabled: /* newDisabled */ js.UndefOr[js.Any] => CallbackTo[IPanel] = null,
    enableSubmissionForm: js.UndefOr[Boolean] = js.undefined,
    enctype: js.Any = null,
    getApi: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBaseParams: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getEnableSubmissionForm: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getEnctype: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMethod: js.UndefOr[CallbackTo[String]] = js.undefined,
    getMultipartDetection: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getParamOrder: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getParamsAsHash: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getStandardSubmit: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getSubmitOnAction: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTimeout: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getTrackResetOnLoad: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getUrl: js.UndefOr[CallbackTo[String]] = js.undefined,
    getValues: (/* enabled */ js.UndefOr[Boolean], /* all */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    hideMask: js.UndefOr[CallbackTo[IPanel]] = js.undefined,
    load: /* options */ js.UndefOr[js.Any] => CallbackTo[IConnection] = null,
    loadModel: /* record */ js.UndefOr[IModel] => CallbackTo[IPanel] = null,
    loadRecord: /* record */ js.UndefOr[IModel] => CallbackTo[IPanel] = null,
    method: String = null,
    multipartDetection: js.UndefOr[Boolean] = js.undefined,
    paramOrder: js.Any = null,
    paramsAsHash: js.UndefOr[Boolean] = js.undefined,
    reset: js.UndefOr[CallbackTo[IPanel]] = js.undefined,
    setApi: /* api */ js.UndefOr[js.Any] => Callback = null,
    setBaseParams: /* baseParams */ js.UndefOr[js.Any] => Callback = null,
    setEnableSubmissionForm: /* enableSubmissionForm */ js.UndefOr[Boolean] => Callback = null,
    setEnctype: /* enctype */ js.UndefOr[js.Any] => Callback = null,
    setMethod: /* method */ js.UndefOr[String] => Callback = null,
    setMultipartDetection: /* multipartDetection */ js.UndefOr[Boolean] => Callback = null,
    setParamOrder: /* paramOrder */ js.UndefOr[js.Any] => Callback = null,
    setParamsAsHash: /* paramsAsHash */ js.UndefOr[Boolean] => Callback = null,
    setStandardSubmit: /* standardSubmit */ js.UndefOr[Boolean] => Callback = null,
    setSubmitOnAction: /* submitOnAction */ js.UndefOr[js.Any] => Callback = null,
    setTimeout: /* timeout */ js.UndefOr[Double] => Callback = null,
    setTrackResetOnLoad: /* trackResetOnLoad */ js.UndefOr[Boolean] => Callback = null,
    setUrl: /* url */ js.UndefOr[String] => Callback = null,
    setValues: /* values */ js.UndefOr[js.Any] => CallbackTo[IPanel] = null,
    showMask: (/* cfg */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => CallbackTo[IPanel] = null,
    standardSubmit: js.UndefOr[Boolean] = js.undefined,
    submit: /* options */ js.UndefOr[js.Any] => CallbackTo[IConnection] = null,
    submitOnAction: js.Any = null,
    timeout: Int | Double = null,
    trackResetOnLoad: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    waitMsgTarget: IElement = null,
    waitTpl: js.Any = null
  ): IPanel = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (baseParams != null) __obj.updateDynamic("baseParams")(baseParams.asInstanceOf[js.Any])
    if (doSetDisabled != null) __obj.updateDynamic("doSetDisabled")(js.Any.fromFunction1((t0: /* newDisabled */ js.UndefOr[js.Any]) => doSetDisabled(t0).runNow()))
    if (!js.isUndefined(enableSubmissionForm)) __obj.updateDynamic("enableSubmissionForm")(enableSubmissionForm.asInstanceOf[js.Any])
    if (enctype != null) __obj.updateDynamic("enctype")(enctype.asInstanceOf[js.Any])
    getApi.foreach(p => __obj.updateDynamic("getApi")(p.toJsFn))
    getBaseParams.foreach(p => __obj.updateDynamic("getBaseParams")(p.toJsFn))
    getEnableSubmissionForm.foreach(p => __obj.updateDynamic("getEnableSubmissionForm")(p.toJsFn))
    getEnctype.foreach(p => __obj.updateDynamic("getEnctype")(p.toJsFn))
    getMethod.foreach(p => __obj.updateDynamic("getMethod")(p.toJsFn))
    getMultipartDetection.foreach(p => __obj.updateDynamic("getMultipartDetection")(p.toJsFn))
    getParamOrder.foreach(p => __obj.updateDynamic("getParamOrder")(p.toJsFn))
    getParamsAsHash.foreach(p => __obj.updateDynamic("getParamsAsHash")(p.toJsFn))
    getStandardSubmit.foreach(p => __obj.updateDynamic("getStandardSubmit")(p.toJsFn))
    getSubmitOnAction.foreach(p => __obj.updateDynamic("getSubmitOnAction")(p.toJsFn))
    getTimeout.foreach(p => __obj.updateDynamic("getTimeout")(p.toJsFn))
    getTrackResetOnLoad.foreach(p => __obj.updateDynamic("getTrackResetOnLoad")(p.toJsFn))
    getUrl.foreach(p => __obj.updateDynamic("getUrl")(p.toJsFn))
    if (getValues != null) __obj.updateDynamic("getValues")(js.Any.fromFunction2((t0: /* enabled */ js.UndefOr[scala.Boolean], t1: /* all */ js.UndefOr[scala.Boolean]) => getValues(t0, t1).runNow()))
    hideMask.foreach(p => __obj.updateDynamic("hideMask")(p.toJsFn))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => load(t0).runNow()))
    if (loadModel != null) __obj.updateDynamic("loadModel")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IModel]) => loadModel(t0).runNow()))
    if (loadRecord != null) __obj.updateDynamic("loadRecord")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IModel]) => loadRecord(t0).runNow()))
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(multipartDetection)) __obj.updateDynamic("multipartDetection")(multipartDetection.asInstanceOf[js.Any])
    if (paramOrder != null) __obj.updateDynamic("paramOrder")(paramOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(paramsAsHash)) __obj.updateDynamic("paramsAsHash")(paramsAsHash.asInstanceOf[js.Any])
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    if (setApi != null) __obj.updateDynamic("setApi")(js.Any.fromFunction1((t0: /* api */ js.UndefOr[js.Any]) => setApi(t0).runNow()))
    if (setBaseParams != null) __obj.updateDynamic("setBaseParams")(js.Any.fromFunction1((t0: /* baseParams */ js.UndefOr[js.Any]) => setBaseParams(t0).runNow()))
    if (setEnableSubmissionForm != null) __obj.updateDynamic("setEnableSubmissionForm")(js.Any.fromFunction1((t0: /* enableSubmissionForm */ js.UndefOr[scala.Boolean]) => setEnableSubmissionForm(t0).runNow()))
    if (setEnctype != null) __obj.updateDynamic("setEnctype")(js.Any.fromFunction1((t0: /* enctype */ js.UndefOr[js.Any]) => setEnctype(t0).runNow()))
    if (setMethod != null) __obj.updateDynamic("setMethod")(js.Any.fromFunction1((t0: /* method */ js.UndefOr[java.lang.String]) => setMethod(t0).runNow()))
    if (setMultipartDetection != null) __obj.updateDynamic("setMultipartDetection")(js.Any.fromFunction1((t0: /* multipartDetection */ js.UndefOr[scala.Boolean]) => setMultipartDetection(t0).runNow()))
    if (setParamOrder != null) __obj.updateDynamic("setParamOrder")(js.Any.fromFunction1((t0: /* paramOrder */ js.UndefOr[js.Any]) => setParamOrder(t0).runNow()))
    if (setParamsAsHash != null) __obj.updateDynamic("setParamsAsHash")(js.Any.fromFunction1((t0: /* paramsAsHash */ js.UndefOr[scala.Boolean]) => setParamsAsHash(t0).runNow()))
    if (setStandardSubmit != null) __obj.updateDynamic("setStandardSubmit")(js.Any.fromFunction1((t0: /* standardSubmit */ js.UndefOr[scala.Boolean]) => setStandardSubmit(t0).runNow()))
    if (setSubmitOnAction != null) __obj.updateDynamic("setSubmitOnAction")(js.Any.fromFunction1((t0: /* submitOnAction */ js.UndefOr[js.Any]) => setSubmitOnAction(t0).runNow()))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1((t0: /* timeout */ js.UndefOr[scala.Double]) => setTimeout(t0).runNow()))
    if (setTrackResetOnLoad != null) __obj.updateDynamic("setTrackResetOnLoad")(js.Any.fromFunction1((t0: /* trackResetOnLoad */ js.UndefOr[scala.Boolean]) => setTrackResetOnLoad(t0).runNow()))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: /* url */ js.UndefOr[java.lang.String]) => setUrl(t0).runNow()))
    if (setValues != null) __obj.updateDynamic("setValues")(js.Any.fromFunction1((t0: /* values */ js.UndefOr[js.Any]) => setValues(t0).runNow()))
    if (showMask != null) __obj.updateDynamic("showMask")(js.Any.fromFunction2((t0: /* cfg */ js.UndefOr[js.Any], t1: /* target */ js.UndefOr[js.Any]) => showMask(t0, t1).runNow()))
    if (!js.isUndefined(standardSubmit)) __obj.updateDynamic("standardSubmit")(standardSubmit.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => submit(t0).runNow()))
    if (submitOnAction != null) __obj.updateDynamic("submitOnAction")(submitOnAction.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResetOnLoad)) __obj.updateDynamic("trackResetOnLoad")(trackResetOnLoad.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (waitMsgTarget != null) __obj.updateDynamic("waitMsgTarget")(waitMsgTarget.asInstanceOf[js.Any])
    if (waitTpl != null) __obj.updateDynamic("waitTpl")(waitTpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanel]
  }
}

