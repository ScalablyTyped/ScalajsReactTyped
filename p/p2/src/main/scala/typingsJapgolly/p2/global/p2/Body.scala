package typingsJapgolly.p2.global.p2

import typingsJapgolly.p2.mod.BodyOptions
import typingsJapgolly.p2.p2Ints.`0`
import typingsJapgolly.p2.p2Ints.`1`
import typingsJapgolly.p2.p2Ints.`2`
import typingsJapgolly.p2.p2Ints.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.Body")
@js.native
open class Body ()
  extends typingsJapgolly.p2.mod.Body {
  def this(options: BodyOptions) = this()
}
/* static members */
object Body {
  
  @JSGlobal("p2.Body")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("p2.Body.AWAKE")
  @js.native
  def AWAKE: `0` = js.native
  inline def AWAKE_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AWAKE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Body.DYNAMIC")
  @js.native
  def DYNAMIC: `1` = js.native
  inline def DYNAMIC_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DYNAMIC")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Body.KINEMATIC")
  @js.native
  def KINEMATIC: `4` = js.native
  inline def KINEMATIC_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KINEMATIC")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Body.SLEEPING")
  @js.native
  def SLEEPING: `2` = js.native
  inline def SLEEPING_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLEEPING")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Body.SLEEPY")
  @js.native
  def SLEEPY: `1` = js.native
  inline def SLEEPY_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLEEPY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Body.STATIC")
  @js.native
  def STATIC: `2` = js.native
  inline def STATIC_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATIC")(x.asInstanceOf[js.Any])
}
