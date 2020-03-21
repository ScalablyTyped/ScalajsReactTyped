package typingsJapgolly.dojo.dojox.dtl.contrib

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/contrib/dom.html
  *
  *
  */
trait dom extends js.Object {
  /**
    *
    * @param nodelist
    * @param options
    */
  def BufferNode(nodelist: js.Any, options: js.Any): Unit
  /**
    *
    * @param styles
    */
  def StyleNode(styles: js.Any): Unit
  /**
    * Buffer large DOM manipulations during re-render.
    * When using DomTemplate, wrap any content
    * that you expect to change often during
    * re-rendering. It will then remove its parent
    * from the main document while it re-renders that
    * section of code. It will only remove it from
    * the main document if a mainpulation of somes sort
    * happens. ie It won't swap out if it diesn't have to.
    *
    * @param parser
    * @param token
    */
  def buffer(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def html(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def style_(parser: js.Any, token: js.Any): js.Any
}

object dom {
  @scala.inline
  def apply(
    BufferNode: (js.Any, js.Any) => Callback,
    StyleNode: js.Any => Callback,
    buffer: (js.Any, js.Any) => CallbackTo[js.Any],
    html: (js.Any, js.Any) => CallbackTo[js.Any],
    style_ : (js.Any, js.Any) => CallbackTo[js.Any]
  ): dom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BufferNode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => BufferNode(t0, t1).runNow()))
    __obj.updateDynamic("StyleNode")(js.Any.fromFunction1((t0: js.Any) => StyleNode(t0).runNow()))
    __obj.updateDynamic("buffer")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => buffer(t0, t1).runNow()))
    __obj.updateDynamic("html")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => html(t0, t1).runNow()))
    __obj.updateDynamic("style_")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => style_(t0, t1).runNow()))
    __obj.asInstanceOf[dom]
  }
}

