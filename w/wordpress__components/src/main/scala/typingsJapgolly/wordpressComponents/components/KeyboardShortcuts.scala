package typingsJapgolly.wordpressComponents.components

import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.keydown
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.keypress
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.keyup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeyboardShortcuts {
  
  object PropsWithChildren {
    
    inline def apply(shortcuts: Record[String, js.Function2[/* event */ KeyboardEvent, /* combo */ String, Unit]]): Builder = {
      val __props = js.Dynamic.literal(shortcuts = shortcuts.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithChildren]))
    }
    
    @JSImport("@wordpress/components", "KeyboardShortcuts")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def bindGlobal(value: Boolean): this.type = set("bindGlobal", value.asInstanceOf[js.Any])
      
      inline def eventName(value: keydown | keypress | keyup): this.type = set("eventName", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithChildren): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object PropsWithoutChildren {
    
    inline def apply(shortcuts: Record[String, js.Function2[/* event */ KeyboardEvent, /* combo */ String, Unit]]): Builder = {
      val __props = js.Dynamic.literal(bindGlobal = true, shortcuts = shortcuts.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithoutChildren]))
    }
    
    @JSImport("@wordpress/components", "KeyboardShortcuts")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def eventName(value: keydown | keypress | keyup): this.type = set("eventName", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithoutChildren): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
