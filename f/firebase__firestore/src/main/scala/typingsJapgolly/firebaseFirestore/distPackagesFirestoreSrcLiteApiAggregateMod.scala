package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.anon.`39`
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLiteApiAggregateMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/aggregate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](left: AggregateQuerySnapshot[T], right: AggregateQuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getCount(query: Query[Any]): js.Promise[AggregateQuerySnapshot[`39`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AggregateQuerySnapshot[`39`]]]
}
