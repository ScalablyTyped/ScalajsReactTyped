package typingsJapgolly.pdfkit.PDFKit

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pdfkit.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represent a single page in the PDF document
  */
trait PDFPage extends StObject {
  
  var annotations: Any
  
  var content: PDFKitReference
  
  /**
    * The page dictionnary
    */
  var dictionary: PDFKitReference
  
  var document: PDFDocument
  
  def end(): Unit
  
  var ext_gstates: Any
  
  var fonts: Any
  
  var height: Double
  
  var layout: String
  
  var margins: Bottom
  
  def maxY(): Double
  
  var patterns: Any
  
  var size: String
  
  var width: Double
  
  def write(chunk: Any): Unit
  
  var xobjects: Any
}
object PDFPage {
  
  inline def apply(
    annotations: Any,
    content: PDFKitReference,
    dictionary: PDFKitReference,
    document: PDFDocument,
    end: Callback,
    ext_gstates: Any,
    fonts: Any,
    height: Double,
    layout: String,
    margins: Bottom,
    maxY: CallbackTo[Double],
    patterns: Any,
    size: String,
    width: Double,
    write: Any => Callback,
    xobjects: Any
  ): PDFPage = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], end = end.toJsFn, ext_gstates = ext_gstates.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], maxY = maxY.toJsFn, patterns = patterns.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], write = js.Any.fromFunction1((t0: Any) => write(t0).runNow()), xobjects = xobjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFPage]
  }
  
  extension [Self <: PDFPage](x: Self) {
    
    inline def setAnnotations(value: Any): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setContent(value: PDFKitReference): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDictionary(value: PDFKitReference): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: PDFDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setExt_gstates(value: Any): Self = StObject.set(x, "ext_gstates", value.asInstanceOf[js.Any])
    
    inline def setFonts(value: Any): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setMargins(value: Bottom): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setMaxY(value: CallbackTo[Double]): Self = StObject.set(x, "maxY", value.toJsFn)
    
    inline def setPatterns(value: Any): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: Any => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setXobjects(value: Any): Self = StObject.set(x, "xobjects", value.asInstanceOf[js.Any])
  }
}
