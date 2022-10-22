package typingsJapgolly.ipp.anon

import typingsJapgolly.ipp.mod.CharacterSet
import typingsJapgolly.ipp.mod.MimeMediaType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Documenturi extends StObject {
  
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.undefined
  
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  
  var compression: js.UndefOr[typingsJapgolly.ipp.mod.Compression] = js.undefined
  
  var `document-format`: js.UndefOr[MimeMediaType] = js.undefined
  
  var `document-name`: js.UndefOr[String] = js.undefined
  
  var `document-natural-language`: js.UndefOr[String] = js.undefined
  
  var `document-uri`: String
  
  var `job-id`: js.UndefOr[Double] = js.undefined
  
  var `job-uri`: js.UndefOr[String] = js.undefined
  
  var `last-document`: Boolean
  
  var `printer-uri`: js.UndefOr[String] = js.undefined
  
  var `requesting-user-name`: String
}
object Documenturi {
  
  inline def apply(`document-uri`: String, `last-document`: Boolean, `requesting-user-name`: String): Documenturi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("document-uri")(`document-uri`.asInstanceOf[js.Any])
    __obj.updateDynamic("last-document")(`last-document`.asInstanceOf[js.Any])
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documenturi]
  }
  
  extension [Self <: Documenturi](x: Self) {
    
    inline def `setAttributes-charset`(value: CharacterSet): Self = StObject.set(x, "attributes-charset", value.asInstanceOf[js.Any])
    
    inline def `setAttributes-charsetUndefined`: Self = StObject.set(x, "attributes-charset", js.undefined)
    
    inline def `setAttributes-natural-language`(value: String): Self = StObject.set(x, "attributes-natural-language", value.asInstanceOf[js.Any])
    
    inline def `setAttributes-natural-languageUndefined`: Self = StObject.set(x, "attributes-natural-language", js.undefined)
    
    inline def setCompression(value: typingsJapgolly.ipp.mod.Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def `setDocument-format`(value: MimeMediaType): Self = StObject.set(x, "document-format", value.asInstanceOf[js.Any])
    
    inline def `setDocument-formatUndefined`: Self = StObject.set(x, "document-format", js.undefined)
    
    inline def `setDocument-name`(value: String): Self = StObject.set(x, "document-name", value.asInstanceOf[js.Any])
    
    inline def `setDocument-nameUndefined`: Self = StObject.set(x, "document-name", js.undefined)
    
    inline def `setDocument-natural-language`(value: String): Self = StObject.set(x, "document-natural-language", value.asInstanceOf[js.Any])
    
    inline def `setDocument-natural-languageUndefined`: Self = StObject.set(x, "document-natural-language", js.undefined)
    
    inline def `setDocument-uri`(value: String): Self = StObject.set(x, "document-uri", value.asInstanceOf[js.Any])
    
    inline def `setJob-id`(value: Double): Self = StObject.set(x, "job-id", value.asInstanceOf[js.Any])
    
    inline def `setJob-idUndefined`: Self = StObject.set(x, "job-id", js.undefined)
    
    inline def `setJob-uri`(value: String): Self = StObject.set(x, "job-uri", value.asInstanceOf[js.Any])
    
    inline def `setJob-uriUndefined`: Self = StObject.set(x, "job-uri", js.undefined)
    
    inline def `setLast-document`(value: Boolean): Self = StObject.set(x, "last-document", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-uri`(value: String): Self = StObject.set(x, "printer-uri", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-uriUndefined`: Self = StObject.set(x, "printer-uri", js.undefined)
    
    inline def `setRequesting-user-name`(value: String): Self = StObject.set(x, "requesting-user-name", value.asInstanceOf[js.Any])
  }
}
