package typingsJapgolly.activexAdox.ADOX

import typingsJapgolly.activexAdodb.ADODB.Command
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  /* private */ @JSName("ADOX.View_typekey")
  var ADOXDotView_typekey: View
  
  var Command: typingsJapgolly.activexAdodb.ADODB.Command
  
  val DateCreated: VarDate
  
  val DateModified: VarDate
  
  val Name: String
}
object View {
  
  inline def apply(
    ADOXDotView_typekey: View,
    Command: Command,
    DateCreated: VarDate,
    DateModified: VarDate,
    Name: String
  ): View = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], DateCreated = DateCreated.asInstanceOf[js.Any], DateModified = DateModified.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.View_typekey")(ADOXDotView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  extension [Self <: View](x: Self) {
    
    inline def setADOXDotView_typekey(value: View): Self = StObject.set(x, "ADOX.View_typekey", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: Command): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: VarDate): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateModified(value: VarDate): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
