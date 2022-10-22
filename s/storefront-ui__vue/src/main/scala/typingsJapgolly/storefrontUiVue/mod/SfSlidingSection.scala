package typingsJapgolly.storefrontUiVue.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfSlidingSection extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfSlidingSection")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var isMobile: Boolean
    
    var mobileObserverClients: Double
    
    var mobileObserverIsInitialized: Boolean
  }
  object Computed {
    
    inline def apply(isMobile: Boolean, mobileObserverClients: Double, mobileObserverIsInitialized: Boolean): Computed = {
      val __obj = js.Dynamic.literal(isMobile = isMobile.asInstanceOf[js.Any], mobileObserverClients = mobileObserverClients.asInstanceOf[js.Any], mobileObserverIsInitialized = mobileObserverIsInitialized.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setMobileObserverClients(value: Double): Self = StObject.set(x, "mobileObserverClients", value.asInstanceOf[js.Any])
      
      inline def setMobileObserverIsInitialized(value: Boolean): Self = StObject.set(x, "mobileObserverIsInitialized", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    def data(): Data
    
    var methods: Methods
  }
  object Constructor {
    
    inline def apply(computed: Computed, data: CallbackTo[Data], methods: Methods): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = data.toJsFn, methods = methods.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: CallbackTo[Data]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var hammer: Any
    
    var hasScrollLock: Boolean
    
    var hasStaticHeight: Boolean
    
    var isActive: Boolean
  }
  object Data {
    
    inline def apply(hammer: Any, hasScrollLock: Boolean, hasStaticHeight: Boolean, isActive: Boolean): Data = {
      val __obj = js.Dynamic.literal(hammer = hammer.asInstanceOf[js.Any], hasScrollLock = hasScrollLock.asInstanceOf[js.Any], hasStaticHeight = hasStaticHeight.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setHammer(value: Any): Self = StObject.set(x, "hammer", value.asInstanceOf[js.Any])
      
      inline def setHasScrollLock(value: Boolean): Self = StObject.set(x, "hasScrollLock", value.asInstanceOf[js.Any])
      
      inline def setHasStaticHeight(value: Boolean): Self = StObject.set(x, "hasStaticHeight", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def closeHandler(): Unit
    
    def scrollLock(): Unit
    
    def scrollUnlock(): Unit
    
    def touchHandler(event: Event): Unit
    
    def touchPreventDefault(e: Event): Unit
  }
  object Methods {
    
    inline def apply(
      closeHandler: Callback,
      scrollLock: Callback,
      scrollUnlock: Callback,
      touchHandler: Event => Callback,
      touchPreventDefault: Event => Callback
    ): Methods = {
      val __obj = js.Dynamic.literal(closeHandler = closeHandler.toJsFn, scrollLock = scrollLock.toJsFn, scrollUnlock = scrollUnlock.toJsFn, touchHandler = js.Any.fromFunction1((t0: Event) => touchHandler(t0).runNow()), touchPreventDefault = js.Any.fromFunction1((t0: Event) => touchPreventDefault(t0).runNow()))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setCloseHandler(value: Callback): Self = StObject.set(x, "closeHandler", value.toJsFn)
      
      inline def setScrollLock(value: Callback): Self = StObject.set(x, "scrollLock", value.toJsFn)
      
      inline def setScrollUnlock(value: Callback): Self = StObject.set(x, "scrollUnlock", value.toJsFn)
      
      inline def setTouchHandler(value: Event => Callback): Self = StObject.set(x, "touchHandler", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setTouchPreventDefault(value: Event => Callback): Self = StObject.set(x, "touchPreventDefault", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfSlidingSection.foo` */
  override def _to: Constructor = ^
}
