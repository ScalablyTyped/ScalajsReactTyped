package typingsJapgolly.playable

import typingsJapgolly.playable.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiTitleTitleDotthemeMod {
  
  object default {
    
    @JSImport("playable/dist/src/modules/ui/title/title.theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/title/title.theme", "default.titleText")
    @js.native
    def titleText: Color = js.native
    inline def titleText_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleText")(x.asInstanceOf[js.Any])
  }
}
