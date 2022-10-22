package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialLoadingOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsLoadingLoadingMod {
  
  @JSImport("carbon-components/components/loading/loading", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Loading {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialLoadingOptions) = this()
    
    /* CompleteClass */
    override def _deleteElement(): Unit = js.native
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    /* CompleteClass */
    override def isActive(): Boolean = js.native
    
    /* CompleteClass */
    override def set(active: Boolean): this.type = js.native
    
    /* CompleteClass */
    override def toggle(): this.type = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/loading/loading", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/loading/loading", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Loading extends StObject {
    
    def _deleteElement(): Unit
    
    def end(): Unit
    
    def isActive(): Boolean
    
    def set(active: Boolean): this.type
    
    def toggle(): this.type
  }
  object Loading {
    
    inline def apply(
      _deleteElement: Callback,
      end: Callback,
      isActive: CallbackTo[Boolean],
      set: Boolean => Loading,
      toggle: CallbackTo[Loading]
    ): Loading = {
      val __obj = js.Dynamic.literal(_deleteElement = _deleteElement.toJsFn, end = end.toJsFn, isActive = isActive.toJsFn, set = js.Any.fromFunction1(set), toggle = toggle.toJsFn)
      __obj.asInstanceOf[Loading]
    }
    
    extension [Self <: Loading](x: Self) {
      
      inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
      
      inline def setSet(value: Boolean => Loading): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setToggle(value: CallbackTo[Loading]): Self = StObject.set(x, "toggle", value.toJsFn)
      
      inline def set_deleteElement(value: Callback): Self = StObject.set(x, "_deleteElement", value.toJsFn)
    }
  }
  
  trait LoadingOptions extends StObject {
    
    var active: Boolean
    
    var classLoadingOverlay: String
    
    var classLoadingOverlayStop: String
    
    var classLoadingStop: String
    
    var selectorInit: String
    
    var selectorLoadingOverlay: String
  }
  object LoadingOptions {
    
    inline def apply(
      active: Boolean,
      classLoadingOverlay: String,
      classLoadingOverlayStop: String,
      classLoadingStop: String,
      selectorInit: String,
      selectorLoadingOverlay: String
    ): LoadingOptions = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], classLoadingOverlay = classLoadingOverlay.asInstanceOf[js.Any], classLoadingOverlayStop = classLoadingOverlayStop.asInstanceOf[js.Any], classLoadingStop = classLoadingStop.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorLoadingOverlay = selectorLoadingOverlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadingOptions]
    }
    
    extension [Self <: LoadingOptions](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setClassLoadingOverlay(value: String): Self = StObject.set(x, "classLoadingOverlay", value.asInstanceOf[js.Any])
      
      inline def setClassLoadingOverlayStop(value: String): Self = StObject.set(x, "classLoadingOverlayStop", value.asInstanceOf[js.Any])
      
      inline def setClassLoadingStop(value: String): Self = StObject.set(x, "classLoadingStop", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorLoadingOverlay(value: String): Self = StObject.set(x, "selectorLoadingOverlay", value.asInstanceOf[js.Any])
    }
  }
}
