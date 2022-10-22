package typingsJapgolly.jupyterlabNbformat.mod

import typingsJapgolly.jupyterlabNbformat.anon.PartialICodeCellMetadata
import typingsJapgolly.jupyterlabNbformat.jupyterlabNbformatStrings.code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICodeCell
  extends StObject
     with IBaseCell
     with _ICell {
  
  /**
    * String identifying the type of cell.
    */
  @JSName("cell_type")
  var cell_type_ICodeCell: code
  
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  var execution_count: ExecutionCount
  
  /**
    * A string field representing the identifier of this particular cell.
    *
    * Notebook format 4.4 requires no id field, but format 4.5 requires an id
    * field. We need to handle both cases, so we make id optional here.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Cell-level metadata.
    */
  @JSName("metadata")
  var metadata_ICodeCell: PartialICodeCellMetadata
  
  /**
    * Execution, display, or stream outputs.
    */
  var outputs: js.Array[IOutput]
}
object ICodeCell {
  
  inline def apply(metadata: PartialICodeCellMetadata, outputs: js.Array[IOutput], source: MultilineString): ICodeCell = {
    val __obj = js.Dynamic.literal(cell_type = "code", metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], execution_count = null)
    __obj.asInstanceOf[ICodeCell]
  }
  
  extension [Self <: ICodeCell](x: Self) {
    
    inline def setCell_type(value: code): Self = StObject.set(x, "cell_type", value.asInstanceOf[js.Any])
    
    inline def setExecution_count(value: ExecutionCount): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    inline def setExecution_countNull: Self = StObject.set(x, "execution_count", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: PartialICodeCellMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: js.Array[IOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: IOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
  }
}
