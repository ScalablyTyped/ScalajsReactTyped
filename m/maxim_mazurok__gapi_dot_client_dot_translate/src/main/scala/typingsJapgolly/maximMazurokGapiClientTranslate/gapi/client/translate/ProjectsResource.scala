package typingsJapgolly.maximMazurokGapiClientTranslate.gapi.client.translate

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTranslate.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientTranslate.anon.Alt
import typingsJapgolly.maximMazurokGapiClientTranslate.anon.DisplayLanguageCode
import typingsJapgolly.maximMazurokGapiClientTranslate.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  def detectLanguage(request: Alt, body: DetectLanguageRequest): Request[DetectLanguageResponse] = js.native
  /** Detects the language of text within a request. */
  def detectLanguage(request: Uploadprotocol): Request[DetectLanguageResponse] = js.native
  
  /** Returns a list of supported languages for translation. */
  def getSupportedLanguages(): Request[SupportedLanguages] = js.native
  def getSupportedLanguages(request: DisplayLanguageCode): Request[SupportedLanguages] = js.native
  
  var locations: LocationsResource = js.native
  
  /** Translates input text and returns translated text. */
  def translateText(request: AccesstokenAlt): Request[TranslateTextResponse] = js.native
  def translateText(request: Alt, body: TranslateTextRequest): Request[TranslateTextResponse] = js.native
}
