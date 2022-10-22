package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wegameApi.anon.AdStylerealWidthnumberrea
import typingsJapgolly.wegameApi.anon.ErrMsg
import typingsJapgolly.wegameApi.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * grid(格子) 广告组件。grid(格子) 广告组件是一个原生组件，层级比普通组件高。grid(格子) 广告组件默认是隐藏的，需要调用 GridAd.show() 将其显示。grid(格子) 广告会根据开发者设置的宽度进行等比缩放，缩放后的尺寸将通过 GridAd.onResize() 事件中提供。
  */
trait GridAd
  extends StObject
     with ResizableAdObject {
  
  /**
    * 广告自动刷新的间隔时间，单位为秒，参数值必须大于等于30（该参数不传入时 Banner 广告不会自动刷新）
    */
  var adIntervals: js.UndefOr[Double] = js.undefined
  
  /**
    * grid(格子) 广告广告组件的主题，提供 white black 两种主题选择。
    */
  var adTheme: String
  
  /**
    * grid(格子) 广告组件的格子个数，可设置爱5，8两种格子个数样式，默认值为5
    */
  var gridCount: Double
  
  /**
    * grid(格子) 广告广告组件的样式。style 上的属性的值仅为开发者设置的grid(格子) 广告) 广告会根据开发者设置的宽度进行等比缩放，缩放后的真实尺寸需要通过 GridAd.onResize() 事件获得。
    */
  var style: AdStylerealWidthnumberrea
}
object GridAd {
  
  inline def apply(
    adTheme: String,
    adUnitId: String,
    destroy: Callback,
    gridCount: Double,
    hide: Callback,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    offLoad: js.Function0[Unit] => Callback,
    offResize: js.Function1[/* res */ Width, Unit] => Callback,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    onLoad: js.Function0[Unit] => Callback,
    onResize: js.Function1[/* res */ Width, Unit] => Callback,
    show: CallbackTo[js.Promise[Unit]],
    style: AdStylerealWidthnumberrea
  ): GridAd = {
    val __obj = js.Dynamic.literal(adTheme = adTheme.asInstanceOf[js.Any], adUnitId = adUnitId.asInstanceOf[js.Any], destroy = destroy.toJsFn, gridCount = gridCount.asInstanceOf[js.Any], hide = hide.toJsFn, offError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => offError(t0).runNow()), offLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => offLoad(t0).runNow()), offResize = js.Any.fromFunction1((t0: js.Function1[/* res */ Width, Unit]) => offResize(t0).runNow()), onError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => onError(t0).runNow()), onLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => onLoad(t0).runNow()), onResize = js.Any.fromFunction1((t0: js.Function1[/* res */ Width, Unit]) => onResize(t0).runNow()), show = show.toJsFn, style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAd]
  }
  
  extension [Self <: GridAd](x: Self) {
    
    inline def setAdIntervals(value: Double): Self = StObject.set(x, "adIntervals", value.asInstanceOf[js.Any])
    
    inline def setAdIntervalsUndefined: Self = StObject.set(x, "adIntervals", js.undefined)
    
    inline def setAdTheme(value: String): Self = StObject.set(x, "adTheme", value.asInstanceOf[js.Any])
    
    inline def setGridCount(value: Double): Self = StObject.set(x, "gridCount", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: AdStylerealWidthnumberrea): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
