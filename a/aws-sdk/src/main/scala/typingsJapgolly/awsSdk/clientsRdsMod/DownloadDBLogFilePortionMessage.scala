package typingsJapgolly.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadDBLogFilePortionMessage extends StObject {
  
  /**
    * The customer-assigned name of the DB instance that contains the log files you want to list. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String
  
  /**
    * The name of the log file to be downloaded.
    */
  var LogFileName: String
  
  /**
    * The pagination token provided in the previous request or "0". If the Marker parameter is specified the response includes only records beyond the marker until the end of the file or up to NumberOfLines.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The number of lines to download. If the number of lines specified results in a file over 1 MB in size, the file is truncated at 1 MB in size. If the NumberOfLines parameter is specified, then the block of lines returned can be from the beginning or the end of the log file, depending on the value of the Marker parameter.   If neither Marker or NumberOfLines are specified, the entire log file is returned up to a maximum of 10000 lines, starting with the most recent log entries first.   If NumberOfLines is specified and Marker isn't specified, then the most recent lines from the end of the log file are returned.   If Marker is specified as "0", then the specified number of lines from the beginning of the log file are returned.   You can download the log file in blocks of lines by specifying the size of the block using the NumberOfLines parameter, and by specifying a value of "0" for the Marker parameter in your first request. Include the Marker value returned in the response as the Marker value for the next request, continuing until the AdditionalDataPending response element returns false.  
    */
  var NumberOfLines: js.UndefOr[Integer] = js.undefined
}
object DownloadDBLogFilePortionMessage {
  
  inline def apply(DBInstanceIdentifier: String, LogFileName: String): DownloadDBLogFilePortionMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any], LogFileName = LogFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadDBLogFilePortionMessage]
  }
  
  extension [Self <: DownloadDBLogFilePortionMessage](x: Self) {
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLogFileName(value: String): Self = StObject.set(x, "LogFileName", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setNumberOfLines(value: Integer): Self = StObject.set(x, "NumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLinesUndefined: Self = StObject.set(x, "NumberOfLines", js.undefined)
  }
}
