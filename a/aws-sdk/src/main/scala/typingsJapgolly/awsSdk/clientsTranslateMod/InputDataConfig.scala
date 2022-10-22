package typingsJapgolly.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDataConfig extends StObject {
  
  /**
    * Describes the format of the data that you submit to Amazon Translate as input. You can specify one of the following multipurpose internet mail extension (MIME) types:    text/html: The input data consists of one or more HTML files. Amazon Translate translates only the text that resides in the html element in each file.    text/plain: The input data consists of one or more unformatted text files. Amazon Translate translates every character in this type of input.    application/vnd.openxmlformats-officedocument.wordprocessingml.document: The input data consists of one or more Word documents (.docx).    application/vnd.openxmlformats-officedocument.presentationml.presentation: The input data consists of one or more PowerPoint Presentation files (.pptx).    application/vnd.openxmlformats-officedocument.spreadsheetml.sheet: The input data consists of one or more Excel Workbook files (.xlsx).    application/x-xliff+xml: The input data consists of one or more XML Localization Interchange File Format (XLIFF) files (.xlf). Amazon Translate supports only XLIFF version 1.2.    If you structure your input data as HTML, ensure that you set this parameter to text/html. By doing so, you cut costs by limiting the translation to the contents of the html element in each file. Otherwise, if you set this parameter to text/plain, your costs will cover the translation of every character. 
    */
  var ContentType: typingsJapgolly.awsSdk.clientsTranslateMod.ContentType
  
  /**
    * The URI of the AWS S3 folder that contains the input files. Amazon Translate translates all the files in the folder. The folder must be in the same Region as the API endpoint you are calling.  The URI can also point to a single input document, or it can provide the prefix for a collection of input documents. For example. if you use the URI S3://bucketName/prefix and the prefix is a single file, Amazon Translate uses that files as input. If more than one file begins with the prefix, Amazon Translate uses all of them as input. 
    */
  var S3Uri: typingsJapgolly.awsSdk.clientsTranslateMod.S3Uri
}
object InputDataConfig {
  
  inline def apply(ContentType: ContentType, S3Uri: S3Uri): InputDataConfig = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDataConfig]
  }
  
  extension [Self <: InputDataConfig](x: Self) {
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
