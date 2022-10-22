package typingsJapgolly.detox.mod.global

import typingsJapgolly.detox.mod.global.Detox.ByFacade
import typingsJapgolly.detox.mod.global.Detox.DetoxCircus
import typingsJapgolly.detox.mod.global.Detox.Device
import typingsJapgolly.detox.mod.global.Detox.ElementFacade
import typingsJapgolly.detox.mod.global.Detox.Expect
import typingsJapgolly.detox.mod.global.Detox.ExpectFacade
import typingsJapgolly.detox.mod.global.Detox.IndexableNativeElement
import typingsJapgolly.detox.mod.global.Detox.NativeElement
import typingsJapgolly.detox.mod.global.Detox.NativeMatcher
import typingsJapgolly.detox.mod.global.Detox.WaitFor
import typingsJapgolly.detox.mod.global.Detox.WaitForFacade
import typingsJapgolly.detox.mod.global.Detox.WebElement
import typingsJapgolly.detox.mod.global.Detox.WebExpect
import typingsJapgolly.detox.mod.global.Detox.WebFacade
import typingsJapgolly.detox.mod.global.Detox.WebViewElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeJS {
  
  trait Global extends StObject {
    
    var by: ByFacade
    
    var detoxCircus: DetoxCircus
    
    var device: Device
    
    def element(by: NativeMatcher): IndexableNativeElement
    @JSName("element")
    var element_Original: ElementFacade
    
    def expect(element: NativeElement): Expect[js.Promise[Unit]]
    def expect(webElement: WebElement): WebExpect[js.Promise[Unit]]
    @JSName("expect")
    var expect_Original: ExpectFacade
    
    def waitFor(element: NativeElement): Expect[WaitFor]
    @JSName("waitFor")
    var waitFor_Original: WaitForFacade
    
    /**
      * Gets the webview element as a testing element.
      * @param matcher a simple view matcher for the webview element in th UI hierarchy.
      * If there is only ONE webview element in the UI hierarchy, its NOT a must to supply it.
      * If there are MORE then one webview element in the UI hierarchy you MUST supply are view matcher.
      */
    def web(): WebViewElement
    def web(matcher: NativeMatcher): WebViewElement
    @JSName("web")
    var web_Original: WebFacade
  }
  object Global {
    
    inline def apply(
      by: ByFacade,
      detoxCircus: DetoxCircus,
      device: Device,
      element: /* by */ NativeMatcher => IndexableNativeElement,
      expect: ExpectFacade,
      waitFor: /* element */ NativeElement => Expect[WaitFor],
      web: WebFacade
    ): Global = {
      val __obj = js.Dynamic.literal(by = by.asInstanceOf[js.Any], detoxCircus = detoxCircus.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], element = js.Any.fromFunction1(element), expect = expect.asInstanceOf[js.Any], waitFor = js.Any.fromFunction1(waitFor), web = web.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    extension [Self <: Global](x: Self) {
      
      inline def setBy(value: ByFacade): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
      
      inline def setDetoxCircus(value: DetoxCircus): Self = StObject.set(x, "detoxCircus", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setElement(value: /* by */ NativeMatcher => IndexableNativeElement): Self = StObject.set(x, "element", js.Any.fromFunction1(value))
      
      inline def setExpect(value: ExpectFacade): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
      
      inline def setWaitFor(value: /* element */ NativeElement => Expect[WaitFor]): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
      
      inline def setWeb(value: WebFacade): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    }
  }
}
