package typingsJapgolly.typescriptCollections

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodes extends js.Object {
  var nodes: StringDictionary[js.Array[String]]
  var rootIds: js.Array[String]
}

object AnonNodes {
  @scala.inline
  def apply(nodes: StringDictionary[js.Array[String]], rootIds: js.Array[String]): AnonNodes = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], rootIds = rootIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNodes]
  }
}

