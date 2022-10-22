package typingsJapgolly.maximMazurokGapiClientBooks.anon

import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.BooksAnnotationsRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CfiRange extends StObject {
  
  /** Range in CFI format for this annotation for version above. */
  var cfiRange: js.UndefOr[BooksAnnotationsRange] = js.undefined
  
  /** Content version applicable to ranges below. */
  var contentVersion: js.UndefOr[String] = js.undefined
  
  /** Range in GB image format for this annotation for version above. */
  var gbImageRange: js.UndefOr[BooksAnnotationsRange] = js.undefined
  
  /** Range in GB text format for this annotation for version above. */
  var gbTextRange: js.UndefOr[BooksAnnotationsRange] = js.undefined
  
  /** Range in image CFI format for this annotation for version above. */
  var imageCfiRange: js.UndefOr[BooksAnnotationsRange] = js.undefined
}
object CfiRange {
  
  inline def apply(): CfiRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CfiRange]
  }
  
  extension [Self <: CfiRange](x: Self) {
    
    inline def setCfiRange(value: BooksAnnotationsRange): Self = StObject.set(x, "cfiRange", value.asInstanceOf[js.Any])
    
    inline def setCfiRangeUndefined: Self = StObject.set(x, "cfiRange", js.undefined)
    
    inline def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    inline def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    inline def setGbImageRange(value: BooksAnnotationsRange): Self = StObject.set(x, "gbImageRange", value.asInstanceOf[js.Any])
    
    inline def setGbImageRangeUndefined: Self = StObject.set(x, "gbImageRange", js.undefined)
    
    inline def setGbTextRange(value: BooksAnnotationsRange): Self = StObject.set(x, "gbTextRange", value.asInstanceOf[js.Any])
    
    inline def setGbTextRangeUndefined: Self = StObject.set(x, "gbTextRange", js.undefined)
    
    inline def setImageCfiRange(value: BooksAnnotationsRange): Self = StObject.set(x, "imageCfiRange", value.asInstanceOf[js.Any])
    
    inline def setImageCfiRangeUndefined: Self = StObject.set(x, "imageCfiRange", js.undefined)
  }
}
