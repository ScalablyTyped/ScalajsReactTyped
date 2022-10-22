package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Restorable extends StObject {
  
  def restore(): Unit
}
object Restorable {
  
  inline def apply(restore: Callback): Restorable = {
    val __obj = js.Dynamic.literal(restore = restore.toJsFn)
    __obj.asInstanceOf[Restorable]
  }
  
  extension [Self <: Restorable](x: Self) {
    
    inline def setRestore(value: Callback): Self = StObject.set(x, "restore", value.toJsFn)
  }
}
