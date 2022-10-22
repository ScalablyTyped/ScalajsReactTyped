package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFFolderListingColumnFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFolderListingColumn extends StObject {
  
  def Clone(): IFolderListingColumn
  
  var Flags: MFFolderListingColumnFlags
  
  val ID: Double
  
  val Name: String
  
  var Position: Double
  
  var Visible: Boolean
  
  var Width: Double
}
object IFolderListingColumn {
  
  inline def apply(
    Clone: CallbackTo[IFolderListingColumn],
    Flags: MFFolderListingColumnFlags,
    ID: Double,
    Name: String,
    Position: Double,
    Visible: Boolean,
    Width: Double
  ): IFolderListingColumn = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Flags = Flags.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderListingColumn]
  }
  
  extension [Self <: IFolderListingColumn](x: Self) {
    
    inline def setClone(value: CallbackTo[IFolderListingColumn]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setFlags(value: MFFolderListingColumnFlags): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
