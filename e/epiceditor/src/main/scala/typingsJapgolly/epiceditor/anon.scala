package typingsJapgolly.epiceditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoSave extends StObject {
    
    var autoSave: Any
    
    var defaultContent: String
    
    var name: String
  }
  object AutoSave {
    
    inline def apply(autoSave: Any, defaultContent: String, name: String): AutoSave = {
      val __obj = js.Dynamic.literal(autoSave = autoSave.asInstanceOf[js.Any], defaultContent = defaultContent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoSave]
    }
    
    extension [Self <: AutoSave](x: Self) {
      
      inline def setAutoSave(value: Any): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setDefaultContent(value: String): Self = StObject.set(x, "defaultContent", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Base extends StObject {
    
    var base: String
    
    var editor: String
    
    var preview: String
  }
  object Base {
    
    inline def apply(base: String, editor: String, preview: String): Base = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    extension [Self <: Base](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fullscreen extends StObject {
    
    var fullscreen: Double
    
    var modifier: Double
    
    var preview: Double
  }
  object Fullscreen {
    
    inline def apply(fullscreen: Double, modifier: Double, preview: Double): Fullscreen = {
      val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fullscreen]
    }
    
    extension [Self <: Fullscreen](x: Self) {
      
      inline def setFullscreen(value: Double): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setModifier(value: Double): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      inline def setPreview(value: Double): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToggleEdit extends StObject {
    
    var toggleEdit: String
    
    var toggleFullscreen: String
    
    var togglePreview: String
  }
  object ToggleEdit {
    
    inline def apply(toggleEdit: String, toggleFullscreen: String, togglePreview: String): ToggleEdit = {
      val __obj = js.Dynamic.literal(toggleEdit = toggleEdit.asInstanceOf[js.Any], toggleFullscreen = toggleFullscreen.asInstanceOf[js.Any], togglePreview = togglePreview.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleEdit]
    }
    
    extension [Self <: ToggleEdit](x: Self) {
      
      inline def setToggleEdit(value: String): Self = StObject.set(x, "toggleEdit", value.asInstanceOf[js.Any])
      
      inline def setToggleFullscreen(value: String): Self = StObject.set(x, "toggleFullscreen", value.asInstanceOf[js.Any])
      
      inline def setTogglePreview(value: String): Self = StObject.set(x, "togglePreview", value.asInstanceOf[js.Any])
    }
  }
}
