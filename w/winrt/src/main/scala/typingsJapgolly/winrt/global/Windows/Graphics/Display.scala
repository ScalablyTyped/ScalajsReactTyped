package typingsJapgolly.winrt.global.Windows.Graphics

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Graphics.Display.DisplayOrientations
import typingsJapgolly.winrt.Windows.Graphics.Display.ResolutionScale
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Display {
  
  @JSGlobal("Windows.Graphics.Display.DisplayOrientations")
  @js.native
  object DisplayOrientations extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Graphics.Display.DisplayOrientations & Double] = js.native
    
    /* 1 */ val landscape: typingsJapgolly.winrt.Windows.Graphics.Display.DisplayOrientations.landscape & Double = js.native
    
    /* 3 */ val landscapeFlipped: typingsJapgolly.winrt.Windows.Graphics.Display.DisplayOrientations.landscapeFlipped & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Graphics.Display.DisplayOrientations.none & Double = js.native
    
    /* 2 */ val portrait: typingsJapgolly.winrt.Windows.Graphics.Display.DisplayOrientations.portrait & Double = js.native
    
    /* 4 */ val portraitFlipped: typingsJapgolly.winrt.Windows.Graphics.Display.DisplayOrientations.portraitFlipped & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Display.DisplayProperties")
  @js.native
  open class DisplayProperties ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Graphics.Display.DisplayProperties
  /* static members */
  object DisplayProperties {
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.autoRotationPreferences")
    @js.native
    def autoRotationPreferences: DisplayOrientations = js.native
    inline def autoRotationPreferences_=(x: DisplayOrientations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoRotationPreferences")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.currentOrientation")
    @js.native
    def currentOrientation: DisplayOrientations = js.native
    inline def currentOrientation_=(x: DisplayOrientations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentOrientation")(x.asInstanceOf[js.Any])
    
    inline def getColorProfileAsync(): IAsyncOperation[IRandomAccessStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorProfileAsync")().asInstanceOf[IAsyncOperation[IRandomAccessStream]]
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.logicalDpi")
    @js.native
    def logicalDpi: Double = js.native
    inline def logicalDpi_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicalDpi")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.nativeOrientation")
    @js.native
    def nativeOrientation: DisplayOrientations = js.native
    inline def nativeOrientation_=(x: DisplayOrientations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeOrientation")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.oncolorprofilechanged")
    @js.native
    def oncolorprofilechanged: Any = js.native
    inline def oncolorprofilechanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oncolorprofilechanged")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.ondisplaycontentsinvalidated")
    @js.native
    def ondisplaycontentsinvalidated: Any = js.native
    inline def ondisplaycontentsinvalidated_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondisplaycontentsinvalidated")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.onlogicaldpichanged")
    @js.native
    def onlogicaldpichanged: Any = js.native
    inline def onlogicaldpichanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlogicaldpichanged")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.onorientationchanged")
    @js.native
    def onorientationchanged: Any = js.native
    inline def onorientationchanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onorientationchanged")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.onstereoenabledchanged")
    @js.native
    def onstereoenabledchanged: Any = js.native
    inline def onstereoenabledchanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onstereoenabledchanged")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.resolutionScale")
    @js.native
    def resolutionScale: ResolutionScale = js.native
    inline def resolutionScale_=(x: ResolutionScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolutionScale")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Display.DisplayProperties.stereoEnabled")
    @js.native
    def stereoEnabled: Boolean = js.native
    inline def stereoEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stereoEnabled")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Graphics.Display.ResolutionScale")
  @js.native
  object ResolutionScale extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Graphics.Display.ResolutionScale & Double] = js.native
    
    /* 0 */ val invalid: typingsJapgolly.winrt.Windows.Graphics.Display.ResolutionScale.invalid & Double = js.native
    
    /* 1 */ val scale100Percent: typingsJapgolly.winrt.Windows.Graphics.Display.ResolutionScale.scale100Percent & Double = js.native
    
    /* 2 */ val scale140Percent: typingsJapgolly.winrt.Windows.Graphics.Display.ResolutionScale.scale140Percent & Double = js.native
    
    /* 3 */ val scale180Percent: typingsJapgolly.winrt.Windows.Graphics.Display.ResolutionScale.scale180Percent & Double = js.native
  }
}
