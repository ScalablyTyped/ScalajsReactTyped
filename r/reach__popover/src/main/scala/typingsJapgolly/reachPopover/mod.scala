package typingsJapgolly.reachPopover

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.reachPolymorphic.mod.ForwardRefComponent
import typingsJapgolly.reachPopover.anon.DirectionDown
import typingsJapgolly.reachPopover.reachPopoverStrings.div
import typingsJapgolly.reachRect.mod.PRect
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/popover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Welcome to @reach/popover!
    */
  /**
    * Popover
    */
  @JSImport("@reach/popover", "Popover")
  @js.native
  val Popover: ForwardRefComponent[div, PopoverProps] = js.native
  
  inline def getCollisions(targetRect: PRect, popoverRect: PRect): DirectionDown = (^.asInstanceOf[js.Dynamic].applyDynamic("getCollisions")(targetRect.asInstanceOf[js.Any], popoverRect.asInstanceOf[js.Any])).asInstanceOf[DirectionDown]
  inline def getCollisions(targetRect: PRect, popoverRect: PRect, offsetLeft: Double): DirectionDown = (^.asInstanceOf[js.Dynamic].applyDynamic("getCollisions")(targetRect.asInstanceOf[js.Any], popoverRect.asInstanceOf[js.Any], offsetLeft.asInstanceOf[js.Any])).asInstanceOf[DirectionDown]
  inline def getCollisions(targetRect: PRect, popoverRect: PRect, offsetLeft: Double, offsetBottom: Double): DirectionDown = (^.asInstanceOf[js.Dynamic].applyDynamic("getCollisions")(targetRect.asInstanceOf[js.Any], popoverRect.asInstanceOf[js.Any], offsetLeft.asInstanceOf[js.Any], offsetBottom.asInstanceOf[js.Any])).asInstanceOf[DirectionDown]
  inline def getCollisions(targetRect: PRect, popoverRect: PRect, offsetLeft: Unit, offsetBottom: Double): DirectionDown = (^.asInstanceOf[js.Dynamic].applyDynamic("getCollisions")(targetRect.asInstanceOf[js.Any], popoverRect.asInstanceOf[js.Any], offsetLeft.asInstanceOf[js.Any], offsetBottom.asInstanceOf[js.Any])).asInstanceOf[DirectionDown]
  
  @JSImport("@reach/popover", "positionDefault")
  @js.native
  val positionDefault: Position = js.native
  
  @JSImport("@reach/popover", "positionMatchWidth")
  @js.native
  val positionMatchWidth: Position = js.native
  
  @JSImport("@reach/popover", "positionRight")
  @js.native
  val positionRight: Position = js.native
  
  trait PopoverProps extends StObject {
    
    var children: Node
    
    /**
      * Render the popover markup, but hide it – used by MenuButton so that it
      * can have an `aria-controls` attribute even when its menu isn't open, and
      * used inside `Popover` as a hint that we can tell `useRect` to stop
      * observing for better performance.
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var targetRef: RefHandle[PossibleNode]
    
    /**
      * Testing this API so we might accept additional nodes that apps can use to
      * determine the position of the popover. One example where it may be useful
      * is for positioning the popover of a listbox where the cursor rests on top
      * of the selected option. Pretty sure this will change so don't use it
      * anywhere in public yet!
      */
    var unstable_observableRefs: js.UndefOr[js.Array[RefHandle[PossibleNode]]] = js.undefined
    
    var unstable_skipInitialPortalRender: js.UndefOr[Boolean] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(targetRef: RefHandle[PossibleNode]): PopoverProps = {
      val __obj = js.Dynamic.literal(targetRef = targetRef.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[PopoverProps]
    }
    
    extension [Self <: PopoverProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTargetRef(value: RefHandle[PossibleNode]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setUnstable_observableRefs(value: js.Array[RefHandle[PossibleNode]]): Self = StObject.set(x, "unstable_observableRefs", value.asInstanceOf[js.Any])
      
      inline def setUnstable_observableRefsUndefined: Self = StObject.set(x, "unstable_observableRefs", js.undefined)
      
      inline def setUnstable_observableRefsVarargs(value: RefHandle[PossibleNode]*): Self = StObject.set(x, "unstable_observableRefs", js.Array(value*))
      
      inline def setUnstable_skipInitialPortalRender(value: Boolean): Self = StObject.set(x, "unstable_skipInitialPortalRender", value.asInstanceOf[js.Any])
      
      inline def setUnstable_skipInitialPortalRenderUndefined: Self = StObject.set(x, "unstable_skipInitialPortalRender", js.undefined)
    }
  }
  
  @js.native
  trait Position extends StObject {
    
    def apply(targetRect: Null, popoverRect: Null, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: Null, popoverRect: Unit, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: Null, popoverRect: PRect, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: Unit, popoverRect: Null, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: Unit, popoverRect: Unit, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: Unit, popoverRect: PRect, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: PRect, popoverRect: Null, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: PRect, popoverRect: Unit, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
    def apply(targetRect: PRect, popoverRect: PRect, unstable_observableNodes: PossibleNode*): CSSProperties = js.native
  }
  
  type PossibleNode = js.UndefOr[Null | HTMLElement | SVGElement]
}
