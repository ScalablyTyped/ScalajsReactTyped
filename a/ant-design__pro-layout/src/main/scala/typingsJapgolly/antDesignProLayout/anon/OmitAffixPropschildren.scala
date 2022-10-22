package typingsJapgolly.antDesignProLayout.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<antd.antd.AffixProps, 'children'> */
trait OmitAffixPropschildren extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var offsetBottom: js.UndefOr[Double] = js.undefined
  
  var offsetTop: js.UndefOr[Double] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* affixed */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var target: js.UndefOr[js.Function0[Window | HTMLElement | Null]] = js.undefined
}
object OmitAffixPropschildren {
  
  inline def apply(): OmitAffixPropschildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitAffixPropschildren]
  }
  
  extension [Self <: OmitAffixPropschildren](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
    
    inline def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
    
    inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
    
    inline def setOnChange(value: /* affixed */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* affixed */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTarget(value: CallbackTo[Window | HTMLElement | Null]): Self = StObject.set(x, "target", value.toJsFn)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
