package typingsJapgolly.antDesignIconsVue

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Event
import typingsJapgolly.antDesignIconsSvg.esTypesMod.IconDefinition
import typingsJapgolly.vueRuntimeCore.mod.FunctionalComponent
import typingsJapgolly.vueRuntimeDom.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsIconBaseMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/es/components/IconBase", JSImport.Default)
  @js.native
  val default: IconBaseType = js.native
  
  trait Color extends StObject {
    
    def getTwoToneColors(): TwoToneColorPalette
    
    def setTwoToneColors(twoToneColors: TwoToneColorPaletteSetter): Unit
  }
  object Color {
    
    inline def apply(
      getTwoToneColors: CallbackTo[TwoToneColorPalette],
      setTwoToneColors: TwoToneColorPaletteSetter => Callback
    ): Color = {
      val __obj = js.Dynamic.literal(getTwoToneColors = getTwoToneColors.toJsFn, setTwoToneColors = js.Any.fromFunction1((t0: TwoToneColorPaletteSetter) => setTwoToneColors(t0).runNow()))
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setGetTwoToneColors(value: CallbackTo[TwoToneColorPalette]): Self = StObject.set(x, "getTwoToneColors", value.toJsFn)
      
      inline def setSetTwoToneColors(value: TwoToneColorPaletteSetter => Callback): Self = StObject.set(x, "setTwoToneColors", js.Any.fromFunction1((t0: TwoToneColorPaletteSetter) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait IconBaseType
    extends StObject
       with Color
       with FunctionalComponent[IconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_IconBaseType: String = js.native
  }
  
  trait IconProps extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var focusable: js.UndefOr[String] = js.undefined
    
    var icon: IconDefinition
    
    var onClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
    
    var primaryColor: js.UndefOr[String] = js.undefined
    
    var secondaryColor: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object IconProps {
    
    inline def apply(icon: IconDefinition): IconProps = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setFocusable(value: String): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setIcon(value: IconDefinition): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* e */ js.UndefOr[Event] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Event]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TwoToneColorPalette
    extends StObject
       with TwoToneColorPaletteSetter {
    
    var calculated: js.UndefOr[Boolean] = js.undefined
  }
  object TwoToneColorPalette {
    
    inline def apply(primaryColor: String): TwoToneColorPalette = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoToneColorPalette]
    }
    
    extension [Self <: TwoToneColorPalette](x: Self) {
      
      inline def setCalculated(value: Boolean): Self = StObject.set(x, "calculated", value.asInstanceOf[js.Any])
      
      inline def setCalculatedUndefined: Self = StObject.set(x, "calculated", js.undefined)
    }
  }
  
  trait TwoToneColorPaletteSetter extends StObject {
    
    var primaryColor: String
    
    var secondaryColor: js.UndefOr[String] = js.undefined
  }
  object TwoToneColorPaletteSetter {
    
    inline def apply(primaryColor: String): TwoToneColorPaletteSetter = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoToneColorPaletteSetter]
    }
    
    extension [Self <: TwoToneColorPaletteSetter](x: Self) {
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
    }
  }
  
  type _To = IconBaseType
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsIconBaseMod.foo` */
  override def _to: IconBaseType = default
}
