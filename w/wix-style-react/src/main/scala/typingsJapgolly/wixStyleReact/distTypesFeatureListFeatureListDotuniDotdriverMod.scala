package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFeatureListFeatureListDotuniDotdriverMod {
  
  trait FeatureListUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getFeatureText(): js.Promise[String]
    
    def getFeatureTitle(): js.Promise[String]
    
    def getNumberOfFeatures(): js.Promise[Double]
    
    def hasFeatureImage(): js.Promise[Boolean]
    
    def hasFeatureText(): js.Promise[Boolean]
    
    def hasFeatureTitle(): js.Promise[Boolean]
  }
  object FeatureListUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getFeatureText: CallbackTo[js.Promise[String]],
      getFeatureTitle: CallbackTo[js.Promise[String]],
      getNumberOfFeatures: CallbackTo[js.Promise[Double]],
      hasFeatureImage: CallbackTo[js.Promise[Boolean]],
      hasFeatureText: CallbackTo[js.Promise[Boolean]],
      hasFeatureTitle: CallbackTo[js.Promise[Boolean]]
    ): FeatureListUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getFeatureText = getFeatureText.toJsFn, getFeatureTitle = getFeatureTitle.toJsFn, getNumberOfFeatures = getNumberOfFeatures.toJsFn, hasFeatureImage = hasFeatureImage.toJsFn, hasFeatureText = hasFeatureText.toJsFn, hasFeatureTitle = hasFeatureTitle.toJsFn)
      __obj.asInstanceOf[FeatureListUniDriver]
    }
    
    extension [Self <: FeatureListUniDriver](x: Self) {
      
      inline def setGetFeatureText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getFeatureText", value.toJsFn)
      
      inline def setGetFeatureTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getFeatureTitle", value.toJsFn)
      
      inline def setGetNumberOfFeatures(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getNumberOfFeatures", value.toJsFn)
      
      inline def setHasFeatureImage(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasFeatureImage", value.toJsFn)
      
      inline def setHasFeatureText(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasFeatureText", value.toJsFn)
      
      inline def setHasFeatureTitle(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasFeatureTitle", value.toJsFn)
    }
  }
}
