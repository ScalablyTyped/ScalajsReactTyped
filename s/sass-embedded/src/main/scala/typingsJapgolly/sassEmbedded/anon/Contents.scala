package typingsJapgolly.sassEmbedded.anon

import typingsJapgolly.sassEmbedded.distTypesLegacyImporterMod._LegacyImporterResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contents
  extends StObject
     with _LegacyImporterResult {
  
  var contents: String
}
object Contents {
  
  inline def apply(contents: String): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
  
  extension [Self <: Contents](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
  }
}
