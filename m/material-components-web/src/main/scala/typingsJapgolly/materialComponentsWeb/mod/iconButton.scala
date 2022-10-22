package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialIconButton.anon.PartialMDCIconButtonToggl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButton {
  
  @JSImport("material-components-web", "iconButton.default")
  @js.native
  open class default ()
    extends typingsJapgolly.materialIconButton.mod.default {
    def this(adapter: PartialMDCIconButtonToggl) = this()
  }
  
  @JSImport("material-components-web", "iconButton.MDCIconButtonToggle")
  @js.native
  open class MDCIconButtonToggle protected ()
    extends typingsJapgolly.materialIconButton.mod.MDCIconButtonToggle {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialIconButton.foundationMod.MDCIconButtonToggleFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCIconButtonToggle {
    
    @JSImport("material-components-web", "iconButton.MDCIconButtonToggle")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: HTMLElement): typingsJapgolly.materialIconButton.componentMod.MDCIconButtonToggle = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialIconButton.componentMod.MDCIconButtonToggle]
  }
  
  @JSImport("material-components-web", "iconButton.MDCIconButtonToggleFoundation")
  @js.native
  open class MDCIconButtonToggleFoundation ()
    extends typingsJapgolly.materialIconButton.mod.MDCIconButtonToggleFoundation {
    def this(adapter: PartialMDCIconButtonToggl) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "iconButton.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "iconButton.cssClasses.ICON_BUTTON_ON")
    @js.native
    def ICON_BUTTON_ON: String = js.native
    inline def ICON_BUTTON_ON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_BUTTON_ON")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "iconButton.cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "iconButton.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "iconButton.strings.ARIA_LABEL")
    @js.native
    def ARIA_LABEL: String = js.native
    inline def ARIA_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_LABEL")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "iconButton.strings.ARIA_PRESSED")
    @js.native
    def ARIA_PRESSED: String = js.native
    inline def ARIA_PRESSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_PRESSED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "iconButton.strings.CHANGE_EVENT")
    @js.native
    def CHANGE_EVENT: String = js.native
    inline def CHANGE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "iconButton.strings.DATA_ARIA_LABEL_OFF")
    @js.native
    def DATA_ARIA_LABEL_OFF: String = js.native
    inline def DATA_ARIA_LABEL_OFF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_ARIA_LABEL_OFF")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "iconButton.strings.DATA_ARIA_LABEL_ON")
    @js.native
    def DATA_ARIA_LABEL_ON: String = js.native
    inline def DATA_ARIA_LABEL_ON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_ARIA_LABEL_ON")(x.asInstanceOf[js.Any])
  }
}
