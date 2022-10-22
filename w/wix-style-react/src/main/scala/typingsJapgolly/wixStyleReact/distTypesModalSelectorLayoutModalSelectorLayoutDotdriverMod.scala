package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDotlegacyDotdriverMod.buttonDriverFactory
import typingsJapgolly.wixStyleReact.distTypesCheckboxCheckboxDotdriverMod.CheckboxDriver
import typingsJapgolly.wixStyleReact.distTypesLoaderLoaderDotdriverMod.LoaderDriver
import typingsJapgolly.wixStyleReact.distTypesSearchSearchDotdriverMod.SearchDriver
import typingsJapgolly.wixStyleReact.distTypesSelectorSelectorDotdriverMod.SelectorDriver
import typingsJapgolly.wixStyleReact.distTypesTextTextDotdriverMod.TextDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalSelectorLayoutModalSelectorLayoutDotdriverMod {
  
  trait ModalSelectorLayoutDriver
    extends StObject
       with BaseDriver {
    
    def cancelButtonDriver(): buttonDriverFactory
    
    def clickOnClose(): Unit
    
    def footerSelector(): CheckboxDriver
    
    def getEmptyState(): HTMLElement
    
    def getNoResultsFoundState(): HTMLElement
    
    def getSelectorDriverAt(i: Double): SelectorDriver
    
    def getTitle(): String
    
    def listExists(): Boolean
    
    def mainLoaderDriver(): LoaderDriver
    
    def nextPageLoaderDriver(): LoaderDriver
    
    def numberOfItemsInList(): Double
    
    def okButtonDriver(): buttonDriverFactory
    
    def scrollDown(): Boolean
    
    def searchDriver(): SearchDriver
    
    def showsEmptyState(): Boolean
    
    def showsNoResultsFoundState(): Boolean
    
    def subtitleTextDriver(): TextDriver
  }
  object ModalSelectorLayoutDriver {
    
    inline def apply(
      cancelButtonDriver: CallbackTo[buttonDriverFactory],
      clickOnClose: Callback,
      exists: CallbackTo[Boolean],
      footerSelector: CallbackTo[CheckboxDriver],
      getEmptyState: CallbackTo[HTMLElement],
      getNoResultsFoundState: CallbackTo[HTMLElement],
      getSelectorDriverAt: Double => SelectorDriver,
      getTitle: CallbackTo[String],
      listExists: CallbackTo[Boolean],
      mainLoaderDriver: CallbackTo[LoaderDriver],
      nextPageLoaderDriver: CallbackTo[LoaderDriver],
      numberOfItemsInList: CallbackTo[Double],
      okButtonDriver: CallbackTo[buttonDriverFactory],
      scrollDown: CallbackTo[Boolean],
      searchDriver: CallbackTo[SearchDriver],
      showsEmptyState: CallbackTo[Boolean],
      showsNoResultsFoundState: CallbackTo[Boolean],
      subtitleTextDriver: CallbackTo[TextDriver]
    ): ModalSelectorLayoutDriver = {
      val __obj = js.Dynamic.literal(cancelButtonDriver = cancelButtonDriver.toJsFn, clickOnClose = clickOnClose.toJsFn, exists = exists.toJsFn, footerSelector = footerSelector.toJsFn, getEmptyState = getEmptyState.toJsFn, getNoResultsFoundState = getNoResultsFoundState.toJsFn, getSelectorDriverAt = js.Any.fromFunction1(getSelectorDriverAt), getTitle = getTitle.toJsFn, listExists = listExists.toJsFn, mainLoaderDriver = mainLoaderDriver.toJsFn, nextPageLoaderDriver = nextPageLoaderDriver.toJsFn, numberOfItemsInList = numberOfItemsInList.toJsFn, okButtonDriver = okButtonDriver.toJsFn, scrollDown = scrollDown.toJsFn, searchDriver = searchDriver.toJsFn, showsEmptyState = showsEmptyState.toJsFn, showsNoResultsFoundState = showsNoResultsFoundState.toJsFn, subtitleTextDriver = subtitleTextDriver.toJsFn)
      __obj.asInstanceOf[ModalSelectorLayoutDriver]
    }
    
    extension [Self <: ModalSelectorLayoutDriver](x: Self) {
      
      inline def setCancelButtonDriver(value: CallbackTo[buttonDriverFactory]): Self = StObject.set(x, "cancelButtonDriver", value.toJsFn)
      
      inline def setClickOnClose(value: Callback): Self = StObject.set(x, "clickOnClose", value.toJsFn)
      
      inline def setFooterSelector(value: CallbackTo[CheckboxDriver]): Self = StObject.set(x, "footerSelector", value.toJsFn)
      
      inline def setGetEmptyState(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getEmptyState", value.toJsFn)
      
      inline def setGetNoResultsFoundState(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getNoResultsFoundState", value.toJsFn)
      
      inline def setGetSelectorDriverAt(value: Double => SelectorDriver): Self = StObject.set(x, "getSelectorDriverAt", js.Any.fromFunction1(value))
      
      inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
      
      inline def setListExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "listExists", value.toJsFn)
      
      inline def setMainLoaderDriver(value: CallbackTo[LoaderDriver]): Self = StObject.set(x, "mainLoaderDriver", value.toJsFn)
      
      inline def setNextPageLoaderDriver(value: CallbackTo[LoaderDriver]): Self = StObject.set(x, "nextPageLoaderDriver", value.toJsFn)
      
      inline def setNumberOfItemsInList(value: CallbackTo[Double]): Self = StObject.set(x, "numberOfItemsInList", value.toJsFn)
      
      inline def setOkButtonDriver(value: CallbackTo[buttonDriverFactory]): Self = StObject.set(x, "okButtonDriver", value.toJsFn)
      
      inline def setScrollDown(value: CallbackTo[Boolean]): Self = StObject.set(x, "scrollDown", value.toJsFn)
      
      inline def setSearchDriver(value: CallbackTo[SearchDriver]): Self = StObject.set(x, "searchDriver", value.toJsFn)
      
      inline def setShowsEmptyState(value: CallbackTo[Boolean]): Self = StObject.set(x, "showsEmptyState", value.toJsFn)
      
      inline def setShowsNoResultsFoundState(value: CallbackTo[Boolean]): Self = StObject.set(x, "showsNoResultsFoundState", value.toJsFn)
      
      inline def setSubtitleTextDriver(value: CallbackTo[TextDriver]): Self = StObject.set(x, "subtitleTextDriver", value.toJsFn)
    }
  }
}
