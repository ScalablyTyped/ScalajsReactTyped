package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object Oriented style of API needed to create elements and text nodes.
  *
  * This is the native browser API style, e.g. operations are methods on individual objects
  * like HTMLElement. With this style, no additional code is needed as a facade
  * (reducing payload size).
  * */
trait ObjectOrientedRenderer3 extends Renderer3 {
  def createComment(data: String): RComment
  def createElement(tagName: String): RElement
  def createElementNS(namespace: String, tagName: String): RElement
  def createTextNode(data: String): RText
  def querySelector(selectors: String): RElement | Null
}

object ObjectOrientedRenderer3 {
  @scala.inline
  def apply(
    createComment: String => CallbackTo[RComment],
    createElement: String => CallbackTo[RElement],
    createElementNS: (String, String) => CallbackTo[RElement],
    createTextNode: String => CallbackTo[RText],
    querySelector: String => CallbackTo[RElement | Null]
  ): ObjectOrientedRenderer3 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createComment")(js.Any.fromFunction1((t0: java.lang.String) => createComment(t0).runNow()))
    __obj.updateDynamic("createElement")(js.Any.fromFunction1((t0: java.lang.String) => createElement(t0).runNow()))
    __obj.updateDynamic("createElementNS")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => createElementNS(t0, t1).runNow()))
    __obj.updateDynamic("createTextNode")(js.Any.fromFunction1((t0: java.lang.String) => createTextNode(t0).runNow()))
    __obj.updateDynamic("querySelector")(js.Any.fromFunction1((t0: java.lang.String) => querySelector(t0).runNow()))
    __obj.asInstanceOf[ObjectOrientedRenderer3]
  }
}

