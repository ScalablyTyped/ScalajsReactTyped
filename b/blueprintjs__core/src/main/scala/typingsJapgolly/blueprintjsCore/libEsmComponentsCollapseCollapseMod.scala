package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.blueprintjsCore.anon.AnimationState
import typingsJapgolly.blueprintjsCore.anon.Height
import typingsJapgolly.blueprintjsCore.anon.PartialCollapseProps
import typingsJapgolly.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsCollapseCollapseMod {
  
  @js.native
  sealed trait AnimationStates extends StObject
  @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "AnimationStates")
  @js.native
  object AnimationStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AnimationStates & Double] = js.native
    
    /**
      * The contents of the collapse is not rendered, the collapse height is 0,
      * and the body Y is at -height (so that the bottom of the body is at Y=0).
      */
    @js.native
    sealed trait CLOSED
      extends StObject
         with AnimationStates
    /* 5 */ val CLOSED: typingsJapgolly.blueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.CLOSED & Double = js.native
    
    /**
      * Height is set to 0 and the body Y is at -height. Both of these properties
      * are transformed, and then after the animation is complete, the state
      * changes to CLOSED.
      */
    @js.native
    sealed trait CLOSING
      extends StObject
         with AnimationStates
    /* 4 */ val CLOSING: typingsJapgolly.blueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.CLOSING & Double = js.native
    
    /**
      * Height has been changed from auto to the measured height of the body to
      * prepare for the closing animation in CLOSING.
      */
    @js.native
    sealed trait CLOSING_START
      extends StObject
         with AnimationStates
    /* 3 */ val CLOSING_START: typingsJapgolly.blueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.CLOSING_START & Double = js.native
    
    /**
      * The collapse height is set to auto, and the body Y is set to 0 (so the
      * element can be seen as normal).
      */
    @js.native
    sealed trait OPEN
      extends StObject
         with AnimationStates
    /* 2 */ val OPEN: typingsJapgolly.blueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.OPEN & Double = js.native
    
    /**
      * Animation begins, height is set to auto. This is all animated, and on
      * complete, the state changes to OPEN.
      */
    @js.native
    sealed trait OPENING
      extends StObject
         with AnimationStates
    /* 1 */ val OPENING: typingsJapgolly.blueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.OPENING & Double = js.native
    
    /**
      * The body is re-rendered, height is set to the measured body height and
      * the body Y is set to 0.
      */
    @js.native
    sealed trait OPEN_START
      extends StObject
         with AnimationStates
    /* 0 */ val OPEN_START: typingsJapgolly.blueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.OPEN_START & Double = js.native
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse")
  @js.native
  open class Collapse protected ()
    extends AbstractPureComponent2[CollapseProps, ICollapseState, js.Object] {
    def this(props: CollapseProps) = this()
    def this(props: CollapseProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MCollapse(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCollapse(): Unit = js.native
    
    /* private */ var contents: Any = js.native
    
    /* private */ var contentsRefHandler: Any = js.native
    
    /* private */ var onDelayedStateChange: Any = js.native
  }
  /* static members */
  object Collapse {
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse.defaultProps")
    @js.native
    def defaultProps: PartialCollapseProps = js.native
    inline def defaultProps_=(x: PartialCollapseProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: CollapseProps, state: ICollapseState): AnimationState | Height | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AnimationState | Height | Null]
  }
  
  type CollapseProps = ICollapseProps
  
  trait ICollapseProps
    extends StObject
       with IProps {
    
    /** Contents to collapse. */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Component to render as the root element.
      * Useful when rendering a `Collapse` inside a `<table>`, for instance.
      *
      * @default "div"
      */
    var component: js.UndefOr[ElementType] = js.undefined
    
    /**
      * Whether the component is open or closed.
      *
      * @default false
      */
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the child components will remain mounted when the `Collapse` is closed.
      * Setting to true may improve performance by avoiding re-mounting children.
      *
      * @default false
      */
    var keepChildrenMounted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The length of time the transition takes, in milliseconds. This must match
      * the duration of the animation in CSS. Only set this prop if you override
      * Blueprint's default transitions with new transitions of a different
      * length.
      *
      * @default 200
      */
    var transitionDuration: js.UndefOr[Double] = js.undefined
  }
  object ICollapseProps {
    
    inline def apply(): ICollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICollapseProps]
    }
    
    extension [Self <: ICollapseProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setKeepChildrenMounted(value: Boolean): Self = StObject.set(x, "keepChildrenMounted", value.asInstanceOf[js.Any])
      
      inline def setKeepChildrenMountedUndefined: Self = StObject.set(x, "keepChildrenMounted", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
  
  trait ICollapseState extends StObject {
    
    /** The state the element is currently in. */
    var animationState: AnimationStates
    
    /** The height that should be used for the content animations. This is a CSS value, not just a number. */
    var height: js.UndefOr[String] = js.undefined
    
    /**
      * The most recent non-zero height (once a height has been measured upon first open; it is undefined until then)
      */
    var heightWhenOpen: js.UndefOr[Double] = js.undefined
  }
  object ICollapseState {
    
    inline def apply(animationState: AnimationStates): ICollapseState = {
      val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICollapseState]
    }
    
    extension [Self <: ICollapseState](x: Self) {
      
      inline def setAnimationState(value: AnimationStates): Self = StObject.set(x, "animationState", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightWhenOpen(value: Double): Self = StObject.set(x, "heightWhenOpen", value.asInstanceOf[js.Any])
      
      inline def setHeightWhenOpenUndefined: Self = StObject.set(x, "heightWhenOpen", js.undefined)
    }
  }
}
