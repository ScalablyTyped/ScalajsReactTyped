package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.anon.PartialCheckboxRenderCust
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import typingsJapgolly.muiDatatables.mod.MUIDataTableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_MUIDataTableProps936471268 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def components(value: PartialCheckboxRenderCust): this.type = set("components", value.asInstanceOf[js.Any])
  
  inline def innerRef(value: RefHandle[js.UndefOr[(Component[MUIDataTableProps & js.Object, js.Object]) | Null]]): this.type = set("innerRef", value.asInstanceOf[js.Any])
  
  inline def options(value: MUIDataTableOptions): this.type = set("options", value.asInstanceOf[js.Any])
  
  inline def title(value: String | Node): this.type = set("title", value.asInstanceOf[js.Any])
  
  inline def titleNull: this.type = set("title", null)
  
  inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
  
  inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
}
