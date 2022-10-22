package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.anon.CountAggregateField
import typingsJapgolly.firebaseFirestore.distFirestoreSrcApiMod.AbstractUserDataWriter
import typingsJapgolly.firebaseFirestore.distFirestoreSrcApiMod.Query_
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot
import typingsJapgolly.firebaseFirestore.distFirestoreSrcRemoteDatastoreMod.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcCoreCountQueryRunnerMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/core/count_query_runner", "CountQueryRunner")
  @js.native
  open class CountQueryRunner protected () extends StObject {
    def this(query: Query_[Any], datastore: Datastore, userDataWriter: AbstractUserDataWriter) = this()
    
    /* private */ val datastore: Any = js.native
    
    /* private */ val query: Any = js.native
    
    def run(): js.Promise[AggregateQuerySnapshot[CountAggregateField]] = js.native
    
    /* private */ val userDataWriter: Any = js.native
  }
}
