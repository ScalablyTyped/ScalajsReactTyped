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
import typingsJapgolly.ckeditorCkeditor5Paragraph.srcParagraphMod.default
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-paragraph", "Paragraph")
  @js.native
  open class Paragraph () extends default
  /* static members */
  object Paragraph {
    
    @JSImport("@ckeditor/ckeditor5-paragraph", "Paragraph")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-paragraph", "Paragraph.paragraphLikeElements")
    @js.native
    def paragraphLikeElements: Set[blockquote | dd | div | dt | h1 | h2 | h3 | h4 | h5 | h6 | li | p | td | th] = js.native
    inline def paragraphLikeElements_=(x: Set[blockquote | dd | div | dt | h1 | h2 | h3 | h4 | h5 | h6 | li | p | td | th]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paragraphLikeElements")(x.asInstanceOf[js.Any])
    
    @JSImport("@ckeditor/ckeditor5-paragraph", "Paragraph.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5Paragraph.ckeditorCkeditor5ParagraphStrings.Paragraph = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-paragraph", "ParagraphButtonUI")
  @js.native
  open class ParagraphButtonUI protected ()
    extends typingsJapgolly.ckeditorCkeditor5Paragraph.srcParagraphbuttonuiMod.default {
    def this(editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorWithUI */ Any) = this()
  }
}
