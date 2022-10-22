package typingsJapgolly.evernote.anon

import typingsJapgolly.evernote.mod.NoteStore.ManageNoteSharesError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: js.UndefOr[js.Array[ManageNoteSharesError]] = js.undefined
}
object Errors {
  
  inline def apply(): Errors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: js.Array[ManageNoteSharesError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ManageNoteSharesError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
