package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.anon.Height
import typingsJapgolly.wixUiCore.anon.X
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsPaginationPaginationDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/pagination/Pagination.protractor.driver", "paginationDriverFactory")
  @js.native
  val paginationDriverFactory: DriverFactory[PaginationDriver] = js.native
  
  trait PaginationDriver
    extends StObject
       with BaseDriver {
    
    /** Returns x & y coordinates for the element found with data-hook */
    def getElementLocation(dataHook: String): js.Promise[X]
    
    /** Returns width & height for the element found with data-hook */
    def getElementSize(dataHook: String): js.Promise[Height]
    
    /** Get the text content of pages shown in "pages" mode  */
    def getPageList(): js.Promise[js.Array[String]]
  }
  object PaginationDriver {
    
    inline def apply(
      element: CallbackTo[ElementFinder],
      getElementLocation: String => js.Promise[X],
      getElementSize: String => js.Promise[Height],
      getPageList: CallbackTo[js.Promise[js.Array[String]]]
    ): PaginationDriver = {
      val __obj = js.Dynamic.literal(element = element.toJsFn, getElementLocation = js.Any.fromFunction1(getElementLocation), getElementSize = js.Any.fromFunction1(getElementSize), getPageList = getPageList.toJsFn)
      __obj.asInstanceOf[PaginationDriver]
    }
    
    extension [Self <: PaginationDriver](x: Self) {
      
      inline def setGetElementLocation(value: String => js.Promise[X]): Self = StObject.set(x, "getElementLocation", js.Any.fromFunction1(value))
      
      inline def setGetElementSize(value: String => js.Promise[Height]): Self = StObject.set(x, "getElementSize", js.Any.fromFunction1(value))
      
      inline def setGetPageList(value: CallbackTo[js.Promise[js.Array[String]]]): Self = StObject.set(x, "getPageList", value.toJsFn)
    }
  }
}
