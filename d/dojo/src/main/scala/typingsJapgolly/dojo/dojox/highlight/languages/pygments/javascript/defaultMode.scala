package typingsJapgolly.dojo.dojox.highlight.languages.pygments.javascript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/pygments/javascript.defaultMode.html
  *
  *
  */
trait defaultMode extends js.Object {
  /**
    *
    */
  var contains: js.Array[_]
  /**
    *
    */
  var keywords: js.Object
  /**
    *
    */
  var lexems: js.Array[_]
}

object defaultMode {
  @scala.inline
  def apply(contains: js.Array[_], keywords: js.Object, lexems: js.Array[_]): defaultMode = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], lexems = lexems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[defaultMode]
  }
}

