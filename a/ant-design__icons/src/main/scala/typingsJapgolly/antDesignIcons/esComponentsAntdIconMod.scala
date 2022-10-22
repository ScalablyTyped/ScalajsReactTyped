package typingsJapgolly.antDesignIcons

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.antDesignIcons.esComponentsIconMod.IconBaseProps
import typingsJapgolly.antDesignIcons.esComponentsTwoTonePrimaryColorMod.TwoToneColor
import typingsJapgolly.antDesignIconsSvg.esTypesMod.IconDefinition
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsAntdIconMod extends Shortcut {
  
  @JSImport("@ant-design/icons/es/components/AntdIcon", JSImport.Default)
  @js.native
  val default: IconBaseComponent[IconComponentProps] = js.native
  
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
  trait IconBaseComponent[Props]
    extends StObject
       with ForwardRefExoticComponent[Props & RefAttributes[HTMLSpanElement]] {
    
    var getTwoToneColor: js.Function0[TwoToneColor] = js.native
    
    var setTwoToneColor: js.Function1[/* twoToneColor */ TwoToneColor, Unit] = js.native
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
  
  type _To = IconBaseComponent[IconComponentProps]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsAntdIconMod.foo` */
  override def _to: IconBaseComponent[IconComponentProps] = default
}
