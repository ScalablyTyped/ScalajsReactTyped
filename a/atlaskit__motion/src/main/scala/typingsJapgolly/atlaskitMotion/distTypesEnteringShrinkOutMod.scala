package typingsJapgolly.atlaskitMotion

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.atlaskitMotion.anon.Ref
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.MotionProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEnteringShrinkOutMod extends Shortcut {
  
  /**
    * __ShrinkOut__
    *
    * Will shrink an element down to nothing when exiting.
    * Works best with flex children as collapsing margins can come with undesired behaviour.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  @JSImport("@atlaskit/motion/dist/types/entering/shrink-out", JSImport.Default)
  @js.native
  val default: FC[ShrinkOutProps] = js.native
  
  type ShrinkOutProps = MotionProps[Ref]
  
  type _To = FC[ShrinkOutProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesEnteringShrinkOutMod.foo` */
  override def _to: FC[ShrinkOutProps] = default
}
