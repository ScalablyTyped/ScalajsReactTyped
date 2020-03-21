package typingsJapgolly.markdownIt.tokenMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var attrs: js.Array[js.Array[String]]
  var block: Boolean
  var children: js.Array[Token]
  var content: String
  var hidden: Boolean
  var info: String
  var level: Double
  var map: js.Array[Double]
  var markup: String
  var meta: js.Any
  var nesting: Double
  var tag: String
  var `type`: String
  def attrGet(name: String): String | Null
  def attrIndex(name: String): Double
  def attrJoin(name: String, value: String): Unit
  def attrPush(attrData: js.Array[String]): Unit
  def attrSet(name: String, value: String): Unit
}

object Token {
  @scala.inline
  def apply(
    attrGet: String => CallbackTo[String | Null],
    attrIndex: String => CallbackTo[Double],
    attrJoin: (String, String) => Callback,
    attrPush: js.Array[String] => Callback,
    attrSet: (String, String) => Callback,
    attrs: js.Array[js.Array[String]],
    block: Boolean,
    children: js.Array[Token],
    content: String,
    hidden: Boolean,
    info: String,
    level: Double,
    map: js.Array[Double],
    markup: String,
    meta: js.Any,
    nesting: Double,
    tag: String,
    `type`: String
  ): Token = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], markup = markup.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("attrGet")(js.Any.fromFunction1((t0: java.lang.String) => attrGet(t0).runNow()))
    __obj.updateDynamic("attrIndex")(js.Any.fromFunction1((t0: java.lang.String) => attrIndex(t0).runNow()))
    __obj.updateDynamic("attrJoin")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => attrJoin(t0, t1).runNow()))
    __obj.updateDynamic("attrPush")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => attrPush(t0).runNow()))
    __obj.updateDynamic("attrSet")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => attrSet(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

