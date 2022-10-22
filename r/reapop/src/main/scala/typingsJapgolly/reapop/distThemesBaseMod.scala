package typingsJapgolly.reapop

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reapop.distReducersNotificationsTypesMod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemesBaseMod {
  
  object default {
    
    @JSImport("reapop/dist/themes/base", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def container(position: Position): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("container")(position.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  }
  
  object baseTheme {
    
    @JSImport("reapop/dist/themes/base", "baseTheme")
    @js.native
    val ^ : js.Any = js.native
    
    inline def container(position: Position): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("container")(position.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  }
}
