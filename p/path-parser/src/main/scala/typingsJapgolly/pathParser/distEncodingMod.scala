package typingsJapgolly.pathParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEncodingMod {
  
  @JSImport("path-parser/dist/encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeParam(param: String, encoding: URLParamsEncodingType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeParam")(param.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeParam(param: String, encoding: URLParamsEncodingType, isSpatParam: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeParam")(param.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], isSpatParam.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeParam(param: Boolean, encoding: URLParamsEncodingType, isSpatParam: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeParam")(param.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], isSpatParam.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeParam(param: Double, encoding: URLParamsEncodingType, isSpatParam: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeParam")(param.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], isSpatParam.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeURIComponentExcludingSubDelims(segment: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeURIComponentExcludingSubDelims")(segment.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pathParser.pathParserStrings.default
    - typingsJapgolly.pathParser.pathParserStrings.uri
    - typingsJapgolly.pathParser.pathParserStrings.uriComponent
    - typingsJapgolly.pathParser.pathParserStrings.none
    - typingsJapgolly.pathParser.pathParserStrings.legacy
  */
  trait URLParamsEncodingType extends StObject
  object URLParamsEncodingType {
    
    inline def default: typingsJapgolly.pathParser.pathParserStrings.default = "default".asInstanceOf[typingsJapgolly.pathParser.pathParserStrings.default]
    
    inline def legacy: typingsJapgolly.pathParser.pathParserStrings.legacy = "legacy".asInstanceOf[typingsJapgolly.pathParser.pathParserStrings.legacy]
    
    inline def none: typingsJapgolly.pathParser.pathParserStrings.none = "none".asInstanceOf[typingsJapgolly.pathParser.pathParserStrings.none]
    
    inline def uri: typingsJapgolly.pathParser.pathParserStrings.uri = "uri".asInstanceOf[typingsJapgolly.pathParser.pathParserStrings.uri]
    
    inline def uriComponent: typingsJapgolly.pathParser.pathParserStrings.uriComponent = "uriComponent".asInstanceOf[typingsJapgolly.pathParser.pathParserStrings.uriComponent]
  }
}
