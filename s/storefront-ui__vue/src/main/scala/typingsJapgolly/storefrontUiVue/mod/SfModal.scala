package typingsJapgolly.storefrontUiVue.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfModal extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfModal")
  @js.native
  val ^ : Constructor = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    def data(): Data
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(data: CallbackTo[Data], methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(data = data.toJsFn, methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setData(value: CallbackTo[Data]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var className: String | Null
    
    var staticClass: String | Null
  }
  object Data {
    
    inline def apply(): Data = {
      val __obj = js.Dynamic.literal(className = null, staticClass = null)
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameNull: Self = StObject.set(x, "className", null)
      
      inline def setStaticClass(value: String): Self = StObject.set(x, "staticClass", value.asInstanceOf[js.Any])
      
      inline def setStaticClassNull: Self = StObject.set(x, "staticClass", null)
    }
  }
  
  trait Methods extends StObject {
    
    def checkPersistence(): Unit
    
    def classHandler(): Unit
    
    def close(): Unit
    
    def keydownHandler(e: KeyboardEvent): Unit
  }
  object Methods {
    
    inline def apply(
      checkPersistence: Callback,
      classHandler: Callback,
      close: Callback,
      keydownHandler: KeyboardEvent => Callback
    ): Methods = {
      val __obj = js.Dynamic.literal(checkPersistence = checkPersistence.toJsFn, classHandler = classHandler.toJsFn, close = close.toJsFn, keydownHandler = js.Any.fromFunction1((t0: KeyboardEvent) => keydownHandler(t0).runNow()))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setCheckPersistence(value: Callback): Self = StObject.set(x, "checkPersistence", value.toJsFn)
      
      inline def setClassHandler(value: Callback): Self = StObject.set(x, "classHandler", value.toJsFn)
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setKeydownHandler(value: KeyboardEvent => Callback): Self = StObject.set(x, "keydownHandler", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
    }
  }
  
  trait Props extends StObject {
    
    var cross: Boolean
    
    var overlay: Boolean
    
    var persistent: Boolean
    
    var title: String
    
    var transitionModal: String
    
    var transitionOverlay: Boolean
    
    var visible: Boolean
  }
  object Props {
    
    inline def apply(
      cross: Boolean,
      overlay: Boolean,
      persistent: Boolean,
      title: String,
      transitionModal: String,
      transitionOverlay: Boolean,
      visible: Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(cross = cross.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transitionModal = transitionModal.asInstanceOf[js.Any], transitionOverlay = transitionOverlay.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setCross(value: Boolean): Self = StObject.set(x, "cross", value.asInstanceOf[js.Any])
      
      inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTransitionModal(value: String): Self = StObject.set(x, "transitionModal", value.asInstanceOf[js.Any])
      
      inline def setTransitionOverlay(value: Boolean): Self = StObject.set(x, "transitionOverlay", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfModal.foo` */
  override def _to: Constructor = ^
}
