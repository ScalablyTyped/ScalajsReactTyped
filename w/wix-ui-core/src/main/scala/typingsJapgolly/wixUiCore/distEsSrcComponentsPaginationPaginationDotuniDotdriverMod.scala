package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsPaginationPaginationDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/pagination/Pagination.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginationDriverFactory(base: UniDriver[Any]): PaginationDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("paginationDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[PaginationDriver]
  
  trait PaginationDriver
    extends StObject
       with BaseUniDriver {
    
    def clickNextButton(): js.Promise[Unit]
    
    def clickOnPage(page: Double): js.Promise[Unit]
    
    def clickPreviousButton(): js.Promise[Unit]
    
    def getCurrentPage(): js.Promise[Double]
    
    def getTotalPages(): js.Promise[Double]
    
    def isVisible(): js.Promise[Boolean]
  }
  object PaginationDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickNextButton: CallbackTo[js.Promise[Unit]],
      clickOnPage: Double => js.Promise[Unit],
      clickPreviousButton: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getCurrentPage: CallbackTo[js.Promise[Double]],
      getTotalPages: CallbackTo[js.Promise[Double]],
      isVisible: CallbackTo[js.Promise[Boolean]]
    ): PaginationDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickNextButton = clickNextButton.toJsFn, clickOnPage = js.Any.fromFunction1(clickOnPage), clickPreviousButton = clickPreviousButton.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getCurrentPage = getCurrentPage.toJsFn, getTotalPages = getTotalPages.toJsFn, isVisible = isVisible.toJsFn)
      __obj.asInstanceOf[PaginationDriver]
    }
    
    extension [Self <: PaginationDriver](x: Self) {
      
      inline def setClickNextButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickNextButton", value.toJsFn)
      
      inline def setClickOnPage(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickOnPage", js.Any.fromFunction1(value))
      
      inline def setClickPreviousButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickPreviousButton", value.toJsFn)
      
      inline def setGetCurrentPage(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getCurrentPage", value.toJsFn)
      
      inline def setGetTotalPages(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getTotalPages", value.toJsFn)
      
      inline def setIsVisible(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isVisible", value.toJsFn)
    }
  }
}
