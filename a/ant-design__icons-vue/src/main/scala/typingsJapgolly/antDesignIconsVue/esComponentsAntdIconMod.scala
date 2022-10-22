package typingsJapgolly.antDesignIconsVue

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antDesignIconsSvg.esTypesMod.IconDefinition
import typingsJapgolly.antDesignIconsVue.esComponentsIconMod.IconBaseProps
import typingsJapgolly.antDesignIconsVue.esComponentsTwoTonePrimaryColorMod.TwoToneColor
import typingsJapgolly.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsAntdIconMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/es/components/AntdIcon", JSImport.Default)
  @js.native
  val default: AntdIconType = js.native
  
  trait AntdIconProps
    extends StObject
       with IconBaseProps {
    
    var twoToneColor: js.UndefOr[TwoToneColor] = js.undefined
  }
  object AntdIconProps {
    
    inline def apply(): AntdIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntdIconProps]
    }
    
    extension [Self <: AntdIconProps](x: Self) {
      
      inline def setTwoToneColor(value: TwoToneColor): Self = StObject.set(x, "twoToneColor", value.asInstanceOf[js.Any])
      
      inline def setTwoToneColorUndefined: Self = StObject.set(x, "twoToneColor", js.undefined)
    }
  }
  
  @js.native
  trait AntdIconType
    extends StObject
       with Color
       with FunctionalComponent[IconComponentProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AntdIconType: String = js.native
  }
  
  trait Color extends StObject {
    
    def getTwoToneColor(): TwoToneColor
    
    def setTwoToneColor(twoToneColor: TwoToneColor): Unit
  }
  object Color {
    
    inline def apply(getTwoToneColor: CallbackTo[TwoToneColor], setTwoToneColor: TwoToneColor => Callback): Color = {
      val __obj = js.Dynamic.literal(getTwoToneColor = getTwoToneColor.toJsFn, setTwoToneColor = js.Any.fromFunction1((t0: TwoToneColor) => setTwoToneColor(t0).runNow()))
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setGetTwoToneColor(value: CallbackTo[TwoToneColor]): Self = StObject.set(x, "getTwoToneColor", value.toJsFn)
      
      inline def setSetTwoToneColor(value: TwoToneColor => Callback): Self = StObject.set(x, "setTwoToneColor", js.Any.fromFunction1((t0: TwoToneColor) => value(t0).runNow()))
    }
  }
  
  trait IconComponentProps
    extends StObject
       with AntdIconProps {
    
    var icon: IconDefinition
  }
  object IconComponentProps {
    
    inline def apply(icon: IconDefinition): IconComponentProps = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconComponentProps]
    }
    
    extension [Self <: IconComponentProps](x: Self) {
      
      inline def setIcon(value: IconDefinition): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = AntdIconType
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsAntdIconMod.foo` */
  override def _to: AntdIconType = default
}
