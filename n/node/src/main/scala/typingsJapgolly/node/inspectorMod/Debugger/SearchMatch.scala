package typingsJapgolly.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search match for resource.
  */
trait SearchMatch extends js.Object {
  /**
    * Line with match content.
    */
  var lineContent: java.lang.String
  /**
    * Line number in resource content.
    */
  var lineNumber: Double
}

object SearchMatch {
  @scala.inline
  def apply(lineContent: java.lang.String, lineNumber: Double): SearchMatch = {
    val __obj = js.Dynamic.literal(lineContent = lineContent.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchMatch]
  }
}

