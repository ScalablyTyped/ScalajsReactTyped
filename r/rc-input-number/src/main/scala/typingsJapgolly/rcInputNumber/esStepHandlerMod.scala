package typingsJapgolly.rcInputNumber

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

object esStepHandlerMod {
  
  @JSImport("rc-input-number/es/StepHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasPrefixClsUpNodeDownNodeUpDisabledDownDisabledOnStep: StepHandlerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPrefixClsUpNodeDownNodeUpDisabledDownDisabledOnStep.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait StepHandlerProps extends StObject {
    
    var downDisabled: js.UndefOr[Boolean] = js.undefined
    
    var downNode: js.UndefOr[Node] = js.undefined
    
    def onStep(up: Boolean): Unit
    
    var prefixCls: String
    
    var upDisabled: js.UndefOr[Boolean] = js.undefined
    
    var upNode: js.UndefOr[Node] = js.undefined
  }
  object StepHandlerProps {
    
    inline def apply(onStep: Boolean => Callback, prefixCls: String): StepHandlerProps = {
      val __obj = js.Dynamic.literal(onStep = js.Any.fromFunction1((t0: Boolean) => onStep(t0).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepHandlerProps]
    }
    
    extension [Self <: StepHandlerProps](x: Self) {
      
      inline def setDownDisabled(value: Boolean): Self = StObject.set(x, "downDisabled", value.asInstanceOf[js.Any])
      
      inline def setDownDisabledUndefined: Self = StObject.set(x, "downDisabled", js.undefined)
      
      inline def setDownNode(value: VdomNode): Self = StObject.set(x, "downNode", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDownNodeNull: Self = StObject.set(x, "downNode", null)
      
      inline def setDownNodeUndefined: Self = StObject.set(x, "downNode", js.undefined)
      
      inline def setDownNodeVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "downNode", js.Array(value*))
      
      inline def setDownNodeVdomElement(value: VdomElement): Self = StObject.set(x, "downNode", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnStep(value: Boolean => Callback): Self = StObject.set(x, "onStep", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setUpDisabled(value: Boolean): Self = StObject.set(x, "upDisabled", value.asInstanceOf[js.Any])
      
      inline def setUpDisabledUndefined: Self = StObject.set(x, "upDisabled", js.undefined)
      
      inline def setUpNode(value: VdomNode): Self = StObject.set(x, "upNode", value.rawNode.asInstanceOf[js.Any])
      
      inline def setUpNodeNull: Self = StObject.set(x, "upNode", null)
      
      inline def setUpNodeUndefined: Self = StObject.set(x, "upNode", js.undefined)
      
      inline def setUpNodeVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "upNode", js.Array(value*))
      
      inline def setUpNodeVdomElement(value: VdomElement): Self = StObject.set(x, "upNode", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
