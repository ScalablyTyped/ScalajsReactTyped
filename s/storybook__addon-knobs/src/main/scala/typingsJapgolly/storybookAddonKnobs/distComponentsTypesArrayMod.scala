package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.Record
import typingsJapgolly.storybookAddonKnobs.anon.Knob
import typingsJapgolly.storybookAddonKnobs.anon.PartialArrayTypeProps
import typingsJapgolly.storybookAddonKnobs.anon.ReadonlyArrayTypeProps
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsTypesArrayMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Array", JSImport.Default)
  @js.native
  open class default () extends ArrayType
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Array", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Array", "default.defaultProps")
    @js.native
    def defaultProps: PartialArrayTypeProps = js.native
    inline def defaultProps_=(x: PartialArrayTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def deserialize(value: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def deserialize(value: Record[String, String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Array", "default.propTypes")
    @js.native
    def propTypes: Knob = js.native
    inline def propTypes_=(x: Knob): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    inline def serialize(value: ArrayTypeKnobValue): ArrayTypeKnobValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[ArrayTypeKnobValue]
  }
  
  @js.native
  trait ArrayType
    extends Component[ArrayTypeProps, js.Object, Any] {
    
    def handleChange(e: ReactEventFrom[HTMLTextAreaElement]): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MArrayType(nextProps: ReadonlyArrayTypeProps): Boolean = js.native
  }
  
  trait ArrayTypeKnob
    extends StObject
       with KnobControlConfig[ArrayTypeKnobValue] {
    
    var separator: String
  }
  object ArrayTypeKnob {
    
    inline def apply(name: String, separator: String, value: ArrayTypeKnobValue): ArrayTypeKnob = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayTypeKnob]
    }
    
    extension [Self <: ArrayTypeKnob](x: Self) {
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    }
  }
  
  type ArrayTypeKnobValue = js.Array[String]
  
  trait ArrayTypeProps
    extends StObject
       with KnobControlProps[ArrayTypeKnobValue] {
    
    @JSName("knob")
    var knob_ArrayTypeProps: ArrayTypeKnob
  }
  object ArrayTypeProps {
    
    inline def apply(knob: ArrayTypeKnob, onChange: ArrayTypeKnobValue => ArrayTypeKnobValue): ArrayTypeProps = {
      val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[ArrayTypeProps]
    }
    
    extension [Self <: ArrayTypeProps](x: Self) {
      
      inline def setKnob(value: ArrayTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
}
