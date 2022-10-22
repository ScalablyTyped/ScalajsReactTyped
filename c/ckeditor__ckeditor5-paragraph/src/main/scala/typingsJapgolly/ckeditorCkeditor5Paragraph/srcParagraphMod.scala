package typingsJapgolly.ckeditorCkeditor5Paragraph

import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.blockquote
import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.dd
import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.div
import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.dt
import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.h1
import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.h2
import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.h3
import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.h4
import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.h5
import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.h6
import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.li
import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.p
import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.td
import typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.th
import typingsJapgolly.std.Plugin
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcParagraphMod {
  
  @JSImport("@ckeditor/ckeditor5-paragraph/src/paragraph", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Paragraph
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-paragraph/src/paragraph", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-paragraph/src/paragraph", "default.paragraphLikeElements")
    @js.native
    def paragraphLikeElements: Set[blockquote | dd | div | dt | h1 | h2 | h3 | h4 | h5 | h6 | li | p | td | th] = js.native
    inline def paragraphLikeElements_=(x: Set[blockquote | dd | div | dt | h1 | h2 | h3 | h4 | h5 | h6 | li | p | td | th]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paragraphLikeElements")(x.asInstanceOf[js.Any])
    
    @JSImport("@ckeditor/ckeditor5-paragraph/src/paragraph", "default.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.Paragraph = js.native
  }
  
  @js.native
  trait Paragraph
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcCommandcollectionAugmentingMod {
    
    trait Commands extends StObject {
      
      var insertParagraph: typingsJapgolly.ckeditorCkeditor5Paragraph.srcInsertparagraphcommandMod.default
      
      var paragraph: typingsJapgolly.ckeditorCkeditor5Paragraph.srcParagraphcommandMod.default
    }
    object Commands {
      
      inline def apply(
        insertParagraph: typingsJapgolly.ckeditorCkeditor5Paragraph.srcInsertparagraphcommandMod.default,
        paragraph: typingsJapgolly.ckeditorCkeditor5Paragraph.srcParagraphcommandMod.default
      ): Commands = {
        val __obj = js.Dynamic.literal(insertParagraph = insertParagraph.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      extension [Self <: Commands](x: Self) {
        
        inline def setInsertParagraph(value: typingsJapgolly.ckeditorCkeditor5Paragraph.srcInsertparagraphcommandMod.default): Self = StObject.set(x, "insertParagraph", value.asInstanceOf[js.Any])
        
        inline def setParagraph(value: typingsJapgolly.ckeditorCkeditor5Paragraph.srcParagraphcommandMod.default): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var Paragraph: typingsJapgolly.ckeditorCkeditor5Paragraph.srcParagraphMod.Paragraph
    }
    object Plugins {
      
      inline def apply(Paragraph: Paragraph): Plugins = {
        val __obj = js.Dynamic.literal(Paragraph = Paragraph.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setParagraph(value: Paragraph): Self = StObject.set(x, "Paragraph", value.asInstanceOf[js.Any])
      }
    }
  }
}
