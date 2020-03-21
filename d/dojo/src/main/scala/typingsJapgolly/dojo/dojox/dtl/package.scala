package typingsJapgolly.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dtl {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/Context.html
    *
    * Represents a runtime context used by DTL templates.
    *
    * @param dict
    */
  type Context = js.Function1[/* dict */ js.Object, scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_DomTemplated.html
    *
    * The base class for DOM-based templating.
    *
    */
  type DomTemplated = js.Function0[scala.Unit]
  type base = typingsJapgolly.dojo.dojox.dtl.base_
  type dom = typingsJapgolly.dojo.dojox.dtl.dom_
}
