package typingsJapgolly.jupyterlabNbformat.mod

import typingsJapgolly.jupyterlabNbformat.anon.PartialIBaseCellJupyterMe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.jupyterlabNbformat.mod.ICellMetadata because Already inherited */ trait IRawCellMetadata
  extends StObject
     with IBaseCellMetadata {
  
  /**
    * Raw cell metadata format for nbconvert.
    */
  var format: String
}
object IRawCellMetadata {
  
  inline def apply(
    format: String,
    jupyter: PartialIBaseCellJupyterMe,
    name: String,
    tags: js.Array[String],
    trusted: Boolean
  ): IRawCellMetadata = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRawCellMetadata]
  }
  
  extension [Self <: IRawCellMetadata](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
