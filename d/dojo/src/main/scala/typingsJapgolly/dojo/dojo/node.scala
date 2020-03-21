package typingsJapgolly.dojo.dojo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/node.html
  *
  * This AMD plugin module allows native Node.js modules to be loaded by AMD modules using the Dojo
  * loader. Note that this plugin will not work with AMD loaders other than the Dojo loader.
  *
  */
trait node extends js.Object {
  /**
    * Standard AMD plugin interface. See https://github.com/amdjs/amdjs-api/wiki/Loader-Plugins
    * for information.
    *
    * @param id
    * @param require
    * @param load
    */
  def load(id: String, require: js.Function, load: js.Function): Unit
  /**
    * Produces a normalized id to be used by node.  Relative ids are resolved relative to the requesting
    * module's location in the file system and will return an id with path separators appropriate for the
    * local file system.
    *
    * @param id
    * @param normalize
    */
  def normalize(id: String, normalize: js.Function): js.Any
}

object node {
  @scala.inline
  def apply(
    load: (String, js.Function, js.Function) => Callback,
    normalize: (String, js.Function) => CallbackTo[js.Any]
  ): node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Function, t2: js.Function) => load(t0, t1, t2).runNow()))
    __obj.updateDynamic("normalize")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => normalize(t0, t1).runNow()))
    __obj.asInstanceOf[node]
  }
}

