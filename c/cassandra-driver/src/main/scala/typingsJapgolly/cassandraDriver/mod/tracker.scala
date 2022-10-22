package typingsJapgolly.cassandraDriver.mod

import typingsJapgolly.cassandraDriver.anon.LogErroredRequests
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tracker {
  
  @JSImport("cassandra-driver", "tracker.RequestLogger")
  @js.native
  open class RequestLogger protected ()
    extends typingsJapgolly.cassandraDriver.libTrackerMod.tracker.RequestLogger {
    def this(options: LogErroredRequests) = this()
  }
}
