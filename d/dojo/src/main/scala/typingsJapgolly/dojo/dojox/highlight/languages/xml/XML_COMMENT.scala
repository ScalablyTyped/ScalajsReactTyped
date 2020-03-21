package typingsJapgolly.dojo.dojox.highlight.languages.xml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/xml.XML_COMMENT.html
  *
  *
  */
trait XML_COMMENT extends js.Object {
  /**
    *
    */
  var begin: String
  /**
    *
    */
  var className: String
  /**
    *
    */
  var end: String
}

object XML_COMMENT {
  @scala.inline
  def apply(begin: String, className: String, end: String): XML_COMMENT = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XML_COMMENT]
  }
}

