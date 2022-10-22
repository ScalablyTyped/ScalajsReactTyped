package typingsJapgolly.jupyterlabNbformat.mod

import typingsJapgolly.jupyterlabNbformat.anon.PartialICodeCellMetadata
import typingsJapgolly.jupyterlabNbformat.anon.PartialIRawCellMetadata
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ICell extends StObject
object _ICell {
  
  inline def ICodeCell(metadata: PartialICodeCellMetadata, outputs: js.Array[IOutput], source: MultilineString): typingsJapgolly.jupyterlabNbformat.mod.ICodeCell = {
    val __obj = js.Dynamic.literal(cell_type = "code", metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], execution_count = null)
    __obj.asInstanceOf[typingsJapgolly.jupyterlabNbformat.mod.ICodeCell]
  }
  
  inline def IMarkdownCell(metadata: Partial[ICellMetadata], source: MultilineString): typingsJapgolly.jupyterlabNbformat.mod.IMarkdownCell = {
    val __obj = js.Dynamic.literal(cell_type = "markdown", metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabNbformat.mod.IMarkdownCell]
  }
  
  inline def IRawCell(metadata: PartialIRawCellMetadata, source: MultilineString): typingsJapgolly.jupyterlabNbformat.mod.IRawCell = {
    val __obj = js.Dynamic.literal(cell_type = "raw", metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabNbformat.mod.IRawCell]
  }
}
