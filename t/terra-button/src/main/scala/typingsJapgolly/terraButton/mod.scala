package typingsJapgolly.terraButton

import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.Context
import typingsJapgolly.terraButton.anon.Types
import typingsJapgolly.terraThemeContext.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("terra-button", JSImport.Default)
  @js.native
  open class default[T /* <: HTMLAnchorElement | HTMLButtonElement */] ()
    extends typingsJapgolly.terraButton.libButtonMod.default[T]
  /* static members */
  object default {
    
    @JSImport("terra-button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("terra-button", "default.Opts")
    @js.native
    def Opts: Types = js.native
    inline def Opts_=(x: Types): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Opts")(x.asInstanceOf[js.Any])
    
    @JSImport("terra-button", "default.contextType")
    @js.native
    def contextType: Context[ClassName] = js.native
    inline def contextType_=(x: Context[ClassName]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("terra-button", "ButtonTypes")
  @js.native
  object ButtonTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.terraButton.libButtonMod.ButtonTypes & String] = js.native
    
    /* "button" */ val BUTTON: typingsJapgolly.terraButton.libButtonMod.ButtonTypes.BUTTON & String = js.native
    
    /* "reset" */ val RESET: typingsJapgolly.terraButton.libButtonMod.ButtonTypes.RESET & String = js.native
    
    /* "submit" */ val SUBMIT: typingsJapgolly.terraButton.libButtonMod.ButtonTypes.SUBMIT & String = js.native
  }
  
  @JSImport("terra-button", "ButtonVariants")
  @js.native
  object ButtonVariants extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.terraButton.libButtonMod.ButtonVariants & String] = js.native
    
    /* "action" */ val ACTION: typingsJapgolly.terraButton.libButtonMod.ButtonVariants.ACTION & String = js.native
    
    /* "de-emphasis" */ val `DE-EMPHASIS`: typingsJapgolly.terraButton.libButtonMod.ButtonVariants.`DE-EMPHASIS` & String = js.native
    
    /* "de-emphasis" */ val `DE-EMPHSASIS`: typingsJapgolly.terraButton.libButtonMod.ButtonVariants.`DE-EMPHSASIS` & String = js.native
    
    /* "emphasis" */ val EMPHASIS: typingsJapgolly.terraButton.libButtonMod.ButtonVariants.EMPHASIS & String = js.native
    
    /* "ghost" */ val GHOST: typingsJapgolly.terraButton.libButtonMod.ButtonVariants.GHOST & String = js.native
    
    /* "neutral" */ val NEUTRAL: typingsJapgolly.terraButton.libButtonMod.ButtonVariants.NEUTRAL & String = js.native
    
    /* "utility" */ val UTILITY: typingsJapgolly.terraButton.libButtonMod.ButtonVariants.UTILITY & String = js.native
  }
}
