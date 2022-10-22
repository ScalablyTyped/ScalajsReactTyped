package typingsJapgolly.wixWixUiIconsCommon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStoriesComponentsCategoryListCategoryListDotdriverMod {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/category-list/CategoryList.driver", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CategoryListDriver {
    def this(baseElement: Element) = this()
    
    /* CompleteClass */
    var baseElement: Element = js.native
    
    /* CompleteClass */
    override def getAmountOfCategoryRows(): Double = js.native
    
    /* CompleteClass */
    override def getAmountOfCategoryTitles(): Double = js.native
    
    /* CompleteClass */
    override def getRowText(index: Double): String | Null = js.native
    
    /* CompleteClass */
    override def search(query: String): Unit = js.native
  }
  
  trait CategoryListDriver extends StObject {
    
    var baseElement: Element
    
    def getAmountOfCategoryRows(): Double
    
    def getAmountOfCategoryTitles(): Double
    
    def getRowText(index: Double): String | Null
    
    def search(query: String): Unit
  }
  object CategoryListDriver {
    
    inline def apply(
      baseElement: Element,
      getAmountOfCategoryRows: CallbackTo[Double],
      getAmountOfCategoryTitles: CallbackTo[Double],
      getRowText: Double => String | Null,
      search: String => Callback
    ): CategoryListDriver = {
      val __obj = js.Dynamic.literal(baseElement = baseElement.asInstanceOf[js.Any], getAmountOfCategoryRows = getAmountOfCategoryRows.toJsFn, getAmountOfCategoryTitles = getAmountOfCategoryTitles.toJsFn, getRowText = js.Any.fromFunction1(getRowText), search = js.Any.fromFunction1((t0: String) => search(t0).runNow()))
      __obj.asInstanceOf[CategoryListDriver]
    }
    
    extension [Self <: CategoryListDriver](x: Self) {
      
      inline def setBaseElement(value: Element): Self = StObject.set(x, "baseElement", value.asInstanceOf[js.Any])
      
      inline def setGetAmountOfCategoryRows(value: CallbackTo[Double]): Self = StObject.set(x, "getAmountOfCategoryRows", value.toJsFn)
      
      inline def setGetAmountOfCategoryTitles(value: CallbackTo[Double]): Self = StObject.set(x, "getAmountOfCategoryTitles", value.toJsFn)
      
      inline def setGetRowText(value: Double => String | Null): Self = StObject.set(x, "getRowText", js.Any.fromFunction1(value))
      
      inline def setSearch(value: String => Callback): Self = StObject.set(x, "search", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
