package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.I18n
  * @augments pc.EventHandler
  * @classdesc Handles localization. Responsible for loading localization assets
  * and returning translations for a certain key. Can also handle plural forms. To override
  * its default behaviour define a different implementation for {@link pc.I18n#getText} and {@link pc.I18n#getPluralText}.
  * @param {pc.Application} app - The application.
  * @property {string} locale The current locale for example "en-US". Changing the locale will raise an event which will cause localized Text Elements to
  * change language to the new locale.
  * @property {number[]|pc.Asset[]} assets An array of asset ids or assets that contain localization data in the expected format. I18n will automatically load
  * translations from these assets as the assets are loaded and it will also automatically unload translations if the assets get removed or unloaded at runtime.
  */
@JSImport("playcanvas", "I18n")
@js.native
class I18n protected ()
  extends typingsJapgolly.playcanvas.pc.I18n {
  def this(app: typingsJapgolly.playcanvas.pc.Application) = this()
}

