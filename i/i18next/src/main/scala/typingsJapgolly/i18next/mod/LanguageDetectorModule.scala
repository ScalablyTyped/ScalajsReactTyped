package typingsJapgolly.i18next.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.i18next.i18nextStrings.languageDetector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to detect language in user land.
  * Can be provided as a singleton or as a prototype constructor (preferred for supporting multiple instances of i18next).
  * For singleton set property `type` to `'languageDetector'` For a prototype constructor set static property.
  */
trait LanguageDetectorModule extends Module {
  @JSName("type")
  var type_LanguageDetectorModule: languageDetector
  def cacheUserLanguage(lng: String): Unit
  /** Must return detected language */
  def detect(): js.UndefOr[String]
  def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit
}

object LanguageDetectorModule {
  @scala.inline
  def apply(
    cacheUserLanguage: String => japgolly.scalajs.react.Callback,
    detect: CallbackTo[js.UndefOr[String]],
    init: (Services, js.Object, InitOptions) => japgolly.scalajs.react.Callback,
    `type`: languageDetector
  ): LanguageDetectorModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cacheUserLanguage")(js.Any.fromFunction1((t0: java.lang.String) => cacheUserLanguage(t0).runNow()))
    __obj.updateDynamic("detect")(detect.toJsFn)
    __obj.updateDynamic("init")(js.Any.fromFunction3((t0: typingsJapgolly.i18next.mod.Services, t1: js.Object, t2: typingsJapgolly.i18next.mod.InitOptions) => init(t0, t1, t2).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetectorModule]
  }
}

