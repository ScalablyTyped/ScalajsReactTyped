package typingsJapgolly.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeArchiveRequest extends StObject {
  
  /**
    * The name of the archive to retrieve.
    */
  var ArchiveName: typingsJapgolly.awsSdk.clientsCloudwatcheventsMod.ArchiveName
}
object DescribeArchiveRequest {
  
  inline def apply(ArchiveName: ArchiveName): DescribeArchiveRequest = {
    val __obj = js.Dynamic.literal(ArchiveName = ArchiveName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeArchiveRequest]
  }
  
  extension [Self <: DescribeArchiveRequest](x: Self) {
    
    inline def setArchiveName(value: ArchiveName): Self = StObject.set(x, "ArchiveName", value.asInstanceOf[js.Any])
  }
}
