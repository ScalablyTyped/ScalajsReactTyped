package typingsJapgolly.materialUiStyles

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.materialUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typingsJapgolly.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/StylesProvider", JSImport.Namespace)
@js.native
object stylesProviderMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[StylesProviderProps, ComponentState, js.Any] {
    def this(props: StylesProviderProps) = this()
    def this(props: StylesProviderProps, context: js.Any) = this()
  }
  
  val StylesContext: Context[StylesOptions] = js.native
  @js.native
  object default extends TopLevel[ComponentType[StylesProviderProps]]
  
}

