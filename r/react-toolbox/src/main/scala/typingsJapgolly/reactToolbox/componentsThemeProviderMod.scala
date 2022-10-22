package typingsJapgolly.reactToolbox

import typingsJapgolly.reactCssThemr.mod.ThemeProvider
import typingsJapgolly.reactCssThemr.mod.ThemeProviderProps
import typingsJapgolly.reactToolbox.anon.ReadonlyThemeProviderProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsThemeProviderMod {
  
  @JSImport("react-toolbox/components/ThemeProvider", JSImport.Default)
  @js.native
  open class default protected () extends ThemeProvider {
    def this(props: ThemeProviderProps) = this()
    def this(props: ReadonlyThemeProviderProp) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ThemeProviderProps, context: Any) = this()
  }
}
