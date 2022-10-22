package typingsJapgolly.i18next.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.i18next.i18nextStrings.languageDetector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageDetectorModule
  extends StObject
     with Module {
  
  def cacheUserLanguage(lng: String): Unit
  
  /** Must return detected language */
  def detect(): js.UndefOr[String | js.Array[String]]
  
  def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit
  
  @JSName("type")
  var type_LanguageDetectorModule: languageDetector
}
object LanguageDetectorModule {
  
  inline def apply(
    cacheUserLanguage: String => japgolly.scalajs.react.Callback,
    detect: CallbackTo[js.UndefOr[String | js.Array[String]]],
    init: (Services, js.Object, InitOptions) => japgolly.scalajs.react.Callback
  ): LanguageDetectorModule = {
    val __obj = js.Dynamic.literal(cacheUserLanguage = js.Any.fromFunction1((t0: String) => cacheUserLanguage(t0).runNow()), detect = detect.toJsFn, init = js.Any.fromFunction3((t0: Services, t1: js.Object, t2: InitOptions) => (init(t0, t1, t2)).runNow()))
    __obj.updateDynamic("type")("languageDetector")
    __obj.asInstanceOf[LanguageDetectorModule]
  }
  
  extension [Self <: LanguageDetectorModule](x: Self) {
    
    inline def setCacheUserLanguage(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "cacheUserLanguage", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setDetect(value: CallbackTo[js.UndefOr[String | js.Array[String]]]): Self = StObject.set(x, "detect", value.toJsFn)
    
    inline def setInit(value: (Services, js.Object, InitOptions) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "init", js.Any.fromFunction3((t0: Services, t1: js.Object, t2: InitOptions) => (value(t0, t1, t2)).runNow()))
    
    inline def setType(value: languageDetector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
