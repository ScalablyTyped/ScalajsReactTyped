package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestimonialListTestimonialListDotuniDotdriverMod {
  
  trait TestimonialListUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getNumberOfTestimonials(): js.Promise[Double]
    
    def getTestimonialAuthorName(): js.Promise[String]
    
    def getTestimonialText(): js.Promise[String]
    
    def hasTestimonialAuthorName(): js.Promise[Boolean]
    
    def hasTestimonialAvatar(): js.Promise[Boolean]
    
    def hasTestimonialText(): js.Promise[Boolean]
  }
  object TestimonialListUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getNumberOfTestimonials: CallbackTo[js.Promise[Double]],
      getTestimonialAuthorName: CallbackTo[js.Promise[String]],
      getTestimonialText: CallbackTo[js.Promise[String]],
      hasTestimonialAuthorName: CallbackTo[js.Promise[Boolean]],
      hasTestimonialAvatar: CallbackTo[js.Promise[Boolean]],
      hasTestimonialText: CallbackTo[js.Promise[Boolean]]
    ): TestimonialListUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getNumberOfTestimonials = getNumberOfTestimonials.toJsFn, getTestimonialAuthorName = getTestimonialAuthorName.toJsFn, getTestimonialText = getTestimonialText.toJsFn, hasTestimonialAuthorName = hasTestimonialAuthorName.toJsFn, hasTestimonialAvatar = hasTestimonialAvatar.toJsFn, hasTestimonialText = hasTestimonialText.toJsFn)
      __obj.asInstanceOf[TestimonialListUniDriver]
    }
    
    extension [Self <: TestimonialListUniDriver](x: Self) {
      
      inline def setGetNumberOfTestimonials(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getNumberOfTestimonials", value.toJsFn)
      
      inline def setGetTestimonialAuthorName(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTestimonialAuthorName", value.toJsFn)
      
      inline def setGetTestimonialText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTestimonialText", value.toJsFn)
      
      inline def setHasTestimonialAuthorName(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasTestimonialAuthorName", value.toJsFn)
      
      inline def setHasTestimonialAvatar(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasTestimonialAvatar", value.toJsFn)
      
      inline def setHasTestimonialText(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasTestimonialText", value.toJsFn)
    }
  }
}
