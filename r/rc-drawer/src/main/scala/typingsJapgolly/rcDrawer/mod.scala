package typingsJapgolly.rcDrawer

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcDrawer.esDrawerMod.DrawerProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-drawer", JSImport.Default)
  @js.native
  val default: FC[DrawerProps] = js.native
  
  type _To = FC[DrawerProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[DrawerProps] = default
}
