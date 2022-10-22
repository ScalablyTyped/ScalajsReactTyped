package typingsJapgolly.cypress.typesSinonMod

import typingsJapgolly.sinonjsFakeTimers.mod.InstalledMethods
import typingsJapgolly.sinonjsFakeTimers.mod.NodeClock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonFakeTimers
  extends StObject
     with InstalledMethods
     with NodeClock {
  
  /**
    * Restore the faked methods.
    * Call in e.g. tearDown.
    */
  def restore(): Unit = js.native
}
