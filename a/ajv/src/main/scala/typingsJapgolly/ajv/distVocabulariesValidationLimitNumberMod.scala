package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.anon.Data
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationLimitNumberMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/limitNumber", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajv.ajvStrings.LessthansignEqualssign
    - typingsJapgolly.ajv.ajvStrings.GreaterthansignEqualssign
    - typingsJapgolly.ajv.ajvStrings.Lessthansign
    - typingsJapgolly.ajv.ajvStrings.Greaterthansign
  */
  trait Comparison extends StObject
  object Comparison {
    
    inline def Greaterthansign: typingsJapgolly.ajv.ajvStrings.Greaterthansign = ">".asInstanceOf[typingsJapgolly.ajv.ajvStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typingsJapgolly.ajv.ajvStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typingsJapgolly.ajv.ajvStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typingsJapgolly.ajv.ajvStrings.Lessthansign = "<".asInstanceOf[typingsJapgolly.ajv.ajvStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typingsJapgolly.ajv.ajvStrings.LessthansignEqualssign = "<=".asInstanceOf[typingsJapgolly.ajv.ajvStrings.LessthansignEqualssign]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajv.ajvStrings.maximum
    - typingsJapgolly.ajv.ajvStrings.minimum
    - typingsJapgolly.ajv.ajvStrings.exclusiveMaximum
    - typingsJapgolly.ajv.ajvStrings.exclusiveMinimum
  */
  trait Kwd extends StObject
  object Kwd {
    
    inline def exclusiveMaximum: typingsJapgolly.ajv.ajvStrings.exclusiveMaximum = "exclusiveMaximum".asInstanceOf[typingsJapgolly.ajv.ajvStrings.exclusiveMaximum]
    
    inline def exclusiveMinimum: typingsJapgolly.ajv.ajvStrings.exclusiveMinimum = "exclusiveMinimum".asInstanceOf[typingsJapgolly.ajv.ajvStrings.exclusiveMinimum]
    
    inline def maximum: typingsJapgolly.ajv.ajvStrings.maximum = "maximum".asInstanceOf[typingsJapgolly.ajv.ajvStrings.maximum]
    
    inline def minimum: typingsJapgolly.ajv.ajvStrings.minimum = "minimum".asInstanceOf[typingsJapgolly.ajv.ajvStrings.minimum]
  }
  
  type LimitNumberError = ErrorObject[Kwd, typingsJapgolly.ajv.anon.Comparison, Double | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationLimitNumberMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
