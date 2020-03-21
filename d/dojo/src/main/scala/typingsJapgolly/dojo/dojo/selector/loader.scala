package typingsJapgolly.dojo.dojo.selector

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/selector/_loader.html
  *
  * This module handles loading the appropriate selector engine for the given browser
  *
  */
trait loader extends js.Object {
  /**
    *
    * @param id
    * @param parentRequire
    * @param loaded
    * @param config
    */
  def load(id: js.Any, parentRequire: js.Any, loaded: js.Any, config: js.Any): js.Any
}

object loader {
  @scala.inline
  def apply(load: (js.Any, js.Any, js.Any, js.Any) => CallbackTo[js.Any]): loader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => load(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[loader]
  }
}

