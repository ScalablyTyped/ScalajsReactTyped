package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDocumentRequest extends StObject {
  
  /**
    * The document version for which you want information. Can be a specific version or the default version.
    */
  var DocumentVersion: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.DocumentVersion] = js.undefined
  
  /**
    * The name of the SSM document.
    */
  var Name: DocumentARN
  
  /**
    * An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and can't be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}
object DescribeDocumentRequest {
  
  inline def apply(Name: DocumentARN): DescribeDocumentRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentRequest]
  }
  
  extension [Self <: DescribeDocumentRequest](x: Self) {
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setVersionName(value: DocumentVersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
  }
}
