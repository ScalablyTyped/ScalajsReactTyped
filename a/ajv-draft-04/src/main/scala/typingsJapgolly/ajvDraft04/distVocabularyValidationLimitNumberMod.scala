package typingsJapgolly.ajvDraft04

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import typingsJapgolly.ajvDraft04.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabularyValidationLimitNumberMod extends Shortcut {
  
  @JSImport("ajv-draft-04/dist/vocabulary/validation/limitNumber", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajvDraft04.ajvDraft04Strings.LessthansignEqualssign
    - typingsJapgolly.ajvDraft04.ajvDraft04Strings.GreaterthansignEqualssign
    - typingsJapgolly.ajvDraft04.ajvDraft04Strings.Lessthansign
    - typingsJapgolly.ajvDraft04.ajvDraft04Strings.Greaterthansign
  */
  trait Comparison extends StObject
  object Comparison {
    
    inline def Greaterthansign: typingsJapgolly.ajvDraft04.ajvDraft04Strings.Greaterthansign = ">".asInstanceOf[typingsJapgolly.ajvDraft04.ajvDraft04Strings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typingsJapgolly.ajvDraft04.ajvDraft04Strings.GreaterthansignEqualssign = ">=".asInstanceOf[typingsJapgolly.ajvDraft04.ajvDraft04Strings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typingsJapgolly.ajvDraft04.ajvDraft04Strings.Lessthansign = "<".asInstanceOf[typingsJapgolly.ajvDraft04.ajvDraft04Strings.Lessthansign]
    
    inline def LessthansignEqualssign: typingsJapgolly.ajvDraft04.ajvDraft04Strings.LessthansignEqualssign = "<=".asInstanceOf[typingsJapgolly.ajvDraft04.ajvDraft04Strings.LessthansignEqualssign]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajvDraft04.ajvDraft04Strings.exclusiveMaximum
    - typingsJapgolly.ajvDraft04.ajvDraft04Strings.exclusiveMinimum
  */
  trait ExclusiveLimitKwd extends StObject
  object ExclusiveLimitKwd {
    
    inline def exclusiveMaximum: typingsJapgolly.ajvDraft04.ajvDraft04Strings.exclusiveMaximum = "exclusiveMaximum".asInstanceOf[typingsJapgolly.ajvDraft04.ajvDraft04Strings.exclusiveMaximum]
    
    inline def exclusiveMinimum: typingsJapgolly.ajvDraft04.ajvDraft04Strings.exclusiveMinimum = "exclusiveMinimum".asInstanceOf[typingsJapgolly.ajvDraft04.ajvDraft04Strings.exclusiveMinimum]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajvDraft04.ajvDraft04Strings.maximum
    - typingsJapgolly.ajvDraft04.ajvDraft04Strings.minimum
  */
  trait LimitKwd extends StObject
  object LimitKwd {
    
    inline def maximum: typingsJapgolly.ajvDraft04.ajvDraft04Strings.maximum = "maximum".asInstanceOf[typingsJapgolly.ajvDraft04.ajvDraft04Strings.maximum]
    
    inline def minimum: typingsJapgolly.ajvDraft04.ajvDraft04Strings.minimum = "minimum".asInstanceOf[typingsJapgolly.ajvDraft04.ajvDraft04Strings.minimum]
  }
  
  type LimitNumberError = ErrorObject[LimitKwd, typingsJapgolly.ajvDraft04.anon.Comparison, Double | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabularyValidationLimitNumberMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
