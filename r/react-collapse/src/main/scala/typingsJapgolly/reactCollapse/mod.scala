package typingsJapgolly.reactCollapse

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactCollapse.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-collapse", "Collapse")
  @js.native
  open class Collapse protected ()
    extends PureComponent[CollapseProps, js.Object, Any] {
    def this(props: CollapseProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CollapseProps, context: Any) = this()
  }
  
  @JSImport("react-collapse", "UnmountClosed")
  @js.native
  open class UnmountClosed protected ()
    extends PureComponent[CollapseProps, js.Object, Any] {
    def this(props: CollapseProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CollapseProps, context: Any) = this()
  }
  
  trait CollapseCallbackArgs extends StObject {
    
    /** current pixel height of Collapse container (changes until reaches `contentHeight`) */
    var containerHeight: Double
    
    /** determined height of supplied Content */
    var contentHeight: Double
    
    /** `true` only when Collapse is fully closed and height is zero */
    var isFullyClosed: Boolean
    
    /** `true` only when Collapse reached final height */
    var isFullyOpened: Boolean
    
    /** `true` if Collapse has any non-zero height */
    var isOpened: Boolean
  }
  object CollapseCallbackArgs {
    
    inline def apply(
      containerHeight: Double,
      contentHeight: Double,
      isFullyClosed: Boolean,
      isFullyOpened: Boolean,
      isOpened: Boolean
    ): CollapseCallbackArgs = {
      val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], contentHeight = contentHeight.asInstanceOf[js.Any], isFullyClosed = isFullyClosed.asInstanceOf[js.Any], isFullyOpened = isFullyOpened.asInstanceOf[js.Any], isOpened = isOpened.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapseCallbackArgs]
    }
    
    extension [Self <: CollapseCallbackArgs](x: Self) {
      
      inline def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
      
      inline def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      inline def setIsFullyClosed(value: Boolean): Self = StObject.set(x, "isFullyClosed", value.asInstanceOf[js.Any])
      
      inline def setIsFullyOpened(value: Boolean): Self = StObject.set(x, "isFullyOpened", value.asInstanceOf[js.Any])
      
      inline def setIsOpened(value: Boolean): Self = StObject.set(x, "isOpened", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollapseProps
    extends StObject
       with HTMLProps[Collapse] {
    
    /** How often (in ms) the height of the content is checked. */
    var checkTimeout: js.UndefOr[Double] = js.undefined
    
    /** One or multiple children with static, variable or dynamic height. */
    @JSName("children")
    var children_CollapseProps: Node
    
    /** A way to control the initial element style. Will not be valid after the initial render */
    var initialStyle: js.UndefOr[Height] = js.undefined
    
    /** Expands or collapses content. */
    var isOpened: Boolean
    
    /** Callback function triggered when animation has completed */
    var onRest: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.undefined
    
    /** Callback function triggered when animation begins */
    var onWork: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.undefined
    
    /** It is possible to set className for extra div elements that ReactCollapse creates. */
    var theme: js.UndefOr[typingsJapgolly.reactCollapse.anon.Collapse] = js.undefined
  }
  object CollapseProps {
    
    inline def apply(isOpened: Boolean): CollapseProps = {
      val __obj = js.Dynamic.literal(isOpened = isOpened.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[CollapseProps]
    }
    
    extension [Self <: CollapseProps](x: Self) {
      
      inline def setCheckTimeout(value: Double): Self = StObject.set(x, "checkTimeout", value.asInstanceOf[js.Any])
      
      inline def setCheckTimeoutUndefined: Self = StObject.set(x, "checkTimeout", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInitialStyle(value: Height): Self = StObject.set(x, "initialStyle", value.asInstanceOf[js.Any])
      
      inline def setInitialStyleUndefined: Self = StObject.set(x, "initialStyle", js.undefined)
      
      inline def setIsOpened(value: Boolean): Self = StObject.set(x, "isOpened", value.asInstanceOf[js.Any])
      
      inline def setOnRest(value: /* args */ CollapseCallbackArgs => Callback): Self = StObject.set(x, "onRest", js.Any.fromFunction1((t0: /* args */ CollapseCallbackArgs) => value(t0).runNow()))
      
      inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      inline def setOnWork(value: /* args */ CollapseCallbackArgs => Callback): Self = StObject.set(x, "onWork", js.Any.fromFunction1((t0: /* args */ CollapseCallbackArgs) => value(t0).runNow()))
      
      inline def setOnWorkUndefined: Self = StObject.set(x, "onWork", js.undefined)
      
      inline def setTheme(value: typingsJapgolly.reactCollapse.anon.Collapse): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
