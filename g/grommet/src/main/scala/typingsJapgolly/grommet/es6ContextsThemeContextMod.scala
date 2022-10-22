package typingsJapgolly.grommet

import typingsJapgolly.grommet.anon.Children
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ContextsThemeContextMod {
  
  @JSImport("grommet/es6/contexts/ThemeContext", "ThemeContext")
  @js.native
  val ThemeContext: ThemeContextI = js.native
  
  trait ThemeContextI
    extends StObject
       with Context[ThemeValue] {
    
    var Extend: FC[Children]
  }
  object ThemeContextI {
    
    inline def apply(Consumer: Consumer[ThemeValue], Extend: FC[Children], Provider: Provider[ThemeValue]): ThemeContextI = {
      val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Extend = Extend.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeContextI]
    }
    
    extension [Self <: ThemeContextI](x: Self) {
      
      inline def setExtend(value: FC[Children]): Self = StObject.set(x, "Extend", value.asInstanceOf[js.Any])
    }
  }
  
  type ThemeValue = js.Object
}
