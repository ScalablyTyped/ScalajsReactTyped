package typingsJapgolly.i18nextXhrBackend.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendOptions extends js.Object {
  /**
    * path to post missing resources
    */
  var addPath: js.UndefOr[String] = js.undefined
  /**
    * define a custom xhr function
    * can be used to support XDomainRequest in IE 8 and 9
    */
  var ajax: js.UndefOr[
    js.Function5[
      /* url */ String, 
      /* options */ this.type, 
      /* callback */ AjaxRequestCallback, 
      /* data */ js.Object | String, 
      /* cache */ Boolean, 
      Unit
    ]
  ] = js.undefined
  /**
    * your backend server supports multiLoading
    * locales/resources.json?lng=de+en&ns=ns1+ns2
    * set loadPath: '/locales/resources.json?lng={{lng}}&ns={{ns}}' to adapt to multiLoading
    */
  var allowMultiLoading: js.UndefOr[Boolean] = js.undefined
  /**
    * allow cross domain requests
    */
  var crossDomain: js.UndefOr[Boolean] = js.undefined
  /**
    * @see https://github.com/i18next/i18next-xhr-backend/blob/281c7e235e1157b33122adacef1957252e5700f1/src/ajax.js#L52
    */
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * path where resources get loaded from, or a function
    * returning a path:
    * function(lngs, namespaces) { return customPath; }
    * the returned path will interpolate lng, ns if provided like giving a static path
    */
  var loadPath: js.UndefOr[LoadPathOption] = js.undefined
  /**
    * parse data after it has been fetched
    * in example use https://www.npmjs.com/package/json5
    * here it removes the letter a from the json (bad idea)
    */
  var parse: js.UndefOr[js.Function1[/* data */ String, String]] = js.undefined
  /**
    * parse data before it has been sent by addPath
    */
  var parsePayload: js.UndefOr[
    js.Function3[
      /* namespace */ String, 
      /* key */ String, 
      /* fallbackValue */ js.UndefOr[String], 
      StringDictionary[_]
    ]
  ] = js.undefined
  /**
    * adds parameters to resource URL. 'example.com' -> 'example.com?v=1.3.5'
    */
  var queryStringParams: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * allow credentials on cross domain requests
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object BackendOptions {
  @scala.inline
  def apply(
    addPath: String = null,
    ajax: (/* url */ String, BackendOptions, /* callback */ AjaxRequestCallback, /* data */ js.Object | String, /* cache */ Boolean) => Callback = null,
    allowMultiLoading: js.UndefOr[Boolean] = js.undefined,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    customHeaders: StringDictionary[String] = null,
    loadPath: LoadPathOption = null,
    parse: /* data */ String => CallbackTo[String] = null,
    parsePayload: (/* namespace */ String, /* key */ String, /* fallbackValue */ js.UndefOr[String]) => CallbackTo[StringDictionary[js.Any]] = null,
    queryStringParams: StringDictionary[String] = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): BackendOptions = {
    val __obj = js.Dynamic.literal()
    if (addPath != null) __obj.updateDynamic("addPath")(addPath.asInstanceOf[js.Any])
    if (ajax != null) __obj.updateDynamic("ajax")(js.Any.fromFunction5((t0: /* url */ java.lang.String, t1: typingsJapgolly.i18nextXhrBackend.mod.BackendOptions, t2: /* callback */ typingsJapgolly.i18nextXhrBackend.mod.AjaxRequestCallback, t3: /* data */ js.Object | java.lang.String, t4: /* cache */ scala.Boolean) => ajax(t0, t1, t2, t3, t4).runNow()))
    if (!js.isUndefined(allowMultiLoading)) __obj.updateDynamic("allowMultiLoading")(allowMultiLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (loadPath != null) __obj.updateDynamic("loadPath")(loadPath.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => parse(t0).runNow()))
    if (parsePayload != null) __obj.updateDynamic("parsePayload")(js.Any.fromFunction3((t0: /* namespace */ java.lang.String, t1: /* key */ java.lang.String, t2: /* fallbackValue */ js.UndefOr[java.lang.String]) => parsePayload(t0, t1, t2).runNow()))
    if (queryStringParams != null) __obj.updateDynamic("queryStringParams")(queryStringParams.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendOptions]
  }
}

