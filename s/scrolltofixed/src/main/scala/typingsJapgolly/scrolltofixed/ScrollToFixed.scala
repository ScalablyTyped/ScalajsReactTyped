package typingsJapgolly.scrolltofixed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollToFixed {
  
  trait ScrollToFixedOptions extends StObject {
    
    var baseClassName: js.UndefOr[String] = js.undefined
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dontCheckForPositionFixedSupport: js.UndefOr[Boolean] = js.undefined
    
    var dontSetWidth: js.UndefOr[Boolean] = js.undefined
    
    var fixed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var limit: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    var marginTop: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var offsets: js.UndefOr[Boolean] = js.undefined
    
    var postAbsolute: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var postFixed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var postUnfixed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preAbsolute: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preFixed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preUnfixed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removeOffsets: js.UndefOr[Boolean] = js.undefined
    
    var spacerClass: js.UndefOr[String] = js.undefined
    
    var unfixed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object ScrollToFixedOptions {
    
    inline def apply(): ScrollToFixedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollToFixedOptions]
    }
    
    extension [Self <: ScrollToFixedOptions](x: Self) {
      
      inline def setBaseClassName(value: String): Self = StObject.set(x, "baseClassName", value.asInstanceOf[js.Any])
      
      inline def setBaseClassNameUndefined: Self = StObject.set(x, "baseClassName", js.undefined)
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDontCheckForPositionFixedSupport(value: Boolean): Self = StObject.set(x, "dontCheckForPositionFixedSupport", value.asInstanceOf[js.Any])
      
      inline def setDontCheckForPositionFixedSupportUndefined: Self = StObject.set(x, "dontCheckForPositionFixedSupport", js.undefined)
      
      inline def setDontSetWidth(value: Boolean): Self = StObject.set(x, "dontSetWidth", value.asInstanceOf[js.Any])
      
      inline def setDontSetWidthUndefined: Self = StObject.set(x, "dontSetWidth", js.undefined)
      
      inline def setFixed(value: Callback): Self = StObject.set(x, "fixed", value.toJsFn)
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setLimit(value: Double | js.Function0[Double]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitCallbackTo(value: CallbackTo[Double]): Self = StObject.set(x, "limit", value.toJsFn)
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMarginTop(value: Double | js.Function0[Double]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopCallbackTo(value: CallbackTo[Double]): Self = StObject.set(x, "marginTop", value.toJsFn)
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOffsets(value: Boolean): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
      
      inline def setOffsetsUndefined: Self = StObject.set(x, "offsets", js.undefined)
      
      inline def setPostAbsolute(value: Callback): Self = StObject.set(x, "postAbsolute", value.toJsFn)
      
      inline def setPostAbsoluteUndefined: Self = StObject.set(x, "postAbsolute", js.undefined)
      
      inline def setPostFixed(value: Callback): Self = StObject.set(x, "postFixed", value.toJsFn)
      
      inline def setPostFixedUndefined: Self = StObject.set(x, "postFixed", js.undefined)
      
      inline def setPostUnfixed(value: Callback): Self = StObject.set(x, "postUnfixed", value.toJsFn)
      
      inline def setPostUnfixedUndefined: Self = StObject.set(x, "postUnfixed", js.undefined)
      
      inline def setPreAbsolute(value: Callback): Self = StObject.set(x, "preAbsolute", value.toJsFn)
      
      inline def setPreAbsoluteUndefined: Self = StObject.set(x, "preAbsolute", js.undefined)
      
      inline def setPreFixed(value: Callback): Self = StObject.set(x, "preFixed", value.toJsFn)
      
      inline def setPreFixedUndefined: Self = StObject.set(x, "preFixed", js.undefined)
      
      inline def setPreUnfixed(value: Callback): Self = StObject.set(x, "preUnfixed", value.toJsFn)
      
      inline def setPreUnfixedUndefined: Self = StObject.set(x, "preUnfixed", js.undefined)
      
      inline def setRemoveOffsets(value: Boolean): Self = StObject.set(x, "removeOffsets", value.asInstanceOf[js.Any])
      
      inline def setRemoveOffsetsUndefined: Self = StObject.set(x, "removeOffsets", js.undefined)
      
      inline def setSpacerClass(value: String): Self = StObject.set(x, "spacerClass", value.asInstanceOf[js.Any])
      
      inline def setSpacerClassUndefined: Self = StObject.set(x, "spacerClass", js.undefined)
      
      inline def setUnfixed(value: Callback): Self = StObject.set(x, "unfixed", value.toJsFn)
      
      inline def setUnfixedUndefined: Self = StObject.set(x, "unfixed", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
