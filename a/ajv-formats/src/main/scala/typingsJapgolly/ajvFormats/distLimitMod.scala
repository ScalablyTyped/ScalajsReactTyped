package typingsJapgolly.ajvFormats

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.distCoreMod.Plugin
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLimitMod extends Shortcut {
  
  @JSImport("ajv-formats/dist/limit", JSImport.Default)
  @js.native
  val default: Plugin[Unit] = js.native
  
  @JSImport("ajv-formats/dist/limit", "formatLimitDefinition")
  @js.native
  val formatLimitDefinition: CodeKeywordDefinition = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.LessthansignEqualssign
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.GreaterthansignEqualssign
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.Lessthansign
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.Greaterthansign
  */
  trait Comparison extends StObject
  object Comparison {
    
    inline def Greaterthansign: typingsJapgolly.ajvFormats.ajvFormatsStrings.Greaterthansign = ">".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typingsJapgolly.ajvFormats.ajvFormatsStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typingsJapgolly.ajvFormats.ajvFormatsStrings.Lessthansign = "<".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typingsJapgolly.ajvFormats.ajvFormatsStrings.LessthansignEqualssign = "<=".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.LessthansignEqualssign]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.formatMaximum
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.formatMinimum
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.formatExclusiveMaximum
    - typingsJapgolly.ajvFormats.ajvFormatsStrings.formatExclusiveMinimum
  */
  trait Kwd extends StObject
  object Kwd {
    
    inline def formatExclusiveMaximum: typingsJapgolly.ajvFormats.ajvFormatsStrings.formatExclusiveMaximum = "formatExclusiveMaximum".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.formatExclusiveMaximum]
    
    inline def formatExclusiveMinimum: typingsJapgolly.ajvFormats.ajvFormatsStrings.formatExclusiveMinimum = "formatExclusiveMinimum".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.formatExclusiveMinimum]
    
    inline def formatMaximum: typingsJapgolly.ajvFormats.ajvFormatsStrings.formatMaximum = "formatMaximum".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.formatMaximum]
    
    inline def formatMinimum: typingsJapgolly.ajvFormats.ajvFormatsStrings.formatMinimum = "formatMinimum".asInstanceOf[typingsJapgolly.ajvFormats.ajvFormatsStrings.formatMinimum]
  }
  
  type LimitFormatError = ErrorObject[Kwd, typingsJapgolly.ajvFormats.anon.Comparison, Any]
  
  type _To = Plugin[Unit]
  
  /* This means you don't have to write `default`, but can instead just say `distLimitMod.foo` */
  override def _to: Plugin[Unit] = default
}
