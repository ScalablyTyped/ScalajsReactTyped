package typingsJapgolly.testingLibraryUserEvent.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Restore extends StObject {
  
  def restore(): Unit
}
object Restore {
  
  inline def apply(restore: Callback): Restore = {
    val __obj = js.Dynamic.literal(restore = restore.toJsFn)
    __obj.asInstanceOf[Restore]
  }
  
  extension [Self <: Restore](x: Self) {
    
    inline def setRestore(value: Callback): Self = StObject.set(x, "restore", value.toJsFn)
  }
}
