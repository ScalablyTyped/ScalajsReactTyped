package typingsJapgolly.dojo.dojo.dnd.autoscroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/autoscroll._validOverflow.html
  *
  *
  */
trait validOverflow extends js.Object {
  /**
    *
    */
  var auto: Double
  /**
    *
    */
  var scroll: Double
}

object validOverflow {
  @scala.inline
  def apply(auto: Double, scroll: Double): validOverflow = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[validOverflow]
  }
}

