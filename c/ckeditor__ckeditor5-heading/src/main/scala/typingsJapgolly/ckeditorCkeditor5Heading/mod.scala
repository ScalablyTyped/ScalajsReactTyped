package typingsJapgolly.ckeditorCkeditor5Heading

import typingsJapgolly.ckeditorCkeditor5Heading.anon.TypeofHeadingEditing
import typingsJapgolly.ckeditorCkeditor5Heading.anon.TypeofHeadingUI
import typingsJapgolly.ckeditorCkeditor5Heading.anon.TypeofParagraph
import typingsJapgolly.ckeditorCkeditor5Heading.srcHeadingMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-heading", "Heading")
  @js.native
  open class Heading () extends default
  /* static members */
  object Heading {
    
    @JSImport("@ckeditor/ckeditor5-heading", "Heading.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.Heading = js.native
    
    @JSImport("@ckeditor/ckeditor5-heading", "Heading.requires")
    @js.native
    val requires: js.Tuple2[TypeofHeadingEditing, TypeofHeadingUI] = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-heading", "HeadingButtonsUI")
  @js.native
  open class HeadingButtonsUI ()
    extends typingsJapgolly.ckeditorCkeditor5Heading.srcHeadingbuttonsuiMod.default
  
  @JSImport("@ckeditor/ckeditor5-heading", "HeadingEditing")
  @js.native
  open class HeadingEditing ()
    extends typingsJapgolly.ckeditorCkeditor5Heading.srcHeadingeditingMod.default
  /* static members */
  object HeadingEditing {
    
    @JSImport("@ckeditor/ckeditor5-heading", "HeadingEditing.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.HeadingEditing = js.native
    
    @JSImport("@ckeditor/ckeditor5-heading", "HeadingEditing.requires")
    @js.native
    val requires: js.Array[TypeofParagraph] = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-heading", "HeadingUI")
  @js.native
  open class HeadingUI ()
    extends typingsJapgolly.ckeditorCkeditor5Heading.srcHeadinguiMod.default
  /* static members */
  object HeadingUI {
    
    @JSImport("@ckeditor/ckeditor5-heading", "HeadingUI.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.HeadingUI = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-heading", "Title")
  @js.native
  open class Title ()
    extends typingsJapgolly.ckeditorCkeditor5Heading.srcTitleMod.default
  /* static members */
  object Title {
    
    @JSImport("@ckeditor/ckeditor5-heading", "Title.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5Heading.ckeditorCkeditor5HeadingStrings.Title = js.native
    
    @JSImport("@ckeditor/ckeditor5-heading", "Title.requires")
    @js.native
    val requires: js.Array[TypeofParagraph] = js.native
  }
}
