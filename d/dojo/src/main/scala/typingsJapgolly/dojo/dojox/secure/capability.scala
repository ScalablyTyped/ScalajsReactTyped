package typingsJapgolly.dojo.dojox.secure

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/secure/capability.html
  *
  *
  */
trait capability extends js.Object {
  /**
    *
    */
  var keywords: js.Array[_]
  /**
    * pass in the text of a script. If it passes and it can be eval'ed, it should be safe.
    * Note that this does not do full syntax checking, it relies on eval to reject invalid scripts.
    * There are also known false rejections:
    *
    * Nesting vars inside blocks will not declare the variable for the outer block
    * Named functions are not treated as declaration so they are generally not allowed unless the name is declared with a var.
    * Var declaration that involve multiple comma delimited variable assignments are not accepted
    *
    * @param script the script to execute
    * @param safeLibraries The safe libraries that can be called (the functions can not be access/modified by the untrusted code, only called)
    * @param safeGlobals These globals can be freely interacted with by the untrusted code
    */
  def validate(script: String, safeLibraries: js.Array[_], safeGlobals: js.Object): Unit
}

object capability {
  @scala.inline
  def apply(keywords: js.Array[_], validate: (String, js.Array[js.Any], js.Object) => Callback): capability = {
    val __obj = js.Dynamic.literal(keywords = keywords.asInstanceOf[js.Any])
    __obj.updateDynamic("validate")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Array[js.Any], t2: js.Object) => validate(t0, t1, t2).runNow()))
    __obj.asInstanceOf[capability]
  }
}

