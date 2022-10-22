package typingsJapgolly.ajvFormats

import typingsJapgolly.ajv.distTypesMod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormatsMod {
  
  @JSImport("ajv-formats/dist/formats", "fastFormats")
  @js.native
  val fastFormats: DefinedFormats = js.native
  
  @JSImport("ajv-formats/dist/formats", "formatNames")
  @js.native
  val formatNames: js.Array[FormatName] = js.native
  
  @JSImport("ajv-formats/dist/formats", "fullFormats")
  @js.native
  val fullFormats: DefinedFormats = js.native
  
  /* Inlined {[ key in ajv-formats.ajv-formats/dist/formats.FormatName ]: ajv.ajv.Format} */
  trait DefinedFormats extends StObject {
    
    var binary: Format
    
    var byte: Format
    
    var date: Format
    
    var `date-time`: Format
    
    var double: Format
    
    var duration: Format
    
    var email: Format
    
    var float: Format
    
    var hostname: Format
    
    var int32: Format
    
    var int64: Format
    
    var ipv4: Format
    
    var ipv6: Format
    
    var `json-pointer`: Format
    
    var `json-pointer-uri-fragment`: Format
    
    var password: Format
    
    var regex: Format
    
    var `relative-json-pointer`: Format
    
    var time: Format
    
    var uri: Format
    
    var `uri-reference`: Format
    
    var `uri-template`: Format
    
    var url: Format
    
    var uuid: Format
  }
  object DefinedFormats {
    
    inline def apply(
      binary: Format,
      byte: Format,
      date: Format,
      `date-time`: Format,
      double: Format,
      duration: Format,
      email: Format,
      float: Format,
      hostname: Format,
      int32: Format,
      int64: Format,
      ipv4: Format,
      ipv6: Format,
      `json-pointer`: Format,
      `json-pointer-uri-fragment`: Format,
      password: Format,
      regex: Format,
      `relative-json-pointer`: Format,
      time: Format,
      uri: Format,
      `uri-reference`: Format,
      `uri-template`: Format,
      url: Format,
      uuid: Format
    ): DefinedFormats = {
      val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], byte = byte.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], int64 = int64.asInstanceOf[js.Any], ipv4 = ipv4.asInstanceOf[js.Any], ipv6 = ipv6.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("date-time")(`date-time`.asInstanceOf[js.Any])
      __obj.updateDynamic("json-pointer")(`json-pointer`.asInstanceOf[js.Any])
      __obj.updateDynamic("json-pointer-uri-fragment")(`json-pointer-uri-fragment`.asInstanceOf[js.Any])
      __obj.updateDynamic("relative-json-pointer")(`relative-json-pointer`.asInstanceOf[js.Any])
      __obj.updateDynamic("uri-reference")(`uri-reference`.asInstanceOf[js.Any])
      __obj.updateDynamic("uri-template")(`uri-template`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefinedFormats]
    }
    
    extension [Self <: DefinedFormats](x: Self) {
      
      inline def setBinary(value: Format): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryFunction1(value: String => Boolean): Self = StObject.set(x, "binary", js.Any.fromFunction1(value))
      
      inline def setByte(value: Format): Self = StObject.set(x, "byte", value.asInstanceOf[js.Any])
      
      inline def setByteFunction1(value: String => Boolean): Self = StObject.set(x, "byte", js.Any.fromFunction1(value))
      
      inline def setDate(value: Format): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def `setDate-time`(value: Format): Self = StObject.set(x, "date-time", value.asInstanceOf[js.Any])
      
      inline def `setDate-timeFunction1`(value: String => Boolean): Self = StObject.set(x, "date-time", js.Any.fromFunction1(value))
      
      inline def setDateFunction1(value: String => Boolean): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
      
      inline def setDouble(value: Format): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
      
      inline def setDoubleFunction1(value: String => Boolean): Self = StObject.set(x, "double", js.Any.fromFunction1(value))
      
      inline def setDuration(value: Format): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationFunction1(value: String => Boolean): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
      
      inline def setEmail(value: Format): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailFunction1(value: String => Boolean): Self = StObject.set(x, "email", js.Any.fromFunction1(value))
      
      inline def setFloat(value: Format): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatFunction1(value: String => Boolean): Self = StObject.set(x, "float", js.Any.fromFunction1(value))
      
      inline def setHostname(value: Format): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameFunction1(value: String => Boolean): Self = StObject.set(x, "hostname", js.Any.fromFunction1(value))
      
      inline def setInt32(value: Format): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setInt32Function1(value: String => Boolean): Self = StObject.set(x, "int32", js.Any.fromFunction1(value))
      
      inline def setInt64(value: Format): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
      
      inline def setInt64Function1(value: String => Boolean): Self = StObject.set(x, "int64", js.Any.fromFunction1(value))
      
      inline def setIpv4(value: Format): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
      
      inline def setIpv4Function1(value: String => Boolean): Self = StObject.set(x, "ipv4", js.Any.fromFunction1(value))
      
      inline def setIpv6(value: Format): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      inline def setIpv6Function1(value: String => Boolean): Self = StObject.set(x, "ipv6", js.Any.fromFunction1(value))
      
      inline def `setJson-pointer`(value: Format): Self = StObject.set(x, "json-pointer", value.asInstanceOf[js.Any])
      
      inline def `setJson-pointer-uri-fragment`(value: Format): Self = StObject.set(x, "json-pointer-uri-fragment", value.asInstanceOf[js.Any])
      
      inline def `setJson-pointer-uri-fragmentFunction1`(value: String => Boolean): Self = StObject.set(x, "json-pointer-uri-fragment", js.Any.fromFunction1(value))
      
      inline def `setJson-pointerFunction1`(value: String => Boolean): Self = StObject.set(x, "json-pointer", js.Any.fromFunction1(value))
      
      inline def setPassword(value: Format): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordFunction1(value: String => Boolean): Self = StObject.set(x, "password", js.Any.fromFunction1(value))
      
      inline def setRegex(value: Format): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexFunction1(value: String => Boolean): Self = StObject.set(x, "regex", js.Any.fromFunction1(value))
      
      inline def `setRelative-json-pointer`(value: Format): Self = StObject.set(x, "relative-json-pointer", value.asInstanceOf[js.Any])
      
      inline def `setRelative-json-pointerFunction1`(value: String => Boolean): Self = StObject.set(x, "relative-json-pointer", js.Any.fromFunction1(value))
      
      inline def setTime(value: Format): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeFunction1(value: String => Boolean): Self = StObject.set(x, "time", js.Any.fromFunction1(value))
      
      inline def setUri(value: Format): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def `setUri-reference`(value: Format): Self = StObject.set(x, "uri-reference", value.asInstanceOf[js.Any])
      
      inline def `setUri-referenceFunction1`(value: String => Boolean): Self = StObject.set(x, "uri-reference", js.Any.fromFunction1(value))
      
      inline def `setUri-template`(value: Format): Self = StObject.set(x, "uri-template", value.asInstanceOf[js.Any])
      
      inline def `setUri-templateFunction1`(value: String => Boolean): Self = StObject.set(x, "uri-template", js.Any.fromFunction1(value))
      
      inline def setUriFunction1(value: String => Boolean): Self = StObject.set(x, "uri", js.Any.fromFunction1(value))
      
      inline def setUrl(value: Format): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlFunction1(value: String => Boolean): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      inline def setUuid(value: Format): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidFunction1(value: String => Boolean): Self = StObject.set(x, "uuid", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.fast
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.full
  */
  trait FormatMode extends StObject
  object FormatMode {
    
    inline def fast: typingsJapgolly.ajvFormats.ajvFormatsStrings.fast = "fast".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.fast]
    
    inline def full: typingsJapgolly.ajvFormats.ajvFormatsStrings.full = "full".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.full]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.date
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.time
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.`date-time`
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.duration
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.uri
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.`uri-reference`
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.`uri-template`
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.url
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.email
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.hostname
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.ipv4
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.ipv6
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.regex
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.uuid
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.`json-pointer`
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.`json-pointer-uri-fragment`
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.`relative-json-pointer`
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.byte
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.int32
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.int64
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.float
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.double
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.password
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.binary
  */
  trait FormatName extends StObject
  object FormatName {
    
    inline def binary: typingsJapgolly.ajvFormats.ajvFormatsStrings.binary = "binary".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.binary]
    
    inline def byte: typingsJapgolly.ajvFormats.ajvFormatsStrings.byte = "byte".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.byte]
    
    inline def date: typingsJapgolly.ajvFormats.ajvFormatsStrings.date = "date".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.date]
    
    inline def `date-time`: typingsJapgolly.ajvFormats.ajvFormatsStrings.`date-time` = "date-time".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.`date-time`]
    
    inline def double: typingsJapgolly.ajvFormats.ajvFormatsStrings.double = "double".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.double]
    
    inline def duration: typingsJapgolly.ajvFormats.ajvFormatsStrings.duration = "duration".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.duration]
    
    inline def email: typingsJapgolly.ajvFormats.ajvFormatsStrings.email = "email".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.email]
    
    inline def float: typingsJapgolly.ajvFormats.ajvFormatsStrings.float = "float".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.float]
    
    inline def hostname: typingsJapgolly.ajvFormats.ajvFormatsStrings.hostname = "hostname".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.hostname]
    
    inline def int32: typingsJapgolly.ajvFormats.ajvFormatsStrings.int32 = "int32".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.int32]
    
    inline def int64: typingsJapgolly.ajvFormats.ajvFormatsStrings.int64 = "int64".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.int64]
    
    inline def ipv4: typingsJapgolly.ajvFormats.ajvFormatsStrings.ipv4 = "ipv4".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.ipv4]
    
    inline def ipv6: typingsJapgolly.ajvFormats.ajvFormatsStrings.ipv6 = "ipv6".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.ipv6]
    
    inline def `json-pointer`: typingsJapgolly.ajvFormats.ajvFormatsStrings.`json-pointer` = "json-pointer".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.`json-pointer`]
    
    inline def `json-pointer-uri-fragment`: typingsJapgolly.ajvFormats.ajvFormatsStrings.`json-pointer-uri-fragment` = "json-pointer-uri-fragment".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.`json-pointer-uri-fragment`]
    
    inline def password: typingsJapgolly.ajvFormats.ajvFormatsStrings.password = "password".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.password]
    
    inline def regex: typingsJapgolly.ajvFormats.ajvFormatsStrings.regex = "regex".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.regex]
    
    inline def `relative-json-pointer`: typingsJapgolly.ajvFormats.ajvFormatsStrings.`relative-json-pointer` = "relative-json-pointer".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.`relative-json-pointer`]
    
    inline def time: typingsJapgolly.ajvFormats.ajvFormatsStrings.time = "time".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.time]
    
    inline def uri: typingsJapgolly.ajvFormats.ajvFormatsStrings.uri = "uri".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.uri]
    
    inline def `uri-reference`: typingsJapgolly.ajvFormats.ajvFormatsStrings.`uri-reference` = "uri-reference".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.`uri-reference`]
    
    inline def `uri-template`: typingsJapgolly.ajvFormats.ajvFormatsStrings.`uri-template` = "uri-template".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.`uri-template`]
    
    inline def url: typingsJapgolly.ajvFormats.ajvFormatsStrings.url = "url".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.url]
    
    inline def uuid: typingsJapgolly.ajvFormats.ajvFormatsStrings.uuid = "uuid".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.uuid]
  }
}
