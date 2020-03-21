package typingsJapgolly.dojo.dojox.dtl.tag

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/misc.html
  *
  *
  */
trait misc extends js.Object {
  /**
    *
    * @param text
    */
  def DebugNode(text: js.Any): Unit
  /**
    *
    * @param varnode
    * @param nodelist
    */
  def FilterNode(varnode: js.Any, nodelist: js.Any): Unit
  /**
    *
    * @param vars
    * @param text
    */
  def FirstOfNode(vars: js.Any, text: js.Any): Unit
  /**
    *
    * @param nodelist
    * @param text
    */
  def SpacelessNode(nodelist: js.Any, text: js.Any): Unit
  /**
    *
    * @param tag
    * @param text
    */
  def TemplateTagNode(tag: js.Any, text: js.Any): Unit
  /**
    *
    * @param current
    * @param max
    * @param width
    * @param text
    */
  def WidthRatioNode(current: js.Any, max: js.Any, width: js.Any, text: js.Any): Unit
  /**
    *
    * @param target
    * @param alias
    * @param nodelist
    */
  def WithNode(target: js.Any, alias: js.Any, nodelist: js.Any): Unit
  /**
    * Ignore everything between {% comment %} and {% endcomment %}
    *
    * @param parser
    * @param token
    */
  def comment(parser: js.Any, token: js.Any): js.Any
  /**
    * Output the current context, maybe add more stuff later.
    *
    * @param parser
    * @param token
    */
  def debug(parser: js.Any, token: js.Any): js.Any
  /**
    * Filter the contents of the blog through variable filters.
    *
    * @param parser
    * @param token
    */
  def filter(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def firstof(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def spaceless(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def templatetag(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def widthratio(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def with_(parser: js.Any, token: js.Any): js.Any
}

object misc {
  @scala.inline
  def apply(
    DebugNode: js.Any => Callback,
    FilterNode: (js.Any, js.Any) => Callback,
    FirstOfNode: (js.Any, js.Any) => Callback,
    SpacelessNode: (js.Any, js.Any) => Callback,
    TemplateTagNode: (js.Any, js.Any) => Callback,
    WidthRatioNode: (js.Any, js.Any, js.Any, js.Any) => Callback,
    WithNode: (js.Any, js.Any, js.Any) => Callback,
    comment: (js.Any, js.Any) => CallbackTo[js.Any],
    debug: (js.Any, js.Any) => CallbackTo[js.Any],
    filter: (js.Any, js.Any) => CallbackTo[js.Any],
    firstof: (js.Any, js.Any) => CallbackTo[js.Any],
    spaceless: (js.Any, js.Any) => CallbackTo[js.Any],
    templatetag: (js.Any, js.Any) => CallbackTo[js.Any],
    widthratio: (js.Any, js.Any) => CallbackTo[js.Any],
    with_ : (js.Any, js.Any) => CallbackTo[js.Any]
  ): misc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DebugNode")(js.Any.fromFunction1((t0: js.Any) => DebugNode(t0).runNow()))
    __obj.updateDynamic("FilterNode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => FilterNode(t0, t1).runNow()))
    __obj.updateDynamic("FirstOfNode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => FirstOfNode(t0, t1).runNow()))
    __obj.updateDynamic("SpacelessNode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => SpacelessNode(t0, t1).runNow()))
    __obj.updateDynamic("TemplateTagNode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => TemplateTagNode(t0, t1).runNow()))
    __obj.updateDynamic("WidthRatioNode")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => WidthRatioNode(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("WithNode")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => WithNode(t0, t1, t2).runNow()))
    __obj.updateDynamic("comment")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => comment(t0, t1).runNow()))
    __obj.updateDynamic("debug")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => debug(t0, t1).runNow()))
    __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => filter(t0, t1).runNow()))
    __obj.updateDynamic("firstof")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => firstof(t0, t1).runNow()))
    __obj.updateDynamic("spaceless")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => spaceless(t0, t1).runNow()))
    __obj.updateDynamic("templatetag")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => templatetag(t0, t1).runNow()))
    __obj.updateDynamic("widthratio")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => widthratio(t0, t1).runNow()))
    __obj.updateDynamic("with_")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => with_(t0, t1).runNow()))
    __obj.asInstanceOf[misc]
  }
}

