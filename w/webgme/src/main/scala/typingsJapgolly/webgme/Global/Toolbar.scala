package typingsJapgolly.webgme.global

import org.scalajs.dom.Element
import typingsJapgolly.webgme.Toolbar.ClickFn
import typingsJapgolly.webgme.Toolbar.ToolbarParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toolbar {
  
  @JSGlobal("Toolbar.Toolbar")
  @js.native
  open class Toolbar protected ()
    extends StObject
       with typingsJapgolly.webgme.Toolbar.Toolbar {
    def this(element: Element) = this()
    
    /* CompleteClass */
    override def add(item: typingsJapgolly.webgme.Toolbar.ToolbarItem): typingsJapgolly.webgme.Toolbar.ToolbarButton = js.native
    
    /* CompleteClass */
    override def addButton(params: ToolbarParams): typingsJapgolly.webgme.Toolbar.ToolbarButton = js.native
    
    /* CompleteClass */
    override def addCheckBox(): typingsJapgolly.webgme.Toolbar.ToolbarCheckBox = js.native
    
    /* CompleteClass */
    override def addColorPicker(params: ToolbarParams): typingsJapgolly.webgme.Toolbar.ToolbarColorPicker = js.native
    
    /* CompleteClass */
    override def addDropDownButton(params: ToolbarParams): typingsJapgolly.webgme.Toolbar.ToolbarDropDownButton = js.native
    
    /* CompleteClass */
    override def addLabel(): typingsJapgolly.webgme.Toolbar.ToolbarLabel = js.native
    
    /* CompleteClass */
    override def addRadioButtonGroup(clickFn: ClickFn): typingsJapgolly.webgme.Toolbar.ToolbarRadioButtonGroup = js.native
    
    /* CompleteClass */
    override def addSeparator(): typingsJapgolly.webgme.Toolbar.ToolbarSeparator = js.native
    
    /* CompleteClass */
    override def addTextBox(params: ToolbarParams): typingsJapgolly.webgme.Toolbar.ToolbarTextBox = js.native
    
    /* CompleteClass */
    override def addToggleButton(params: ToolbarParams): typingsJapgolly.webgme.Toolbar.ToolbarToggleButton = js.native
    
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  
  @JSGlobal("Toolbar.ToolbarButton")
  @js.native
  open class ToolbarButton ()
    extends StObject
       with typingsJapgolly.webgme.Toolbar.ToolbarItem {
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @JSGlobal("Toolbar.ToolbarCheckBox")
  @js.native
  open class ToolbarCheckBox ()
    extends StObject
       with typingsJapgolly.webgme.Toolbar.ToolbarItem {
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @JSGlobal("Toolbar.ToolbarColorPicker")
  @js.native
  open class ToolbarColorPicker ()
    extends StObject
       with typingsJapgolly.webgme.Toolbar.ToolbarItem {
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @JSGlobal("Toolbar.ToolbarDropDownButton")
  @js.native
  open class ToolbarDropDownButton ()
    extends StObject
       with typingsJapgolly.webgme.Toolbar.ToolbarDropDownButton {
    
    /* CompleteClass */
    override def addButton(params: ToolbarParams): typingsJapgolly.webgme.Toolbar.ToolbarButton = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @JSGlobal("Toolbar.ToolbarItem")
  @js.native
  open class ToolbarItem ()
    extends StObject
       with typingsJapgolly.webgme.Toolbar.ToolbarItem {
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @JSGlobal("Toolbar.ToolbarLabel")
  @js.native
  open class ToolbarLabel ()
    extends StObject
       with typingsJapgolly.webgme.Toolbar.ToolbarItem {
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @JSGlobal("Toolbar.ToolbarRadioButtonGroup")
  @js.native
  open class ToolbarRadioButtonGroup ()
    extends StObject
       with typingsJapgolly.webgme.Toolbar.ToolbarItem {
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @JSGlobal("Toolbar.ToolbarSeparator")
  @js.native
  open class ToolbarSeparator ()
    extends StObject
       with typingsJapgolly.webgme.Toolbar.ToolbarItem {
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @JSGlobal("Toolbar.ToolbarTextBox")
  @js.native
  open class ToolbarTextBox ()
    extends StObject
       with typingsJapgolly.webgme.Toolbar.ToolbarItem {
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @JSGlobal("Toolbar.ToolbarToggleButton")
  @js.native
  open class ToolbarToggleButton ()
    extends StObject
       with typingsJapgolly.webgme.Toolbar.ToolbarItem {
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
}
