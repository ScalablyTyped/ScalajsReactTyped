package typingsJapgolly.storefrontUiVue.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.glidejsGlide.mod.Options
import typingsJapgolly.storefrontUiVue.storefrontUiVueStrings.next
import typingsJapgolly.storefrontUiVue.storefrontUiVueStrings.prev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfHero extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfHero")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var mergedOptions: Options
    
    var numberOfPages: Double
    
    var page: Double
  }
  object Computed {
    
    inline def apply(mergedOptions: Options, numberOfPages: Double, page: Double): Computed = {
      val __obj = js.Dynamic.literal(mergedOptions = mergedOptions.asInstanceOf[js.Any], numberOfPages = numberOfPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setMergedOptions(value: Options): Self = StObject.set(x, "mergedOptions", value.asInstanceOf[js.Any])
      
      inline def setNumberOfPages(value: Double): Self = StObject.set(x, "numberOfPages", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
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
    
    var defaultOptions: Options
    
    var glide: Any
  }
  object Data {
    
    inline def apply(defaultOptions: Options, glide: Any): Data = {
      val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], glide = glide.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setDefaultOptions(value: Options): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      inline def setGlide(value: Any): Self = StObject.set(x, "glide", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def go(direct: prev | next): Unit
  }
  object Methods {
    
    inline def apply(go: prev | next => Callback): Methods = {
      val __obj = js.Dynamic.literal(go = js.Any.fromFunction1((t0: prev | next) => go(t0).runNow()))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setGo(value: prev | next => Callback): Self = StObject.set(x, "go", js.Any.fromFunction1((t0: prev | next) => value(t0).runNow()))
    }
  }
  
  trait Props extends StObject {
    
    var sliderOptions: Options
  }
  object Props {
    
    inline def apply(sliderOptions: Options): Props = {
      val __obj = js.Dynamic.literal(sliderOptions = sliderOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setSliderOptions(value: Options): Self = StObject.set(x, "sliderOptions", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfHero.foo` */
  override def _to: Constructor = ^
}
