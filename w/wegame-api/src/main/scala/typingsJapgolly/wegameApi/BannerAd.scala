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
  * banner 广告组件。banner 广告组件是一个原生组件，层级比普通组件高。banner 广告组件默认是隐藏的，需要调用 BannerAd.show() 将其显示。banner 广告会根据开发者设置的宽度进行等比缩放，缩放后的尺寸将通过 BannerAd.onResize() 事件中提供。
  */
trait BannerAd
  extends StObject
     with ResizableAdObject {
  
  /**
    * 广告自动刷新的间隔时间，单位为秒，参数值必须大于等于30（该参数不传入时 Banner 广告不会自动刷新）
    */
  var adIntervals: js.UndefOr[Double] = js.undefined
  
  /**
    * banner 广告组件的样式。style 上的属性的值仅为开发者设置的值，banner 广告会根据开发者设置的宽度进行等比缩放，缩放后的真实尺寸需要通过 BannerAd.onResize() 事件获得。
    */
  var style: AdStylerealWidthnumberrea
}
object BannerAd {
  
  inline def apply(
    adUnitId: String,
    destroy: Callback,
    hide: Callback,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    offLoad: js.Function0[Unit] => Callback,
    offResize: js.Function1[/* res */ Width, Unit] => Callback,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    onLoad: js.Function0[Unit] => Callback,
    onResize: js.Function1[/* res */ Width, Unit] => Callback,
    show: CallbackTo[js.Promise[Unit]],
    style: AdStylerealWidthnumberrea
  ): BannerAd = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], destroy = destroy.toJsFn, hide = hide.toJsFn, offError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => offError(t0).runNow()), offLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => offLoad(t0).runNow()), offResize = js.Any.fromFunction1((t0: js.Function1[/* res */ Width, Unit]) => offResize(t0).runNow()), onError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => onError(t0).runNow()), onLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => onLoad(t0).runNow()), onResize = js.Any.fromFunction1((t0: js.Function1[/* res */ Width, Unit]) => onResize(t0).runNow()), show = show.toJsFn, style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerAd]
  }
  
  extension [Self <: BannerAd](x: Self) {
    
    inline def setAdIntervals(value: Double): Self = StObject.set(x, "adIntervals", value.asInstanceOf[js.Any])
    
    inline def setAdIntervalsUndefined: Self = StObject.set(x, "adIntervals", js.undefined)
    
    inline def setStyle(value: AdStylerealWidthnumberrea): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
