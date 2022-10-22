package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPlaywrightDeclarationsMod.E2EPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlaywrightPageUtilsLocatorMod {
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright/page/utils/locator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def locator(
    page: E2EPage,
    originalFn: js.Function2[/* selector */ String, /* options */ js.UndefOr[LocatorOptions], E2ELocator],
    selector: String
  ): E2ELocator = (^.asInstanceOf[js.Dynamic].applyDynamic("locator")(page.asInstanceOf[js.Any], originalFn.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[E2ELocator]
  inline def locator(
    page: E2EPage,
    originalFn: js.Function2[/* selector */ String, /* options */ js.UndefOr[LocatorOptions], E2ELocator],
    selector: String,
    options: LocatorOptions
  ): E2ELocator = (^.asInstanceOf[js.Dynamic].applyDynamic("locator")(page.asInstanceOf[js.Any], originalFn.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[E2ELocator]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator * / any */ trait E2ELocator extends StObject {
    
    /**
      * Creates a new EventSpy and listens
      * on the element for an event.
      * The test will timeout if the event
      * never fires.
      *
      * Usage:
      * const input = page.locator('ion-input');
      * const ionChange = await locator.spyOnEvent('ionChange');
      * ...
      * await ionChange.next();
      */
    def spyOnEvent(eventName: String): js.Promise[EventSpy]
  }
  object E2ELocator {
    
    inline def apply(spyOnEvent: String => js.Promise[EventSpy]): E2ELocator = {
      val __obj = js.Dynamic.literal(spyOnEvent = js.Any.fromFunction1(spyOnEvent))
      __obj.asInstanceOf[E2ELocator]
    }
    
    extension [Self <: E2ELocator](x: Self) {
      
      inline def setSpyOnEvent(value: String => js.Promise[EventSpy]): Self = StObject.set(x, "spyOnEvent", js.Any.fromFunction1(value))
    }
  }
  
  trait LocatorOptions extends StObject {
    
    var has: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ Any
      ] = js.undefined
    
    var hasText: js.UndefOr[String | js.RegExp] = js.undefined
  }
  object LocatorOptions {
    
    inline def apply(): LocatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocatorOptions]
    }
    
    extension [Self <: LocatorOptions](x: Self) {
      
      inline def setHas(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ Any
      ): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setHasText(value: String | js.RegExp): Self = StObject.set(x, "hasText", value.asInstanceOf[js.Any])
      
      inline def setHasTextUndefined: Self = StObject.set(x, "hasText", js.undefined)
      
      inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
    }
  }
}
