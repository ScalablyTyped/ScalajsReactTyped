package typingsJapgolly.ckeditorCkeditor5Undo

import typingsJapgolly.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUndouiMod {
  
  @JSImport("@ckeditor/ckeditor5-undo/src/undoui", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with UndoUI
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-undo/src/undoui", "default.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5Undo.ckeditorCkeditor5UndoStrings.UndoUI = js.native
  }
  
  @js.native
  trait UndoUI
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var UndoUI: typingsJapgolly.ckeditorCkeditor5Undo.srcUndouiMod.UndoUI
    }
    object Plugins {
      
      inline def apply(UndoUI: UndoUI): Plugins = {
        val __obj = js.Dynamic.literal(UndoUI = UndoUI.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setUndoUI(value: UndoUI): Self = StObject.set(x, "UndoUI", value.asInstanceOf[js.Any])
      }
    }
  }
}
