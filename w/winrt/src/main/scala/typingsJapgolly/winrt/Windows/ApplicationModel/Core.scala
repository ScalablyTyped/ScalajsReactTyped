package typingsJapgolly.winrt.Windows.ApplicationModel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IGetActivationFactory
import typingsJapgolly.winrt.Windows.UI.Core.CoreWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  trait CoreApplication extends StObject
  
  trait CoreApplicationView
    extends StObject
       with ICoreApplicationView
  object CoreApplicationView {
    
    inline def apply(coreWindow: CoreWindow, isHosted: Boolean, isMain: Boolean, onactivated: Any): CoreApplicationView = {
      val __obj = js.Dynamic.literal(coreWindow = coreWindow.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], onactivated = onactivated.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoreApplicationView]
    }
  }
  
  trait ICoreApplication extends StObject {
    
    def getCurrentView(): CoreApplicationView
    
    var id: String
    
    var onresuming: Any
    
    var onsuspending: Any
    
    var properties: IPropertySet
    
    def run(viewSource: IFrameworkViewSource): Unit
    
    def runWithActivationFactories(activationFactoryCallback: IGetActivationFactory): Unit
  }
  object ICoreApplication {
    
    inline def apply(
      getCurrentView: CallbackTo[CoreApplicationView],
      id: String,
      onresuming: Any,
      onsuspending: Any,
      properties: IPropertySet,
      run: IFrameworkViewSource => Callback,
      runWithActivationFactories: IGetActivationFactory => Callback
    ): ICoreApplication = {
      val __obj = js.Dynamic.literal(getCurrentView = getCurrentView.toJsFn, id = id.asInstanceOf[js.Any], onresuming = onresuming.asInstanceOf[js.Any], onsuspending = onsuspending.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], run = js.Any.fromFunction1((t0: IFrameworkViewSource) => run(t0).runNow()), runWithActivationFactories = js.Any.fromFunction1((t0: IGetActivationFactory) => runWithActivationFactories(t0).runNow()))
      __obj.asInstanceOf[ICoreApplication]
    }
    
    extension [Self <: ICoreApplication](x: Self) {
      
      inline def setGetCurrentView(value: CallbackTo[CoreApplicationView]): Self = StObject.set(x, "getCurrentView", value.toJsFn)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnresuming(value: Any): Self = StObject.set(x, "onresuming", value.asInstanceOf[js.Any])
      
      inline def setOnsuspending(value: Any): Self = StObject.set(x, "onsuspending", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setRun(value: IFrameworkViewSource => Callback): Self = StObject.set(x, "run", js.Any.fromFunction1((t0: IFrameworkViewSource) => value(t0).runNow()))
      
      inline def setRunWithActivationFactories(value: IGetActivationFactory => Callback): Self = StObject.set(x, "runWithActivationFactories", js.Any.fromFunction1((t0: IGetActivationFactory) => value(t0).runNow()))
    }
  }
  
  trait ICoreApplicationExit extends StObject {
    
    def exit(): Unit
    
    var onexiting: Any
  }
  object ICoreApplicationExit {
    
    inline def apply(exit: Callback, onexiting: Any): ICoreApplicationExit = {
      val __obj = js.Dynamic.literal(exit = exit.toJsFn, onexiting = onexiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICoreApplicationExit]
    }
    
    extension [Self <: ICoreApplicationExit](x: Self) {
      
      inline def setExit(value: Callback): Self = StObject.set(x, "exit", value.toJsFn)
      
      inline def setOnexiting(value: Any): Self = StObject.set(x, "onexiting", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICoreApplicationUseCount extends StObject {
    
    def decrementApplicationUseCount(): Unit
    
    def incrementApplicationUseCount(): Unit
  }
  object ICoreApplicationUseCount {
    
    inline def apply(decrementApplicationUseCount: Callback, incrementApplicationUseCount: Callback): ICoreApplicationUseCount = {
      val __obj = js.Dynamic.literal(decrementApplicationUseCount = decrementApplicationUseCount.toJsFn, incrementApplicationUseCount = incrementApplicationUseCount.toJsFn)
      __obj.asInstanceOf[ICoreApplicationUseCount]
    }
    
    extension [Self <: ICoreApplicationUseCount](x: Self) {
      
      inline def setDecrementApplicationUseCount(value: Callback): Self = StObject.set(x, "decrementApplicationUseCount", value.toJsFn)
      
      inline def setIncrementApplicationUseCount(value: Callback): Self = StObject.set(x, "incrementApplicationUseCount", value.toJsFn)
    }
  }
  
  trait ICoreApplicationView extends StObject {
    
    var coreWindow: CoreWindow
    
    var isHosted: Boolean
    
    var isMain: Boolean
    
    var onactivated: Any
  }
  object ICoreApplicationView {
    
    inline def apply(coreWindow: CoreWindow, isHosted: Boolean, isMain: Boolean, onactivated: Any): ICoreApplicationView = {
      val __obj = js.Dynamic.literal(coreWindow = coreWindow.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], onactivated = onactivated.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICoreApplicationView]
    }
    
    extension [Self <: ICoreApplicationView](x: Self) {
      
      inline def setCoreWindow(value: CoreWindow): Self = StObject.set(x, "coreWindow", value.asInstanceOf[js.Any])
      
      inline def setIsHosted(value: Boolean): Self = StObject.set(x, "isHosted", value.asInstanceOf[js.Any])
      
      inline def setIsMain(value: Boolean): Self = StObject.set(x, "isMain", value.asInstanceOf[js.Any])
      
      inline def setOnactivated(value: Any): Self = StObject.set(x, "onactivated", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICoreImmersiveApplication extends StObject {
    
    def createNewView(runtimeType: String, entryPoint: String): CoreApplicationView
    
    var mainView: CoreApplicationView
    
    var views: IVectorView[CoreApplicationView]
  }
  object ICoreImmersiveApplication {
    
    inline def apply(
      createNewView: (String, String) => CoreApplicationView,
      mainView: CoreApplicationView,
      views: IVectorView[CoreApplicationView]
    ): ICoreImmersiveApplication = {
      val __obj = js.Dynamic.literal(createNewView = js.Any.fromFunction2(createNewView), mainView = mainView.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICoreImmersiveApplication]
    }
    
    extension [Self <: ICoreImmersiveApplication](x: Self) {
      
      inline def setCreateNewView(value: (String, String) => CoreApplicationView): Self = StObject.set(x, "createNewView", js.Any.fromFunction2(value))
      
      inline def setMainView(value: CoreApplicationView): Self = StObject.set(x, "mainView", value.asInstanceOf[js.Any])
      
      inline def setViews(value: IVectorView[CoreApplicationView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFrameworkView extends StObject {
    
    def initialize(applicationView: CoreApplicationView): Unit
    
    def load(entryPoint: String): Unit
    
    def run(): Unit
    
    def setWindow(window: CoreWindow): Unit
    
    def uninitialize(): Unit
  }
  object IFrameworkView {
    
    inline def apply(
      initialize: CoreApplicationView => Callback,
      load: String => Callback,
      run: Callback,
      setWindow: CoreWindow => Callback,
      uninitialize: Callback
    ): IFrameworkView = {
      val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1((t0: CoreApplicationView) => initialize(t0).runNow()), load = js.Any.fromFunction1((t0: String) => load(t0).runNow()), run = run.toJsFn, setWindow = js.Any.fromFunction1((t0: CoreWindow) => setWindow(t0).runNow()), uninitialize = uninitialize.toJsFn)
      __obj.asInstanceOf[IFrameworkView]
    }
    
    extension [Self <: IFrameworkView](x: Self) {
      
      inline def setInitialize(value: CoreApplicationView => Callback): Self = StObject.set(x, "initialize", js.Any.fromFunction1((t0: CoreApplicationView) => value(t0).runNow()))
      
      inline def setLoad(value: String => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRun(value: Callback): Self = StObject.set(x, "run", value.toJsFn)
      
      inline def setSetWindow(value: CoreWindow => Callback): Self = StObject.set(x, "setWindow", js.Any.fromFunction1((t0: CoreWindow) => value(t0).runNow()))
      
      inline def setUninitialize(value: Callback): Self = StObject.set(x, "uninitialize", value.toJsFn)
    }
  }
  
  trait IFrameworkViewSource extends StObject {
    
    def createView(): IFrameworkView
  }
  object IFrameworkViewSource {
    
    inline def apply(createView: CallbackTo[IFrameworkView]): IFrameworkViewSource = {
      val __obj = js.Dynamic.literal(createView = createView.toJsFn)
      __obj.asInstanceOf[IFrameworkViewSource]
    }
    
    extension [Self <: IFrameworkViewSource](x: Self) {
      
      inline def setCreateView(value: CallbackTo[IFrameworkView]): Self = StObject.set(x, "createView", value.toJsFn)
    }
  }
}
