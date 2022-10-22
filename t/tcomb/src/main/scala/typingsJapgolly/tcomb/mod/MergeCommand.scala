package typingsJapgolly.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeCommand
  extends StObject
     with Command {
  
  @JSName("$merge")
  var $merge: js.Object
}
object MergeCommand {
  
  inline def apply($merge: js.Object): MergeCommand = {
    val __obj = js.Dynamic.literal($merge = $merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeCommand]
  }
  
  extension [Self <: MergeCommand](x: Self) {
    
    inline def set$merge(value: js.Object): Self = StObject.set(x, "$merge", value.asInstanceOf[js.Any])
  }
}
