package typingsJapgolly.koaBodyparser.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.koa.mod.Context
import typingsJapgolly.koaBodyparser.AnonForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * custom json request detect function. Default is null
    */
  var detectJSON: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.undefined
  /**
    *  parser will only parse when request type hits enableTypes, default is ['json', 'form'].
    */
  var enableTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * requested encoding. Default is utf-8 by co-body
    */
  var encode: js.UndefOr[String] = js.undefined
  /**
    * support extend types
    */
  var extendTypes: js.UndefOr[AnonForm] = js.undefined
  /**
    * limit of the urlencoded body. If the body ends up being larger than this limit
    * a 413 error code is returned. Default is 56kb
    */
  var formLimit: js.UndefOr[String] = js.undefined
  /**
    * limit of the json body. Default is 1mb
    */
  var jsonLimit: js.UndefOr[String] = js.undefined
  /**
    * support custom error handle
    */
  var onerror: js.UndefOr[js.Function2[/* err */ js.Error, /* ctx */ Context, Unit]] = js.undefined
  /**
    * when set to true, JSON parser will only accept arrays and objects. Default is true
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * limit of the text body. Default is 1mb.
    */
  var textLimit: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    detectJSON: /* ctx */ Context => CallbackTo[Boolean] = null,
    enableTypes: js.Array[String] = null,
    encode: String = null,
    extendTypes: AnonForm = null,
    formLimit: String = null,
    jsonLimit: String = null,
    onerror: (/* err */ js.Error, /* ctx */ Context) => Callback = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    textLimit: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (detectJSON != null) __obj.updateDynamic("detectJSON")(js.Any.fromFunction1((t0: /* ctx */ typingsJapgolly.koa.mod.Context) => detectJSON(t0).runNow()))
    if (enableTypes != null) __obj.updateDynamic("enableTypes")(enableTypes.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (extendTypes != null) __obj.updateDynamic("extendTypes")(extendTypes.asInstanceOf[js.Any])
    if (formLimit != null) __obj.updateDynamic("formLimit")(formLimit.asInstanceOf[js.Any])
    if (jsonLimit != null) __obj.updateDynamic("jsonLimit")(jsonLimit.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction2((t0: /* err */ js.Error, t1: /* ctx */ typingsJapgolly.koa.mod.Context) => onerror(t0, t1).runNow()))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (textLimit != null) __obj.updateDynamic("textLimit")(textLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

