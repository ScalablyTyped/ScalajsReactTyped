package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLSelectElement
import typingsJapgolly.materialUiCore.materialUiCoreStrings.filled
import typingsJapgolly.materialUiCore.materialUiCoreStrings.outlined
import typingsJapgolly.materialUiCore.materialUiCoreStrings.standard
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.SelectHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeSelectNativeSelectInputMod extends Shortcut {
  
  @JSImport("@material-ui/core/NativeSelect/NativeSelectInput", JSImport.Default)
  @js.native
  val default: ComponentType[NativeSelectInputProps] = js.native
  
  trait NativeSelectInputProps
    extends StObject
       with SelectHTMLAttributes[HTMLSelectElement] {
    
    var IconComponent: js.UndefOr[ElementType] = js.undefined
    
    var inputRef: js.UndefOr[Ref[HTMLSelectElement]] = js.undefined
    
    var variant: js.UndefOr[standard | outlined | filled] = js.undefined
  }
  object NativeSelectInputProps {
    
    inline def apply(): NativeSelectInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeSelectInputProps]
    }
    
    extension [Self <: NativeSelectInputProps](x: Self) {
      
      inline def setIconComponent(value: ElementType): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      inline def setIconComponentUndefined: Self = StObject.set(x, "IconComponent", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLSelectElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: HTMLSelectElement | Null => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: HTMLSelectElement | Null) => value(t0).runNow()))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = ComponentType[NativeSelectInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `nativeSelectNativeSelectInputMod.foo` */
  override def _to: ComponentType[NativeSelectInputProps] = default
}
