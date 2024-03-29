package typingsJapgolly.ddTrace

import typingsJapgolly.ddTrace.ddTraceInts.`-1`
import typingsJapgolly.ddTrace.ddTraceInts.`0`
import typingsJapgolly.ddTrace.ddTraceInts.`1`
import typingsJapgolly.ddTrace.ddTraceInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extPriorityMod {
  
  @JSImport("dd-trace/ext/priority", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dd-trace/ext/priority", "AUTO_KEEP")
  @js.native
  def AUTO_KEEP: `1` = js.native
  inline def AUTO_KEEP_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO_KEEP")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/priority", "AUTO_REJECT")
  @js.native
  def AUTO_REJECT: `0` = js.native
  inline def AUTO_REJECT_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO_REJECT")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/priority", "USER_KEEP")
  @js.native
  def USER_KEEP: `2` = js.native
  inline def USER_KEEP_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_KEEP")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/priority", "USER_REJECT")
  @js.native
  def USER_REJECT: `-1` = js.native
  inline def USER_REJECT_=(x: `-1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_REJECT")(x.asInstanceOf[js.Any])
}
