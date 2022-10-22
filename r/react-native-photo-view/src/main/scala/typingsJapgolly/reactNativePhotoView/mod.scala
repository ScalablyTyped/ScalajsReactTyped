package typingsJapgolly.reactNativePhotoView

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativePhotoView.anon.X
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.center
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.centerCrop
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.centerInside
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.fitCenter
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.fitEnd
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.fitStart
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.fitXY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-photo-view", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ReactNativePhotoViewProps & ViewProps, js.Object, Any]
  
  type ReactNativePhotoView = japgolly.scalajs.react.facade.React.Component[ReactNativePhotoViewProps & ViewProps & js.Object, js.Object]
  
  trait ReactNativePhotoViewProps extends StObject {
    
    var androidScaleType: js.UndefOr[center | centerCrop | centerInside | fitCenter | fitStart | fitEnd | fitXY] = js.undefined
    
    var androidZoomTransitionDuration: js.UndefOr[Double] = js.undefined
    
    var fadeDuration: js.UndefOr[Double] = js.undefined
    
    var loadingIndicatorSource: js.UndefOr[ImageSourcePropType] = js.undefined
    
    var maximumZoomScale: js.UndefOr[Double] = js.undefined
    
    var minimumZoomScale: js.UndefOr[Double] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onProgress: js.UndefOr[js.Function2[/* loaded */ Double, /* total */ Double, Unit]] = js.undefined
    
    var onScale: js.UndefOr[js.Function2[/* scale */ Double, /* target */ js.UndefOr[Element], Unit]] = js.undefined
    
    var onTap: js.UndefOr[js.Function2[/* point */ X, /* target */ js.UndefOr[Element], Unit]] = js.undefined
    
    var onViewTap: js.UndefOr[js.Function2[/* point */ X, /* target */ js.UndefOr[Element], Unit]] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    
    var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    
    var source: js.UndefOr[ImageSourcePropType] = js.undefined
  }
  object ReactNativePhotoViewProps {
    
    inline def apply(): ReactNativePhotoViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactNativePhotoViewProps]
    }
    
    extension [Self <: ReactNativePhotoViewProps](x: Self) {
      
      inline def setAndroidScaleType(value: center | centerCrop | centerInside | fitCenter | fitStart | fitEnd | fitXY): Self = StObject.set(x, "androidScaleType", value.asInstanceOf[js.Any])
      
      inline def setAndroidScaleTypeUndefined: Self = StObject.set(x, "androidScaleType", js.undefined)
      
      inline def setAndroidZoomTransitionDuration(value: Double): Self = StObject.set(x, "androidZoomTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setAndroidZoomTransitionDurationUndefined: Self = StObject.set(x, "androidZoomTransitionDuration", js.undefined)
      
      inline def setFadeDuration(value: Double): Self = StObject.set(x, "fadeDuration", value.asInstanceOf[js.Any])
      
      inline def setFadeDurationUndefined: Self = StObject.set(x, "fadeDuration", js.undefined)
      
      inline def setLoadingIndicatorSource(value: ImageSourcePropType): Self = StObject.set(x, "loadingIndicatorSource", value.asInstanceOf[js.Any])
      
      inline def setLoadingIndicatorSourceUndefined: Self = StObject.set(x, "loadingIndicatorSource", js.undefined)
      
      inline def setLoadingIndicatorSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "loadingIndicatorSource", js.Array(value*))
      
      inline def setMaximumZoomScale(value: Double): Self = StObject.set(x, "maximumZoomScale", value.asInstanceOf[js.Any])
      
      inline def setMaximumZoomScaleUndefined: Self = StObject.set(x, "maximumZoomScale", js.undefined)
      
      inline def setMinimumZoomScale(value: Double): Self = StObject.set(x, "minimumZoomScale", value.asInstanceOf[js.Any])
      
      inline def setMinimumZoomScaleUndefined: Self = StObject.set(x, "minimumZoomScale", js.undefined)
      
      inline def setOnLoad(value: Callback): Self = StObject.set(x, "onLoad", value.toJsFn)
      
      inline def setOnLoadEnd(value: Callback): Self = StObject.set(x, "onLoadEnd", value.toJsFn)
      
      inline def setOnLoadEndUndefined: Self = StObject.set(x, "onLoadEnd", js.undefined)
      
      inline def setOnLoadStart(value: Callback): Self = StObject.set(x, "onLoadStart", value.toJsFn)
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnProgress(value: (/* loaded */ Double, /* total */ Double) => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction2((t0: /* loaded */ Double, t1: /* total */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnScale(value: (/* scale */ Double, /* target */ js.UndefOr[Element]) => Callback): Self = StObject.set(x, "onScale", js.Any.fromFunction2((t0: /* scale */ Double, t1: /* target */ js.UndefOr[Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnScaleUndefined: Self = StObject.set(x, "onScale", js.undefined)
      
      inline def setOnTap(value: (/* point */ X, /* target */ js.UndefOr[Element]) => Callback): Self = StObject.set(x, "onTap", js.Any.fromFunction2((t0: /* point */ X, t1: /* target */ js.UndefOr[Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      inline def setOnViewTap(value: (/* point */ X, /* target */ js.UndefOr[Element]) => Callback): Self = StObject.set(x, "onViewTap", js.Any.fromFunction2((t0: /* point */ X, t1: /* target */ js.UndefOr[Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnViewTapUndefined: Self = StObject.set(x, "onViewTap", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShowsHorizontalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowsHorizontalScrollIndicatorUndefined: Self = StObject.set(x, "showsHorizontalScrollIndicator", js.undefined)
      
      inline def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
      
      inline def setSource(value: ImageSourcePropType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value*))
    }
  }
}
