package typingsJapgolly.hellosignSdk.anon

import typingsJapgolly.hellosignSdk.hellosignSdkStrings.zip
import typingsJapgolly.hellosignSdk.mod.FilesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with FilesOptions {
  
  var file_type: zip
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(file_type = "zip")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setFile_type(value: zip): Self = StObject.set(x, "file_type", value.asInstanceOf[js.Any])
  }
}
