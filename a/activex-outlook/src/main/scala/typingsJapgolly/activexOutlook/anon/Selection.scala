package typingsJapgolly.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selection extends StObject {
  
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ Any
  
  val Selection: typingsJapgolly.activexOutlook.Outlook.Selection
}
object Selection {
  
  inline def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ Any,
    Selection: typingsJapgolly.activexOutlook.Outlook.Selection
  ): Selection = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  extension [Self <: Selection](x: Self) {
    
    inline def setCommandBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ Any
    ): Self = StObject.set(x, "CommandBar", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: typingsJapgolly.activexOutlook.Outlook.Selection): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
  }
}
