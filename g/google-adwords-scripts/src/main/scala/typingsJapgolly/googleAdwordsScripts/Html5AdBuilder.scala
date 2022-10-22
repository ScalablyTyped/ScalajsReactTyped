package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Html5AdBuilder[Html5Ad]
  extends StObject
     with AdBuilder[Html5AdBuilder[Html5Ad]] {
  
  def withDimensions(dimensions: String): Html5AdBuilder[Html5Ad]
  
  def withDisplayUrl(displayUrl: String): Html5AdBuilder[Html5Ad]
  
  def withEntryPoint(entryPoint: String): Html5AdBuilder[Html5Ad]
  
  def withMediaBundle(mediaBundle: Media): Html5AdBuilder[Html5Ad]
  
  def withName(name: String): Html5AdBuilder[Html5Ad]
}
object Html5AdBuilder {
  
  inline def apply[Html5Ad](
    build: CallbackTo[AdWordsOperation[Html5AdBuilder[Html5Ad]]],
    withCustomParameters: js.Object => Html5AdBuilder[Html5Ad],
    withDimensions: String => Html5AdBuilder[Html5Ad],
    withDisplayUrl: String => Html5AdBuilder[Html5Ad],
    withEntryPoint: String => Html5AdBuilder[Html5Ad],
    withFinalUrl: String => Html5AdBuilder[Html5Ad],
    withMediaBundle: Media => Html5AdBuilder[Html5Ad],
    withMobileFinalUrl: String => Html5AdBuilder[Html5Ad],
    withName: String => Html5AdBuilder[Html5Ad],
    withTrackingTemplate: String => Html5AdBuilder[Html5Ad]
  ): Html5AdBuilder[Html5Ad] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDimensions = js.Any.fromFunction1(withDimensions), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withEntryPoint = js.Any.fromFunction1(withEntryPoint), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withMediaBundle = js.Any.fromFunction1(withMediaBundle), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[Html5AdBuilder[Html5Ad]]
  }
  
  extension [Self <: Html5AdBuilder[?], Html5Ad](x: Self & Html5AdBuilder[Html5Ad]) {
    
    inline def setWithDimensions(value: String => Html5AdBuilder[Html5Ad]): Self = StObject.set(x, "withDimensions", js.Any.fromFunction1(value))
    
    inline def setWithDisplayUrl(value: String => Html5AdBuilder[Html5Ad]): Self = StObject.set(x, "withDisplayUrl", js.Any.fromFunction1(value))
    
    inline def setWithEntryPoint(value: String => Html5AdBuilder[Html5Ad]): Self = StObject.set(x, "withEntryPoint", js.Any.fromFunction1(value))
    
    inline def setWithMediaBundle(value: Media => Html5AdBuilder[Html5Ad]): Self = StObject.set(x, "withMediaBundle", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => Html5AdBuilder[Html5Ad]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
