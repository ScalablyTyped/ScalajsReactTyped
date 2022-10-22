package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskboard {
  
  trait Command
    extends StObject
       with Class {
    
    var exec: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Command {
    
    inline def apply(): Command = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Command]
    }
    
    extension [Self <: Command](x: Self) {
      
      inline def setExec(value: Callback): Self = StObject.set(x, "exec", value.toJsFn)
      
      inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    }
  }
  
  object commands {
    
    type AddCardCommand = Command
    
    type AddColumnCommand = Command
    
    type CancelEditColumnCommand = Command
    
    type ClosePaneCommand = Command
    
    type DeleteCardCommand = Command
    
    type DeleteColumnCommand = Command
    
    type EditCardCommand = Command
    
    type EditColumnCommand = Command
    
    type MoveCardCommand = Command
    
    type MoveFocusCommand = Command
    
    type OpenPaneCommand = Command
    
    type SaveChangesCommand = Command
    
    type SaveColumnCommand = Command
    
    type SearchCommand = Command
    
    type SelectCardCommand = Command
  }
}
