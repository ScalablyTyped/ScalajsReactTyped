package typingsJapgolly.primereact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrolltopScrolltopMod {
  
  @JSImport("primereact/scrolltop/scrolltop", "ScrollTop")
  @js.native
  open class ScrollTop protected () extends Component[ScrollTopProps, Any, Any] {
    def this(props: ScrollTopProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollTopProps, context: Any) = this()
    
    def getElement(): HTMLButtonElement = js.native
  }
  
  trait ScrollTopProps extends StObject {
    
    var behavior: js.UndefOr[ScrollTopScrollBehavior] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ScrollTopProps> */ Any
      ] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var target: js.UndefOr[ScrollTopTargetType] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var transitionOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ] = js.undefined
  }
  object ScrollTopProps {
    
    inline def apply(): ScrollTopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollTopProps]
    }
    
    extension [Self <: ScrollTopProps](x: Self) {
      
      inline def setBehavior(value: ScrollTopScrollBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ScrollTopProps> */ Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: ScrollTopTargetType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTransitionOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ): Self = StObject.set(x, "transitionOptions", value.asInstanceOf[js.Any])
      
      inline def setTransitionOptionsUndefined: Self = StObject.set(x, "transitionOptions", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.primereact.primereactStrings.auto
    - typingsJapgolly.primereact.primereactStrings.smooth
  */
  trait ScrollTopScrollBehavior extends StObject
  object ScrollTopScrollBehavior {
    
    inline def auto: typingsJapgolly.primereact.primereactStrings.auto = "auto".asInstanceOf[typingsJapgolly.primereact.primereactStrings.auto]
    
    inline def smooth: typingsJapgolly.primereact.primereactStrings.smooth = "smooth".asInstanceOf[typingsJapgolly.primereact.primereactStrings.smooth]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.primereact.primereactStrings.window
    - typingsJapgolly.primereact.primereactStrings.parent
  */
  trait ScrollTopTargetType extends StObject
  object ScrollTopTargetType {
    
    inline def parent: typingsJapgolly.primereact.primereactStrings.parent = "parent".asInstanceOf[typingsJapgolly.primereact.primereactStrings.parent]
    
    inline def window: typingsJapgolly.primereact.primereactStrings.window = "window".asInstanceOf[typingsJapgolly.primereact.primereactStrings.window]
  }
}
