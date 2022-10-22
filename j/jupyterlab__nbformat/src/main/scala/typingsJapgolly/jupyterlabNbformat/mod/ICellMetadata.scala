package typingsJapgolly.jupyterlabNbformat.mod

import typingsJapgolly.jupyterlabNbformat.anon.PartialIBaseCellJupyterMe
import typingsJapgolly.jupyterlabNbformat.anon.PartialICodeCellJupyterMe
import typingsJapgolly.jupyterlabNbformat.jupyterlabNbformatStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabNbformat.mod.IBaseCellMetadata
  - typingsJapgolly.jupyterlabNbformat.mod.IRawCellMetadata
  - typingsJapgolly.jupyterlabNbformat.mod.ICodeCellMetadata
*/
trait ICellMetadata extends StObject
object ICellMetadata {
  
  inline def IBaseCellMetadata(jupyter: PartialIBaseCellJupyterMe, name: String, tags: js.Array[String], trusted: Boolean): typingsJapgolly.jupyterlabNbformat.mod.IBaseCellMetadata = {
    val __obj = js.Dynamic.literal(jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabNbformat.mod.IBaseCellMetadata]
  }
  
  inline def ICodeCellMetadata(
    collapsed: Boolean,
    jupyter: PartialICodeCellJupyterMe,
    name: String,
    scrolled: Boolean | auto,
    tags: js.Array[String],
    trusted: Boolean
  ): typingsJapgolly.jupyterlabNbformat.mod.ICodeCellMetadata = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scrolled = scrolled.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabNbformat.mod.ICodeCellMetadata]
  }
  
  inline def IRawCellMetadata(
    format: String,
    jupyter: PartialIBaseCellJupyterMe,
    name: String,
    tags: js.Array[String],
    trusted: Boolean
  ): typingsJapgolly.jupyterlabNbformat.mod.IRawCellMetadata = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabNbformat.mod.IRawCellMetadata]
  }
}
