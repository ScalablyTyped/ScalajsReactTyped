package typingsJapgolly.storefrontUiVue.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.storefrontUiVue.storefrontUiVueStrings.added_to_cart
import typingsJapgolly.storefrontUiVue.storefrontUiVueStrings.danger
import typingsJapgolly.storefrontUiVue.storefrontUiVueStrings.info
import typingsJapgolly.storefrontUiVue.storefrontUiVueStrings.info_circle
import typingsJapgolly.storefrontUiVue.storefrontUiVueStrings.info_shield
import typingsJapgolly.storefrontUiVue.storefrontUiVueStrings.secondary
import typingsJapgolly.storefrontUiVue.storefrontUiVueStrings.success
import typingsJapgolly.storefrontUiVue.storefrontUiVueStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfNotification extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfNotification")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var icon: added_to_cart | info_shield | info_circle
  }
  object Computed {
    
    inline def apply(icon: added_to_cart | info_shield | info_circle): Computed = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setIcon(value: added_to_cart | info_shield | info_circle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def actionHandler(): Unit
    
    def closeHandler(): Unit
  }
  object Methods {
    
    inline def apply(actionHandler: Callback, closeHandler: Callback): Methods = {
      val __obj = js.Dynamic.literal(actionHandler = actionHandler.toJsFn, closeHandler = closeHandler.toJsFn)
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setActionHandler(value: Callback): Self = StObject.set(x, "actionHandler", value.toJsFn)
      
      inline def setCloseHandler(value: Callback): Self = StObject.set(x, "closeHandler", value.toJsFn)
    }
  }
  
  trait Props extends StObject {
    
    var action: String
    
    var message: String
    
    var title: String
    
    var `type`: secondary | info | success | warning | danger
    
    var visible: Boolean
  }
  object Props {
    
    inline def apply(
      action: String,
      message: String,
      title: String,
      `type`: secondary | info | success | warning | danger,
      visible: Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: secondary | info | success | warning | danger): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfNotification.foo` */
  override def _to: Constructor = ^
}
