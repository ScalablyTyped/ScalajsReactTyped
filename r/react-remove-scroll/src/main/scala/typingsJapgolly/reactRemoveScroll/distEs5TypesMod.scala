package typingsJapgolly.reactRemoveScroll

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactRemoveScroll.anon.FullWidth
import typingsJapgolly.reactRemoveScroll.anon.SideCar
import typingsJapgolly.reactRemoveScroll.reactRemoveScrollBooleans.`false`
import typingsJapgolly.reactRemoveScroll.reactRemoveScrollBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5TypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactRemoveScroll.reactRemoveScrollStrings.v
    - typingsJapgolly.reactRemoveScroll.reactRemoveScrollStrings.h
  */
  trait Axis extends StObject
  object Axis {
    
    inline def h: typingsJapgolly.reactRemoveScroll.reactRemoveScrollStrings.h = "h".asInstanceOf[typingsJapgolly.reactRemoveScroll.reactRemoveScrollStrings.h]
    
    inline def v: typingsJapgolly.reactRemoveScroll.reactRemoveScrollStrings.v = "v".asInstanceOf[typingsJapgolly.reactRemoveScroll.reactRemoveScrollStrings.v]
  }
  
  trait ChildrenForward extends StObject {
    
    var children: Element
    
    /**
      * if forwardProps is true - children should be single Element
      * which would NOT with a div
      * @see {@link IRemoveScrollSelfProps.as}
      */
    var forwardProps: `true`
  }
  object ChildrenForward {
    
    inline def apply(children: VdomElement): ChildrenForward = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], forwardProps = true)
      __obj.asInstanceOf[ChildrenForward]
    }
    
    extension [Self <: ChildrenForward](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setForwardProps(value: `true`): Self = StObject.set(x, "forwardProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChildrenNode extends StObject {
    
    var children: Node
    
    /**
      * if forwardProps is false - children should be ReactNode
      * and it would be wrapper with a div
      * @see {@link IRemoveScrollSelfProps.as}
      */
    var forwardProps: js.UndefOr[`false`] = js.undefined
  }
  object ChildrenNode {
    
    inline def apply(): ChildrenNode = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ChildrenNode]
    }
    
    extension [Self <: ChildrenNode](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setForwardProps(value: `false`): Self = StObject.set(x, "forwardProps", value.asInstanceOf[js.Any])
      
      inline def setForwardPropsUndefined: Self = StObject.set(x, "forwardProps", js.undefined)
    }
  }
  
  trait IRemoveScrollEffectProps extends StObject {
    
    var allowPinchZoom: Boolean
    
    var inert: js.UndefOr[Boolean] = js.undefined
    
    var lockRef: RefHandle[HTMLElement]
    
    var noIsolation: js.UndefOr[Boolean] = js.undefined
    
    var removeScrollBar: js.UndefOr[Boolean] = js.undefined
    
    def setCallbacks(cb: RemoveScrollEffectCallbacks): Unit
    
    var shards: js.UndefOr[js.Array[RefHandle[Any] | HTMLElement]] = js.undefined
  }
  object IRemoveScrollEffectProps {
    
    inline def apply(
      allowPinchZoom: Boolean,
      lockRef: RefHandle[HTMLElement],
      setCallbacks: RemoveScrollEffectCallbacks => Callback
    ): IRemoveScrollEffectProps = {
      val __obj = js.Dynamic.literal(allowPinchZoom = allowPinchZoom.asInstanceOf[js.Any], lockRef = lockRef.asInstanceOf[js.Any], setCallbacks = js.Any.fromFunction1((t0: RemoveScrollEffectCallbacks) => setCallbacks(t0).runNow()))
      __obj.asInstanceOf[IRemoveScrollEffectProps]
    }
    
    extension [Self <: IRemoveScrollEffectProps](x: Self) {
      
      inline def setAllowPinchZoom(value: Boolean): Self = StObject.set(x, "allowPinchZoom", value.asInstanceOf[js.Any])
      
      inline def setInert(value: Boolean): Self = StObject.set(x, "inert", value.asInstanceOf[js.Any])
      
      inline def setInertUndefined: Self = StObject.set(x, "inert", js.undefined)
      
      inline def setLockRef(value: RefHandle[HTMLElement]): Self = StObject.set(x, "lockRef", value.asInstanceOf[js.Any])
      
      inline def setNoIsolation(value: Boolean): Self = StObject.set(x, "noIsolation", value.asInstanceOf[js.Any])
      
      inline def setNoIsolationUndefined: Self = StObject.set(x, "noIsolation", js.undefined)
      
      inline def setRemoveScrollBar(value: Boolean): Self = StObject.set(x, "removeScrollBar", value.asInstanceOf[js.Any])
      
      inline def setRemoveScrollBarUndefined: Self = StObject.set(x, "removeScrollBar", js.undefined)
      
      inline def setSetCallbacks(value: RemoveScrollEffectCallbacks => Callback): Self = StObject.set(x, "setCallbacks", js.Any.fromFunction1((t0: RemoveScrollEffectCallbacks) => value(t0).runNow()))
      
      inline def setShards(value: js.Array[RefHandle[Any] | HTMLElement]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
      
      inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
      
      inline def setShardsVarargs(value: (RefHandle[Any] | HTMLElement)*): Self = StObject.set(x, "shards", js.Array(value*))
    }
  }
  
  type IRemoveScrollProps = (ChildrenForward & IRemoveScrollSelfProps) | (ChildrenNode & IRemoveScrollSelfProps)
  
  trait IRemoveScrollSelfProps extends StObject {
    
    /**
      * allows pinch-zoom, however might work not perfectly for normal scroll
      */
    var allowPinchZoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Control host node used for the lock.
      * @default 'div'
      */
    var as: js.UndefOr[String | ElementType] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * switches on/off the behavior of the component
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * enabled complete Lock isolation using `pointer-events:none` for anything outside the Lock
      * you probably don't need it, except you do
      * @default false
      * @see {IRemoveScrollSelfProps.noIsolation}
      */
    var inert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * disables "event isolation" (suppressing of events happening outside of the Lock)
      * @default false
      */
    var noIsolation: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    /**
      * Controls the body scroll bar removal
      * @default false
      */
    var removeScrollBar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * array of refs to other Elements, which should be considered as a part of the Lock
      */
    var shards: js.UndefOr[js.Array[RefHandle[Any] | HTMLElement]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object IRemoveScrollSelfProps {
    
    inline def apply(): IRemoveScrollSelfProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRemoveScrollSelfProps]
    }
    
    extension [Self <: IRemoveScrollSelfProps](x: Self) {
      
      inline def setAllowPinchZoom(value: Boolean): Self = StObject.set(x, "allowPinchZoom", value.asInstanceOf[js.Any])
      
      inline def setAllowPinchZoomUndefined: Self = StObject.set(x, "allowPinchZoom", js.undefined)
      
      inline def setAs(value: String | ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setInert(value: Boolean): Self = StObject.set(x, "inert", value.asInstanceOf[js.Any])
      
      inline def setInertUndefined: Self = StObject.set(x, "inert", js.undefined)
      
      inline def setNoIsolation(value: Boolean): Self = StObject.set(x, "noIsolation", value.asInstanceOf[js.Any])
      
      inline def setNoIsolationUndefined: Self = StObject.set(x, "noIsolation", js.undefined)
      
      inline def setRef(value: Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRemoveScrollBar(value: Boolean): Self = StObject.set(x, "removeScrollBar", value.asInstanceOf[js.Any])
      
      inline def setRemoveScrollBarUndefined: Self = StObject.set(x, "removeScrollBar", js.undefined)
      
      inline def setShards(value: js.Array[RefHandle[Any] | HTMLElement]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
      
      inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
      
      inline def setShardsVarargs(value: (RefHandle[Any] | HTMLElement)*): Self = StObject.set(x, "shards", js.Array(value*))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type IRemoveScrollUIProps = IRemoveScrollProps & SideCar
  
  @js.native
  trait RefForwarded[T]
    extends StObject
       with ForwardRefExoticComponent[T & RefAttributes[HTMLElement]]
       with WithClassNames
  
  trait RemoveScrollEffectCallbacks extends StObject {
    
    def onScrollCapture(event: Any): Unit
    
    def onTouchMoveCapture(event: Any): Unit
    
    def onWheelCapture(event: Any): Unit
  }
  object RemoveScrollEffectCallbacks {
    
    inline def apply(
      onScrollCapture: Any => Callback,
      onTouchMoveCapture: Any => Callback,
      onWheelCapture: Any => Callback
    ): RemoveScrollEffectCallbacks = {
      val __obj = js.Dynamic.literal(onScrollCapture = js.Any.fromFunction1((t0: Any) => onScrollCapture(t0).runNow()), onTouchMoveCapture = js.Any.fromFunction1((t0: Any) => onTouchMoveCapture(t0).runNow()), onWheelCapture = js.Any.fromFunction1((t0: Any) => onWheelCapture(t0).runNow()))
      __obj.asInstanceOf[RemoveScrollEffectCallbacks]
    }
    
    extension [Self <: RemoveScrollEffectCallbacks](x: Self) {
      
      inline def setOnScrollCapture(value: Any => Callback): Self = StObject.set(x, "onScrollCapture", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setOnTouchMoveCapture(value: Any => Callback): Self = StObject.set(x, "onTouchMoveCapture", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setOnWheelCapture(value: Any => Callback): Self = StObject.set(x, "onWheelCapture", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  type RemoveScrollType = RefForwarded[IRemoveScrollProps]
  
  type RemoveScrollUIType = RefForwarded[IRemoveScrollUIProps]
  
  trait WithClassNames extends StObject {
    
    var classNames: FullWidth
  }
  object WithClassNames {
    
    inline def apply(classNames: FullWidth): WithClassNames = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithClassNames]
    }
    
    extension [Self <: WithClassNames](x: Self) {
      
      inline def setClassNames(value: FullWidth): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    }
  }
}
