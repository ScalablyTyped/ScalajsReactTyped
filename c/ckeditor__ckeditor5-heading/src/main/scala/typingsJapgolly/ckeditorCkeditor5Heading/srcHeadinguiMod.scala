package typingsJapgolly.ckeditorCkeditor5Heading

import typingsJapgolly.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHeadinguiMod {
  
  @JSImport("@ckeditor/ckeditor5-heading/src/headingui", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HeadingUI
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-heading/src/headingui", "default.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.HeadingUI = js.native
  }
  
  @js.native
  trait HeadingUI
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var HeadingUI: typingsJapgolly.ckeditorCkeditor5Heading.srcHeadinguiMod.HeadingUI
    }
    object Plugins {
      
      inline def apply(HeadingUI: HeadingUI): Plugins = {
        val __obj = js.Dynamic.literal(HeadingUI = HeadingUI.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setHeadingUI(value: HeadingUI): Self = StObject.set(x, "HeadingUI", value.asInstanceOf[js.Any])
      }
    }
  }
}
