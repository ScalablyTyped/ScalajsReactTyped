package typingsJapgolly.ckeditor

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSet extends js.Object {
  var removed: js.Array[String]
  var set: StringDictionary[String]
}

object AnonSet {
  @scala.inline
  def apply(removed: js.Array[String], set: StringDictionary[String]): AnonSet = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSet]
  }
}

