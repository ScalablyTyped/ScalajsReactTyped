package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.BorderRadius02
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesThemeProviderThemeProviderMod {
  
  /** ThemeProvider */
  @JSImport("wix-style-react/dist/types/ThemeProvider/ThemeProvider", JSImport.Default)
  @js.native
  open class default protected () extends ThemeProvider {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/ThemeProvider/ThemeProvider", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ThemeProvider/ThemeProvider", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ThemeProvider/ThemeProvider", "default.propTypes.theme")
      @js.native
      val theme: Requireable[InferProps[BorderRadius02]] = js.native
    }
  }
  
  /** ThemeProvider */
  @js.native
  trait ThemeProvider extends PureComponent[Any, Any, Any] {
    
    def _parseTheme(theme: Any): js.Object = js.native
  }
}
