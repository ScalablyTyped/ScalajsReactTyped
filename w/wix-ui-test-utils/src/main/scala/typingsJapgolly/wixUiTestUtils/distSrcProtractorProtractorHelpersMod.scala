package typingsJapgolly.wixUiTestUtils

import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.protractor.mod.WebElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcProtractorProtractorHelpersMod {
  
  @JSImport("wix-ui-test-utils/dist/src/protractor/protractor-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStoryUrl(hasKindStoryWithExamples: StoryUrlParams): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createStoryUrl")(hasKindStoryWithExamples.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getElementByDataHook(dataHook: String): ElementFinder = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementByDataHook")(dataHook.asInstanceOf[js.Any]).asInstanceOf[ElementFinder]
  
  inline def getStoryUrl(kind: String, story: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStoryUrl")(kind.asInstanceOf[js.Any], story.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hasAttribute(elementFinder: ElementFinder, attributeName: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasAttribute")(elementFinder.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def hasEllipsis(element: ElementFinder): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEllipsis")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def isFocused(element: ElementFinder): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocused")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def mouseEnter(element: WebElement): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseEnter")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def mouseEnter(element: ILocation): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseEnter")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def mouseLeave(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseLeave")().asInstanceOf[js.Promise[Unit]]
  
  inline def scrollToElement(element: ElementFinder): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToElement")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def waitForVisibilityOf(elements: js.Array[ElementFinder]): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: js.Array[ElementFinder], errorMsg: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: js.Array[ElementFinder], errorMsg: String, timeout: Double): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: js.Array[ElementFinder], errorMsg: Unit, timeout: Double): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: ElementFinder): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: ElementFinder, errorMsg: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: ElementFinder, errorMsg: String, timeout: Double): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: ElementFinder, errorMsg: Unit, timeout: Double): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  
  trait ILocation extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object ILocation {
    
    inline def apply(x: Double, y: Double): ILocation = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILocation]
    }
    
    extension [Self <: ILocation](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryUrlParams extends StObject {
    
    var kind: String
    
    var story: String
    
    var withExamples: js.UndefOr[Boolean] = js.undefined
  }
  object StoryUrlParams {
    
    inline def apply(kind: String, story: String): StoryUrlParams = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryUrlParams]
    }
    
    extension [Self <: StoryUrlParams](x: Self) {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setStory(value: String): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
      
      inline def setWithExamples(value: Boolean): Self = StObject.set(x, "withExamples", value.asInstanceOf[js.Any])
      
      inline def setWithExamplesUndefined: Self = StObject.set(x, "withExamples", js.undefined)
    }
  }
}
