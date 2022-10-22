package typingsJapgolly.reactFocusLock

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
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactFocusLock.reactFocusLockStrings.tail
import typingsJapgolly.std.FocusOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: Node
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait ChildrenChildrenType[ChildrenType] extends StObject {
    
    var children: ChildrenType
  }
  object ChildrenChildrenType {
    
    inline def apply[ChildrenType](children: ChildrenType): ChildrenChildrenType[ChildrenType] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildrenChildrenType[ChildrenType]]
    }
    
    extension [Self <: ChildrenChildrenType[?], ChildrenType](x: Self & ChildrenChildrenType[ChildrenType]) {
      
      inline def setChildren(value: ChildrenType): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-focus-lock.react-focus-lock/interfaces.ReactFocusLockProps<react.react.ReactNode, std.Record<string, any>> & {  sideCar :react.react.FC<any>} */
  trait ReactFocusLockPropsReactN extends StObject {
    
    /**
      * @deprecated Use persistentFocus=false instead
      * enables(or disables) text selection. This also allows not to have ANY focus.
      */
    var allowTextSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Component to use, defaults to 'div'
      */
    var as: js.UndefOr[String | ElementType] = js.undefined
    
    /**
      * enables or disables autoFocusing feature.
      * If enabled - will move focus inside Lock, selecting the first or autoFocusable element
      * If disable - will blur any focus on Lock activation.
      * @default true
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * enables aggressive focus capturing within iframes
      * - once disabled allows focus to move outside of iframe, if enabled inside iframe
      * - once enabled keep focus in the lock, no matter where lock is active (default)
      * @default true
      */
    var crossFrame: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * used to control behavior or "returning focus back to the lock"
      *
      * @deprecated Can lead to a wrong user experience. Use this option only if you known what you are doing
      * @see {@link https://github.com/theKashey/react-focus-lock/issues/162}
      * @example
      * prevent scroll example
      * ```tsx
      * <FocusLock focusOptions={{preventScroll: true}} />
      * ```
      */
    var focusOptions: js.UndefOr[FocusOptions] = js.undefined
    
    /**
      * named focus group for focus scattering aka combined lock targets
      */
    var group: js.UndefOr[String] = js.undefined
    
    /**
      * Controls support a focus lock behavior when any elements tabIndex greater than 0.
      * @default false
      * @see - https://github.com/theKashey/react-focus-lock/issues/32
      */
    var hasPositiveIndices: js.UndefOr[Boolean] = js.undefined
    
    var lockProps: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * disables hidden inputs before and after the lock.
      */
    var noFocusGuards: js.UndefOr[Boolean | tail] = js.undefined
    
    /**
      * life-cycle hook, called on lock activation
      * @param node the observed node
      */
    var onActivation: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    /**
      * life-cycle hook, called on deactivation
      * @param node the observed node
      */
    var onDeactivation: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    /**
      * enables of disables "sticky" behavior, when any focusable element shall be focused.
      * This disallow any text selection on the page.
      * @default false
      */
    var persistentFocus: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    /**
      * if true, will return focus to the previous position on trap disable.
      * Optionally, can pass focus options instead of `true` to control the focus
      * more precisely (ie. `{ preventScroll: true }`)
      *
      * can also accept a function with the first argument equals to element focus will be returned to
      * in order to provide full control to the user space
      */
    var returnFocus: js.UndefOr[
        Boolean | FocusOptions | (js.Function1[/* returnTo */ org.scalajs.dom.Element, Boolean | FocusOptions])
      ] = js.undefined
    
    /**
      * Shards forms a scattered lock, same as `group` does, but in more "low" and controlled way
      */
    var shards: js.UndefOr[js.Array[RefHandle[Any] | HTMLElement]] = js.undefined
    
    var sideCar: FC[Any]
    
    /**
      * Controls focus lock working areas. Lock will silently ignore all the events from `not allowed` areas
      * @param activeElement
      * @returns {Boolean} true if focus lock should handle activeElement, false if not
      */
    var whiteList: js.UndefOr[js.Function1[/* activeElement */ HTMLElement, Boolean]] = js.undefined
  }
  object ReactFocusLockPropsReactN {
    
    inline def apply(sideCar: FC[Any]): ReactFocusLockPropsReactN = {
      val __obj = js.Dynamic.literal(sideCar = sideCar.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactFocusLockPropsReactN]
    }
    
    extension [Self <: ReactFocusLockPropsReactN](x: Self) {
      
      inline def setAllowTextSelection(value: Boolean): Self = StObject.set(x, "allowTextSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowTextSelectionUndefined: Self = StObject.set(x, "allowTextSelection", js.undefined)
      
      inline def setAs(value: String | ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCrossFrame(value: Boolean): Self = StObject.set(x, "crossFrame", value.asInstanceOf[js.Any])
      
      inline def setCrossFrameUndefined: Self = StObject.set(x, "crossFrame", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocusOptions(value: FocusOptions): Self = StObject.set(x, "focusOptions", value.asInstanceOf[js.Any])
      
      inline def setFocusOptionsUndefined: Self = StObject.set(x, "focusOptions", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setHasPositiveIndices(value: Boolean): Self = StObject.set(x, "hasPositiveIndices", value.asInstanceOf[js.Any])
      
      inline def setHasPositiveIndicesUndefined: Self = StObject.set(x, "hasPositiveIndices", js.undefined)
      
      inline def setLockProps(value: Record[String, Any]): Self = StObject.set(x, "lockProps", value.asInstanceOf[js.Any])
      
      inline def setLockPropsUndefined: Self = StObject.set(x, "lockProps", js.undefined)
      
      inline def setNoFocusGuards(value: Boolean | tail): Self = StObject.set(x, "noFocusGuards", value.asInstanceOf[js.Any])
      
      inline def setNoFocusGuardsUndefined: Self = StObject.set(x, "noFocusGuards", js.undefined)
      
      inline def setOnActivation(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onActivation", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnActivationUndefined: Self = StObject.set(x, "onActivation", js.undefined)
      
      inline def setOnDeactivation(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onDeactivation", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnDeactivationUndefined: Self = StObject.set(x, "onDeactivation", js.undefined)
      
      inline def setPersistentFocus(value: Boolean): Self = StObject.set(x, "persistentFocus", value.asInstanceOf[js.Any])
      
      inline def setPersistentFocusUndefined: Self = StObject.set(x, "persistentFocus", js.undefined)
      
      inline def setRef(value: Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setReturnFocus(
        value: Boolean | FocusOptions | (js.Function1[/* returnTo */ org.scalajs.dom.Element, Boolean | FocusOptions])
      ): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
      
      inline def setReturnFocusFunction1(value: /* returnTo */ org.scalajs.dom.Element => Boolean | FocusOptions): Self = StObject.set(x, "returnFocus", js.Any.fromFunction1(value))
      
      inline def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
      
      inline def setShards(value: js.Array[RefHandle[Any] | HTMLElement]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
      
      inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
      
      inline def setShardsVarargs(value: (RefHandle[Any] | HTMLElement)*): Self = StObject.set(x, "shards", js.Array(value*))
      
      inline def setSideCar(value: FC[Any]): Self = StObject.set(x, "sideCar", value.asInstanceOf[js.Any])
      
      inline def setWhiteList(value: /* activeElement */ HTMLElement => Boolean): Self = StObject.set(x, "whiteList", js.Any.fromFunction1(value))
      
      inline def setWhiteListUndefined: Self = StObject.set(x, "whiteList", js.undefined)
    }
  }
}
