package typingsJapgolly.i18nextBrowserLanguagedetector.mod

import typingsJapgolly.i18next.i18nextStrings.`3rdParty`
import typingsJapgolly.i18next.i18nextStrings.backend
import typingsJapgolly.i18next.i18nextStrings.i18nFormat
import typingsJapgolly.i18next.i18nextStrings.languageDetector
import typingsJapgolly.i18next.i18nextStrings.logger
import typingsJapgolly.i18next.i18nextStrings.postProcessor
import typingsJapgolly.i18next.mod.InitOptions
import typingsJapgolly.i18next.mod.Services
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18next-browser-languagedetector", JSImport.Default)
@js.native
class default () extends I18nextBrowserLanguageDetector {
  def this(services: js.Any) = this()
  def this(services: js.Any, options: DetectorOptions) = this()
  /* CompleteClass */
  override var `type`: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty` = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_LanguageDetectorModule: languageDetector = js.native
  /* CompleteClass */
  override def cacheUserLanguage(lng: String): Unit = js.native
  /** Must return detected language */
  /* CompleteClass */
  override def detect(): js.UndefOr[String] = js.native
  /* CompleteClass */
  override def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit = js.native
}

