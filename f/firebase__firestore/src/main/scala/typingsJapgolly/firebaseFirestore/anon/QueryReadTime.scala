package typingsJapgolly.firebaseFirestore.anon

import typingsJapgolly.firebaseFirestore.distLiteFirestoreTestUtilHelpersMod.TestSnapshotVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryReadTime extends StObject {
  
  var query: typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query
  
  var readTime: js.UndefOr[TestSnapshotVersion] = js.undefined
  
  var resumeToken: js.UndefOr[String] = js.undefined
}
object QueryReadTime {
  
  inline def apply(query: typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query): QueryReadTime = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryReadTime]
  }
  
  extension [Self <: QueryReadTime](x: Self) {
    
    inline def setQuery(value: typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: TestSnapshotVersion): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
  }
}
