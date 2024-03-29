package typingsJapgolly.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dockerode", "Volume")
@js.native
open class Volume protected () extends StObject {
  def this(modem: Any, name: String) = this()
  
  def inspect(): js.Promise[VolumeInspectInfo] = js.native
  def inspect(callback: Callback[VolumeInspectInfo]): Unit = js.native
  def inspect(options: js.Object): js.Promise[VolumeInspectInfo] = js.native
  def inspect(options: js.Object, callback: Callback[VolumeInspectInfo]): Unit = js.native
  
  var modem: Any = js.native
  
  var name: String = js.native
  
  def remove(): js.Promise[Any] = js.native
  def remove(callback: Callback[Any]): Unit = js.native
  def remove(options: js.Object): js.Promise[Any] = js.native
  def remove(options: js.Object, callback: Callback[Any]): Unit = js.native
}
