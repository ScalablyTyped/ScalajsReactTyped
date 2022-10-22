package typingsJapgolly.wordpressCustomizeBrowser

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import typingsJapgolly.jquery.JQuery.Deferred
import typingsJapgolly.wordpressCustomizeBrowser.classMod.Class
import typingsJapgolly.wordpressCustomizeBrowser.notificationsMod.Notifications
import typingsJapgolly.wordpressCustomizeBrowser.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  
  /* note: abstract class */ @JSImport("@wordpress/customize-browser/Container", "Container")
  @js.native
  open class Container protected () extends Class {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def _animateChangeExpanded(completeCallback: js.Function0[Unit]): Unit = js.native
    
    def _children(parentType: String, childType: String): js.Array[Any] = js.native
    
    def _toggleActive(active: Boolean): Boolean = js.native
    def _toggleActive(active: Boolean, params: ContainerArguments): Boolean = js.native
    
    def _toggleExpanded(expanded: Boolean, params: ContainerArguments): Boolean = js.native
    
    def activate(): Boolean = js.native
    def activate(params: ContainerArguments): Boolean = js.native
    
    var active: Value[Boolean] = js.native
    
    var activeArgumentsQueue: js.Array[ContainerArguments] = js.native
    
    def collapse(params: ContainerArguments): Boolean = js.native
    
    var container: js.UndefOr[JQuery[HTMLElement]] = js.native
    
    var containerType: String = js.native
    
    var contentContainer: js.UndefOr[String] = js.native
    
    def deactivate(): Boolean = js.native
    def deactivate(params: ContainerArguments): Boolean = js.native
    
    var defaultActiveArguments: ContainerArguments = js.native
    
    var defaultExpandedArguments: ContainerArguments = js.native
    
    var defaults: ContainerParams = js.native
    
    var deferred: ContainerDeferred = js.native
    
    def expand(params: ContainerArguments): Boolean = js.native
    
    var expanded: Value[Boolean] = js.native
    
    var expandedArgumentsQueue: js.Array[ContainerArguments] = js.native
    
    def focus(): Unit = js.native
    
    def getContainer(): String = js.native
    
    def getContent(): JQuery[HTMLElement] = js.native
    
    def getNotificationsContainerElement(): JQuery[HTMLElement] = js.native
    
    var headContainer: js.UndefOr[JQuery[HTMLElement]] = js.native
    
    def initialize(): Unit = js.native
    def initialize(id: String): Unit = js.native
    def initialize(id: String, options: ContainerParams): Unit = js.native
    def initialize(id: Unit, options: ContainerParams): Unit = js.native
    
    def isContextuallyActive(): Boolean | scala.Nothing = js.native
    
    var notifications: js.UndefOr[Notifications] = js.native
    
    def onChangeActive(active: Boolean): Unit = js.native
    def onChangeActive(active: Boolean, args: ContainerArguments): Unit = js.native
    
    def onChangeExpanded(expanded: Boolean, args: ContainerArguments): Unit | scala.Nothing = js.native
    
    var priority: Value[Double] = js.native
    
    def ready(): Unit = js.native
    
    def setupNotifications(): Unit = js.native
    
    var templateSelector: js.UndefOr[String] = js.native
  }
  /* static members */
  object Container {
    
    @JSImport("@wordpress/customize-browser/Container", "Container")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/customize-browser/Container", "Container.instanceCounter")
    @js.native
    def instanceCounter: js.UndefOr[Double] = js.native
    inline def instanceCounter_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instanceCounter")(x.asInstanceOf[js.Any])
  }
  
  trait ContainerArguments extends StObject {
    
    var completeCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var duration: js.UndefOr[String | Double] = js.undefined
    
    var unchanged: js.UndefOr[Boolean] = js.undefined
  }
  object ContainerArguments {
    
    inline def apply(): ContainerArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerArguments]
    }
    
    extension [Self <: ContainerArguments](x: Self) {
      
      inline def setCompleteCallback(value: Callback): Self = StObject.set(x, "completeCallback", value.toJsFn)
      
      inline def setCompleteCallbackUndefined: Self = StObject.set(x, "completeCallback", js.undefined)
      
      inline def setDuration(value: String | Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setUnchanged(value: Boolean): Self = StObject.set(x, "unchanged", value.asInstanceOf[js.Any])
      
      inline def setUnchangedUndefined: Self = StObject.set(x, "unchanged", js.undefined)
    }
  }
  
  trait ContainerDeferred extends StObject {
    
    var embedded: Deferred[Any, Any, Any]
  }
  object ContainerDeferred {
    
    inline def apply(embedded: Deferred[Any, Any, Any]): ContainerDeferred = {
      val __obj = js.Dynamic.literal(embedded = embedded.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerDeferred]
    }
    
    extension [Self <: ContainerDeferred](x: Self) {
      
      inline def setEmbedded(value: Deferred[Any, Any, Any]): Self = StObject.set(x, "embedded", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContainerParams extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var content: js.UndefOr[String | Null] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var instanceNumber: js.UndefOr[Double | Null] = js.undefined
    
    var params: js.UndefOr[ContainerParams] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var title: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ContainerParams {
    
    inline def apply(title: String): ContainerParams = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerParams]
    }
    
    extension [Self <: ContainerParams](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setInstanceNumber(value: Double): Self = StObject.set(x, "instanceNumber", value.asInstanceOf[js.Any])
      
      inline def setInstanceNumberNull: Self = StObject.set(x, "instanceNumber", null)
      
      inline def setInstanceNumberUndefined: Self = StObject.set(x, "instanceNumber", js.undefined)
      
      inline def setParams(value: ContainerParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
