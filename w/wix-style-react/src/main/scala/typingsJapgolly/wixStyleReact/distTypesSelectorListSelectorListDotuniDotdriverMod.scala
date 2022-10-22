package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcUniDriverFactoryCreateUniDriverFactoryMod.UniDriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorListSelectorListDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/SelectorList/SelectorList.uni.driver", "selectorListUniDriverFactory")
  @js.native
  val selectorListUniDriverFactory: UniDriverFactory[SelectorListUniDriver] = js.native
  
  trait SelectorListUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickSearchInputClear(): js.Promise[Unit]
    
    def clickToggleAllCheckbox(): js.Promise[Unit]
    
    def enterSearchValue(value: String): js.Promise[Unit]
    
    def focusSearchInput(): js.Promise[Unit]
    
    def getEmptyState(): js.Promise[HTMLElement]
    
    def getNoResultsFoundState(): js.Promise[HTMLElement]
    
    def getSearchValue(): js.Promise[String]
    
    def getToggleAllCheckboxLabel(): js.Promise[String]
    
    def isSelectorCheckedAt(i: Double): js.Promise[Boolean]
    
    def isSelectorDisabledAt(i: Double): js.Promise[Boolean]
    
    def isSelectorIsIndeterminateAt(i: Double): js.Promise[Boolean]
    
    def isToggleAllCheckboxChecked(): js.Promise[Boolean]
    
    def listExists(): js.Promise[Boolean]
    
    def mainLoaderExists(): js.Promise[Boolean]
    
    def nextPageLoaderExists(): js.Promise[Boolean]
    
    def numberOfItemsInList(): js.Promise[Double]
    
    def scrollDown(): js.Promise[Boolean]
    
    def searchInputExists(): js.Promise[Boolean]
    
    def showsEmptyState(): js.Promise[Boolean]
    
    def showsNoResultsFoundState(): js.Promise[Boolean]
    
    def toggleAllCheckboxExists(): js.Promise[Boolean]
    
    def toggleSelectorAt(i: Double): js.Promise[Unit]
  }
  object SelectorListUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickSearchInputClear: CallbackTo[js.Promise[Unit]],
      clickToggleAllCheckbox: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      enterSearchValue: String => js.Promise[Unit],
      exists: CallbackTo[js.Promise[Boolean]],
      focusSearchInput: CallbackTo[js.Promise[Unit]],
      getEmptyState: CallbackTo[js.Promise[HTMLElement]],
      getNoResultsFoundState: CallbackTo[js.Promise[HTMLElement]],
      getSearchValue: CallbackTo[js.Promise[String]],
      getToggleAllCheckboxLabel: CallbackTo[js.Promise[String]],
      isSelectorCheckedAt: Double => js.Promise[Boolean],
      isSelectorDisabledAt: Double => js.Promise[Boolean],
      isSelectorIsIndeterminateAt: Double => js.Promise[Boolean],
      isToggleAllCheckboxChecked: CallbackTo[js.Promise[Boolean]],
      listExists: CallbackTo[js.Promise[Boolean]],
      mainLoaderExists: CallbackTo[js.Promise[Boolean]],
      nextPageLoaderExists: CallbackTo[js.Promise[Boolean]],
      numberOfItemsInList: CallbackTo[js.Promise[Double]],
      scrollDown: CallbackTo[js.Promise[Boolean]],
      searchInputExists: CallbackTo[js.Promise[Boolean]],
      showsEmptyState: CallbackTo[js.Promise[Boolean]],
      showsNoResultsFoundState: CallbackTo[js.Promise[Boolean]],
      toggleAllCheckboxExists: CallbackTo[js.Promise[Boolean]],
      toggleSelectorAt: Double => js.Promise[Unit]
    ): SelectorListUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickSearchInputClear = clickSearchInputClear.toJsFn, clickToggleAllCheckbox = clickToggleAllCheckbox.toJsFn, element = element.toJsFn, enterSearchValue = js.Any.fromFunction1(enterSearchValue), exists = exists.toJsFn, focusSearchInput = focusSearchInput.toJsFn, getEmptyState = getEmptyState.toJsFn, getNoResultsFoundState = getNoResultsFoundState.toJsFn, getSearchValue = getSearchValue.toJsFn, getToggleAllCheckboxLabel = getToggleAllCheckboxLabel.toJsFn, isSelectorCheckedAt = js.Any.fromFunction1(isSelectorCheckedAt), isSelectorDisabledAt = js.Any.fromFunction1(isSelectorDisabledAt), isSelectorIsIndeterminateAt = js.Any.fromFunction1(isSelectorIsIndeterminateAt), isToggleAllCheckboxChecked = isToggleAllCheckboxChecked.toJsFn, listExists = listExists.toJsFn, mainLoaderExists = mainLoaderExists.toJsFn, nextPageLoaderExists = nextPageLoaderExists.toJsFn, numberOfItemsInList = numberOfItemsInList.toJsFn, scrollDown = scrollDown.toJsFn, searchInputExists = searchInputExists.toJsFn, showsEmptyState = showsEmptyState.toJsFn, showsNoResultsFoundState = showsNoResultsFoundState.toJsFn, toggleAllCheckboxExists = toggleAllCheckboxExists.toJsFn, toggleSelectorAt = js.Any.fromFunction1(toggleSelectorAt))
      __obj.asInstanceOf[SelectorListUniDriver]
    }
    
    extension [Self <: SelectorListUniDriver](x: Self) {
      
      inline def setClickSearchInputClear(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickSearchInputClear", value.toJsFn)
      
      inline def setClickToggleAllCheckbox(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickToggleAllCheckbox", value.toJsFn)
      
      inline def setEnterSearchValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterSearchValue", js.Any.fromFunction1(value))
      
      inline def setFocusSearchInput(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "focusSearchInput", value.toJsFn)
      
      inline def setGetEmptyState(value: CallbackTo[js.Promise[HTMLElement]]): Self = StObject.set(x, "getEmptyState", value.toJsFn)
      
      inline def setGetNoResultsFoundState(value: CallbackTo[js.Promise[HTMLElement]]): Self = StObject.set(x, "getNoResultsFoundState", value.toJsFn)
      
      inline def setGetSearchValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSearchValue", value.toJsFn)
      
      inline def setGetToggleAllCheckboxLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getToggleAllCheckboxLabel", value.toJsFn)
      
      inline def setIsSelectorCheckedAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isSelectorCheckedAt", js.Any.fromFunction1(value))
      
      inline def setIsSelectorDisabledAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isSelectorDisabledAt", js.Any.fromFunction1(value))
      
      inline def setIsSelectorIsIndeterminateAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isSelectorIsIndeterminateAt", js.Any.fromFunction1(value))
      
      inline def setIsToggleAllCheckboxChecked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isToggleAllCheckboxChecked", value.toJsFn)
      
      inline def setListExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "listExists", value.toJsFn)
      
      inline def setMainLoaderExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "mainLoaderExists", value.toJsFn)
      
      inline def setNextPageLoaderExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "nextPageLoaderExists", value.toJsFn)
      
      inline def setNumberOfItemsInList(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "numberOfItemsInList", value.toJsFn)
      
      inline def setScrollDown(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "scrollDown", value.toJsFn)
      
      inline def setSearchInputExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "searchInputExists", value.toJsFn)
      
      inline def setShowsEmptyState(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "showsEmptyState", value.toJsFn)
      
      inline def setShowsNoResultsFoundState(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "showsNoResultsFoundState", value.toJsFn)
      
      inline def setToggleAllCheckboxExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "toggleAllCheckboxExists", value.toJsFn)
      
      inline def setToggleSelectorAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "toggleSelectorAt", js.Any.fromFunction1(value))
    }
  }
}
