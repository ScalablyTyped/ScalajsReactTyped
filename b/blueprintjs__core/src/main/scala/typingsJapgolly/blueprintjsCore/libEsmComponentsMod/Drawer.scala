package typingsJapgolly.blueprintjsCore.libEsmComponentsMod

import typingsJapgolly.blueprintjsCore.libEsmComponentsDrawerDrawerMod.DrawerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Drawer")
@js.native
open class Drawer protected ()
  extends typingsJapgolly.blueprintjsCore.libEsmComponentsDrawerDrawerMod.Drawer {
  def this(props: DrawerProps) = this()
  def this(props: DrawerProps, context: Any) = this()
}
/* static members */
object Drawer {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Drawer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Drawer.defaultProps")
  @js.native
  def defaultProps: DrawerProps = js.native
  inline def defaultProps_=(x: DrawerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Drawer.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
