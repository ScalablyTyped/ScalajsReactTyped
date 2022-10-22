package typingsJapgolly.storefrontUiVue.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.storefrontUiVue.anon.Scrollablemaxheight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfScrollable extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfScrollable")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var style: Scrollablemaxheight
  }
  object Computed {
    
    inline def apply(style: Scrollablemaxheight): Computed = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setStyle(value: Scrollablemaxheight): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
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
    
    var contentEl: Any
    
    var hasScroll: Boolean
    
    var isHidden: Boolean
  }
  object Data {
    
    inline def apply(contentEl: Any, hasScroll: Boolean, isHidden: Boolean): Data = {
      val __obj = js.Dynamic.literal(contentEl = contentEl.asInstanceOf[js.Any], hasScroll = hasScroll.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setContentEl(value: Any): Self = StObject.set(x, "contentEl", value.asInstanceOf[js.Any])
      
      inline def setHasScroll(value: Boolean): Self = StObject.set(x, "hasScroll", value.asInstanceOf[js.Any])
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def sizeCalc(): Unit
  }
  object Methods {
    
    inline def apply(sizeCalc: Callback): Methods = {
      val __obj = js.Dynamic.literal(sizeCalc = sizeCalc.toJsFn)
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setSizeCalc(value: Callback): Self = StObject.set(x, "sizeCalc", value.toJsFn)
    }
  }
  
  trait Props extends StObject {
    
    var hideText: String
    
    var maxContentHeight: String
    
    var showText: String
  }
  object Props {
    
    inline def apply(hideText: String, maxContentHeight: String, showText: String): Props = {
      val __obj = js.Dynamic.literal(hideText = hideText.asInstanceOf[js.Any], maxContentHeight = maxContentHeight.asInstanceOf[js.Any], showText = showText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setHideText(value: String): Self = StObject.set(x, "hideText", value.asInstanceOf[js.Any])
      
      inline def setMaxContentHeight(value: String): Self = StObject.set(x, "maxContentHeight", value.asInstanceOf[js.Any])
      
      inline def setShowText(value: String): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfScrollable.foo` */
  override def _to: Constructor = ^
}
