package typingsJapgolly.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionicCliFramework.definitionsMod.TextFootnote
  - typingsJapgolly.ionicCliFramework.definitionsMod.LinkFootnote
*/
trait Footnote extends js.Object

object Footnote {
  @scala.inline
  def TextFootnote(id: String | Double, text: String): Footnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Footnote]
  }
  @scala.inline
  def LinkFootnote(id: String | Double, url: String, shortUrl: String = null): Footnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (shortUrl != null) __obj.updateDynamic("shortUrl")(shortUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Footnote]
  }
}

