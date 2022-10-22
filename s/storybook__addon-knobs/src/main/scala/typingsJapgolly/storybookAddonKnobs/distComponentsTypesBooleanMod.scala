package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.storybookAddonKnobs.anon.PartialBooleanTypeProps
import typingsJapgolly.storybookAddonKnobs.anon.WeakValidationMapBooleanT
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsTypesBooleanMod {
  
  /* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeProps> & {  serialize :(value : @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeKnobValue): string | null,   deserialize :(value : string | null): boolean} */
  object default {
    
    inline def apply(props: BooleanTypeProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: BooleanTypeProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialBooleanTypeProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialBooleanTypeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", "default.deserialize")
    @js.native
    def deserialize: js.Function1[/* value */ String | Null, Boolean] = js.native
    inline def deserialize_=(x: js.Function1[/* value */ String | Null, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapBooleanT] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapBooleanT]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", "default.serialize")
    @js.native
    def serialize: js.Function1[/* value */ BooleanTypeKnobValue, String | Null] = js.native
    inline def serialize_=(x: js.Function1[/* value */ BooleanTypeKnobValue, String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
  
  type BooleanTypeKnob = KnobControlConfig[BooleanTypeKnobValue]
  
  type BooleanTypeKnobValue = Boolean
  
  trait BooleanTypeProps
    extends StObject
       with KnobControlProps[BooleanTypeKnobValue] {
    
    @JSName("knob")
    var knob_BooleanTypeProps: BooleanTypeKnob
  }
  object BooleanTypeProps {
    
    inline def apply(knob: BooleanTypeKnob, onChange: BooleanTypeKnobValue => BooleanTypeKnobValue): BooleanTypeProps = {
      val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[BooleanTypeProps]
    }
    
    extension [Self <: BooleanTypeProps](x: Self) {
      
      inline def setKnob(value: BooleanTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
}
