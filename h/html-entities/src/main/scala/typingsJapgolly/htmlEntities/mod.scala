package typingsJapgolly.htmlEntities

import typingsJapgolly.htmlEntities.htmlEntitiesStrings.decimal
import typingsJapgolly.htmlEntities.htmlEntitiesStrings.hexadecimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-entities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")().asInstanceOf[String]
  inline def decode(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decode(text: String, hasLevelScope: DecodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any], hasLevelScope.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decode(text: Null, hasLevelScope: DecodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any], hasLevelScope.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decode(text: Unit, hasLevelScope: DecodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any], hasLevelScope.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeEntity(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeEntity")().asInstanceOf[String]
  inline def decodeEntity(entity: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeEntity(entity: String, hasLevel: CommonOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeEntity")(entity.asInstanceOf[js.Any], hasLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decodeEntity(entity: Null, hasLevel: CommonOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeEntity")(entity.asInstanceOf[js.Any], hasLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decodeEntity(entity: Unit, hasLevel: CommonOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeEntity")(entity.asInstanceOf[js.Any], hasLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")().asInstanceOf[String]
  inline def encode(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(text: String, hasModeNumericLevel: EncodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any], hasModeNumericLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(text: Null, hasModeNumericLevel: EncodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any], hasModeNumericLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(text: Unit, hasModeNumericLevel: EncodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any], hasModeNumericLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait CommonOptions extends StObject {
    
    var level: js.UndefOr[Level] = js.undefined
  }
  object CommonOptions {
    
    inline def apply(): CommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions]
    }
    
    extension [Self <: CommonOptions](x: Self) {
      
      inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  trait DecodeOptions
    extends StObject
       with CommonOptions {
    
    var scope: js.UndefOr[DecodeScope] = js.undefined
  }
  object DecodeOptions {
    
    inline def apply(): DecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptions]
    }
    
    extension [Self <: DecodeOptions](x: Self) {
      
      inline def setScope(value: DecodeScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.htmlEntities.htmlEntitiesStrings.strict
    - typingsJapgolly.htmlEntities.htmlEntitiesStrings.body
    - typingsJapgolly.htmlEntities.htmlEntitiesStrings.attribute
  */
  trait DecodeScope extends StObject
  object DecodeScope {
    
    inline def attribute: typingsJapgolly.htmlEntities.htmlEntitiesStrings.attribute = "attribute".asInstanceOf[typingsJapgolly.htmlEntities.htmlEntitiesStrings.attribute]
    
    inline def body: typingsJapgolly.htmlEntities.htmlEntitiesStrings.body = "body".asInstanceOf[typingsJapgolly.htmlEntities.htmlEntitiesStrings.body]
    
    inline def strict: typingsJapgolly.htmlEntities.htmlEntitiesStrings.strict = "strict".asInstanceOf[typingsJapgolly.htmlEntities.htmlEntitiesStrings.strict]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.htmlEntities.htmlEntitiesStrings.specialChars
    - typingsJapgolly.htmlEntities.htmlEntitiesStrings.nonAscii
    - typingsJapgolly.htmlEntities.htmlEntitiesStrings.nonAsciiPrintable
    - typingsJapgolly.htmlEntities.htmlEntitiesStrings.extensive
  */
  trait EncodeMode extends StObject
  object EncodeMode {
    
    inline def extensive: typingsJapgolly.htmlEntities.htmlEntitiesStrings.extensive = "extensive".asInstanceOf[typingsJapgolly.htmlEntities.htmlEntitiesStrings.extensive]
    
    inline def nonAscii: typingsJapgolly.htmlEntities.htmlEntitiesStrings.nonAscii = "nonAscii".asInstanceOf[typingsJapgolly.htmlEntities.htmlEntitiesStrings.nonAscii]
    
    inline def nonAsciiPrintable: typingsJapgolly.htmlEntities.htmlEntitiesStrings.nonAsciiPrintable = "nonAsciiPrintable".asInstanceOf[typingsJapgolly.htmlEntities.htmlEntitiesStrings.nonAsciiPrintable]
    
    inline def specialChars: typingsJapgolly.htmlEntities.htmlEntitiesStrings.specialChars = "specialChars".asInstanceOf[typingsJapgolly.htmlEntities.htmlEntitiesStrings.specialChars]
  }
  
  trait EncodeOptions
    extends StObject
       with CommonOptions {
    
    var mode: js.UndefOr[EncodeMode] = js.undefined
    
    var numeric: js.UndefOr[decimal | hexadecimal] = js.undefined
  }
  object EncodeOptions {
    
    inline def apply(): EncodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodeOptions]
    }
    
    extension [Self <: EncodeOptions](x: Self) {
      
      inline def setMode(value: EncodeMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNumeric(value: decimal | hexadecimal): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.htmlEntities.htmlEntitiesStrings.xml
    - typingsJapgolly.htmlEntities.htmlEntitiesStrings.html4
    - typingsJapgolly.htmlEntities.htmlEntitiesStrings.html5
    - typingsJapgolly.htmlEntities.htmlEntitiesStrings.all
  */
  trait Level extends StObject
  object Level {
    
    inline def all: typingsJapgolly.htmlEntities.htmlEntitiesStrings.all = "all".asInstanceOf[typingsJapgolly.htmlEntities.htmlEntitiesStrings.all]
    
    inline def html4: typingsJapgolly.htmlEntities.htmlEntitiesStrings.html4 = "html4".asInstanceOf[typingsJapgolly.htmlEntities.htmlEntitiesStrings.html4]
    
    inline def html5: typingsJapgolly.htmlEntities.htmlEntitiesStrings.html5 = "html5".asInstanceOf[typingsJapgolly.htmlEntities.htmlEntitiesStrings.html5]
    
    inline def xml: typingsJapgolly.htmlEntities.htmlEntitiesStrings.xml = "xml".asInstanceOf[typingsJapgolly.htmlEntities.htmlEntitiesStrings.xml]
  }
}
