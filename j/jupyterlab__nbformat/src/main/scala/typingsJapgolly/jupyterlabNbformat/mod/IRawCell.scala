package typingsJapgolly.jupyterlabNbformat.mod

import typingsJapgolly.jupyterlabNbformat.anon.PartialIRawCellMetadata
import typingsJapgolly.jupyterlabNbformat.jupyterlabNbformatStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRawCell
  extends StObject
     with IBaseCell
     with _ICell {
  
  /**
    * Cell attachments.
    */
  var attachments: js.UndefOr[IAttachments] = js.undefined
  
  /**
    * String identifying the type of cell.
    */
  @JSName("cell_type")
  var cell_type_IRawCell: raw
  
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
  var metadata_IRawCell: PartialIRawCellMetadata
}
object IRawCell {
  
  inline def apply(metadata: PartialIRawCellMetadata, source: MultilineString): IRawCell = {
    val __obj = js.Dynamic.literal(cell_type = "raw", metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRawCell]
  }
  
  extension [Self <: IRawCell](x: Self) {
    
    inline def setAttachments(value: IAttachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setCell_type(value: raw): Self = StObject.set(x, "cell_type", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: PartialIRawCellMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
