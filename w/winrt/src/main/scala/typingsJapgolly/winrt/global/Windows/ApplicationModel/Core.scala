package typingsJapgolly.winrt.global.Windows.ApplicationModel

import typingsJapgolly.winrt.Windows.ApplicationModel.Core.IFrameworkViewSource
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IGetActivationFactory
import typingsJapgolly.winrt.Windows.UI.Core.CoreWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  @JSGlobal("Windows.ApplicationModel.Core.CoreApplication")
  @js.native
  open class CoreApplication ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Core.CoreApplication
  /* static members */
  object CoreApplication {
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createNewView(runtimeType: String, entryPoint: String): typingsJapgolly.winrt.Windows.ApplicationModel.Core.CoreApplicationView = (^.asInstanceOf[js.Dynamic].applyDynamic("createNewView")(runtimeType.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrt.Windows.ApplicationModel.Core.CoreApplicationView]
    
    inline def decrementApplicationUseCount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decrementApplicationUseCount")().asInstanceOf[Unit]
    
    inline def exit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")().asInstanceOf[Unit]
    
    inline def getCurrentView(): typingsJapgolly.winrt.Windows.ApplicationModel.Core.CoreApplicationView = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentView")().asInstanceOf[typingsJapgolly.winrt.Windows.ApplicationModel.Core.CoreApplicationView]
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    inline def incrementApplicationUseCount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("incrementApplicationUseCount")().asInstanceOf[Unit]
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.mainView")
    @js.native
    def mainView: typingsJapgolly.winrt.Windows.ApplicationModel.Core.CoreApplicationView = js.native
    inline def mainView_=(x: typingsJapgolly.winrt.Windows.ApplicationModel.Core.CoreApplicationView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainView")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.onexiting")
    @js.native
    def onexiting: Any = js.native
    inline def onexiting_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onexiting")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.onresuming")
    @js.native
    def onresuming: Any = js.native
    inline def onresuming_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onresuming")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.onsuspending")
    @js.native
    def onsuspending: Any = js.native
    inline def onsuspending_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onsuspending")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.properties")
    @js.native
    def properties: IPropertySet = js.native
    inline def properties_=(x: IPropertySet): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
    
    inline def run(viewSource: IFrameworkViewSource): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(viewSource.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def runWithActivationFactories(activationFactoryCallback: IGetActivationFactory): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runWithActivationFactories")(activationFactoryCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.views")
    @js.native
    def views: IVectorView[typingsJapgolly.winrt.Windows.ApplicationModel.Core.CoreApplicationView] = js.native
    inline def views_=(x: IVectorView[typingsJapgolly.winrt.Windows.ApplicationModel.Core.CoreApplicationView]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("views")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.ApplicationModel.Core.CoreApplicationView")
  @js.native
  open class CoreApplicationView ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Core.CoreApplicationView {
    
    /* CompleteClass */
    var coreWindow: CoreWindow = js.native
    
    /* CompleteClass */
    var isHosted: Boolean = js.native
    
    /* CompleteClass */
    var isMain: Boolean = js.native
    
    /* CompleteClass */
    var onactivated: Any = js.native
  }
}
