package typingsJapgolly.rcPicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsHeaderMod {
  
  @JSImport("rc-picker/es/panels/Header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasPrefixClsPrevIconNextIconSuperPrevIconSuperNextIconOnSuperPrevOnSuperNextOnPrevOnNextChildren: HeaderProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPrefixClsPrevIconNextIconSuperPrevIconSuperNextIconOnSuperPrevOnSuperNextOnPrevOnNextChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait HeaderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var nextIcon: js.UndefOr[Node] = js.undefined
    
    /** Next one step */
    var onNext: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Last one step */
    var onPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Next multiple steps */
    var onSuperNext: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Last multiple steps */
    var onSuperPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var prefixCls: String
    
    var prevIcon: js.UndefOr[Node] = js.undefined
    
    var superNextIcon: js.UndefOr[Node] = js.undefined
    
    var superPrevIcon: js.UndefOr[Node] = js.undefined
  }
  object HeaderProps {
    
    inline def apply(prefixCls: String): HeaderProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderProps]
    }
    
    extension [Self <: HeaderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNextIcon(value: VdomNode): Self = StObject.set(x, "nextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNextIconNull: Self = StObject.set(x, "nextIcon", null)
      
      inline def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      inline def setNextIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "nextIcon", js.Array(value*))
      
      inline def setNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "nextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnNext(value: Callback): Self = StObject.set(x, "onNext", value.toJsFn)
      
      inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      inline def setOnPrev(value: Callback): Self = StObject.set(x, "onPrev", value.toJsFn)
      
      inline def setOnPrevUndefined: Self = StObject.set(x, "onPrev", js.undefined)
      
      inline def setOnSuperNext(value: Callback): Self = StObject.set(x, "onSuperNext", value.toJsFn)
      
      inline def setOnSuperNextUndefined: Self = StObject.set(x, "onSuperNext", js.undefined)
      
      inline def setOnSuperPrev(value: Callback): Self = StObject.set(x, "onSuperPrev", value.toJsFn)
      
      inline def setOnSuperPrevUndefined: Self = StObject.set(x, "onSuperPrev", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrevIcon(value: VdomNode): Self = StObject.set(x, "prevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrevIconNull: Self = StObject.set(x, "prevIcon", null)
      
      inline def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      inline def setPrevIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "prevIcon", js.Array(value*))
      
      inline def setPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "prevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSuperNextIcon(value: VdomNode): Self = StObject.set(x, "superNextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuperNextIconNull: Self = StObject.set(x, "superNextIcon", null)
      
      inline def setSuperNextIconUndefined: Self = StObject.set(x, "superNextIcon", js.undefined)
      
      inline def setSuperNextIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "superNextIcon", js.Array(value*))
      
      inline def setSuperNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "superNextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSuperPrevIcon(value: VdomNode): Self = StObject.set(x, "superPrevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuperPrevIconNull: Self = StObject.set(x, "superPrevIcon", null)
      
      inline def setSuperPrevIconUndefined: Self = StObject.set(x, "superPrevIcon", js.undefined)
      
      inline def setSuperPrevIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "superPrevIcon", js.Array(value*))
      
      inline def setSuperPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "superPrevIcon", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
