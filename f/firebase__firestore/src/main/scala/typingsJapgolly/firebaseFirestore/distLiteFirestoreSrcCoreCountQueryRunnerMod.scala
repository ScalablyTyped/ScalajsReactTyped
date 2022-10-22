package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.anon.`11`
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiMod.AbstractUserDataWriter
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiMod.Query_
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcRemoteDatastoreMod.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcCoreCountQueryRunnerMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/count_query_runner", "CountQueryRunner")
  @js.native
  open class CountQueryRunner protected () extends StObject {
    def this(query: Query_[Any], datastore: Datastore, userDataWriter: AbstractUserDataWriter) = this()
    
    /* private */ val datastore: Any = js.native
    
    /* private */ val query: Any = js.native
    
    def run(): js.Promise[AggregateQuerySnapshot[`11`]] = js.native
    
    /* private */ val userDataWriter: Any = js.native
  }
}
