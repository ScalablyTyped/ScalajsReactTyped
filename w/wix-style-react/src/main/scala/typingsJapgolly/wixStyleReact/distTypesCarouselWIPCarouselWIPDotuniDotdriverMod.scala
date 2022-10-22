package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriverList
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselWIPCarouselWIPDotuniDotdriverMod {
  
  trait CarouselWIPUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickNext(): js.Promise[Unit]
    
    def clickPrevious(): js.Promise[Unit]
    
    def getChildren(): UniDriverList[Any]
    
    def getImages(): js.Array[js.Promise[String | Null]]
    
    def isLoading(): js.Promise[Boolean]
  }
  object CarouselWIPUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickNext: CallbackTo[js.Promise[Unit]],
      clickPrevious: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getChildren: CallbackTo[UniDriverList[Any]],
      getImages: CallbackTo[js.Array[js.Promise[String | Null]]],
      isLoading: CallbackTo[js.Promise[Boolean]]
    ): CarouselWIPUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickNext = clickNext.toJsFn, clickPrevious = clickPrevious.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getChildren = getChildren.toJsFn, getImages = getImages.toJsFn, isLoading = isLoading.toJsFn)
      __obj.asInstanceOf[CarouselWIPUniDriver]
    }
    
    extension [Self <: CarouselWIPUniDriver](x: Self) {
      
      inline def setClickNext(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickNext", value.toJsFn)
      
      inline def setClickPrevious(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickPrevious", value.toJsFn)
      
      inline def setGetChildren(value: CallbackTo[UniDriverList[Any]]): Self = StObject.set(x, "getChildren", value.toJsFn)
      
      inline def setGetImages(value: CallbackTo[js.Array[js.Promise[String | Null]]]): Self = StObject.set(x, "getImages", value.toJsFn)
      
      inline def setIsLoading(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLoading", value.toJsFn)
    }
  }
}
