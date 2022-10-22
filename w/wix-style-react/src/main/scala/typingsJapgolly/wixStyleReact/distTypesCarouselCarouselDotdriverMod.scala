package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselCarouselDotdriverMod {
  
  trait CarouselDriver
    extends StObject
       with BaseDriver {
    
    def clickNext(): js.Promise[Unit]
    
    def clickPrevious(): js.Promise[Unit]
    
    def getChildren(): NodeList[HTMLElement & Node]
    
    def getImages(): js.Array[String]
    
    def isLoading(): Boolean
  }
  object CarouselDriver {
    
    inline def apply(
      clickNext: CallbackTo[js.Promise[Unit]],
      clickPrevious: CallbackTo[js.Promise[Unit]],
      exists: CallbackTo[Boolean],
      getChildren: CallbackTo[NodeList[HTMLElement & Node]],
      getImages: CallbackTo[js.Array[String]],
      isLoading: CallbackTo[Boolean]
    ): CarouselDriver = {
      val __obj = js.Dynamic.literal(clickNext = clickNext.toJsFn, clickPrevious = clickPrevious.toJsFn, exists = exists.toJsFn, getChildren = getChildren.toJsFn, getImages = getImages.toJsFn, isLoading = isLoading.toJsFn)
      __obj.asInstanceOf[CarouselDriver]
    }
    
    extension [Self <: CarouselDriver](x: Self) {
      
      inline def setClickNext(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickNext", value.toJsFn)
      
      inline def setClickPrevious(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickPrevious", value.toJsFn)
      
      inline def setGetChildren(value: CallbackTo[NodeList[HTMLElement & Node]]): Self = StObject.set(x, "getChildren", value.toJsFn)
      
      inline def setGetImages(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getImages", value.toJsFn)
      
      inline def setIsLoading(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoading", value.toJsFn)
    }
  }
}
