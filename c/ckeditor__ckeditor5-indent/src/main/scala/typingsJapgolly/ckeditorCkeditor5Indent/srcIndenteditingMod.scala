package typingsJapgolly.ckeditorCkeditor5Indent

import typingsJapgolly.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndenteditingMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indentediting", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IndentEditing
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-indent/src/indentediting", "default.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5Indent.ckeditorCkeditor5IndentStrings.IndentEditing = js.native
  }
  
  @js.native
  trait IndentEditing
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var IndentEditing: typingsJapgolly.ckeditorCkeditor5Indent.srcIndenteditingMod.IndentEditing
    }
    object Plugins {
      
      inline def apply(IndentEditing: IndentEditing): Plugins = {
        val __obj = js.Dynamic.literal(IndentEditing = IndentEditing.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setIndentEditing(value: IndentEditing): Self = StObject.set(x, "IndentEditing", value.asInstanceOf[js.Any])
      }
    }
  }
}
