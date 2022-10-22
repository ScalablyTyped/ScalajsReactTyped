package typingsJapgolly.winrt.Windows.Graphics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Display {
  
  @js.native
  sealed trait DisplayOrientations extends StObject
  @JSGlobal("Windows.Graphics.Display.DisplayOrientations")
  @js.native
  object DisplayOrientations extends StObject {
    
    @js.native
    sealed trait landscape
      extends StObject
         with DisplayOrientations
    
    @js.native
    sealed trait landscapeFlipped
      extends StObject
         with DisplayOrientations
    
    @js.native
    sealed trait none
      extends StObject
         with DisplayOrientations
    
    @js.native
    sealed trait portrait
      extends StObject
         with DisplayOrientations
    
    @js.native
    sealed trait portraitFlipped
      extends StObject
         with DisplayOrientations
  }
  
  @js.native
  sealed trait ResolutionScale extends StObject
  @JSGlobal("Windows.Graphics.Display.ResolutionScale")
  @js.native
  object ResolutionScale extends StObject {
    
    @js.native
    sealed trait invalid
      extends StObject
         with ResolutionScale
    
    @js.native
    sealed trait scale100Percent
      extends StObject
         with ResolutionScale
    
    @js.native
    sealed trait scale140Percent
      extends StObject
         with ResolutionScale
    
    @js.native
    sealed trait scale180Percent
      extends StObject
         with ResolutionScale
  }
  
  trait DisplayProperties extends StObject
  
  type DisplayPropertiesEventHandler = js.Function1[/* sender */ Any, Unit]
  
  trait IDisplayPropertiesStatics extends StObject {
    
    var autoRotationPreferences: DisplayOrientations
    
    var currentOrientation: DisplayOrientations
    
    def getColorProfileAsync(): IAsyncOperation[IRandomAccessStream]
    
    var logicalDpi: Double
    
    var nativeOrientation: DisplayOrientations
    
    var oncolorprofilechanged: Any
    
    var ondisplaycontentsinvalidated: Any
    
    var onlogicaldpichanged: Any
    
    var onorientationchanged: Any
    
    var onstereoenabledchanged: Any
    
    var resolutionScale: ResolutionScale
    
    var stereoEnabled: Boolean
  }
  object IDisplayPropertiesStatics {
    
    inline def apply(
      autoRotationPreferences: DisplayOrientations,
      currentOrientation: DisplayOrientations,
      getColorProfileAsync: CallbackTo[IAsyncOperation[IRandomAccessStream]],
      logicalDpi: Double,
      nativeOrientation: DisplayOrientations,
      oncolorprofilechanged: Any,
      ondisplaycontentsinvalidated: Any,
      onlogicaldpichanged: Any,
      onorientationchanged: Any,
      onstereoenabledchanged: Any,
      resolutionScale: ResolutionScale,
      stereoEnabled: Boolean
    ): IDisplayPropertiesStatics = {
      val __obj = js.Dynamic.literal(autoRotationPreferences = autoRotationPreferences.asInstanceOf[js.Any], currentOrientation = currentOrientation.asInstanceOf[js.Any], getColorProfileAsync = getColorProfileAsync.toJsFn, logicalDpi = logicalDpi.asInstanceOf[js.Any], nativeOrientation = nativeOrientation.asInstanceOf[js.Any], oncolorprofilechanged = oncolorprofilechanged.asInstanceOf[js.Any], ondisplaycontentsinvalidated = ondisplaycontentsinvalidated.asInstanceOf[js.Any], onlogicaldpichanged = onlogicaldpichanged.asInstanceOf[js.Any], onorientationchanged = onorientationchanged.asInstanceOf[js.Any], onstereoenabledchanged = onstereoenabledchanged.asInstanceOf[js.Any], resolutionScale = resolutionScale.asInstanceOf[js.Any], stereoEnabled = stereoEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDisplayPropertiesStatics]
    }
    
    extension [Self <: IDisplayPropertiesStatics](x: Self) {
      
      inline def setAutoRotationPreferences(value: DisplayOrientations): Self = StObject.set(x, "autoRotationPreferences", value.asInstanceOf[js.Any])
      
      inline def setCurrentOrientation(value: DisplayOrientations): Self = StObject.set(x, "currentOrientation", value.asInstanceOf[js.Any])
      
      inline def setGetColorProfileAsync(value: CallbackTo[IAsyncOperation[IRandomAccessStream]]): Self = StObject.set(x, "getColorProfileAsync", value.toJsFn)
      
      inline def setLogicalDpi(value: Double): Self = StObject.set(x, "logicalDpi", value.asInstanceOf[js.Any])
      
      inline def setNativeOrientation(value: DisplayOrientations): Self = StObject.set(x, "nativeOrientation", value.asInstanceOf[js.Any])
      
      inline def setOncolorprofilechanged(value: Any): Self = StObject.set(x, "oncolorprofilechanged", value.asInstanceOf[js.Any])
      
      inline def setOndisplaycontentsinvalidated(value: Any): Self = StObject.set(x, "ondisplaycontentsinvalidated", value.asInstanceOf[js.Any])
      
      inline def setOnlogicaldpichanged(value: Any): Self = StObject.set(x, "onlogicaldpichanged", value.asInstanceOf[js.Any])
      
      inline def setOnorientationchanged(value: Any): Self = StObject.set(x, "onorientationchanged", value.asInstanceOf[js.Any])
      
      inline def setOnstereoenabledchanged(value: Any): Self = StObject.set(x, "onstereoenabledchanged", value.asInstanceOf[js.Any])
      
      inline def setResolutionScale(value: ResolutionScale): Self = StObject.set(x, "resolutionScale", value.asInstanceOf[js.Any])
      
      inline def setStereoEnabled(value: Boolean): Self = StObject.set(x, "stereoEnabled", value.asInstanceOf[js.Any])
    }
  }
}
