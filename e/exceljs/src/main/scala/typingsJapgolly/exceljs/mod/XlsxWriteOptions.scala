package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.anon.PartialJSZipGeneratorOpti
import typingsJapgolly.exceljs.mod.stream.xlsx.WorkbookWriterOptions
import typingsJapgolly.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XlsxWriteOptions
  extends StObject
     with WorkbookWriterOptions {
  
  /**
  	 * The option passed to JsZip#generateAsync(options)
  	 */
  var zip: PartialJSZipGeneratorOpti
}
object XlsxWriteOptions {
  
  inline def apply(
    filename: String,
    stream: Stream,
    useSharedStrings: Boolean,
    useStyles: Boolean,
    zip: PartialJSZipGeneratorOpti
  ): XlsxWriteOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], useSharedStrings = useSharedStrings.asInstanceOf[js.Any], useStyles = useStyles.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[XlsxWriteOptions]
  }
  
  extension [Self <: XlsxWriteOptions](x: Self) {
    
    inline def setZip(value: PartialJSZipGeneratorOpti): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
  }
}
