package typingsJapgolly.chenfengyuanVueQrcode

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chenfengyuanVueQrcode.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@chenfengyuan/vue-qrcode", JSImport.Namespace)
  @js.native
  val ^ : QrCodeConstructor = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait QrCodeConstructor extends StObject {
    
    var methods: QrCodeMethods
    
    var props: QrCodePorps
    
    var watch: QrCodeWatch
  }
  object QrCodeConstructor {
    
    inline def apply(methods: QrCodeMethods, props: QrCodePorps, watch: QrCodeWatch): QrCodeConstructor = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
      __obj.asInstanceOf[QrCodeConstructor]
    }
    
    extension [Self <: QrCodeConstructor](x: Self) {
      
      inline def setMethods(value: QrCodeMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: QrCodePorps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: QrCodeWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
  
  trait QrCodeMethods extends StObject {
    
    // Generate QR code.
    def generate(): Unit
  }
  object QrCodeMethods {
    
    inline def apply(generate: Callback): QrCodeMethods = {
      val __obj = js.Dynamic.literal(generate = generate.toJsFn)
      __obj.asInstanceOf[QrCodeMethods]
    }
    
    extension [Self <: QrCodeMethods](x: Self) {
      
      inline def setGenerate(value: Callback): Self = StObject.set(x, "generate", value.toJsFn)
    }
  }
  
  trait QrCodePorps extends StObject {
    
    // The options for the QR code generator.
    var options: Color
    
    // The tag name of the component's root element.
    var tag: String
    
    // The value of the QR code.
    var value: String | Null
  }
  object QrCodePorps {
    
    inline def apply(options: Color, tag: String): QrCodePorps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[QrCodePorps]
    }
    
    extension [Self <: QrCodePorps](x: Self) {
      
      inline def setOptions(value: Color): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait QrCodeWatch extends StObject {
    
    @JSName("$props")
    def $props(`val`: Any): Unit
  }
  object QrCodeWatch {
    
    inline def apply($props: Any => Callback): QrCodeWatch = {
      val __obj = js.Dynamic.literal($props = js.Any.fromFunction1((t0: Any) => $props(t0).runNow()))
      __obj.asInstanceOf[QrCodeWatch]
    }
    
    extension [Self <: QrCodeWatch](x: Self) {
      
      inline def set$props(value: Any => Callback): Self = StObject.set(x, "$props", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  type _To = QrCodeConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: QrCodeConstructor = ^
}
