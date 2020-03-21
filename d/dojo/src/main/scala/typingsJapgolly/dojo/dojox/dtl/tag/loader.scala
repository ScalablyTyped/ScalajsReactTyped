package typingsJapgolly.dojo.dojox.dtl.tag

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/loader.html
  *
  *
  */
trait loader extends js.Object {
  /**
    *
    * @param name
    * @param nodelist
    */
  def BlockNode(name: js.Any, nodelist: js.Any): Unit
  /**
    *
    * @param getTemplate
    * @param nodelist
    * @param shared
    * @param parent
    * @param key
    */
  def ExtendsNode(getTemplate: js.Any, nodelist: js.Any, shared: js.Any, parent: js.Any, key: js.Any): Unit
  /**
    *
    * @param path
    * @param constant
    * @param getTemplate
    * @param text
    * @param parsed
    */
  def IncludeNode(path: js.Any, constant: js.Any, getTemplate: js.Any, text: js.Any, parsed: js.Any): Unit
  /**
    *
    * @param parser
    * @param token
    */
  def block(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def extends_(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def include(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def ssi(parser: js.Any, token: js.Any): js.Any
}

object loader {
  @scala.inline
  def apply(
    BlockNode: (js.Any, js.Any) => Callback,
    ExtendsNode: (js.Any, js.Any, js.Any, js.Any, js.Any) => Callback,
    IncludeNode: (js.Any, js.Any, js.Any, js.Any, js.Any) => Callback,
    block: (js.Any, js.Any) => CallbackTo[js.Any],
    extends_ : (js.Any, js.Any) => CallbackTo[js.Any],
    include: (js.Any, js.Any) => CallbackTo[js.Any],
    ssi: (js.Any, js.Any) => CallbackTo[js.Any]
  ): loader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BlockNode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => BlockNode(t0, t1).runNow()))
    __obj.updateDynamic("ExtendsNode")(js.Any.fromFunction5((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any, t4: js.Any) => ExtendsNode(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("IncludeNode")(js.Any.fromFunction5((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any, t4: js.Any) => IncludeNode(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("block")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => block(t0, t1).runNow()))
    __obj.updateDynamic("extends_")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => extends_(t0, t1).runNow()))
    __obj.updateDynamic("include")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => include(t0, t1).runNow()))
    __obj.updateDynamic("ssi")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => ssi(t0, t1).runNow()))
    __obj.asInstanceOf[loader]
  }
}

