package typingsJapgolly.wordpressCustomizeBrowser

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressCustomizeBrowser.anon.ArraySettinganyValueanyde
import typingsJapgolly.wordpressCustomizeBrowser.anon.Default
import typingsJapgolly.wordpressCustomizeBrowser.classMod.Class
import typingsJapgolly.wordpressCustomizeBrowser.containerMod.ContainerArguments
import typingsJapgolly.wordpressCustomizeBrowser.containerMod.ContainerDeferred
import typingsJapgolly.wordpressCustomizeBrowser.notificationsMod.Notifications
import typingsJapgolly.wordpressCustomizeBrowser.settingMod.Setting
import typingsJapgolly.wordpressCustomizeBrowser.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlMod {
  
  @JSImport("@wordpress/customize-browser/Control", "Control")
  @js.native
  open class Control protected () extends Class {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def _toggleActive(active: Boolean, params: ContainerArguments): Boolean = js.native
    
    def activate(params: ContainerArguments): Boolean = js.native
    
    var active: Value[Boolean] = js.native
    
    var activeArgumentsQueue: js.Array[ContainerArguments] = js.native
    
    def addNewPage(): Unit = js.native
    
    var container: JQuery[HTMLElement] = js.native
    
    def deactivate(params: ContainerArguments): Boolean = js.native
    
    var defaultActiveArguments: ContainerArguments = js.native
    
    var defaults: ControlParams = js.native
    
    var deferred: ContainerDeferred = js.native
    
    def dropdownInit(): Unit = js.native
    
    var elements: js.Array[Element] = js.native
    
    def embed(): Unit = js.native
    
    def expand(params: ContainerArguments): Unit = js.native
    
    def focus(): Unit = js.native
    def focus(params: Any): Unit = js.native
    
    def getNotificationsContainerElement(): JQuery[HTMLElement] = js.native
    
    var id: String = js.native
    
    def initialize(): Unit = js.native
    def initialize(id: String): Unit = js.native
    def initialize(id: String, options: ControlParams): Unit = js.native
    def initialize(id: Unit, options: ControlParams): Unit = js.native
    
    def linkElements(): Unit = js.native
    
    var notifications: Notifications = js.native
    
    // TODO
    def onChangeActive(active: Boolean, args: ContainerArguments): Unit = js.native
    
    var params: ControlParams = js.native
    
    var priority: Value[Double] = js.native
    
    def ready(): Unit = js.native
    
    def renderContent(): Unit = js.native
    
    def renderNotifications(): Unit = js.native
    
    var section: Value[String] = js.native
    
    var selector: String = js.native
    
    var settings: ControlSettings = js.native
    
    def setupNotifications(): Unit = js.native
    
    var templateSelector: String = js.native
    
    def toggle(active: Boolean): Unit = js.native
  }
  /* static members */
  object Control {
    
    @JSImport("@wordpress/customize-browser/Control", "Control")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/customize-browser/Control", "Control.instanceCounter")
    @js.native
    def instanceCounter: js.UndefOr[Double] = js.native
    inline def instanceCounter_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instanceCounter")(x.asInstanceOf[js.Any])
  }
  
  trait ControlParams extends StObject {
    
    var active: Boolean
    
    var content: js.UndefOr[String] = js.undefined
    
    var description: String
    
    var instanceNumber: js.UndefOr[Double] = js.undefined
    
    var label: String
    
    var params: js.UndefOr[ControlParams] = js.undefined
    
    var priority: Double
    
    var section: String
    
    var setting: js.UndefOr[String | Setting[Any]] = js.undefined
    
    var settings: ControlSettings
    
    var templateId: js.UndefOr[String] = js.undefined
    
    var `type`: Any
  }
  object ControlParams {
    
    inline def apply(
      active: Boolean,
      description: String,
      label: String,
      priority: Double,
      section: String,
      settings: ControlSettings,
      `type`: Any
    ): ControlParams = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlParams]
    }
    
    extension [Self <: ControlParams](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setInstanceNumber(value: Double): Self = StObject.set(x, "instanceNumber", value.asInstanceOf[js.Any])
      
      inline def setInstanceNumberUndefined: Self = StObject.set(x, "instanceNumber", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setParams(value: ControlParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSetting(value: String | Setting[Any]): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
      
      inline def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
      
      inline def setSettings(value: ControlSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ControlSettings = ((Record[String, Setting[Any] | Value[Any]]) & Default) | ArraySettinganyValueanyde
}
