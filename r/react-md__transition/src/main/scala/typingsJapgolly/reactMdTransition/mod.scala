package typingsJapgolly.reactMdTransition

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactMdTransition.typesCollapseMod.CollapseProps
import typingsJapgolly.reactMdTransition.typesCrossFadeMod.CrossFadeProps
import typingsJapgolly.reactMdTransition.typesCsstransitionMod.CSSTransitionProps
import typingsJapgolly.reactMdTransition.typesScaleTransitionMod.ScaleTransitionProps
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionHookOptions
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionHookReturnValue
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionHookOptions
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionHookReturnValue
import typingsJapgolly.reactMdTransition.typesUseCollapseTransitionMod.CollapseTransitionHookOptions
import typingsJapgolly.reactMdTransition.typesUseCollapseTransitionMod.CollapseTransitionHookReturnValue
import typingsJapgolly.reactMdTransition.typesUseCrossFadeTransitionMod.CrossFadeTransitionHookOptions
import typingsJapgolly.reactMdTransition.typesUseFixedPositioningMod.FixedPositioningHookReturnValue
import typingsJapgolly.reactMdTransition.typesUseFixedPositioningMod.FixedPositioningOptions
import typingsJapgolly.reactMdTransition.typesUseScaleTransitionMod.ScaleTransitionHookOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.CSSTransitionClassNamesObject> */
  object CROSS_FADE_CLASSNAMES {
    
    @JSImport("@react-md/transition", "CROSS_FADE_CLASSNAMES.appear")
    @js.native
    val appear: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "CROSS_FADE_CLASSNAMES.appearActive")
    @js.native
    val appearActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "CROSS_FADE_CLASSNAMES.appearDone")
    @js.native
    val appearDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "CROSS_FADE_CLASSNAMES.enter")
    @js.native
    val enter: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "CROSS_FADE_CLASSNAMES.enterActive")
    @js.native
    val enterActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "CROSS_FADE_CLASSNAMES.enterDone")
    @js.native
    val enterDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "CROSS_FADE_CLASSNAMES.exit")
    @js.native
    val exit: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "CROSS_FADE_CLASSNAMES.exitActive")
    @js.native
    val exitActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "CROSS_FADE_CLASSNAMES.exitDone")
    @js.native
    val exitDone: js.UndefOr[String] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.TransitionTimeoutObject> */
  object CROSS_FADE_TIMEOUT {
    
    @JSImport("@react-md/transition", "CROSS_FADE_TIMEOUT.appear")
    @js.native
    val appear: js.UndefOr[Double] = js.native
    
    @JSImport("@react-md/transition", "CROSS_FADE_TIMEOUT.enter")
    @js.native
    val enter: js.UndefOr[Double] = js.native
    
    @JSImport("@react-md/transition", "CROSS_FADE_TIMEOUT.exit")
    @js.native
    val exit: js.UndefOr[Double] = js.native
  }
  
  inline def CSSTransition[E /* <: HTMLElement */](hasChildrenClassNameOptions: CSSTransitionProps[E]): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("CSSTransition")(hasChildrenClassNameOptions.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def Collapse[E /* <: HTMLElement */](hasChildrenCollapsedClassNameOptions: CollapseProps[E]): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Collapse")(hasChildrenCollapsedClassNameOptions.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def CrossFade[E /* <: HTMLElement */](hasAppearTransitionInChildrenClassNameOptions: CrossFadeProps[E]): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("CrossFade")(hasAppearTransitionInChildrenClassNameOptions.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @JSImport("@react-md/transition", "DEFAULT_COLLAPSE_MIN_HEIGHT")
  @js.native
  val DEFAULT_COLLAPSE_MIN_HEIGHT: /* 0 */ Double = js.native
  
  @JSImport("@react-md/transition", "DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM")
  @js.native
  val DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM: /* 0 */ Double = js.native
  
  @JSImport("@react-md/transition", "DEFAULT_COLLAPSE_MIN_PADDING_TOP")
  @js.native
  val DEFAULT_COLLAPSE_MIN_PADDING_TOP: /* 0 */ Double = js.native
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.TransitionTimeoutObject> */
  object DEFAULT_COLLAPSE_TIMEOUT {
    
    @JSImport("@react-md/transition", "DEFAULT_COLLAPSE_TIMEOUT.appear")
    @js.native
    val appear: js.UndefOr[Double] = js.native
    
    @JSImport("@react-md/transition", "DEFAULT_COLLAPSE_TIMEOUT.enter")
    @js.native
    val enter: js.UndefOr[Double] = js.native
    
    @JSImport("@react-md/transition", "DEFAULT_COLLAPSE_TIMEOUT.exit")
    @js.native
    val exit: js.UndefOr[Double] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.CSSTransitionClassNamesObject> */
  object SCALE_CLASSNAMES {
    
    @JSImport("@react-md/transition", "SCALE_CLASSNAMES.appear")
    @js.native
    val appear: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_CLASSNAMES.appearActive")
    @js.native
    val appearActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_CLASSNAMES.appearDone")
    @js.native
    val appearDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_CLASSNAMES.enter")
    @js.native
    val enter: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_CLASSNAMES.enterActive")
    @js.native
    val enterActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_CLASSNAMES.enterDone")
    @js.native
    val enterDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_CLASSNAMES.exit")
    @js.native
    val exit: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_CLASSNAMES.exitActive")
    @js.native
    val exitActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_CLASSNAMES.exitDone")
    @js.native
    val exitDone: js.UndefOr[String] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.TransitionTimeoutObject> */
  object SCALE_TIMEOUT {
    
    @JSImport("@react-md/transition", "SCALE_TIMEOUT.appear")
    @js.native
    val appear: js.UndefOr[Double] = js.native
    
    @JSImport("@react-md/transition", "SCALE_TIMEOUT.enter")
    @js.native
    val enter: js.UndefOr[Double] = js.native
    
    @JSImport("@react-md/transition", "SCALE_TIMEOUT.exit")
    @js.native
    val exit: js.UndefOr[Double] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.CSSTransitionClassNamesObject> */
  object SCALE_Y_CLASSNAMES {
    
    @JSImport("@react-md/transition", "SCALE_Y_CLASSNAMES.appear")
    @js.native
    val appear: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_Y_CLASSNAMES.appearActive")
    @js.native
    val appearActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_Y_CLASSNAMES.appearDone")
    @js.native
    val appearDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_Y_CLASSNAMES.enter")
    @js.native
    val enter: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_Y_CLASSNAMES.enterActive")
    @js.native
    val enterActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_Y_CLASSNAMES.enterDone")
    @js.native
    val enterDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_Y_CLASSNAMES.exit")
    @js.native
    val exit: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_Y_CLASSNAMES.exitActive")
    @js.native
    val exitActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition", "SCALE_Y_CLASSNAMES.exitDone")
    @js.native
    val exitDone: js.UndefOr[String] = js.native
  }
  
  inline def ScaleTransition[E /* <: HTMLElement */](hasPortalPortalIntoPortalIntoIdChildrenClassNameOptions: ScaleTransitionProps[E]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScaleTransition")(hasPortalPortalIntoPortalIntoIdChildrenClassNameOptions.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useCSSTransition[E /* <: HTMLElement */](hasClassNameClassNamesAppearEnterExitTimeoutOptions: CSSTransitionHookOptions[E]): CSSTransitionHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCSSTransition")(hasClassNameClassNamesAppearEnterExitTimeoutOptions.asInstanceOf[js.Any]).asInstanceOf[CSSTransitionHookReturnValue[E]]
  
  inline def useCollapseTransition[E /* <: HTMLElement */](
    hasPropNodeRefPropStyleClassNameTransitionInTimeoutMinHeightMinPaddingTopMinPaddingBottomTemporaryAppearEnterExitOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited: CollapseTransitionHookOptions[E]
  ): CollapseTransitionHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCollapseTransition")(hasPropNodeRefPropStyleClassNameTransitionInTimeoutMinHeightMinPaddingTopMinPaddingBottomTemporaryAppearEnterExitOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited.asInstanceOf[js.Any]).asInstanceOf[CollapseTransitionHookReturnValue[E]]
  
  inline def useCrossFadeTransition[E /* <: HTMLElement */](): CSSTransitionHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCrossFadeTransition")().asInstanceOf[CSSTransitionHookReturnValue[E]]
  inline def useCrossFadeTransition[E /* <: HTMLElement */](hasTransitionInTimeoutClassNamesOptions: CrossFadeTransitionHookOptions[E]): CSSTransitionHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCrossFadeTransition")(hasTransitionInTimeoutClassNamesOptions.asInstanceOf[js.Any]).asInstanceOf[CSSTransitionHookReturnValue[E]]
  
  inline def useFixedPositioning[FixedToElement /* <: HTMLElement */, FixedElement /* <: HTMLElement */](
    hasPropStyleNodeRefFixedToOnEnterOnEnteringOnEnteredOnExitedAnchorDisableSwappingDisableVHBoundsInitialXInitialYPreventOverlapTransformOriginVhMarginVwMarginWidthXMarginYMarginGetFixedPositionOptionsOnScrollOnResize: FixedPositioningOptions[FixedToElement, FixedElement]
  ): FixedPositioningHookReturnValue[FixedElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFixedPositioning")(hasPropStyleNodeRefFixedToOnEnterOnEnteringOnEnteredOnExitedAnchorDisableSwappingDisableVHBoundsInitialXInitialYPreventOverlapTransformOriginVhMarginVwMarginWidthXMarginYMarginGetFixedPositionOptionsOnScrollOnResize.asInstanceOf[js.Any]).asInstanceOf[FixedPositioningHookReturnValue[FixedElement]]
  
  inline def useScaleTransition[E /* <: HTMLElement */](hasTimeoutVerticalTemporaryClassNamesOptions: ScaleTransitionHookOptions[E]): CSSTransitionHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScaleTransition")(hasTimeoutVerticalTemporaryClassNamesOptions.asInstanceOf[js.Any]).asInstanceOf[CSSTransitionHookReturnValue[E]]
  
  inline def useTransition[E /* <: HTMLElement */](
    hasNodeRefTimeoutTransitionInReflowTemporaryAppearEnterExitOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited: TransitionHookOptions[E]
  ): TransitionHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(hasNodeRefTimeoutTransitionInReflowTemporaryAppearEnterExitOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited.asInstanceOf[js.Any]).asInstanceOf[TransitionHookReturnValue[E]]
}
