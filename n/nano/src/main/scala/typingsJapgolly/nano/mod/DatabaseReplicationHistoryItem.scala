package typingsJapgolly.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Database replication history.
  * @see Docs: {@link http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate} */
trait DatabaseReplicationHistoryItem extends StObject {
  
  /** Number of document write failures */
  var doc_write_failures: Double
  
  /** Number of documents read */
  var docs_read: Double
  
  /** Number of documents written to target */
  var docs_written: Double
  
  /** Last sequence number in changes stream */
  var end_last_seq: Double
  
  /** Date/Time replication operation completed in RFC 2822 format */
  var end_time: String
  
  /** Number of missing documents checked */
  var missing_checked: Double
  
  /** Number of missing documents found */
  var missing_found: Double
  
  /** Last recorded sequence number */
  var recorded_seq: Double
  
  /** Session ID for this replication operation */
  var session_id: String
  
  /** First sequence number in changes stream */
  var start_last_seq: Double
  
  /** Date/Time replication operation started in RFC 2822 format */
  var start_time: String
}
object DatabaseReplicationHistoryItem {
  
  inline def apply(
    doc_write_failures: Double,
    docs_read: Double,
    docs_written: Double,
    end_last_seq: Double,
    end_time: String,
    missing_checked: Double,
    missing_found: Double,
    recorded_seq: Double,
    session_id: String,
    start_last_seq: Double,
    start_time: String
  ): DatabaseReplicationHistoryItem = {
    val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures.asInstanceOf[js.Any], docs_read = docs_read.asInstanceOf[js.Any], docs_written = docs_written.asInstanceOf[js.Any], end_last_seq = end_last_seq.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], missing_checked = missing_checked.asInstanceOf[js.Any], missing_found = missing_found.asInstanceOf[js.Any], recorded_seq = recorded_seq.asInstanceOf[js.Any], session_id = session_id.asInstanceOf[js.Any], start_last_seq = start_last_seq.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseReplicationHistoryItem]
  }
  
  extension [Self <: DatabaseReplicationHistoryItem](x: Self) {
    
    inline def setDoc_write_failures(value: Double): Self = StObject.set(x, "doc_write_failures", value.asInstanceOf[js.Any])
    
    inline def setDocs_read(value: Double): Self = StObject.set(x, "docs_read", value.asInstanceOf[js.Any])
    
    inline def setDocs_written(value: Double): Self = StObject.set(x, "docs_written", value.asInstanceOf[js.Any])
    
    inline def setEnd_last_seq(value: Double): Self = StObject.set(x, "end_last_seq", value.asInstanceOf[js.Any])
    
    inline def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    inline def setMissing_checked(value: Double): Self = StObject.set(x, "missing_checked", value.asInstanceOf[js.Any])
    
    inline def setMissing_found(value: Double): Self = StObject.set(x, "missing_found", value.asInstanceOf[js.Any])
    
    inline def setRecorded_seq(value: Double): Self = StObject.set(x, "recorded_seq", value.asInstanceOf[js.Any])
    
    inline def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
    
    inline def setStart_last_seq(value: Double): Self = StObject.set(x, "start_last_seq", value.asInstanceOf[js.Any])
    
    inline def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
  }
}
