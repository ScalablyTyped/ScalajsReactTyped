package typingsJapgolly.atlaskitMotion

import typingsJapgolly.atlaskitMotion.distTypesEnteringSlideInMod.SlideInProps
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Direction
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Fade
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Transition
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEntryPointsSlideInMod {
  
  @JSImport("@atlaskit/motion/dist/types/entry-points/slide-in", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * __SlideIn__
    *
    * Will slide an element into position, generally used for things that appear from outside of the viewport into view.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  @JSImport("@atlaskit/motion/dist/types/entry-points/slide-in", JSImport.Default)
  @js.native
  val default: FC[SlideInProps] = js.native
  
  inline def slideInAnimation(from: Direction, state: Transition, fade: Fade): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("slideInAnimation")(from.asInstanceOf[js.Any], state.asInstanceOf[js.Any], fade.asInstanceOf[js.Any])).asInstanceOf[Any]
}
