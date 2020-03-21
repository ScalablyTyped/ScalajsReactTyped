package typingsJapgolly.i18nextExpressMiddleware.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.i18next.i18nextStrings.`3rdParty`
import typingsJapgolly.i18next.i18nextStrings.backend
import typingsJapgolly.i18next.i18nextStrings.i18nFormat
import typingsJapgolly.i18next.i18nextStrings.languageDetector
import typingsJapgolly.i18next.i18nextStrings.logger
import typingsJapgolly.i18next.i18nextStrings.postProcessor
import typingsJapgolly.i18next.mod.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18next-express-middleware", "LanguageDetector")
@js.native
class LanguageDetector () extends Module {
  def this(options: LanguageDetectorOptions) = this()
  def this(services: LanguageDetectorServices) = this()
  def this(options: LanguageDetectorOptions, allOptions: LanguageDetectorAllOptions) = this()
  def this(services: LanguageDetectorServices, options: LanguageDetectorOptions) = this()
  def this(
    services: LanguageDetectorServices,
    options: LanguageDetectorOptions,
    allOptions: LanguageDetectorAllOptions
  ) = this()
  /* CompleteClass */
  override var `type`: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty` = js.native
  @JSName("type")
  var type_LanguageDetector: typingsJapgolly.i18nextExpressMiddleware.i18nextExpressMiddlewareStrings.languageDetector = js.native
  def addDetector(detector: LanguageDetectorInterface): Unit = js.native
  def cacheUserLanguage(req: Request_[ParamsDictionary], res: Response_, lng: String, caches: LanguageDetectorCaches): Unit = js.native
  def detect(req: Request_[ParamsDictionary], res: Response_, detectionOrder: LanguageDetectorOrder): Unit = js.native
  def init(): Unit = js.native
  def init(options: LanguageDetectorOptions): Unit = js.native
  def init(options: LanguageDetectorOptions, allOptions: LanguageDetectorAllOptions): Unit = js.native
  def init(services: LanguageDetectorServices): Unit = js.native
  def init(services: LanguageDetectorServices, options: LanguageDetectorOptions): Unit = js.native
  def init(
    services: LanguageDetectorServices,
    options: LanguageDetectorOptions,
    allOptions: LanguageDetectorAllOptions
  ): Unit = js.native
}

