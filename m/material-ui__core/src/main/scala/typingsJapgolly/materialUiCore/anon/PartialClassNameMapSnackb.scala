package typingsJapgolly.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/SnackbarContent/SnackbarContent.SnackbarContentClassKey>> */
trait PartialClassNameMapSnackb extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapSnackb {
  
  inline def apply(): PartialClassNameMapSnackb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapSnackb]
  }
  
  extension [Self <: PartialClassNameMapSnackb](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
