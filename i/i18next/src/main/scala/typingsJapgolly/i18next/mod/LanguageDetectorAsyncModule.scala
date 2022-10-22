package typingsJapgolly.i18next.mod

import typingsJapgolly.i18next.i18nextBooleans.`true`
import typingsJapgolly.i18next.i18nextStrings.languageDetector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageDetectorAsyncModule
  extends StObject
     with Module {
  
  /** Set to true to enable async detection */
  var async: `true`
  
  def cacheUserLanguage(lng: String): Unit
  
  /** Must call callback passing detected language */
  def detect(callback: js.Function1[/* lng */ js.UndefOr[String | js.Array[String]], Unit]): Unit
  
  def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit
  
  @JSName("type")
  var type_LanguageDetectorAsyncModule: languageDetector
}
object LanguageDetectorAsyncModule {
  
  inline def apply(
    cacheUserLanguage: String => japgolly.scalajs.react.Callback,
    detect: js.Function1[/* lng */ js.UndefOr[String | js.Array[String]], Unit] => japgolly.scalajs.react.Callback,
    init: (Services, js.Object, InitOptions) => japgolly.scalajs.react.Callback
  ): LanguageDetectorAsyncModule = {
    val __obj = js.Dynamic.literal(async = true, cacheUserLanguage = js.Any.fromFunction1((t0: String) => cacheUserLanguage(t0).runNow()), detect = js.Any.fromFunction1((t0: js.Function1[/* lng */ js.UndefOr[String | js.Array[String]], Unit]) => detect(t0).runNow()), init = js.Any.fromFunction3((t0: Services, t1: js.Object, t2: InitOptions) => (init(t0, t1, t2)).runNow()))
    __obj.updateDynamic("type")("languageDetector")
    __obj.asInstanceOf[LanguageDetectorAsyncModule]
  }
  
  extension [Self <: LanguageDetectorAsyncModule](x: Self) {
    
    inline def setAsync(value: `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setCacheUserLanguage(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "cacheUserLanguage", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setDetect(
      value: js.Function1[/* lng */ js.UndefOr[String | js.Array[String]], Unit] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "detect", js.Any.fromFunction1((t0: js.Function1[/* lng */ js.UndefOr[String | js.Array[String]], Unit]) => value(t0).runNow()))
    
    inline def setInit(value: (Services, js.Object, InitOptions) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "init", js.Any.fromFunction3((t0: Services, t1: js.Object, t2: InitOptions) => (value(t0, t1, t2)).runNow()))
    
    inline def setType(value: languageDetector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
