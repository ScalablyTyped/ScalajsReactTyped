package typingsJapgolly.dojo.dojox.validate.regexp

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/regexp.us.html
  *
  *
  */
trait us extends js.Object {
  /**
    * A regular expression to match US state and territory abbreviations
    *
    * @param flags               Optionalflags.allowTerritories  Allow Guam, Puerto Rico, etc.  Default is true.flags.allowMilitary  Allow military 'states', e.g. Armed Forces Europe (AE).  Default is true.
    */
  def state(flags: js.Object): String
}

object us {
  @scala.inline
  def apply(state: js.Object => CallbackTo[String]): us = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(js.Any.fromFunction1((t0: js.Object) => state(t0).runNow()))
    __obj.asInstanceOf[us]
  }
}

