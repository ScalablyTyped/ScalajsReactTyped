package typingsJapgolly.unidriverProtractor

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.builtBrowserMod.ProtractorBrowser
import typingsJapgolly.protractor.builtElementMod.ElementArrayFinder
import typingsJapgolly.protractor.builtElementMod.ElementFinder
import typingsJapgolly.protractor.builtLocatorsMod.Locator
import typingsJapgolly.seleniumWebdriver.libWebdriverMod.ShadowRootPromise
import typingsJapgolly.seleniumWebdriver.mod.ILocation
import typingsJapgolly.seleniumWebdriver.mod.IRectangle
import typingsJapgolly.seleniumWebdriver.mod.ISize
import typingsJapgolly.seleniumWebdriver.mod.IWebElementId
import typingsJapgolly.seleniumWebdriver.mod.WebDriver
import typingsJapgolly.seleniumWebdriver.mod.WebElement
import typingsJapgolly.seleniumWebdriver.mod.WebElementPromise
import typingsJapgolly.unidriverCore.mod.DriverContext
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.unidriverCore.mod.UniDriverList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@unidriver/protractor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def protractorUniDriver(el: ElementGetter): UniDriver[TsSafeElementFinder] = ^.asInstanceOf[js.Dynamic].applyDynamic("protractorUniDriver")(el.asInstanceOf[js.Any]).asInstanceOf[UniDriver[TsSafeElementFinder]]
  inline def protractorUniDriver(el: ElementGetter, context: DriverContext): UniDriver[TsSafeElementFinder] = (^.asInstanceOf[js.Dynamic].applyDynamic("protractorUniDriver")(el.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[UniDriver[TsSafeElementFinder]]
  
  inline def protractorUniDriverList(elems: ElementsGetter): UniDriverList[TsSafeElementFinder] = ^.asInstanceOf[js.Dynamic].applyDynamic("protractorUniDriverList")(elems.asInstanceOf[js.Any]).asInstanceOf[UniDriverList[TsSafeElementFinder]]
  inline def protractorUniDriverList(elems: ElementsGetter, context: DriverContext): UniDriverList[TsSafeElementFinder] = (^.asInstanceOf[js.Dynamic].applyDynamic("protractorUniDriverList")(elems.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[UniDriverList[TsSafeElementFinder]]
  
  type ElementGetter = js.Function0[js.Promise[TsSafeElementFinder | Null]]
  
  type ElementsGetter = js.Function0[js.Promise[js.Array[TsSafeElementFinder]]]
  
  /* Inlined std.Omit<protractor.protractor.ElementFinder, 'then'> */
  trait TsSafeElementFinder extends StObject {
    
    @JSName("$")
    def $(selector: String): ElementFinder
    @JSName("$")
    var $_Original: js.Function1[/* selector */ String, ElementFinder]
    
    @JSName("$$")
    def DollarDollar(selector: String): ElementArrayFinder
    @JSName("$$")
    var DollarDollar_Original: js.Function1[/* selector */ String, ElementArrayFinder]
    
    def all(subLocator: Locator): ElementArrayFinder
    @JSName("all")
    var all_Original: js.Function1[/* subLocator */ Locator, ElementArrayFinder]
    
    def allowAnimations(value: Boolean): ElementFinder
    @JSName("allowAnimations")
    var allowAnimations_Original: js.Function1[/* value */ Boolean, ElementFinder]
    
    var browser_ : ProtractorBrowser
    
    var buildId: js.UndefOr[Any] = js.undefined
    
    def clear(): js.Promise[Unit]
    @JSName("clear")
    var clear_Original: js.Function0[js.Promise[Unit]]
    
    def click(): js.Promise[Unit]
    @JSName("click")
    var click_Original: js.Function0[js.Promise[Unit]]
    
    @JSName("clone")
    var clone_Original: js.Function0[ElementFinder]
    
    @JSName("constructor")
    var constructor_Original: js.Function2[/* browser_ */ ProtractorBrowser, /* elementArrayFinder */ ElementArrayFinder, Any]
    
    def element(subLocator: Locator): ElementFinder
    
    var elementArrayFinder_ : ElementArrayFinder
    
    @JSName("element")
    var element_Original: js.Function1[/* subLocator */ Locator, ElementFinder]
    
    def equals(element: ElementFinder): js.Promise[Any]
    @JSName("equals")
    var equals_Original: js.Function1[/* element */ ElementFinder, js.Promise[Any]]
    
    def evaluate(expression: String): ElementFinder
    @JSName("evaluate")
    var evaluate_Original: js.Function1[/* expression */ String, ElementFinder]
    
    var extractId: js.UndefOr[Any] = js.undefined
    
    def findElement(locator: typingsJapgolly.seleniumWebdriver.mod.Locator): WebElementPromise
    @JSName("findElement")
    var findElement_Original: js.Function1[/* locator */ typingsJapgolly.seleniumWebdriver.mod.Locator, WebElementPromise]
    
    def findElements(locator: typingsJapgolly.seleniumWebdriver.mod.Locator): js.Promise[js.Array[WebElement]]
    @JSName("findElements")
    var findElements_Original: js.Function1[
        /* locator */ typingsJapgolly.seleniumWebdriver.mod.Locator, 
        js.Promise[js.Array[WebElement]]
      ]
    
    var fromWebElement_ : js.UndefOr[Any] = js.undefined
    
    def getAttribute(attributeName: String): js.Promise[String]
    @JSName("getAttribute")
    var getAttribute_Original: js.Function1[/* attributeName */ String, js.Promise[String]]
    
    def getCssValue(cssStyleProperty: String): js.Promise[String]
    @JSName("getCssValue")
    var getCssValue_Original: js.Function1[/* cssStyleProperty */ String, js.Promise[String]]
    
    def getDriver(): WebDriver
    @JSName("getDriver")
    var getDriver_Original: js.Function0[WebDriver]
    
    def getId(): js.Promise[String]
    @JSName("getId")
    var getId_Original: js.Function0[js.Promise[String]]
    
    def getLocation(): js.Promise[ILocation]
    @JSName("getLocation")
    var getLocation_Original: js.Function0[js.Promise[ILocation]]
    
    def getRect(): js.Promise[IRectangle]
    @JSName("getRect")
    var getRect_Original: js.Function0[js.Promise[IRectangle]]
    
    def getShadowRoot(): ShadowRootPromise
    @JSName("getShadowRoot")
    var getShadowRoot_Original: js.Function0[ShadowRootPromise]
    
    def getSize(): js.Promise[ISize]
    @JSName("getSize")
    var getSize_Original: js.Function0[js.Promise[ISize]]
    
    def getTagName(): js.Promise[String]
    @JSName("getTagName")
    var getTagName_Original: js.Function0[js.Promise[String]]
    
    def getText(): js.Promise[String]
    @JSName("getText")
    var getText_Original: js.Function0[js.Promise[String]]
    
    def getWebElement(): WebElementPromise
    @JSName("getWebElement")
    var getWebElement_Original: js.Function0[WebElementPromise]
    
    def isDisplayed(): js.Promise[Boolean]
    @JSName("isDisplayed")
    var isDisplayed_Original: js.Function0[js.Promise[Boolean]]
    
    def isElementPresent(subLocator: Locator): js.Promise[Boolean]
    @JSName("isElementPresent")
    var isElementPresent_Original: js.Function1[/* subLocator */ Locator, js.Promise[Boolean]]
    
    def isEnabled(): js.Promise[Boolean]
    @JSName("isEnabled")
    var isEnabled_Original: js.Function0[js.Promise[Boolean]]
    
    var isId: js.UndefOr[Any] = js.undefined
    
    def isPresent(): js.Promise[Boolean]
    @JSName("isPresent")
    var isPresent_Original: js.Function0[js.Promise[Boolean]]
    
    def isSelected(): js.Promise[Boolean]
    @JSName("isSelected")
    var isSelected_Original: js.Function0[js.Promise[Boolean]]
    
    def locator(): Any
    @JSName("locator")
    var locator_Original: js.Function0[Any]
    
    var parentElementArrayFinder: ElementArrayFinder
    
    def sendKeys(var_args: (String | Double | (js.Promise[String | Double]))*): js.Promise[Unit]
    @JSName("sendKeys")
    var sendKeys_Original: js.Function1[/* repeated */ String | Double | (js.Promise[String | Double]), js.Promise[Unit]]
    
    def serialize(): js.Promise[IWebElementId]
    @JSName("serialize")
    var serialize_Original: js.Function0[js.Promise[IWebElementId]]
    
    def submit(): js.Promise[Unit]
    @JSName("submit")
    var submit_Original: js.Function0[js.Promise[Unit]]
    
    def takeScreenshot(): js.Promise[String]
    @JSName("takeScreenshot")
    var takeScreenshot_Original: js.Function0[js.Promise[String]]
  }
  object TsSafeElementFinder {
    
    inline def apply(
      $: /* selector */ String => ElementFinder,
      DollarDollar: /* selector */ String => ElementArrayFinder,
      all: /* subLocator */ Locator => ElementArrayFinder,
      allowAnimations: /* value */ Boolean => ElementFinder,
      browser_ : ProtractorBrowser,
      clear: CallbackTo[js.Promise[Unit]],
      click: CallbackTo[js.Promise[Unit]],
      clone_ : CallbackTo[ElementFinder],
      constructor: (/* browser_ */ ProtractorBrowser, /* elementArrayFinder */ ElementArrayFinder) => Any,
      element: /* subLocator */ Locator => ElementFinder,
      elementArrayFinder_ : ElementArrayFinder,
      equals_ : /* element */ ElementFinder => js.Promise[Any],
      evaluate: /* expression */ String => ElementFinder,
      findElement: /* locator */ typingsJapgolly.seleniumWebdriver.mod.Locator => WebElementPromise,
      findElements: /* locator */ typingsJapgolly.seleniumWebdriver.mod.Locator => js.Promise[js.Array[WebElement]],
      getAttribute: /* attributeName */ String => js.Promise[String],
      getCssValue: /* cssStyleProperty */ String => js.Promise[String],
      getDriver: CallbackTo[WebDriver],
      getId: CallbackTo[js.Promise[String]],
      getLocation: CallbackTo[js.Promise[ILocation]],
      getRect: CallbackTo[js.Promise[IRectangle]],
      getShadowRoot: CallbackTo[ShadowRootPromise],
      getSize: CallbackTo[js.Promise[ISize]],
      getTagName: CallbackTo[js.Promise[String]],
      getText: CallbackTo[js.Promise[String]],
      getWebElement: CallbackTo[WebElementPromise],
      isDisplayed: CallbackTo[js.Promise[Boolean]],
      isElementPresent: /* subLocator */ Locator => js.Promise[Boolean],
      isEnabled: CallbackTo[js.Promise[Boolean]],
      isPresent: CallbackTo[js.Promise[Boolean]],
      isSelected: CallbackTo[js.Promise[Boolean]],
      locator: CallbackTo[Any],
      parentElementArrayFinder: ElementArrayFinder,
      sendKeys: /* repeated */ String | Double | (js.Promise[String | Double]) => js.Promise[Unit],
      serialize: CallbackTo[js.Promise[IWebElementId]],
      submit: CallbackTo[js.Promise[Unit]],
      takeScreenshot: CallbackTo[js.Promise[String]]
    ): TsSafeElementFinder = {
      val __obj = js.Dynamic.literal($ = js.Any.fromFunction1($), all = js.Any.fromFunction1(all), allowAnimations = js.Any.fromFunction1(allowAnimations), browser_ = browser_.asInstanceOf[js.Any], clear = clear.toJsFn, click = click.toJsFn, constructor = js.Any.fromFunction2(constructor), element = js.Any.fromFunction1(element), elementArrayFinder_ = elementArrayFinder_.asInstanceOf[js.Any], evaluate = js.Any.fromFunction1(evaluate), findElement = js.Any.fromFunction1(findElement), findElements = js.Any.fromFunction1(findElements), getAttribute = js.Any.fromFunction1(getAttribute), getCssValue = js.Any.fromFunction1(getCssValue), getDriver = getDriver.toJsFn, getId = getId.toJsFn, getLocation = getLocation.toJsFn, getRect = getRect.toJsFn, getShadowRoot = getShadowRoot.toJsFn, getSize = getSize.toJsFn, getTagName = getTagName.toJsFn, getText = getText.toJsFn, getWebElement = getWebElement.toJsFn, isDisplayed = isDisplayed.toJsFn, isElementPresent = js.Any.fromFunction1(isElementPresent), isEnabled = isEnabled.toJsFn, isPresent = isPresent.toJsFn, isSelected = isSelected.toJsFn, locator = locator.toJsFn, parentElementArrayFinder = parentElementArrayFinder.asInstanceOf[js.Any], sendKeys = js.Any.fromFunction1(sendKeys), serialize = serialize.toJsFn, submit = submit.toJsFn, takeScreenshot = takeScreenshot.toJsFn)
      __obj.updateDynamic("$$")(js.Any.fromFunction1(DollarDollar))
      __obj.updateDynamic("clone")(clone_.toJsFn)
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[TsSafeElementFinder]
    }
    
    extension [Self <: TsSafeElementFinder](x: Self) {
      
      inline def set$(value: /* selector */ String => ElementFinder): Self = StObject.set(x, "$", js.Any.fromFunction1(value))
      
      inline def setAll(value: /* subLocator */ Locator => ElementArrayFinder): Self = StObject.set(x, "all", js.Any.fromFunction1(value))
      
      inline def setAllowAnimations(value: /* value */ Boolean => ElementFinder): Self = StObject.set(x, "allowAnimations", js.Any.fromFunction1(value))
      
      inline def setBrowser_(value: ProtractorBrowser): Self = StObject.set(x, "browser_", value.asInstanceOf[js.Any])
      
      inline def setBuildId(value: Any): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
      
      inline def setClear(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setClone_(value: CallbackTo[ElementFinder]): Self = StObject.set(x, "clone", value.toJsFn)
      
      inline def setConstructor(value: (/* browser_ */ ProtractorBrowser, /* elementArrayFinder */ ElementArrayFinder) => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction2(value))
      
      inline def setDollarDollar(value: /* selector */ String => ElementArrayFinder): Self = StObject.set(x, "$$", js.Any.fromFunction1(value))
      
      inline def setElement(value: /* subLocator */ Locator => ElementFinder): Self = StObject.set(x, "element", js.Any.fromFunction1(value))
      
      inline def setElementArrayFinder_(value: ElementArrayFinder): Self = StObject.set(x, "elementArrayFinder_", value.asInstanceOf[js.Any])
      
      inline def setEquals_(value: /* element */ ElementFinder => js.Promise[Any]): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setEvaluate(value: /* expression */ String => ElementFinder): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
      
      inline def setExtractId(value: Any): Self = StObject.set(x, "extractId", value.asInstanceOf[js.Any])
      
      inline def setExtractIdUndefined: Self = StObject.set(x, "extractId", js.undefined)
      
      inline def setFindElement(value: /* locator */ typingsJapgolly.seleniumWebdriver.mod.Locator => WebElementPromise): Self = StObject.set(x, "findElement", js.Any.fromFunction1(value))
      
      inline def setFindElements(
        value: /* locator */ typingsJapgolly.seleniumWebdriver.mod.Locator => js.Promise[js.Array[WebElement]]
      ): Self = StObject.set(x, "findElements", js.Any.fromFunction1(value))
      
      inline def setFromWebElement_(value: Any): Self = StObject.set(x, "fromWebElement_", value.asInstanceOf[js.Any])
      
      inline def setFromWebElement_Undefined: Self = StObject.set(x, "fromWebElement_", js.undefined)
      
      inline def setGetAttribute(value: /* attributeName */ String => js.Promise[String]): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetCssValue(value: /* cssStyleProperty */ String => js.Promise[String]): Self = StObject.set(x, "getCssValue", js.Any.fromFunction1(value))
      
      inline def setGetDriver(value: CallbackTo[WebDriver]): Self = StObject.set(x, "getDriver", value.toJsFn)
      
      inline def setGetId(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getId", value.toJsFn)
      
      inline def setGetLocation(value: CallbackTo[js.Promise[ILocation]]): Self = StObject.set(x, "getLocation", value.toJsFn)
      
      inline def setGetRect(value: CallbackTo[js.Promise[IRectangle]]): Self = StObject.set(x, "getRect", value.toJsFn)
      
      inline def setGetShadowRoot(value: CallbackTo[ShadowRootPromise]): Self = StObject.set(x, "getShadowRoot", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[js.Promise[ISize]]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetTagName(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTagName", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setGetWebElement(value: CallbackTo[WebElementPromise]): Self = StObject.set(x, "getWebElement", value.toJsFn)
      
      inline def setIsDisplayed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisplayed", value.toJsFn)
      
      inline def setIsElementPresent(value: /* subLocator */ Locator => js.Promise[Boolean]): Self = StObject.set(x, "isElementPresent", js.Any.fromFunction1(value))
      
      inline def setIsEnabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isEnabled", value.toJsFn)
      
      inline def setIsId(value: Any): Self = StObject.set(x, "isId", value.asInstanceOf[js.Any])
      
      inline def setIsIdUndefined: Self = StObject.set(x, "isId", js.undefined)
      
      inline def setIsPresent(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPresent", value.toJsFn)
      
      inline def setIsSelected(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSelected", value.toJsFn)
      
      inline def setLocator(value: CallbackTo[Any]): Self = StObject.set(x, "locator", value.toJsFn)
      
      inline def setParentElementArrayFinder(value: ElementArrayFinder): Self = StObject.set(x, "parentElementArrayFinder", value.asInstanceOf[js.Any])
      
      inline def setSendKeys(value: /* repeated */ String | Double | (js.Promise[String | Double]) => js.Promise[Unit]): Self = StObject.set(x, "sendKeys", js.Any.fromFunction1(value))
      
      inline def setSerialize(value: CallbackTo[js.Promise[IWebElementId]]): Self = StObject.set(x, "serialize", value.toJsFn)
      
      inline def setSubmit(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "submit", value.toJsFn)
      
      inline def setTakeScreenshot(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "takeScreenshot", value.toJsFn)
    }
  }
}
