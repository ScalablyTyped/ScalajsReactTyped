package typingsJapgolly.storefrontUiVue.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfTabs extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfTabs")
  @js.native
  val ^ : Constructor = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def openChild(): Unit
    
    def toggle(id: String): Unit
  }
  object Methods {
    
    inline def apply(openChild: Callback, toggle: String => Callback): Methods = {
      val __obj = js.Dynamic.literal(openChild = openChild.toJsFn, toggle = js.Any.fromFunction1((t0: String) => toggle(t0).runNow()))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setOpenChild(value: Callback): Self = StObject.set(x, "openChild", value.toJsFn)
      
      inline def setToggle(value: String => Callback): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait Props extends StObject {
    
    var openTab: Double
    
    var tabHideText: String
    
    var tabMaxContentHeight: String
    
    var tabShowText: String
  }
  object Props {
    
    inline def apply(openTab: Double, tabHideText: String, tabMaxContentHeight: String, tabShowText: String): Props = {
      val __obj = js.Dynamic.literal(openTab = openTab.asInstanceOf[js.Any], tabHideText = tabHideText.asInstanceOf[js.Any], tabMaxContentHeight = tabMaxContentHeight.asInstanceOf[js.Any], tabShowText = tabShowText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOpenTab(value: Double): Self = StObject.set(x, "openTab", value.asInstanceOf[js.Any])
      
      inline def setTabHideText(value: String): Self = StObject.set(x, "tabHideText", value.asInstanceOf[js.Any])
      
      inline def setTabMaxContentHeight(value: String): Self = StObject.set(x, "tabMaxContentHeight", value.asInstanceOf[js.Any])
      
      inline def setTabShowText(value: String): Self = StObject.set(x, "tabShowText", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfTabs.foo` */
  override def _to: Constructor = ^
}
