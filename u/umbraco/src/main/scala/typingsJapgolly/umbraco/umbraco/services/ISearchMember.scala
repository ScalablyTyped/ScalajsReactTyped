package typingsJapgolly.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search members
  */
trait ISearchMember extends StObject {
  
  var editorPath: String
  
  var id: Double
  
  var menuUrl: String
  
  var metaData: js.Object
  
  var name: String
  
  var subtitle: String
}
object ISearchMember {
  
  inline def apply(
    editorPath: String,
    id: Double,
    menuUrl: String,
    metaData: js.Object,
    name: String,
    subtitle: String
  ): ISearchMember = {
    val __obj = js.Dynamic.literal(editorPath = editorPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], menuUrl = menuUrl.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchMember]
  }
  
  extension [Self <: ISearchMember](x: Self) {
    
    inline def setEditorPath(value: String): Self = StObject.set(x, "editorPath", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMenuUrl(value: String): Self = StObject.set(x, "menuUrl", value.asInstanceOf[js.Any])
    
    inline def setMetaData(value: js.Object): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
  }
}
