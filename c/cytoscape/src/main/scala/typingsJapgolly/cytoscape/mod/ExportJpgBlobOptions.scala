package typingsJapgolly.cytoscape.mod

import typingsJapgolly.cytoscape.cytoscapeStrings.blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.cytoscape.mod.ExportOptions because Already inherited
- typingsJapgolly.cytoscape.mod.ExportBlobOptions because var conflicts: bg, full, maxHeight, maxWidth, scale. Inlined output */ trait ExportJpgBlobOptions
  extends StObject
     with ExportJpgOptions {
  
  /**
    * output Whether the output should be 'base64uri' (default), 'base64', or 'blob'.
    */
  var output: js.UndefOr[blob] = js.undefined
}
object ExportJpgBlobOptions {
  
  inline def apply(): ExportJpgBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportJpgBlobOptions]
  }
  
  extension [Self <: ExportJpgBlobOptions](x: Self) {
    
    inline def setOutput(value: blob): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
