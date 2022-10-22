package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDotuniDotdriverMod.ButtonUniDriver
import typingsJapgolly.wixStyleReact.distTypesCheckboxCheckboxDotuniDotdriverMod.CheckboxUniDriver
import typingsJapgolly.wixStyleReact.distTypesLoaderLoaderDotuniDotdriverMod.LoaderUniDriver
import typingsJapgolly.wixStyleReact.distTypesSearchSearchDotuniDotdriverMod.SearchUniDriver
import typingsJapgolly.wixStyleReact.distTypesSelectorSelectorDotuniDotdriverMod.SelectorUniDriver
import typingsJapgolly.wixStyleReact.distTypesTextTextDotuniDotdriverMod.TextUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalSelectorLayoutModalSelectorLayoutDotuniDotdriverMod {
  
  trait ModalSelectorLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def cancelButtonDriver(): ButtonUniDriver
    
    def clickOnClose(): js.Promise[Unit]
    
    def footerSelector(): CheckboxUniDriver
    
    def getEmptyState(): js.Promise[HTMLElement]
    
    def getNoResultsFoundState(): js.Promise[HTMLElement]
    
    def getSelectorDriverAt(i: Double): SelectorUniDriver
    
    def getTitle(): js.Promise[String]
    
    def listExists(): js.Promise[Boolean]
    
    def mainLoaderDriver(): LoaderUniDriver
    
    def nextPageLoaderDriver(): LoaderUniDriver
    
    def numberOfItemsInList(): js.Promise[Double]
    
    def okButtonDriver(): ButtonUniDriver
    
    def scrollDown(): js.Promise[Boolean]
    
    def searchDriver(): SearchUniDriver
    
    def showsEmptyState(): js.Promise[Boolean]
    
    def showsNoResultsFoundState(): js.Promise[Boolean]
    
    def subtitleTextDriver(): TextUniDriver
  }
  object ModalSelectorLayoutUniDriver {
    
    inline def apply(
      cancelButtonDriver: CallbackTo[ButtonUniDriver],
      click: CallbackTo[js.Promise[Unit]],
      clickOnClose: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      footerSelector: CallbackTo[CheckboxUniDriver],
      getEmptyState: CallbackTo[js.Promise[HTMLElement]],
      getNoResultsFoundState: CallbackTo[js.Promise[HTMLElement]],
      getSelectorDriverAt: Double => SelectorUniDriver,
      getTitle: CallbackTo[js.Promise[String]],
      listExists: CallbackTo[js.Promise[Boolean]],
      mainLoaderDriver: CallbackTo[LoaderUniDriver],
      nextPageLoaderDriver: CallbackTo[LoaderUniDriver],
      numberOfItemsInList: CallbackTo[js.Promise[Double]],
      okButtonDriver: CallbackTo[ButtonUniDriver],
      scrollDown: CallbackTo[js.Promise[Boolean]],
      searchDriver: CallbackTo[SearchUniDriver],
      showsEmptyState: CallbackTo[js.Promise[Boolean]],
      showsNoResultsFoundState: CallbackTo[js.Promise[Boolean]],
      subtitleTextDriver: CallbackTo[TextUniDriver]
    ): ModalSelectorLayoutUniDriver = {
      val __obj = js.Dynamic.literal(cancelButtonDriver = cancelButtonDriver.toJsFn, click = click.toJsFn, clickOnClose = clickOnClose.toJsFn, element = element.toJsFn, exists = exists.toJsFn, footerSelector = footerSelector.toJsFn, getEmptyState = getEmptyState.toJsFn, getNoResultsFoundState = getNoResultsFoundState.toJsFn, getSelectorDriverAt = js.Any.fromFunction1(getSelectorDriverAt), getTitle = getTitle.toJsFn, listExists = listExists.toJsFn, mainLoaderDriver = mainLoaderDriver.toJsFn, nextPageLoaderDriver = nextPageLoaderDriver.toJsFn, numberOfItemsInList = numberOfItemsInList.toJsFn, okButtonDriver = okButtonDriver.toJsFn, scrollDown = scrollDown.toJsFn, searchDriver = searchDriver.toJsFn, showsEmptyState = showsEmptyState.toJsFn, showsNoResultsFoundState = showsNoResultsFoundState.toJsFn, subtitleTextDriver = subtitleTextDriver.toJsFn)
      __obj.asInstanceOf[ModalSelectorLayoutUniDriver]
    }
    
    extension [Self <: ModalSelectorLayoutUniDriver](x: Self) {
      
      inline def setCancelButtonDriver(value: CallbackTo[ButtonUniDriver]): Self = StObject.set(x, "cancelButtonDriver", value.toJsFn)
      
      inline def setClickOnClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnClose", value.toJsFn)
      
      inline def setFooterSelector(value: CallbackTo[CheckboxUniDriver]): Self = StObject.set(x, "footerSelector", value.toJsFn)
      
      inline def setGetEmptyState(value: CallbackTo[js.Promise[HTMLElement]]): Self = StObject.set(x, "getEmptyState", value.toJsFn)
      
      inline def setGetNoResultsFoundState(value: CallbackTo[js.Promise[HTMLElement]]): Self = StObject.set(x, "getNoResultsFoundState", value.toJsFn)
      
      inline def setGetSelectorDriverAt(value: Double => SelectorUniDriver): Self = StObject.set(x, "getSelectorDriverAt", js.Any.fromFunction1(value))
      
      inline def setGetTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
      
      inline def setListExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "listExists", value.toJsFn)
      
      inline def setMainLoaderDriver(value: CallbackTo[LoaderUniDriver]): Self = StObject.set(x, "mainLoaderDriver", value.toJsFn)
      
      inline def setNextPageLoaderDriver(value: CallbackTo[LoaderUniDriver]): Self = StObject.set(x, "nextPageLoaderDriver", value.toJsFn)
      
      inline def setNumberOfItemsInList(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "numberOfItemsInList", value.toJsFn)
      
      inline def setOkButtonDriver(value: CallbackTo[ButtonUniDriver]): Self = StObject.set(x, "okButtonDriver", value.toJsFn)
      
      inline def setScrollDown(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "scrollDown", value.toJsFn)
      
      inline def setSearchDriver(value: CallbackTo[SearchUniDriver]): Self = StObject.set(x, "searchDriver", value.toJsFn)
      
      inline def setShowsEmptyState(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "showsEmptyState", value.toJsFn)
      
      inline def setShowsNoResultsFoundState(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "showsNoResultsFoundState", value.toJsFn)
      
      inline def setSubtitleTextDriver(value: CallbackTo[TextUniDriver]): Self = StObject.set(x, "subtitleTextDriver", value.toJsFn)
    }
  }
}
