package typingsJapgolly.storefrontUiVue.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.storefrontUiVue.anon.Footercolumnwidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfFooter extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfFooter")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var isMobile: Boolean
    
    var mobileObserverClients: Double
    
    var mobileObserverIsInitialized: Boolean
    
    var style: Footercolumnwidth
  }
  object Computed {
    
    inline def apply(
      isMobile: Boolean,
      mobileObserverClients: Double,
      mobileObserverIsInitialized: Boolean,
      style: Footercolumnwidth
    ): Computed = {
      val __obj = js.Dynamic.literal(isMobile = isMobile.asInstanceOf[js.Any], mobileObserverClients = mobileObserverClients.asInstanceOf[js.Any], mobileObserverIsInitialized = mobileObserverIsInitialized.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setMobileObserverClients(value: Double): Self = StObject.set(x, "mobileObserverClients", value.asInstanceOf[js.Any])
      
      inline def setMobileObserverIsInitialized(value: Boolean): Self = StObject.set(x, "mobileObserverIsInitialized", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Footercolumnwidth): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    def data(): Data
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, data: CallbackTo[Data], methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = data.toJsFn, methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: CallbackTo[Data]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var items: js.Array[Any]
    
    var open: js.Array[Any]
  }
  object Data {
    
    inline def apply(items: js.Array[Any], open: js.Array[Any]): Data = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOpen(value: js.Array[Any]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenVarargs(value: Any*): Self = StObject.set(x, "open", js.Array(value*))
    }
  }
  
  trait Methods extends StObject {
    
    def toggle(payload: js.Array[Any]): Unit
  }
  object Methods {
    
    inline def apply(toggle: js.Array[Any] => Callback): Methods = {
      val __obj = js.Dynamic.literal(toggle = js.Any.fromFunction1((t0: js.Array[Any]) => toggle(t0).runNow()))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setToggle(value: js.Array[Any] => Callback): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
    }
  }
  
  trait Props extends StObject {
    
    var column: Double
    
    var multiple: Boolean
  }
  object Props {
    
    inline def apply(column: Double, multiple: Boolean): Props = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfFooter.foo` */
  override def _to: Constructor = ^
}
