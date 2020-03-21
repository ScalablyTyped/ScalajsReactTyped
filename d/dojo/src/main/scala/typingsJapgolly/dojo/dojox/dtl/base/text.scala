package typingsJapgolly.dojo.dojox.dtl.base

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base.text.html
  *
  *
  */
trait text extends js.Object {
  /**
    *
    * @param name
    * @param errorless
    */
  def getFilter(name: js.Any, errorless: js.Any): js.Any
  /**
    *
    * @param name
    * @param errorless
    */
  def getTag(name: js.Any, errorless: js.Any): js.Any
  /**
    *
    * @param file
    */
  def getTemplate(file: js.Any): js.Any
  /**
    *
    * @param file
    */
  def getTemplateString(file: js.Any): String
  /**
    *
    * @param str
    */
  def tokenize(str: js.Any): js.Any
}

object text {
  @scala.inline
  def apply(
    getFilter: (js.Any, js.Any) => CallbackTo[js.Any],
    getTag: (js.Any, js.Any) => CallbackTo[js.Any],
    getTemplate: js.Any => CallbackTo[js.Any],
    getTemplateString: js.Any => CallbackTo[String],
    tokenize: js.Any => CallbackTo[js.Any]
  ): text = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFilter")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => getFilter(t0, t1).runNow()))
    __obj.updateDynamic("getTag")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => getTag(t0, t1).runNow()))
    __obj.updateDynamic("getTemplate")(js.Any.fromFunction1((t0: js.Any) => getTemplate(t0).runNow()))
    __obj.updateDynamic("getTemplateString")(js.Any.fromFunction1((t0: js.Any) => getTemplateString(t0).runNow()))
    __obj.updateDynamic("tokenize")(js.Any.fromFunction1((t0: js.Any) => tokenize(t0).runNow()))
    __obj.asInstanceOf[text]
  }
}

