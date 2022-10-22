package typingsJapgolly.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import typingsJapgolly.ibmCloudSdkCore.esLibHelperMod.FileObject
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createClassifier` operation. */
trait CreateClassifierParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The name of the new classifier. Encode special characters in UTF-8. */
  var name: String
  
  /** A .zip file of images that do not depict the visual subject of any of the classes of the new classifier. Must contain a minimum of 10 images. Encode special characters in the file name in UTF-8. */
  var negative_examples: js.UndefOr[ReadableStream | FileObject | Buffer] = js.undefined
  
  /** The filename for negative_examples. */
  var negative_examples_filename: js.UndefOr[String] = js.undefined
  
  /** A dictionary that contains the value for each classname. The value is a .zip file of images that depict the visual subject of a class in the new classifier. You can include more than one positive example file in a call. Specify the parameter name by appending `_positive_examples` to the class name. For example, `goldenretriever_positive_examples` creates the class **goldenretriever**. Include at least 10 images in .jpg or .png format. The minimum recommended image resolution is 32X32 pixels. The maximum number of images is 10,000 images or 100 MB per .zip file. Encode special characters in the file name in UTF-8. */
  var positive_examples: Map[String, ReadableStream | FileObject | Buffer]
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object CreateClassifierParams {
  
  inline def apply(name: String, positive_examples: Map[String, ReadableStream | FileObject | Buffer]): CreateClassifierParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], positive_examples = positive_examples.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClassifierParams]
  }
  
  extension [Self <: CreateClassifierParams](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNegative_examples(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "negative_examples", value.asInstanceOf[js.Any])
    
    inline def setNegative_examplesUndefined: Self = StObject.set(x, "negative_examples", js.undefined)
    
    inline def setNegative_examples_filename(value: String): Self = StObject.set(x, "negative_examples_filename", value.asInstanceOf[js.Any])
    
    inline def setNegative_examples_filenameUndefined: Self = StObject.set(x, "negative_examples_filename", js.undefined)
    
    inline def setPositive_examples(value: Map[String, ReadableStream | FileObject | Buffer]): Self = StObject.set(x, "positive_examples", value.asInstanceOf[js.Any])
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
