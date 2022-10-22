package typingsJapgolly.ecmarkup.anon

import typingsJapgolly.ecmarkup.ecmarkupStrings.`multi-line`
import typingsJapgolly.ecmarkup.ecmarkupStrings.`single-line`
import typingsJapgolly.ecmarkup.ecmarkupStrings.del
import typingsJapgolly.ecmarkup.ecmarkupStrings.ins
import typingsJapgolly.ecmarkup.ecmarkupStrings.mark
import typingsJapgolly.ecmarkup.libHeaderParserMod.Param
import typingsJapgolly.ecmarkup.libHeaderParserMod.ParseError
import typingsJapgolly.ecmarkup.libHeaderParserMod.ParsedHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  returnType :string,   returnOffset :number} & ecmarkup.ecmarkup/lib/header-parser.ParsedHeaderWithoutReturn */
trait returnTypestringreturnOff
  extends StObject
     with ParsedHeader {
  
  var errors: js.Array[ParseError]
  
  var name: String
  
  var optionalParams: js.Array[Param]
  
  var params: js.Array[Param]
  
  var prefix: String | Null
  
  var returnOffset: Double
  
  var returnType: String & (String | Null)
  
  var `type`: `single-line` | `multi-line`
  
  var wrappingTag: ins | del | mark | Null
}
object returnTypestringreturnOff {
  
  inline def apply(
    errors: js.Array[ParseError],
    name: String,
    optionalParams: js.Array[Param],
    params: js.Array[Param],
    returnOffset: Double,
    returnType: String & (String | Null),
    `type`: `single-line` | `multi-line`
  ): returnTypestringreturnOff = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalParams = optionalParams.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], returnOffset = returnOffset.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], prefix = null, wrappingTag = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[returnTypestringreturnOff]
  }
  
  extension [Self <: returnTypestringreturnOff](x: Self) {
    
    inline def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptionalParams(value: js.Array[Param]): Self = StObject.set(x, "optionalParams", value.asInstanceOf[js.Any])
    
    inline def setOptionalParamsVarargs(value: Param*): Self = StObject.set(x, "optionalParams", js.Array(value*))
    
    inline def setParams(value: js.Array[Param]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Param*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
    
    inline def setReturnOffset(value: Double): Self = StObject.set(x, "returnOffset", value.asInstanceOf[js.Any])
    
    inline def setReturnType(value: String & (String | Null)): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setType(value: `single-line` | `multi-line`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWrappingTag(value: ins | del | mark): Self = StObject.set(x, "wrappingTag", value.asInstanceOf[js.Any])
    
    inline def setWrappingTagNull: Self = StObject.set(x, "wrappingTag", null)
  }
}
