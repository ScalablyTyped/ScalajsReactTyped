package typingsJapgolly.i18next.mod

import typingsJapgolly.i18next.i18nextBooleans.`true`
import typingsJapgolly.i18next.i18nextStrings.languageDetector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to detect language in user land.
  * Can be provided as a singleton or as a prototype constructor (preferred for supporting multiple instances of i18next).
  * For singleton set property `type` to `'languageDetector'` For a prototype constructor set static property.
  */
trait LanguageDetectorAsyncModule extends Module {
  /** Set to true to enable async detection */
  var async: `true`
  @JSName("type")
  var type_LanguageDetectorAsyncModule: languageDetector
  def cacheUserLanguage(lng: String): Unit
  /** Must call callback passing detected language */
  def detect(callback: js.Function1[/* lng */ String, Unit]): Unit
  def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit
}

object LanguageDetectorAsyncModule {
  @scala.inline
  def apply(
    async: `true`,
    cacheUserLanguage: String => japgolly.scalajs.react.Callback,
    detect: js.Function1[/* lng */ String, Unit] => japgolly.scalajs.react.Callback,
    init: (Services, js.Object, InitOptions) => japgolly.scalajs.react.Callback,
    `type`: languageDetector
  ): LanguageDetectorAsyncModule = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
    __obj.updateDynamic("cacheUserLanguage")(js.Any.fromFunction1((t0: java.lang.String) => cacheUserLanguage(t0).runNow()))
    __obj.updateDynamic("detect")(js.Any.fromFunction1((t0: js.Function1[/* lng */ java.lang.String, scala.Unit]) => detect(t0).runNow()))
    __obj.updateDynamic("init")(js.Any.fromFunction3((t0: typingsJapgolly.i18next.mod.Services, t1: js.Object, t2: typingsJapgolly.i18next.mod.InitOptions) => init(t0, t1, t2).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetectorAsyncModule]
  }
}

