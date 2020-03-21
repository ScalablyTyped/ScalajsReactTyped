package typingsJapgolly.firebaseFirestore.apiDatabaseMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firebaseFirestore.coreViewSnapshotMod.ViewSnapshot
import typingsJapgolly.firebaseFirestoreTypes.mod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "PublicQuerySnapshot")
@js.native
object PublicQuerySnapshot
  extends TopLevel[
      Instantiable4[
        /* _firestore */ Firestore, 
        /* _originalQuery */ typingsJapgolly.firebaseFirestore.coreQueryMod.Query, 
        /* _snapshot */ ViewSnapshot, 
        js.UndefOr[
          FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
        ], 
        QuerySnapshot[js.Object]
      ]
    ]

