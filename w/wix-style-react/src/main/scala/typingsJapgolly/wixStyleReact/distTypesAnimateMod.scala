package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnimateMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/Animate", JSImport.Default)
  @js.native
  val default: FC[AnimateProps] = js.native
  
  trait AnimateProps extends StObject {
    
    var animateClasses: js.UndefOr[String] = js.undefined
    
    var animateInlineStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var children: Node
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[String | Double] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object AnimateProps {
    
    inline def apply(): AnimateProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[AnimateProps]
    }
    
    extension [Self <: AnimateProps](x: Self) {
      
      inline def setAnimateClasses(value: String): Self = StObject.set(x, "animateClasses", value.asInstanceOf[js.Any])
      
      inline def setAnimateClassesUndefined: Self = StObject.set(x, "animateClasses", js.undefined)
      
      inline def setAnimateInlineStyle(value: CSSProperties): Self = StObject.set(x, "animateInlineStyle", value.asInstanceOf[js.Any])
      
      inline def setAnimateInlineStyleUndefined: Self = StObject.set(x, "animateInlineStyle", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDelay(value: String | Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setOnEnd(value: Callback): Self = StObject.set(x, "onEnd", value.toJsFn)
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnStart(value: Callback): Self = StObject.set(x, "onStart", value.toJsFn)
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
  
  type _To = FC[AnimateProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesAnimateMod.foo` */
  override def _to: FC[AnimateProps] = default
}
