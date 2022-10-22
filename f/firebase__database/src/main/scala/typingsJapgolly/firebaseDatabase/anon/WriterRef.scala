package typingsJapgolly.firebaseDatabase.anon

import typingsJapgolly.firebaseDatabase.distSrcApiReferenceMod.DatabaseReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriterRef extends StObject {
  
  var readerRef: DatabaseReference
  
  var writerRef: DatabaseReference
}
object WriterRef {
  
  inline def apply(readerRef: DatabaseReference, writerRef: DatabaseReference): WriterRef = {
    val __obj = js.Dynamic.literal(readerRef = readerRef.asInstanceOf[js.Any], writerRef = writerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriterRef]
  }
  
  extension [Self <: WriterRef](x: Self) {
    
    inline def setReaderRef(value: DatabaseReference): Self = StObject.set(x, "readerRef", value.asInstanceOf[js.Any])
    
    inline def setWriterRef(value: DatabaseReference): Self = StObject.set(x, "writerRef", value.asInstanceOf[js.Any])
  }
}
