package typingsJapgolly.rcProgress

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcProgress.esInterfaceMod.ProgressProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLineMod extends Shortcut {
  
  @JSImport("rc-progress/es/Line", JSImport.Default)
  @js.native
  val default: FC[ProgressProps] = js.native
  
  type _To = FC[ProgressProps]
  
  /* This means you don't have to write `default`, but can instead just say `esLineMod.foo` */
  override def _to: FC[ProgressProps] = default
}
