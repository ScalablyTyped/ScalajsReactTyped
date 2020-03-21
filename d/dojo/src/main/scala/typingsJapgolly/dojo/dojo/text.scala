package typingsJapgolly.dojo.dojo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/text.html
  *
  * This module implements the dojo/text! plugin and the dojo.cache API.
  * We choose to include our own plugin to leverage functionality already contained in dojo
  * and thereby reduce the size of the plugin compared to various foreign loader implementations.
  * Also, this allows foreign AMD loaders to be used without their plugins.
  *
  * CAUTION: this module is designed to optionally function synchronously to support the dojo v1.x synchronous
  * loader. This feature is outside the scope of the CommonJS plugins specification.
  *
  */
trait text extends js.Object {
  /**
    *
    */
  var dynamic: Boolean
  /**
    *
    * @param id Path to the resource.
    * @param require Object that include the function toUrl with given id returns a valid URL from which to load the text.
    * @param load Callback function which will be called, when the loading finished.
    */
  def load(id: String, require: js.Function, load: js.Function): Unit
  /**
    *
    * @param id
    * @param toAbsMid
    */
  def normalize(id: js.Any, toAbsMid: js.Any): String
}

object text {
  @scala.inline
  def apply(
    dynamic: Boolean,
    load: (String, js.Function, js.Function) => Callback,
    normalize: (js.Any, js.Any) => CallbackTo[String]
  ): text = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any])
    __obj.updateDynamic("load")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Function, t2: js.Function) => load(t0, t1, t2).runNow()))
    __obj.updateDynamic("normalize")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => normalize(t0, t1).runNow()))
    __obj.asInstanceOf[text]
  }
}

