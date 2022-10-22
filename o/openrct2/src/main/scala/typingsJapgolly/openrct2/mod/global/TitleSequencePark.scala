package typingsJapgolly.openrct2.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleSequencePark extends StObject {
  
  /**
    * Deletes this park from the title sequence.
    */
  def delete(): Unit
  
  /**
    * The file name of the park.
    */
  var fileName: String
  
  /**
    * Loads this park.
    */
  def load(): Unit
}
object TitleSequencePark {
  
  inline def apply(delete: Callback, fileName: String, load: Callback): TitleSequencePark = {
    val __obj = js.Dynamic.literal(delete = delete.toJsFn, fileName = fileName.asInstanceOf[js.Any], load = load.toJsFn)
    __obj.asInstanceOf[TitleSequencePark]
  }
  
  extension [Self <: TitleSequencePark](x: Self) {
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "delete", value.toJsFn)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: Callback): Self = StObject.set(x, "load", value.toJsFn)
  }
}
