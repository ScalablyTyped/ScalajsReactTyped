package typingsJapgolly.firebaseFirestore.anon

import typingsJapgolly.firebaseFirestore.distFirestoreTestUtilHelpersMod.TestSnapshotVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  var query: typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query
  
  var readTime: js.UndefOr[TestSnapshotVersion] = js.undefined
  
  var resumeToken: js.UndefOr[String] = js.undefined
}
object Query {
  
  inline def apply(query: typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setQuery(value: typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: TestSnapshotVersion): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
  }
}
