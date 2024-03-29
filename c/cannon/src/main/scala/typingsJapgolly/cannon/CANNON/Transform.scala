package typingsJapgolly.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform extends StObject {
  
  var position: Vec3 = js.native
  
  var quaternion: Quaternion = js.native
  
  def vectorToLocalFrame(position: Vec3, quaternion: Quaternion, worldVector: Vec3): Vec3 = js.native
  def vectorToLocalFrame(position: Vec3, quaternion: Quaternion, worldVector: Vec3, result: Vec3): Vec3 = js.native
  
  def vectorToWorldFrame(localVector: Vec3): Vec3 = js.native
  def vectorToWorldFrame(localVector: Vec3, result: Vec3): Vec3 = js.native
}
