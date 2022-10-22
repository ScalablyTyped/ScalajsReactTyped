package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactNativePaper.libTypescriptComponentsMaterialCommunityIconMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptCoreSettingsMod {
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(Consumer) */ @JSImport("react-native-paper/lib/typescript/core/settings", "Provider")
  @js.native
  val Provider: typingsJapgolly.react.mod.Provider[Settings] = js.native
  
  trait Settings extends StObject {
    
    def icon(hasNameColorSizeDirection: IconProps): Node
  }
  object Settings {
    
    inline def apply(icon: IconProps => Node): Settings = {
      val __obj = js.Dynamic.literal(icon = js.Any.fromFunction1(icon))
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setIcon(value: IconProps => Node): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    }
  }
}
