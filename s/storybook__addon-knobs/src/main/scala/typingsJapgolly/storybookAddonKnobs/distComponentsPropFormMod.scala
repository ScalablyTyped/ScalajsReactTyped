package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.storybookAddonKnobs.anon.OnFieldChange
import typingsJapgolly.storybookAddonKnobs.anon.OnFieldClick
import typingsJapgolly.storybookAddonKnobs.distKnobStoreMod.KnobStoreKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsPropFormMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/PropForm", JSImport.Default)
  @js.native
  open class default () extends PropForm
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/PropForm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/PropForm", "default.defaultProps")
    @js.native
    def defaultProps: OnFieldChange = js.native
    inline def defaultProps_=(x: OnFieldChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/PropForm", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/PropForm", "default.propTypes")
    @js.native
    def propTypes: OnFieldClick = js.native
    inline def propTypes_=(x: OnFieldClick): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PropForm
    extends Component[PropFormProps, js.Object, Any] {
    
    def makeChangeHandler(name: String, `type`: String): js.Function1[/* value */ js.UndefOr[String], Unit] = js.native
  }
  
  trait PropFormProps extends StObject {
    
    var knobs: js.Array[KnobStoreKnob]
    
    def onFieldChange(changedKnob: KnobStoreKnob): Unit
    
    def onFieldClick(knob: KnobStoreKnob): Unit
  }
  object PropFormProps {
    
    inline def apply(
      knobs: js.Array[KnobStoreKnob],
      onFieldChange: KnobStoreKnob => Callback,
      onFieldClick: KnobStoreKnob => Callback
    ): PropFormProps = {
      val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = js.Any.fromFunction1((t0: KnobStoreKnob) => onFieldChange(t0).runNow()), onFieldClick = js.Any.fromFunction1((t0: KnobStoreKnob) => onFieldClick(t0).runNow()))
      __obj.asInstanceOf[PropFormProps]
    }
    
    extension [Self <: PropFormProps](x: Self) {
      
      inline def setKnobs(value: js.Array[KnobStoreKnob]): Self = StObject.set(x, "knobs", value.asInstanceOf[js.Any])
      
      inline def setKnobsVarargs(value: KnobStoreKnob*): Self = StObject.set(x, "knobs", js.Array(value*))
      
      inline def setOnFieldChange(value: KnobStoreKnob => Callback): Self = StObject.set(x, "onFieldChange", js.Any.fromFunction1((t0: KnobStoreKnob) => value(t0).runNow()))
      
      inline def setOnFieldClick(value: KnobStoreKnob => Callback): Self = StObject.set(x, "onFieldClick", js.Any.fromFunction1((t0: KnobStoreKnob) => value(t0).runNow()))
    }
  }
}
