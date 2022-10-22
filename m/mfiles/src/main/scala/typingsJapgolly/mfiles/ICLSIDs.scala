package typingsJapgolly.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICLSIDs extends StObject {
  
  val PreviewerCtrl: String
  
  val ShellListingCtrl: String
}
object ICLSIDs {
  
  inline def apply(PreviewerCtrl: String, ShellListingCtrl: String): ICLSIDs = {
    val __obj = js.Dynamic.literal(PreviewerCtrl = PreviewerCtrl.asInstanceOf[js.Any], ShellListingCtrl = ShellListingCtrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICLSIDs]
  }
  
  extension [Self <: ICLSIDs](x: Self) {
    
    inline def setPreviewerCtrl(value: String): Self = StObject.set(x, "PreviewerCtrl", value.asInstanceOf[js.Any])
    
    inline def setShellListingCtrl(value: String): Self = StObject.set(x, "ShellListingCtrl", value.asInstanceOf[js.Any])
  }
}
