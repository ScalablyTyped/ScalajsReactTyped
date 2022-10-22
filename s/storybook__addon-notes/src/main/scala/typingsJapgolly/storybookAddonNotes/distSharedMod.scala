package typingsJapgolly.storybookAddonNotes

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedMod {
  
  @JSImport("@storybook/addon-notes/dist/shared", "ADDON_ID")
  @js.native
  val ADDON_ID: /* "storybookjs/notes" */ String = js.native
  
  @JSImport("@storybook/addon-notes/dist/shared", "PANEL_ID")
  @js.native
  val PANEL_ID: String = js.native
  
  @JSImport("@storybook/addon-notes/dist/shared", "PARAM_KEY")
  @js.native
  val PARAM_KEY: /* "notes" */ String = js.native
  
  trait DisabledParameter
    extends StObject
       with _Parameters {
    
    var disable: Boolean
  }
  object DisabledParameter {
    
    inline def apply(disable: Boolean): DisabledParameter = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisabledParameter]
    }
    
    extension [Self <: DisabledParameter](x: Self) {
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    }
  }
  
  trait MarkdownParameter
    extends StObject
       with _Parameters {
    
    var markdown: String
  }
  object MarkdownParameter {
    
    inline def apply(markdown: String): MarkdownParameter = {
      val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkdownParameter]
    }
    
    extension [Self <: MarkdownParameter](x: Self) {
      
      inline def setMarkdown(value: String): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.storybookAddonNotes.distSharedMod.TextParameter
    - typingsJapgolly.storybookAddonNotes.distSharedMod.MarkdownParameter
    - typingsJapgolly.storybookAddonNotes.distSharedMod.DisabledParameter
    - typingsJapgolly.storybookAddonNotes.distSharedMod.TabsParameter
  */
  type Parameters = _Parameters | String | TabsParameter
  
  type TabsParameter = Record[String, String]
  
  trait TextParameter
    extends StObject
       with _Parameters {
    
    var text: String
  }
  object TextParameter {
    
    inline def apply(text: String): TextParameter = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextParameter]
    }
    
    extension [Self <: TextParameter](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Parameters extends StObject
  object _Parameters {
    
    inline def DisabledParameter(disable: Boolean): typingsJapgolly.storybookAddonNotes.distSharedMod.DisabledParameter = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.storybookAddonNotes.distSharedMod.DisabledParameter]
    }
    
    inline def MarkdownParameter(markdown: String): typingsJapgolly.storybookAddonNotes.distSharedMod.MarkdownParameter = {
      val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.storybookAddonNotes.distSharedMod.MarkdownParameter]
    }
    
    inline def TextParameter(text: String): typingsJapgolly.storybookAddonNotes.distSharedMod.TextParameter = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.storybookAddonNotes.distSharedMod.TextParameter]
    }
  }
}
