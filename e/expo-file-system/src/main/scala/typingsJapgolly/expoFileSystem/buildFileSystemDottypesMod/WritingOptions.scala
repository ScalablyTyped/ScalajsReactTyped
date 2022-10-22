package typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod

import typingsJapgolly.expoFileSystem.expoFileSystemStrings.base64
import typingsJapgolly.expoFileSystem.expoFileSystemStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WritingOptions extends StObject {
  
  var encoding: js.UndefOr[EncodingType | utf8 | base64] = js.undefined
}
object WritingOptions {
  
  inline def apply(): WritingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WritingOptions]
  }
  
  extension [Self <: WritingOptions](x: Self) {
    
    inline def setEncoding(value: EncodingType | utf8 | base64): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
