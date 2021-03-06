package typingsJapgolly.dojo.dojox.dtl.base

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base.dom.html
  *
  *
  */
trait dom extends js.Object {
  /**
    *
    * @param text
    */
  def getTemplate(text: js.Any): js.Object
  /**
    *
    * @param nodes
    */
  def tokenize(nodes: HTMLElement): js.Array[_]
}

object dom {
  @scala.inline
  def apply(
    getTemplate: js.Any => CallbackTo[js.Object],
    tokenize: HTMLElement => CallbackTo[js.Array[js.Any]]
  ): dom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTemplate")(js.Any.fromFunction1((t0: js.Any) => getTemplate(t0).runNow()))
    __obj.updateDynamic("tokenize")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => tokenize(t0).runNow()))
    __obj.asInstanceOf[dom]
  }
}

