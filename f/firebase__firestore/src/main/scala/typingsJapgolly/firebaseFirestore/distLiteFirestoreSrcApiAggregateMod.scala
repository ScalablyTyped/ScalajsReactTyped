package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.anon.`11`
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiMod.Query_
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcApiAggregateMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/api/aggregate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](left: AggregateQuerySnapshot[T], right: AggregateQuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getCountFromServer(query: Query_[Any]): js.Promise[AggregateQuerySnapshot[`11`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AggregateQuerySnapshot[`11`]]]
}
