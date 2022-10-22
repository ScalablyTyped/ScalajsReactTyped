package typingsJapgolly.atlaskitMotion

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.atlaskitMotion.anon.Mediaprefersreducedmotionreduce
import typingsJapgolly.atlaskitMotion.anon.RefCallbackRef
import typingsJapgolly.atlaskitMotion.anon.ResizingHeightOptschildre
import typingsJapgolly.atlaskitMotion.distTypesEnteringExitingPersistenceMod.ExitingChildContext
import typingsJapgolly.atlaskitMotion.distTypesEnteringExitingPersistenceMod.ExitingPersistenceProps
import typingsJapgolly.atlaskitMotion.distTypesEnteringFadeInMod.FadeKeyframesMotionProps
import typingsJapgolly.atlaskitMotion.distTypesEnteringKeyframesMotionMod.KeyframesMotionProps
import typingsJapgolly.atlaskitMotion.distTypesEnteringShrinkOutMod.ShrinkOutProps
import typingsJapgolly.atlaskitMotion.distTypesEnteringSlideInMod.SlideInProps
import typingsJapgolly.atlaskitMotion.distTypesEnteringStaggeredEntranceMod.StaggeredEntranceProps
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Direction
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Distance
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Fade
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Transition
import typingsJapgolly.atlaskitMotion.distTypesResizingHeightMod.ResizingHeightOpts
import typingsJapgolly.atlaskitMotion.distTypesUtilsCurvesMod.AnimationCurve
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/motion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * __ExitingPersistence__
    *
    * Useful for enabling elements to persist and animate away when they are removed from the DOM.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  @JSImport("@atlaskit/motion", "ExitingPersistence")
  @js.native
  val ExitingPersistence: FC[ExitingPersistenceProps] = js.native
  
  /**
    * __FadeIn__
    *
    * Useful for fading in one or more elements.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  @JSImport("@atlaskit/motion", "FadeIn")
  @js.native
  val FadeIn: FC[FadeKeyframesMotionProps] = js.native
  
  inline def ResizingHeight(hasChildrenProps: ResizingHeightOptschildre): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("ResizingHeight")(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  /**
    * __ShrinkOut__
    *
    * Will shrink an element down to nothing when exiting.
    * Works best with flex children as collapsing margins can come with undesired behaviour.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  @JSImport("@atlaskit/motion", "ShrinkOut")
  @js.native
  val ShrinkOut: FC[ShrinkOutProps] = js.native
  
  /**
    * __SlideIn__
    *
    * Will slide an element into position, generally used for things that appear from outside of the viewport into view.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  @JSImport("@atlaskit/motion", "SlideIn")
  @js.native
  val SlideIn: FC[SlideInProps] = js.native
  
  /**
    * For a list of elements that need to animate in,
    * this should be used in conjunction with entering components.
    * This does not need Javascript to execute so it will run immediately for any SSR rendered React apps before the JS has executed.
    *
    * Will dynamically add delay to each child entering component.
    * Unfortunately all entering components _NEED_ to be a direct descendant.
    */
  @JSImport("@atlaskit/motion", "StaggeredEntrance")
  @js.native
  val StaggeredEntrance: FC[StaggeredEntranceProps] = js.native
  
  /**
    * __ZoomIn__
    *
    * Will over zoom an element into position.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  @JSImport("@atlaskit/motion", "ZoomIn")
  @js.native
  val ZoomIn: FC[KeyframesMotionProps] = js.native
  
  @JSImport("@atlaskit/motion", "durationStep")
  @js.native
  val durationStep: /* 25 */ Double = js.native
  
  @JSImport("@atlaskit/motion", "easeIn")
  @js.native
  val easeIn: AnimationCurve = js.native
  
  @JSImport("@atlaskit/motion", "easeInOut")
  @js.native
  val easeInOut: AnimationCurve = js.native
  
  @JSImport("@atlaskit/motion", "easeOut")
  @js.native
  val easeOut: AnimationCurve = js.native
  
  inline def fadeInAnimation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")().asInstanceOf[Any]
  inline def fadeInAnimation(direction: Unit, distance: Distance): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fadeInAnimation(direction: Direction): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def fadeInAnimation(direction: Direction, distance: Distance): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isReducedMotion(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReducedMotion")().asInstanceOf[Boolean]
  
  @JSImport("@atlaskit/motion", "largeDurationMs")
  @js.native
  val largeDurationMs: Double = js.native
  
  @JSImport("@atlaskit/motion", "mediumDurationMs")
  @js.native
  val mediumDurationMs: Double = js.native
  
  inline def prefersReducedMotion(): Mediaprefersreducedmotionreduce = ^.asInstanceOf[js.Dynamic].applyDynamic("prefersReducedMotion")().asInstanceOf[Mediaprefersreducedmotionreduce]
  
  inline def shrinkOutAnimation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shrinkOutAnimation")().asInstanceOf[Any]
  
  inline def slideInAnimation(from: Direction, state: Transition, fade: Fade): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("slideInAnimation")(from.asInstanceOf[js.Any], state.asInstanceOf[js.Any], fade.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@atlaskit/motion", "smallDurationMs")
  @js.native
  val smallDurationMs: Double = js.native
  
  inline def useExitingPersistence(): ExitingChildContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useExitingPersistence")().asInstanceOf[ExitingChildContext]
  
  inline def useIsReducedMotion(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsReducedMotion")().asInstanceOf[Boolean]
  
  inline def useResizingHeight(): RefCallbackRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizingHeight")().asInstanceOf[RefCallbackRef]
  inline def useResizingHeight(hasCalcDurationCalcTimingFunction: ResizingHeightOpts): RefCallbackRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizingHeight")(hasCalcDurationCalcTimingFunction.asInstanceOf[js.Any]).asInstanceOf[RefCallbackRef]
  
  inline def zoomInAnimation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("zoomInAnimation")().asInstanceOf[Any]
}
