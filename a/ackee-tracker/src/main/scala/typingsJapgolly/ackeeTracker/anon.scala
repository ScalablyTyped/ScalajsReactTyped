package typingsJapgolly.ackeeTracker

import typingsJapgolly.ackeeTracker.ackeeTrackerBooleans.`false`
import typingsJapgolly.ackeeTracker.ackeeTrackerBooleans.`true`
import typingsJapgolly.ackeeTracker.mod.DefaultData
import typingsJapgolly.ackeeTracker.mod.DetailedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): DefaultData = js.native
    def apply(detailed: Boolean): DefaultData | (DefaultData & DetailedData) = js.native
    def apply(detailed: `false`): DefaultData = js.native
    def apply(detailed: `true`): DefaultData & DetailedData = js.native
  }
}
