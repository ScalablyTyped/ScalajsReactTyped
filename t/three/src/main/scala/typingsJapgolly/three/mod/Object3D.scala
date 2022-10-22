package typingsJapgolly.three.mod

import typingsJapgolly.three.srcCoreEventDispatcherMod.BaseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "Object3D")
@js.native
open class Object3D[E /* <: BaseEvent */] ()
  extends typingsJapgolly.three.srcThreeMod.Object3D[E]
/* static members */
object Object3D {
  
  @JSImport("three", "Object3D")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three", "Object3D.DefaultMatrixAutoUpdate")
  @js.native
  def DefaultMatrixAutoUpdate: Boolean = js.native
  inline def DefaultMatrixAutoUpdate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultMatrixAutoUpdate")(x.asInstanceOf[js.Any])
  
  @JSImport("three", "Object3D.DefaultUp")
  @js.native
  def DefaultUp: typingsJapgolly.three.srcMathVector3Mod.Vector3 = js.native
  inline def DefaultUp_=(x: typingsJapgolly.three.srcMathVector3Mod.Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultUp")(x.asInstanceOf[js.Any])
}
