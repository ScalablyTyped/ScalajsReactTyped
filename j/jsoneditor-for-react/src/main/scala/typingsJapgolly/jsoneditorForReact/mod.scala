package typingsJapgolly.jsoneditorForReact

import typingsJapgolly.jsoneditor.mod.JSONEditorOptions
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsoneditor-for-react", JSImport.Default)
  @js.native
  open class default () extends ReactJsoneditor
  
  trait ReactJsonEditorProps extends StObject
  
  @js.native
  trait ReactJsoneditor
    extends Component[ReactJsonEditorProps, js.Object, Any] {
    
    /* private */ var editor: js.UndefOr[typingsJapgolly.jsoneditor.mod.default] = js.native
    
    /* private */ var options: js.UndefOr[JSONEditorOptions] = js.native
  }
}
