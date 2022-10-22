package typingsJapgolly.p2.global.p2

import typingsJapgolly.p2.mod.WorldOptions
import typingsJapgolly.p2.p2Ints.`1`
import typingsJapgolly.p2.p2Ints.`2`
import typingsJapgolly.p2.p2Ints.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.World")
@js.native
//static integrateBody(body: Body, dy: number): void;
open class World ()
  extends typingsJapgolly.p2.mod.World {
  def this(options: WorldOptions) = this()
}
/* static members */
object World {
  
  @JSGlobal("p2.World")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("p2.World.BODY_SLEEPING")
  @js.native
  def BODY_SLEEPING: `2` = js.native
  inline def BODY_SLEEPING_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BODY_SLEEPING")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.World.ISLAND_SLEEPING")
  @js.native
  def ISLAND_SLEEPING: `4` = js.native
  inline def ISLAND_SLEEPING_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISLAND_SLEEPING")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.World.NO_SLEEPING")
  @js.native
  def NO_SLEEPING: `1` = js.native
  inline def NO_SLEEPING_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_SLEEPING")(x.asInstanceOf[js.Any])
}
