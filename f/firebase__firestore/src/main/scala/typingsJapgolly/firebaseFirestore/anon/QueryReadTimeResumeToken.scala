package typingsJapgolly.firebaseFirestore.anon

import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUtilHelpersMod.TestSnapshotVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryReadTimeResumeToken extends StObject {
  
  var query: typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.Query
  
  var readTime: js.UndefOr[TestSnapshotVersion] = js.undefined
  
  var resumeToken: js.UndefOr[String] = js.undefined
}
object QueryReadTimeResumeToken {
  
  inline def apply(query: typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.Query): QueryReadTimeResumeToken = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryReadTimeResumeToken]
  }
  
  extension [Self <: QueryReadTimeResumeToken](x: Self) {
    
    inline def setQuery(value: typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: TestSnapshotVersion): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
  }
}
