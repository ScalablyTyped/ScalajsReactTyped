package typingsJapgolly.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a new folder.
  */
trait INewFolder extends StObject {
  
  /**
    * A description of the folder.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the folder.
    */
  var name: String
  
  /**
    * Sorts the items to specify the following criteria: updated, name,
    * size, or default.
    */
  var sort_by: js.UndefOr[String] = js.undefined
}
object INewFolder {
  
  inline def apply(name: String): INewFolder = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewFolder]
  }
  
  extension [Self <: INewFolder](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSort_by(value: String): Self = StObject.set(x, "sort_by", value.asInstanceOf[js.Any])
    
    inline def setSort_byUndefined: Self = StObject.set(x, "sort_by", js.undefined)
  }
}
