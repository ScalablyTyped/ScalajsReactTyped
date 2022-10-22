package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageTableCardRow extends StObject {
  
  /** Optional. List of cells that make up this row. */
  var cells: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageTableCardCell]] = js.undefined
  
  /** Optional. Whether to add a visual divider after this row. */
  var dividerAfter: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageTableCardRow {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentMessageTableCardRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageTableCardRow]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1IntentMessageTableCardRow](x: Self) {
    
    inline def setCells(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageTableCardCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setCellsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageTableCardCell*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setDividerAfter(value: Boolean): Self = StObject.set(x, "dividerAfter", value.asInstanceOf[js.Any])
    
    inline def setDividerAfterUndefined: Self = StObject.set(x, "dividerAfter", js.undefined)
  }
}
