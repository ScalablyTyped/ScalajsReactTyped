package typingsJapgolly.chrome.anon

import typingsJapgolly.chrome.chrome.i18n.LanguageDetectionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofi18n extends StObject {
  
  def detectLanguage(text: String): js.Promise[LanguageDetectionResult] = js.native
  def detectLanguage(text: String, callback: js.Function1[/* result */ LanguageDetectionResult, Unit]): Unit = js.native
  
  def getAcceptLanguages(): js.Promise[js.Array[String]] = js.native
  def getAcceptLanguages(callback: js.Function1[/* languages */ js.Array[String], Unit]): Unit = js.native
  
  def getMessage(messageName: String): String = js.native
  def getMessage(messageName: String, substitutions: String): String = js.native
  def getMessage(messageName: String, substitutions: js.Array[String]): String = js.native
  
  def getUILanguage(): String = js.native
}
