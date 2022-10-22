package typingsJapgolly.matterJs.global.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Sleeping")
@js.native
open class Sleeping ()
  extends typingsJapgolly.matterJs.mod.Sleeping
/* static members */
object Sleeping {
  
  @JSGlobal("Matter.Sleeping")
  @js.native
  val ^ : js.Any = js.native
  
  inline def set(body: typingsJapgolly.matterJs.mod.Body, isSleeping: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(body.asInstanceOf[js.Any], isSleeping.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
