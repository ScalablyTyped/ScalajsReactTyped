package typingsJapgolly.materialUiLab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/AlertTitle/AlertTitle.AlertTitleClassKey>> */
trait PartialClassNameMapAlertT extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapAlertT {
  
  inline def apply(): PartialClassNameMapAlertT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapAlertT]
  }
  
  extension [Self <: PartialClassNameMapAlertT](x: Self) {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
