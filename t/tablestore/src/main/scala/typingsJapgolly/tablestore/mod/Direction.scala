package typingsJapgolly.tablestore.mod

import typingsJapgolly.tablestore.tablestoreStrings.BACKWARD
import typingsJapgolly.tablestore.tablestoreStrings.FORWARD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Direction {
  
  @JSImport("tablestore", "Direction")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tablestore", "Direction.BACKWARD")
  @js.native
  def BACKWARD: typingsJapgolly.tablestore.tablestoreStrings.BACKWARD = js.native
  inline def BACKWARD_=(x: BACKWARD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
  
  @JSImport("tablestore", "Direction.FORWARD")
  @js.native
  def FORWARD: typingsJapgolly.tablestore.tablestoreStrings.FORWARD = js.native
  inline def FORWARD_=(x: FORWARD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
}
