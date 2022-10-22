package typingsJapgolly.semanticUiEmbed

import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed
import typingsJapgolly.semanticUiEmbed.SemanticUI.EmbedSettings
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get id`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get placeholder`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get sources`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get type`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get url`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`has placeholder`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.change
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.destroy
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.hide
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.reset
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.setting
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def embed(): JQuery
  def embed(settings: EmbedSettings): JQuery
  @JSName("embed")
  var embed_Original: Embed
  /**
    * Changes iframe to a new content source
    */
  @JSName("embed")
  def embed_change(behavior: change, source: String, id: String, url: String): JQuery
  /**
    * Destroys instance and removes all events
    */
  @JSName("embed")
  def embed_destroy(behavior: destroy): JQuery
  /**
    * Returns current content id
    */
  @JSName("embed")
  def embed_getid(behavior: `get id`): String
  /**
    * Returns placeholder image url
    */
  @JSName("embed")
  def embed_getplaceholder(behavior: `get placeholder`): String
  /**
    * Returns source name
    */
  @JSName("embed")
  def embed_getsources(behavior: `get sources`): String
  /**
    * Returns source type
    */
  @JSName("embed")
  def embed_gettype(behavior: `get type`): String
  /**
    * Returns URL with all parameters added
    */
  @JSName("embed")
  def embed_geturl(behavior: `get url`): String
  /**
    * Returns whether embed content has placeholder
    */
  @JSName("embed")
  def embed_hasplaceholder(behavior: `has placeholder`): Boolean
  /**
    * Hides embed content and shows placeholder content
    */
  @JSName("embed")
  def embed_hide(behavior: hide): JQuery
  /**
    * Removes embed and shows placeholder content if available
    */
  @JSName("embed")
  def embed_reset(behavior: reset): JQuery
  @JSName("embed")
  def embed_setting(behavior: setting, value: EmbedSettings): JQuery
  @JSName("embed")
  def embed_setting[K /* <: /* keyof semantic-ui-embed.SemanticUI.EmbedSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("embed")
  def embed_setting[K /* <: /* keyof semantic-ui-embed.SemanticUI.EmbedSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any
  /**
    * Shows embed content
    */
  @JSName("embed")
  def embed_show(behavior: show): JQuery
}
object JQuery {
  
  inline def apply(embed: Embed): JQuery = {
    val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setEmbed(value: Embed): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
  }
}
