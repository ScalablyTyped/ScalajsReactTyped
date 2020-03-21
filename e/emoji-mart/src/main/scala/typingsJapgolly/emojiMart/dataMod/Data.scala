package typingsJapgolly.emojiMart.dataMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var aliases: StringDictionary[String]
  var categories: js.Array[Category]
  var compressed: Boolean
  var emojis: StringDictionary[Emoji]
}

object Data {
  @scala.inline
  def apply(
    aliases: StringDictionary[String],
    categories: js.Array[Category],
    compressed: Boolean,
    emojis: StringDictionary[Emoji]
  ): Data = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Data]
  }
}

