package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MylibraryResource extends StObject {
  
  var annotations: AnnotationsResource
  
  var bookshelves: BookshelvesResource
  
  var readingpositions: ReadingpositionsResource
}
object MylibraryResource {
  
  inline def apply(
    annotations: AnnotationsResource,
    bookshelves: BookshelvesResource,
    readingpositions: ReadingpositionsResource
  ): MylibraryResource = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], bookshelves = bookshelves.asInstanceOf[js.Any], readingpositions = readingpositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MylibraryResource]
  }
  
  extension [Self <: MylibraryResource](x: Self) {
    
    inline def setAnnotations(value: AnnotationsResource): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setBookshelves(value: BookshelvesResource): Self = StObject.set(x, "bookshelves", value.asInstanceOf[js.Any])
    
    inline def setReadingpositions(value: ReadingpositionsResource): Self = StObject.set(x, "readingpositions", value.asInstanceOf[js.Any])
  }
}
