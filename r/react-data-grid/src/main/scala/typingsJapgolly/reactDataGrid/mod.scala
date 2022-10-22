package typingsJapgolly.reactDataGrid

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-data-grid", JSImport.Namespace)
  @js.native
  open class ^[T] () extends ReactDataGrid[T]
  
  @JSImport("react-data-grid", "Cell")
  @js.native
  open class Cell ()
    extends Component[Any, js.Object, Any]
  
  @JSImport("react-data-grid", "Row")
  @js.native
  open class Row ()
    extends Component[Any, js.Object, Any]
  
  object editors {
    
    @JSImport("react-data-grid", "editors.EditorBase")
    @js.native
    open class EditorBase[P, S] ()
      extends typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.editors.EditorBase[P, S]
  }
}
