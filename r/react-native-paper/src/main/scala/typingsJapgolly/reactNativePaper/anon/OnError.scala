package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactNative.mod.ImageErrorEventData
import typingsJapgolly.reactNative.mod.ImageLoadEventData
import typingsJapgolly.reactNative.mod.ImageProgressEventDataIOS
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.libTypescriptComponentsAvatarAvatarImageMod.AvatarImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnError extends StObject {
  
  /**
    * Invoked on load error.
    */
  var onError: js.UndefOr[js.Function1[/* error */ NativeSyntheticEvent[ImageErrorEventData], Unit]] = js.undefined
  
  /**
    * Invoked on mount and on layout changes.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  /**
    * Invoked when load completes successfully.
    */
  var onLoad: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageLoadEventData], Unit]] = js.undefined
  
  /**
    * Invoked when load either succeeds or fails.
    */
  var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Invoked on load start.
    */
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Invoked on download progress.
    */
  var onProgress: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageProgressEventDataIOS], Unit]] = js.undefined
  
  /**
    * Size of the avatar.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Image to display for the `Avatar`.
    * It accepts a standard React Native Image `source` prop
    * Or a function that returns an `Image`.
    */
  var source: AvatarImageSource
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
}
object OnError {
  
  inline def apply(
    source: AvatarImageSource,
    theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  ): OnError = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnError]
  }
  
  extension [Self <: OnError](x: Self) {
    
    inline def setOnError(value: /* error */ NativeSyntheticEvent[ImageErrorEventData] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ NativeSyntheticEvent[ImageErrorEventData]) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Callback): Self = StObject.set(x, "onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnLoad(value: /* event */ NativeSyntheticEvent[ImageLoadEventData] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[ImageLoadEventData]) => value(t0).runNow()))
    
    inline def setOnLoadEnd(value: Callback): Self = StObject.set(x, "onLoadEnd", value.toJsFn)
    
    inline def setOnLoadEndUndefined: Self = StObject.set(x, "onLoadEnd", js.undefined)
    
    inline def setOnLoadStart(value: Callback): Self = StObject.set(x, "onLoadStart", value.toJsFn)
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnProgress(value: /* event */ NativeSyntheticEvent[ImageProgressEventDataIOS] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[ImageProgressEventDataIOS]) => value(t0).runNow()))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSource(value: AvatarImageSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceFunction1(value: /* props */ SizeNumber => Node): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
    
    inline def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
