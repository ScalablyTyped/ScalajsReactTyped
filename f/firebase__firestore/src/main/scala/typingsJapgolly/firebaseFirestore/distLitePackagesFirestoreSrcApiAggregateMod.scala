package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.anon.`24`
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcApiMod.Query_
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcApiAggregateMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/api/aggregate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](left: AggregateQuerySnapshot[T], right: AggregateQuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getCountFromServer(query: Query_[Any]): js.Promise[AggregateQuerySnapshot[`24`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AggregateQuerySnapshot[`24`]]]
}
