package typingsJapgolly.dojo.dojox.lang.oo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/oo/aop.html
  *
  *
  */
trait aop extends js.Object {
  /**
    *
    */
  var after: js.Object
  /**
    *
    */
  var afterReturning: js.Object
  /**
    *
    */
  var afterThrowing: js.Object
  /**
    *
    */
  var around: js.Object
  /**
    *
    */
  var before: js.Object
}

object aop {
  @scala.inline
  def apply(
    after: js.Object,
    afterReturning: js.Object,
    afterThrowing: js.Object,
    around: js.Object,
    before: js.Object
  ): aop = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], afterReturning = afterReturning.asInstanceOf[js.Any], afterThrowing = afterThrowing.asInstanceOf[js.Any], around = around.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[aop]
  }
}

