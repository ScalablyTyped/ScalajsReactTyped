package typingsJapgolly.activexInfopath

import typingsJapgolly.activexInfopath.InfoPath.Application
import typingsJapgolly.activexInfopath.InfoPath.ExternalApplication
import typingsJapgolly.activexInfopath.InfoPath.InfoPathEditorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("InfoPath.Application")
  var InfoPathDotApplication: Application
  
  @JSName("InfoPath.Editor")
  var InfoPathDotEditor: InfoPathEditorObject
  
  @JSName("InfoPath.ExternalApplication")
  var InfoPathDotExternalApplication: ExternalApplication
}
object ActiveXObjectNameMap {
  
  inline def apply(
    InfoPathDotApplication: Application,
    InfoPathDotEditor: InfoPathEditorObject,
    InfoPathDotExternalApplication: ExternalApplication
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InfoPath.Application")(InfoPathDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.Editor")(InfoPathDotEditor.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ExternalApplication")(InfoPathDotExternalApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  extension [Self <: ActiveXObjectNameMap](x: Self) {
    
    inline def setInfoPathDotApplication(value: Application): Self = StObject.set(x, "InfoPath.Application", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotEditor(value: InfoPathEditorObject): Self = StObject.set(x, "InfoPath.Editor", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotExternalApplication(value: ExternalApplication): Self = StObject.set(x, "InfoPath.ExternalApplication", value.asInstanceOf[js.Any])
  }
}
