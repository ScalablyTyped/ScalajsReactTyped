package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdBuilder[T]
  extends StObject
     with AdWordsBuilder[T]
     with hasFinalUrlBuilder[T]
     with hasTrackingTemplateBuilder[T]
object AdBuilder {
  
  inline def apply[T](
    build: CallbackTo[AdWordsOperation[T]],
    withCustomParameters: js.Object => T,
    withFinalUrl: String => T,
    withMobileFinalUrl: String => T,
    withTrackingTemplate: String => T
  ): AdBuilder[T] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, withCustomParameters = js.Any.fromFunction1(withCustomParameters), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[AdBuilder[T]]
  }
}
