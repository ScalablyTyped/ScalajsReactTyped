package typingsJapgolly.ckeditorCkeditor5Highlight

import typingsJapgolly.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHighlighteditingMod {
  
  @JSImport("@ckeditor/ckeditor5-highlight/src/highlightediting", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HighlightEditing
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-highlight/src/highlightediting", "default.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.HighlightEditing = js.native
  }
  
  @js.native
  trait HighlightEditing
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var HighlightEditing: typingsJapgolly.ckeditorCkeditor5Highlight.srcHighlighteditingMod.HighlightEditing
    }
    object Plugins {
      
      inline def apply(HighlightEditing: HighlightEditing): Plugins = {
        val __obj = js.Dynamic.literal(HighlightEditing = HighlightEditing.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setHighlightEditing(value: HighlightEditing): Self = StObject.set(x, "HighlightEditing", value.asInstanceOf[js.Any])
      }
    }
  }
}
