package typingsJapgolly.vscodeLanguageserver.anon

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Old extends StObject {
  
  var `new`: NotebookCell
  
  var old: NotebookCell
}
object Old {
  
  inline def apply(`new`: NotebookCell, old: NotebookCell): Old = {
    val __obj = js.Dynamic.literal(old = old.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Old]
  }
  
  extension [Self <: Old](x: Self) {
    
    inline def setNew(value: NotebookCell): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setOld(value: NotebookCell): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
  }
}
