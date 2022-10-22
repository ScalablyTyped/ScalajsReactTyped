package typingsJapgolly.antd

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.libSkeletonSkeletonMod.CompoundedComponent
import typingsJapgolly.antd.libSkeletonSkeletonMod.SkeletonProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSkeletonMod extends Shortcut {
  
  @JSImport("antd/lib/skeleton", JSImport.Default)
  @js.native
  val default: FC[SkeletonProps] & CompoundedComponent = js.native
  
  type _To = FC[SkeletonProps] & CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libSkeletonMod.foo` */
  override def _to: FC[SkeletonProps] & CompoundedComponent = default
}
