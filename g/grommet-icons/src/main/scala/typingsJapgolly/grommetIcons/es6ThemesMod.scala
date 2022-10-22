package typingsJapgolly.grommetIcons

import typingsJapgolly.grommetIcons.anon.Colors
import typingsJapgolly.grommetIcons.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ThemesMod {
  
  object base {
    
    @JSImport("grommet-icons/es6/themes", "base")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("grommet-icons/es6/themes", "base.global")
    @js.native
    def global: Colors = js.native
    inline def global_=(x: Colors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("global")(x.asInstanceOf[js.Any])
    
    @JSImport("grommet-icons/es6/themes", "base.icon")
    @js.native
    def icon: Size = js.native
    inline def icon_=(x: Size): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icon")(x.asInstanceOf[js.Any])
  }
}
