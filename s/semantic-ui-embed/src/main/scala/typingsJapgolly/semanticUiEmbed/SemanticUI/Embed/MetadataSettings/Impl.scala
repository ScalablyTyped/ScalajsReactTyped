package typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'icon'
    */
  var icon: String
  /**
    * @default 'id'
    */
  var id: String
  /**
    * @default 'placeholder'
    */
  var placeholder: String
  /**
    * @default 'source'
    */
  var source: String
  /**
    * @default 'url'
    */
  var url: String
}

object Impl {
  @scala.inline
  def apply(icon: String, id: String, placeholder: String, source: String, url: String): Impl = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

