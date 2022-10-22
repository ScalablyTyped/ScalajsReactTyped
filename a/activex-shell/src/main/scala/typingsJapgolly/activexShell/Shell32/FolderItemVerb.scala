package typingsJapgolly.activexShell.Shell32

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Definition of interface FolderItemVerb */
trait FolderItemVerb extends StObject {
  
  /** Execute the verb */
  def DoIt(): Unit
  
  /** Get display name for item */
  val Name: String
  
  /* private */ @JSName("Shell32.FolderItemVerb_typekey")
  var Shell32DotFolderItemVerb_typekey: FolderItemVerb
}
object FolderItemVerb {
  
  inline def apply(DoIt: Callback, Name: String, Shell32DotFolderItemVerb_typekey: FolderItemVerb): FolderItemVerb = {
    val __obj = js.Dynamic.literal(DoIt = DoIt.toJsFn, Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell32.FolderItemVerb_typekey")(Shell32DotFolderItemVerb_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderItemVerb]
  }
  
  extension [Self <: FolderItemVerb](x: Self) {
    
    inline def setDoIt(value: Callback): Self = StObject.set(x, "DoIt", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setShell32DotFolderItemVerb_typekey(value: FolderItemVerb): Self = StObject.set(x, "Shell32.FolderItemVerb_typekey", value.asInstanceOf[js.Any])
  }
}
