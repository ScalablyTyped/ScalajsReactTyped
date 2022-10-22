package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpinMod extends Shortcut {
  
  @JSImport("antd/lib/spin", JSImport.Default)
  @js.native
  val default: SpinFCType = js.native
  
  trait SpinClassProps
    extends StObject
       with SpinProps {
    
    var spinPrefixCls: String
  }
  object SpinClassProps {
    
    inline def apply(spinPrefixCls: String): SpinClassProps = {
      val __obj = js.Dynamic.literal(spinPrefixCls = spinPrefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpinClassProps]
    }
    
    extension [Self <: SpinClassProps](x: Self) {
      
      inline def setSpinPrefixCls(value: String): Self = StObject.set(x, "spinPrefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SpinFCType
    extends StObject
       with FunctionComponent[SpinProps] {
    
    def setDefaultIndicator(indicator: Node): Unit = js.native
  }
  
  type SpinIndicator = Element
  
  trait SpinProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var indicator: js.UndefOr[Element] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[SpinSize] = js.undefined
    
    var spinning: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tip: js.UndefOr[Node] = js.undefined
    
    var wrapperClassName: js.UndefOr[String] = js.undefined
  }
  object SpinProps {
    
    inline def apply(): SpinProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinProps]
    }
    
    extension [Self <: SpinProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setIndicator(value: VdomElement): Self = StObject.set(x, "indicator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSize(value: SpinSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpinning(value: Boolean): Self = StObject.set(x, "spinning", value.asInstanceOf[js.Any])
      
      inline def setSpinningUndefined: Self = StObject.set(x, "spinning", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTip(value: VdomNode): Self = StObject.set(x, "tip", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTipNull: Self = StObject.set(x, "tip", null)
      
      inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      inline def setTipVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tip", js.Array(value*))
      
      inline def setTipVdomElement(value: VdomElement): Self = StObject.set(x, "tip", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.small
    - typingsJapgolly.antd.antdStrings.default
    - typingsJapgolly.antd.antdStrings.large
  */
  trait SpinSize extends StObject
  
  type _To = SpinFCType
  
  /* This means you don't have to write `default`, but can instead just say `libSpinMod.foo` */
  override def _to: SpinFCType = default
}
