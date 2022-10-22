package typingsJapgolly.storybookAddonKnobs

import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.storybookAddonKnobs.anon.OnChange
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsTypesColorMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Color", JSImport.Default)
  @js.native
  open class default () extends ColorType
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Color", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Color", "default.defaultProps")
    @js.native
    def defaultProps: ColorTypeProps = js.native
    inline def defaultProps_=(x: ColorTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def deserialize(value: ColorTypeKnobValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Color", "default.propTypes")
    @js.native
    def propTypes: OnChange = js.native
    inline def propTypes_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    inline def serialize(value: ColorTypeKnobValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @js.native
  trait ColorType extends Component[ColorTypeProps, ColorTypeState, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MColorType(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MColorType(): Unit = js.native
    
    /* private */ var handleChange: Any = js.native
    
    /* private */ var handleClick: Any = js.native
    
    def handleWindowMouseDown(e: MouseEvent): Unit = js.native
    
    var popover: HTMLDivElement = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MColorType(nextProps: ColorTypeProps, nextState: ColorTypeState): Boolean = js.native
  }
  
  type ColorTypeKnob = KnobControlConfig[ColorTypeKnobValue]
  
  type ColorTypeKnobValue = String
  
  type ColorTypeProps = KnobControlProps[ColorTypeKnobValue]
  
  trait ColorTypeState extends StObject {
    
    var displayColorPicker: Boolean
  }
  object ColorTypeState {
    
    inline def apply(displayColorPicker: Boolean): ColorTypeState = {
      val __obj = js.Dynamic.literal(displayColorPicker = displayColorPicker.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorTypeState]
    }
    
    extension [Self <: ColorTypeState](x: Self) {
      
      inline def setDisplayColorPicker(value: Boolean): Self = StObject.set(x, "displayColorPicker", value.asInstanceOf[js.Any])
    }
  }
}
