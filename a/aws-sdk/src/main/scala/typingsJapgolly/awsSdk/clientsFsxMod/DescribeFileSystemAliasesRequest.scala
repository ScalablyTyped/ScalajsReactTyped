package typingsJapgolly.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFileSystemAliasesRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The ID of the file system to return the associated DNS aliases for (String).
    */
  var FileSystemId: typingsJapgolly.awsSdk.clientsFsxMod.FileSystemId
  
  /**
    * Maximum number of DNS aliases to return in the response (integer). This parameter value must be greater than 0. The number of items that Amazon FSx returns is the minimum of the MaxResults parameter specified in the request and the service's internal maximum number of items per page.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.MaxResults] = js.undefined
  
  /**
    * Opaque pagination token returned from a previous DescribeFileSystemAliases operation (String). If a token is included in the request, the action continues the list from where the previous returning call left off.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.NextToken] = js.undefined
}
object DescribeFileSystemAliasesRequest {
  
  inline def apply(FileSystemId: FileSystemId): DescribeFileSystemAliasesRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFileSystemAliasesRequest]
  }
  
  extension [Self <: DescribeFileSystemAliasesRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
