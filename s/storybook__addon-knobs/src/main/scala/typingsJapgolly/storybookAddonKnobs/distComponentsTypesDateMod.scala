package typingsJapgolly.storybookAddonKnobs

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.storybookAddonKnobs.anon.KnobOnChange
import typingsJapgolly.storybookAddonKnobs.anon.Valid
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsTypesDateMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Date", JSImport.Default)
  @js.native
  open class default () extends DateType
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Date", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Date", "default.defaultProps")
    @js.native
    def defaultProps: DateTypeProps = js.native
    inline def defaultProps_=(x: DateTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def deserialize(value: DateTypeKnobValue): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getDerivedStateFromProps(): Valid = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")().asInstanceOf[Valid]
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Date", "default.propTypes")
    @js.native
    def propTypes: KnobOnChange = js.native
    inline def propTypes_=(x: KnobOnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    inline def serialize(value: DateTypeKnobValue): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @js.native
  trait DateType extends Component[DateTypeProps, DateTypeState, Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDateType(): Unit = js.native
    
    var dateInput: HTMLInputElement = js.native
    
    /* private */ var onDateChange: Any = js.native
    
    /* private */ var onTimeChange: Any = js.native
    
    var timeInput: HTMLInputElement = js.native
  }
  
  type DateTypeKnob = KnobControlConfig[DateTypeKnobValue]
  
  type DateTypeKnobValue = Double
  
  type DateTypeProps = KnobControlProps[DateTypeKnobValue]
  
  trait DateTypeState extends StObject {
    
    var valid: js.UndefOr[Boolean] = js.undefined
  }
  object DateTypeState {
    
    inline def apply(): DateTypeState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTypeState]
    }
    
    extension [Self <: DateTypeState](x: Self) {
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
}
