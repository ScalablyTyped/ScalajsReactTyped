package typingsJapgolly.ckeditorCkeditor5Core.mod.editor

import typingsJapgolly.ckeditorCkeditor5Core.AnonItems
import typingsJapgolly.ckeditorCkeditor5Core.mod.AlignmentConfig
import typingsJapgolly.ckeditorCkeditor5Core.mod.AutosaveConfig
import typingsJapgolly.ckeditorCkeditor5Core.mod.CKFinderAdapterConfig
import typingsJapgolly.ckeditorCkeditor5Core.mod.CloudServicesConfig
import typingsJapgolly.ckeditorCkeditor5Core.mod.FontFamilyConfig
import typingsJapgolly.ckeditorCkeditor5Core.mod.FontSizeConfig
import typingsJapgolly.ckeditorCkeditor5Core.mod.HeadingConfig
import typingsJapgolly.ckeditorCkeditor5Core.mod.HighlightConfig
import typingsJapgolly.ckeditorCkeditor5Core.mod.ImageConfig
import typingsJapgolly.ckeditorCkeditor5Core.mod.MediaEmbedConfig
import typingsJapgolly.ckeditorCkeditor5Core.mod.Plugin
import typingsJapgolly.ckeditorCkeditor5Core.mod.TypingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// core/editor/editorconfig
trait EditorConfig extends js.Object {
  var alignment: AlignmentConfig
  var autosave: AutosaveConfig
  var balloonToolbar: js.Array[String]
  var blockToolbar: js.Array[String]
  var ckfinder: CKFinderAdapterConfig
  var cloudServices: CloudServicesConfig
  var fontFamily: FontFamilyConfig
  var fontSize: FontSizeConfig
  var heading: HeadingConfig
  var highlight: HighlightConfig
  var image: ImageConfig
  var language: String
  var mediaEmbed: MediaEmbedConfig
  var plugins: js.Array[String | Plugin[Unit]]
  var removePlugins: js.Array[String]
  var toolbar: js.Array[String] | AnonItems
  var typing: TypingConfig
}

object EditorConfig {
  @scala.inline
  def apply(
    alignment: AlignmentConfig,
    autosave: AutosaveConfig,
    balloonToolbar: js.Array[String],
    blockToolbar: js.Array[String],
    ckfinder: CKFinderAdapterConfig,
    cloudServices: CloudServicesConfig,
    fontFamily: FontFamilyConfig,
    fontSize: FontSizeConfig,
    heading: HeadingConfig,
    highlight: HighlightConfig,
    image: ImageConfig,
    language: String,
    mediaEmbed: MediaEmbedConfig,
    plugins: js.Array[String | Plugin[Unit]],
    removePlugins: js.Array[String],
    toolbar: js.Array[String] | AnonItems,
    typing: TypingConfig
  ): EditorConfig = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], autosave = autosave.asInstanceOf[js.Any], balloonToolbar = balloonToolbar.asInstanceOf[js.Any], blockToolbar = blockToolbar.asInstanceOf[js.Any], ckfinder = ckfinder.asInstanceOf[js.Any], cloudServices = cloudServices.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], mediaEmbed = mediaEmbed.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], removePlugins = removePlugins.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditorConfig]
  }
}

