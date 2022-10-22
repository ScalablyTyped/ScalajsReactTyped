package typingsJapgolly.expectPuppeteer

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.expectPuppeteer.expectPuppeteerStrings.css
import typingsJapgolly.expectPuppeteer.expectPuppeteerStrings.left
import typingsJapgolly.expectPuppeteer.expectPuppeteerStrings.middle
import typingsJapgolly.expectPuppeteer.expectPuppeteerStrings.right
import typingsJapgolly.expectPuppeteer.expectPuppeteerStrings.xpath
import typingsJapgolly.puppeteer.mod.Dialog
import typingsJapgolly.puppeteer.mod.ElementHandle
import typingsJapgolly.puppeteer.mod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(instance: ElementHandle[Element]): ExpectPuppeteer = ^.asInstanceOf[js.Dynamic].apply(instance.asInstanceOf[js.Any]).asInstanceOf[ExpectPuppeteer]
  inline def apply(instance: Page): ExpectPuppeteer = ^.asInstanceOf[js.Dynamic].apply(instance.asInstanceOf[js.Any]).asInstanceOf[ExpectPuppeteer]
  
  @JSImport("expect-puppeteer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultOptions(): ExpectDefaultOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ExpectDefaultOptions]
  
  inline def setDefaultOptions(options: ExpectDefaultOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Default options that apply to all expectations and can be set globally
    */
  trait ExpectDefaultOptions extends StObject {
    
    /**
      * An interval at which the pageFunction is executed. Defaults to "raf".
      */
    var polling: js.UndefOr[ExpectPolling] = js.undefined
    
    /**
      * Maximum time to wait for in milliseconds. Defaults to 500.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ExpectDefaultOptions {
    
    inline def apply(): ExpectDefaultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpectDefaultOptions]
    }
    
    extension [Self <: ExpectDefaultOptions](x: Self) {
      
      inline def setPolling(value: ExpectPolling): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
      
      inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /**
    * Interval at which pageFunctions may be executed.
    */
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsJapgolly.expectPuppeteer.expectPuppeteerStrings.mutation
    - typingsJapgolly.expectPuppeteer.expectPuppeteerStrings.raf
  */
  type ExpectPolling = _ExpectPolling | Double
  
  @js.native
  trait ExpectPuppeteer extends StObject {
    
    // These must all match the ExpectPuppeteer interface above.
    // We can't extend from it directly because some method names conflict in type-incompatible ways.
    def toClick(selector: String): js.Promise[Unit] = js.native
    def toClick(selector: String, options: ExpectToClickOptions): js.Promise[Unit] = js.native
    def toClick(selector: MatchSelector): js.Promise[Unit] = js.native
    def toClick(selector: MatchSelector, options: ExpectToClickOptions): js.Promise[Unit] = js.native
    
    def toDisplayDialog(block: js.Function0[js.Promise[Unit]]): js.Promise[Dialog] = js.native
    
    def toFill(selector: String, value: String): js.Promise[Unit] = js.native
    def toFill(selector: String, value: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
    def toFill(selector: MatchSelector, value: String): js.Promise[Unit] = js.native
    def toFill(selector: MatchSelector, value: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
    
    def toMatch(selector: String): js.Promise[Unit] = js.native
    def toMatch(selector: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
    def toMatch(selector: MatchSelector): js.Promise[Unit] = js.native
    def toMatch(selector: MatchSelector, options: ExpectTimingActions): js.Promise[Unit] = js.native
    
    def toMatchElement(selector: String): js.Promise[Unit] = js.native
    def toMatchElement(selector: String, options: ExpectToClickOptions): js.Promise[Unit] = js.native
    def toMatchElement(selector: MatchSelector): js.Promise[Unit] = js.native
    def toMatchElement(selector: MatchSelector, options: ExpectToClickOptions): js.Promise[Unit] = js.native
    
    def toSelect(selector: String, valueOrText: String): js.Promise[Unit] = js.native
    def toSelect(selector: String, valueOrText: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
    def toSelect(selector: MatchSelector, valueOrText: String): js.Promise[Unit] = js.native
    def toSelect(selector: MatchSelector, valueOrText: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
    
    def toUploadFile(selector: String, filePath: String): js.Promise[Unit] = js.native
    def toUploadFile(selector: String, filePath: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
    def toUploadFile(selector: MatchSelector, filePath: String): js.Promise[Unit] = js.native
    def toUploadFile(selector: MatchSelector, filePath: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
  }
  
  /**
    * Configures how to poll for an element.
    */
  trait ExpectTimingActions
    extends StObject
       with ExpectDefaultOptions {
    
    /**
      * delay to pass to the puppeteer element.type API
      */
    var delay: js.UndefOr[Double] = js.undefined
  }
  object ExpectTimingActions {
    
    inline def apply(): ExpectTimingActions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpectTimingActions]
    }
    
    extension [Self <: ExpectTimingActions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  trait ExpectToClickOptions
    extends StObject
       with ExpectTimingActions {
    
    /**
      * Defaults to left.
      */
    var button: js.UndefOr[left | right | middle] = js.undefined
    
    /**
      * defaults to 1. See UIEvent.detail.
      */
    var clickCount: js.UndefOr[Double] = js.undefined
    
    /**
      * A text or a RegExp to match in element textContent.
      */
    var text: js.UndefOr[String | js.RegExp] = js.undefined
    
    /**
      * wait for element to be present in DOM and to be visible, i.e. to not have display: none or visibility: hidden CSS properties. Defaults to false.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ExpectToClickOptions {
    
    inline def apply(): ExpectToClickOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpectToClickOptions]
    }
    
    extension [Self <: ExpectToClickOptions](x: Self) {
      
      inline def setButton(value: left | right | middle): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
      
      inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
      
      inline def setText(value: String | js.RegExp): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait MatchSelector extends StObject {
    
    /**
      * A selector type
      */
    var `type`: css | xpath
    
    /**
      * The selector string
      */
    var value: String
  }
  object MatchSelector {
    
    inline def apply(`type`: css | xpath, value: String): MatchSelector = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchSelector]
    }
    
    extension [Self <: MatchSelector](x: Self) {
      
      inline def setType(value: css | xpath): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ExpectPolling extends StObject
  
  object global {
    
    object jest {
      
      @js.native
      trait Matchers[R, T] extends StObject {
        
        // These must all match the ExpectPuppeteer interface above.
        // We can't extend from it directly because some method names conflict in type-incompatible ways.
        def toClick(selector: String): js.Promise[Unit] = js.native
        def toClick(selector: String, options: ExpectToClickOptions): js.Promise[Unit] = js.native
        def toClick(selector: MatchSelector): js.Promise[Unit] = js.native
        def toClick(selector: MatchSelector, options: ExpectToClickOptions): js.Promise[Unit] = js.native
        
        def toDisplayDialog(block: js.Function0[js.Promise[Unit]]): js.Promise[Dialog] = js.native
        
        def toFill(selector: String, value: String): js.Promise[Unit] = js.native
        def toFill(selector: String, value: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
        def toFill(selector: MatchSelector, value: String): js.Promise[Unit] = js.native
        def toFill(selector: MatchSelector, value: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
        
        def toFillForm(selector: String, value: StringDictionary[Any]): js.Promise[Unit] = js.native
        def toFillForm(selector: String, value: StringDictionary[Any], options: ExpectTimingActions): js.Promise[Unit] = js.native
        def toFillForm(selector: MatchSelector, value: StringDictionary[Any]): js.Promise[Unit] = js.native
        def toFillForm(selector: MatchSelector, value: StringDictionary[Any], options: ExpectTimingActions): js.Promise[Unit] = js.native
        
        def toMatch(matcher: String): js.Promise[Unit] = js.native
        def toMatch(matcher: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
        def toMatch(matcher: js.RegExp): js.Promise[Unit] = js.native
        def toMatch(matcher: js.RegExp, options: ExpectTimingActions): js.Promise[Unit] = js.native
        
        def toMatchElement(selector: String): js.Promise[ElementHandle[Element]] = js.native
        def toMatchElement(selector: String, options: ExpectToClickOptions): js.Promise[ElementHandle[Element]] = js.native
        def toMatchElement(selector: MatchSelector): js.Promise[ElementHandle[Element]] = js.native
        def toMatchElement(selector: MatchSelector, options: ExpectToClickOptions): js.Promise[ElementHandle[Element]] = js.native
        
        def toSelect(selector: String, valueOrText: String): js.Promise[Unit] = js.native
        def toSelect(selector: String, valueOrText: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
        def toSelect(selector: MatchSelector, valueOrText: String): js.Promise[Unit] = js.native
        def toSelect(selector: MatchSelector, valueOrText: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
        
        def toUploadFile(selector: String, filePath: String): js.Promise[Unit] = js.native
        def toUploadFile(selector: String, filePath: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
        def toUploadFile(selector: MatchSelector, filePath: String): js.Promise[Unit] = js.native
        def toUploadFile(selector: MatchSelector, filePath: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
      }
    }
  }
}
