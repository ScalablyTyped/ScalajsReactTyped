package typingsJapgolly.ckeditorCkeditor5Indent

import typingsJapgolly.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndentuiMod {
  
  @JSImport("@ckeditor/ckeditor5-indent/src/indentui", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IndentUI
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-indent/src/indentui", "default.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5Indent.ckeditorCkeditor5IndentStrings.IndentUI = js.native
  }
  
  @js.native
  trait IndentUI
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var IndentUI: typingsJapgolly.ckeditorCkeditor5Indent.srcIndentuiMod.IndentUI
    }
    object Plugins {
      
      inline def apply(IndentUI: IndentUI): Plugins = {
        val __obj = js.Dynamic.literal(IndentUI = IndentUI.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setIndentUI(value: IndentUI): Self = StObject.set(x, "IndentUI", value.asInstanceOf[js.Any])
      }
    }
  }
}
