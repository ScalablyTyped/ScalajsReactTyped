package typingsJapgolly.dojo.dojox.app.utils

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/utils/hash.html
  *
  * This module contains the hash
  *
  */
trait hash extends js.Object {
  /**
    * add the view specific params to the hash for example (view1&param1=value1)
    *
    * @param hash the url hash
    * @param view the view name
    * @param params the params for this view
    */
  def addViewParams(hash: String, view: String, params: js.Object): js.Any
  /**
    * build up the url hash adding the params
    *
    * @param hash the url hash
    * @param params the params object
    */
  def buildWithParams(hash: String, params: js.Object): js.Any
  /**
    * called to handle a view specific params object
    *
    * @param params the view specific params object
    * @param viewPart the part of the view with the params for the view
    */
  def getParamObj(params: js.Object, viewPart: String): js.Any
  /**
    * return the param string
    *
    * @param params the params object
    */
  def getParamString(params: js.Object): js.Any
  /**
    * get the params from the hash
    *
    * @param hash the url hash
    */
  def getParams(hash: String): js.Any
  /**
    * return the target string
    *
    * @param hash the hash string
    * @param defaultView               Optionalthe optional defaultView string
    */
  def getTarget(hash: String, defaultView: String): js.Any
}

object hash {
  @scala.inline
  def apply(
    addViewParams: (String, String, js.Object) => CallbackTo[js.Any],
    buildWithParams: (String, js.Object) => CallbackTo[js.Any],
    getParamObj: (js.Object, String) => CallbackTo[js.Any],
    getParamString: js.Object => CallbackTo[js.Any],
    getParams: String => CallbackTo[js.Any],
    getTarget: (String, String) => CallbackTo[js.Any]
  ): hash = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addViewParams")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Object) => addViewParams(t0, t1, t2).runNow()))
    __obj.updateDynamic("buildWithParams")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => buildWithParams(t0, t1).runNow()))
    __obj.updateDynamic("getParamObj")(js.Any.fromFunction2((t0: js.Object, t1: java.lang.String) => getParamObj(t0, t1).runNow()))
    __obj.updateDynamic("getParamString")(js.Any.fromFunction1((t0: js.Object) => getParamString(t0).runNow()))
    __obj.updateDynamic("getParams")(js.Any.fromFunction1((t0: java.lang.String) => getParams(t0).runNow()))
    __obj.updateDynamic("getTarget")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => getTarget(t0, t1).runNow()))
    __obj.asInstanceOf[hash]
  }
}

