package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.basic
import typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe
import typingsJapgolly.forkTsCheckerWebpackPlugin.libFormatterFormatterMod.Formatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterFormatterOptionsMod {
  
  trait BasicFormatterOptions
    extends StObject
       with _FormatterOptions {
    
    var `type`: basic
  }
  object BasicFormatterOptions {
    
    inline def apply(): BasicFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("basic")
      __obj.asInstanceOf[BasicFormatterOptions]
    }
    
    extension [Self <: BasicFormatterOptions](x: Self) {
      
      inline def setType(value: basic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodeframeFormatterOptions
    extends StObject
       with _FormatterOptions {
    
    var options: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelCodeFrameOptions */ Any
      ] = js.undefined
    
    var `type`: codeframe
  }
  object CodeframeFormatterOptions {
    
    inline def apply(): CodeframeFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("codeframe")
      __obj.asInstanceOf[CodeframeFormatterOptions]
    }
    
    extension [Self <: CodeframeFormatterOptions](x: Self) {
      
      inline def setOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelCodeFrameOptions */ Any
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: codeframe): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typingsJapgolly.forkTsCheckerWebpackPlugin.libFormatterFormatterOptionsMod.FormatterType
    - typingsJapgolly.forkTsCheckerWebpackPlugin.libFormatterFormatterOptionsMod.BasicFormatterOptions
    - typingsJapgolly.forkTsCheckerWebpackPlugin.libFormatterFormatterOptionsMod.CodeframeFormatterOptions
    - typingsJapgolly.forkTsCheckerWebpackPlugin.libFormatterFormatterMod.Formatter
  */
  type FormatterOptions = js.UndefOr[_FormatterOptions | Formatter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.basic
    - typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe
  */
  trait FormatterType
    extends StObject
       with _FormatterOptions
  object FormatterType {
    
    inline def basic: typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.basic = "basic".asInstanceOf[typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.basic]
    
    inline def codeframe: typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe = "codeframe".asInstanceOf[typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe]
  }
  
  trait _FormatterOptions extends StObject
}
