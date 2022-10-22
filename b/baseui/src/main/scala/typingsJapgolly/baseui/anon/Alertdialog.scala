package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.alertdialog
import typingsJapgolly.baseui.baseuiStrings.dialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alertdialog extends StObject {
  
  val alertdialog: typingsJapgolly.baseui.baseuiStrings.alertdialog
  
  val dialog: typingsJapgolly.baseui.baseuiStrings.dialog
}
object Alertdialog {
  
  inline def apply(): Alertdialog = {
    val __obj = js.Dynamic.literal(alertdialog = "alertdialog", dialog = "dialog")
    __obj.asInstanceOf[Alertdialog]
  }
  
  extension [Self <: Alertdialog](x: Self) {
    
    inline def setAlertdialog(value: alertdialog): Self = StObject.set(x, "alertdialog", value.asInstanceOf[js.Any])
    
    inline def setDialog(value: dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
  }
}
