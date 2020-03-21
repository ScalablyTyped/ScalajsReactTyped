package typingsJapgolly.semanticUiEmbed.SemanticUI

import typingsJapgolly.semanticUiEmbed.JQuery
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ErrorSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.MetadataSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ParametersSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.SelectorSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get id`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get placeholder`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get sources`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get type`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get url`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`has placeholder`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.auto
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.autoplay
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.brandedUI
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.change
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.className
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.color
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.debug
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.destroy
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.error
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.hd
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.hide
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.icon
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.id
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.metadata
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.name
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.namespace
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.onCreate
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.onDisplay
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.onEmbed
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.onPlaceholderDisplay
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.parameters
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.performance
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.reset
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.selector
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.setting
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.show
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.silent
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.source
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.templates
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.url
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Embed_ extends js.Object {
  var settings: EmbedSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Returns current content id
    */
  def apply(behavior: `get id`): String = js.native
  /**
    * Returns placeholder image url
    */
  def apply(behavior: `get placeholder`): String = js.native
  /**
    * Returns source name
    */
  def apply(behavior: `get sources`): String = js.native
  /**
    * Returns source type
    */
  def apply(behavior: `get type`): String = js.native
  /**
    * Returns URL with all parameters added
    */
  def apply(behavior: `get url`): String = js.native
  /**
    * Returns whether embed content has placeholder
    */
  def apply(behavior: `has placeholder`): Boolean = js.native
  /**
    * Changes iframe to a new content source
    */
  def apply(behavior: change, source: String, id: String, url: String): JQuery = js.native
  /**
    * Destroys instance and removes all events
    */
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides embed content and shows placeholder content
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Removes embed and shows placeholder content if available
    */
  def apply(behavior: reset): JQuery = js.native
  def apply(behavior: setting, name: autoplay): auto | Boolean = js.native
  def apply(behavior: setting, name: autoplay, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: autoplay, value: auto): JQuery = js.native
  def apply(behavior: setting, name: brandedUI): Boolean = js.native
  def apply(behavior: setting, name: brandedUI, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: color): String = js.native
  def apply(behavior: setting, name: color, value: String): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: hd): Boolean = js.native
  def apply(behavior: setting, name: hd, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: icon): `false` | String = js.native
  def apply(behavior: setting, name: icon, value: String): JQuery = js.native
  def apply(behavior: setting, name: icon, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: id): `false` | String = js.native
  def apply(behavior: setting, name: id, value: String): JQuery = js.native
  def apply(behavior: setting, name: id, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: metadata): MetadataSettings = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onCreate): js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit] = js.native
  def apply(
    behavior: setting,
    name: onCreate,
    value: js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onDisplay): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onDisplay, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onEmbed): js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings] = js.native
  def apply(
    behavior: setting,
    name: onEmbed,
    value: js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
  ): JQuery = js.native
  def apply(behavior: setting, name: onPlaceholderDisplay): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onPlaceholderDisplay, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: parameters): `false` | ParametersSettings = js.native
  def apply(behavior: setting, name: parameters, value: ParametersSettings): JQuery = js.native
  def apply(behavior: setting, name: parameters, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: source): `false` | String = js.native
  def apply(behavior: setting, name: source, value: String): JQuery = js.native
  def apply(behavior: setting, name: source, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: templates): TemplatesSettings = js.native
  def apply(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
  def apply(behavior: setting, name: url): `false` | String = js.native
  def apply(behavior: setting, name: url, value: String): JQuery = js.native
  def apply(behavior: setting, name: url, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: EmbedSettings): JQuery = js.native
  /**
    * Shows embed content
    */
  def apply(behavior: show): JQuery = js.native
  def apply(settings: EmbedSettings): JQuery = js.native
}

