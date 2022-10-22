package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsNativeStatusBarMod {
  
  object StatusBar {
    
    @JSImport("@ionic/core/dist/types/utils/native/status-bar", "StatusBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEngine(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngine")().asInstanceOf[Any]
    
    inline def setStyle(options: StyleOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def supportsDefaultStatusBarStyle(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsDefaultStatusBarStyle")().asInstanceOf[Boolean]
  }
  
  @js.native
  sealed trait Style extends StObject
  @JSImport("@ionic/core/dist/types/utils/native/status-bar", "Style")
  @js.native
  object Style extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Style & String] = js.native
    
    @js.native
    sealed trait Dark
      extends StObject
         with Style
    /* "DARK" */ val Dark: typingsJapgolly.ionicCore.distTypesUtilsNativeStatusBarMod.Style.Dark & String = js.native
    
    @js.native
    sealed trait Default
      extends StObject
         with Style
    /* "DEFAULT" */ val Default: typingsJapgolly.ionicCore.distTypesUtilsNativeStatusBarMod.Style.Default & String = js.native
    
    @js.native
    sealed trait Light
      extends StObject
         with Style
    /* "LIGHT" */ val Light: typingsJapgolly.ionicCore.distTypesUtilsNativeStatusBarMod.Style.Light & String = js.native
  }
  
  trait StyleOptions extends StObject {
    
    var style: Style
  }
  object StyleOptions {
    
    inline def apply(style: Style): StyleOptions = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleOptions]
    }
    
    extension [Self <: StyleOptions](x: Self) {
      
      inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
