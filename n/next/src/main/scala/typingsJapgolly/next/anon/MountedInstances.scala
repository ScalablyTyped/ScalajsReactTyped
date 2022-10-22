package typingsJapgolly.next.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountedInstances extends StObject {
  
  var mountedInstances: Set[Any]
  
  def updateHead(head: js.Array[typingsJapgolly.react.mod.global.JSX.Element]): Unit
}
object MountedInstances {
  
  inline def apply(
    mountedInstances: Set[Any],
    updateHead: js.Array[typingsJapgolly.react.mod.global.JSX.Element] => Callback
  ): MountedInstances = {
    val __obj = js.Dynamic.literal(mountedInstances = mountedInstances.asInstanceOf[js.Any], updateHead = js.Any.fromFunction1((t0: js.Array[typingsJapgolly.react.mod.global.JSX.Element]) => updateHead(t0).runNow()))
    __obj.asInstanceOf[MountedInstances]
  }
  
  extension [Self <: MountedInstances](x: Self) {
    
    inline def setMountedInstances(value: Set[Any]): Self = StObject.set(x, "mountedInstances", value.asInstanceOf[js.Any])
    
    inline def setUpdateHead(value: js.Array[typingsJapgolly.react.mod.global.JSX.Element] => Callback): Self = StObject.set(x, "updateHead", js.Any.fromFunction1((t0: js.Array[typingsJapgolly.react.mod.global.JSX.Element]) => value(t0).runNow()))
  }
}
