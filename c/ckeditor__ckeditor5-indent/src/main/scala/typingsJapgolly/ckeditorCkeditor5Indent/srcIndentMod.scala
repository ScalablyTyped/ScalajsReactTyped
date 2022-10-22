package typingsJapgolly.ckeditorCkeditor5Indent

import typingsJapgolly.ckeditorCkeditor5Indent.anon.TypeofIndentEditing
import typingsJapgolly.ckeditorCkeditor5Indent.anon.TypeofIndentUI
import typingsJapgolly.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndentMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indent", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Plugin
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-indent/src/indent", "default.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5Indent.ckeditorCkeditor5IndentStrings.Indent = js.native
    
    @JSImport("@ckeditor/ckeditor5-indent/src/indent", "default.requires")
    @js.native
    val requires: js.Tuple2[TypeofIndentEditing, TypeofIndentUI] = js.native
  }
  
  type Indent = Plugin
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var Indent: typingsJapgolly.ckeditorCkeditor5Indent.srcIndentMod.Indent
    }
    object Plugins {
      
      inline def apply(Indent: Indent): Plugins = {
        val __obj = js.Dynamic.literal(Indent = Indent.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setIndent(value: Indent): Self = StObject.set(x, "Indent", value.asInstanceOf[js.Any])
      }
    }
  }
}
