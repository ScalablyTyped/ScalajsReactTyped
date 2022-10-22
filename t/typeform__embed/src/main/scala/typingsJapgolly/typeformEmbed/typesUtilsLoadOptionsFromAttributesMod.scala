package typingsJapgolly.typeformEmbed

import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsLoadOptionsFromAttributesMod {
  
  @JSImport("@typeform/embed/types/utils/load-options-from-attributes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelCaseToKebabCase(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCaseToKebabCase")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def loadOptionsFromAttributes(element: HTMLElement, transform: Record[String, Transformation]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("loadOptionsFromAttributes")(element.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def transformAttributeValue(value: String, transformation: Transformation): js.UndefOr[
    String | Double | Boolean | js.Function | (Record[String, String]) | js.Array[String]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAttributeValue")(value.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    String | Double | Boolean | js.Function | (Record[String, String]) | js.Array[String]
  ]]
  inline def transformAttributeValue(value: Null, transformation: Transformation): js.UndefOr[
    String | Double | Boolean | js.Function | (Record[String, String]) | js.Array[String]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAttributeValue")(value.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    String | Double | Boolean | js.Function | (Record[String, String]) | js.Array[String]
  ]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typeformEmbed.typeformEmbedStrings.string
    - typingsJapgolly.typeformEmbed.typeformEmbedStrings.boolean
    - typingsJapgolly.typeformEmbed.typeformEmbedStrings.integer
    - typingsJapgolly.typeformEmbed.typeformEmbedStrings.function
    - typingsJapgolly.typeformEmbed.typeformEmbedStrings.array
    - typingsJapgolly.typeformEmbed.typeformEmbedStrings.record
    - typingsJapgolly.typeformEmbed.typeformEmbedStrings.integerOrBoolean
    - typingsJapgolly.typeformEmbed.typeformEmbedStrings.stringOrBoolean
  */
  trait Transformation extends StObject
  object Transformation {
    
    inline def array: typingsJapgolly.typeformEmbed.typeformEmbedStrings.array = "array".asInstanceOf[typingsJapgolly.typeformEmbed.typeformEmbedStrings.array]
    
    inline def boolean: typingsJapgolly.typeformEmbed.typeformEmbedStrings.boolean = "boolean".asInstanceOf[typingsJapgolly.typeformEmbed.typeformEmbedStrings.boolean]
    
    inline def function: typingsJapgolly.typeformEmbed.typeformEmbedStrings.function = "function".asInstanceOf[typingsJapgolly.typeformEmbed.typeformEmbedStrings.function]
    
    inline def integer: typingsJapgolly.typeformEmbed.typeformEmbedStrings.integer = "integer".asInstanceOf[typingsJapgolly.typeformEmbed.typeformEmbedStrings.integer]
    
    inline def integerOrBoolean: typingsJapgolly.typeformEmbed.typeformEmbedStrings.integerOrBoolean = "integerOrBoolean".asInstanceOf[typingsJapgolly.typeformEmbed.typeformEmbedStrings.integerOrBoolean]
    
    inline def record: typingsJapgolly.typeformEmbed.typeformEmbedStrings.record = "record".asInstanceOf[typingsJapgolly.typeformEmbed.typeformEmbedStrings.record]
    
    inline def string: typingsJapgolly.typeformEmbed.typeformEmbedStrings.string = "string".asInstanceOf[typingsJapgolly.typeformEmbed.typeformEmbedStrings.string]
    
    inline def stringOrBoolean: typingsJapgolly.typeformEmbed.typeformEmbedStrings.stringOrBoolean = "stringOrBoolean".asInstanceOf[typingsJapgolly.typeformEmbed.typeformEmbedStrings.stringOrBoolean]
  }
}
