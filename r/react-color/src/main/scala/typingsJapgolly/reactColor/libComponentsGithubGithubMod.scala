package typingsJapgolly.reactColor

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.anon.PartialClassesGithubPicke
import typingsJapgolly.reactColor.mod.ColorPickerProps
import typingsJapgolly.reactColor.mod.ColorResult
import typingsJapgolly.reactColor.reactColorStrings.`top-left`
import typingsJapgolly.reactColor.reactColorStrings.`top-right`
import typingsJapgolly.reactColor.reactColorStrings.hide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsGithubGithubMod {
  
  @JSImport("react-color/lib/components/github/Github", JSImport.Default)
  @js.native
  open class default ()
    extends Component[GithubPickerProps, js.Object, Any]
  
  type GithubPicker = japgolly.scalajs.react.facade.React.Component[GithubPickerProps & js.Object, js.Object]
  
  trait GithubPickerProps
    extends StObject
       with ColorPickerProps[
          japgolly.scalajs.react.facade.React.Component[GithubPickerProps & js.Object, js.Object]
        ] {
    
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
    
    @JSName("styles")
    var styles_GithubPickerProps: js.UndefOr[PartialClassesGithubPicke] = js.undefined
    
    var triangle: js.UndefOr[hide | `top-left` | `top-right`] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object GithubPickerProps {
    
    inline def apply(): GithubPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GithubPickerProps]
    }
    
    extension [Self <: GithubPickerProps](x: Self) {
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Callback): Self = StObject.set(x, "onSwatchHover", js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ MouseEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnSwatchHoverUndefined: Self = StObject.set(x, "onSwatchHover", js.undefined)
      
      inline def setStyles(value: PartialClassesGithubPicke): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTriangle(value: hide | `top-left` | `top-right`): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
      
      inline def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait GithubPickerStylesProps extends StObject {
    
    var card: CSSProperties
    
    var triangle: CSSProperties
    
    var triangleShadow: CSSProperties
  }
  object GithubPickerStylesProps {
    
    inline def apply(card: CSSProperties, triangle: CSSProperties, triangleShadow: CSSProperties): GithubPickerStylesProps = {
      val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], triangle = triangle.asInstanceOf[js.Any], triangleShadow = triangleShadow.asInstanceOf[js.Any])
      __obj.asInstanceOf[GithubPickerStylesProps]
    }
    
    extension [Self <: GithubPickerStylesProps](x: Self) {
      
      inline def setCard(value: CSSProperties): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setTriangle(value: CSSProperties): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
      
      inline def setTriangleShadow(value: CSSProperties): Self = StObject.set(x, "triangleShadow", value.asInstanceOf[js.Any])
    }
  }
}
