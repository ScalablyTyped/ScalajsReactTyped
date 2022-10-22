package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesMod.default.`object`
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Object {
  
  inline def apply[T](knob: KnobControlConfig[T], onChange: T => T): Builder[T] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[KnobControlProps[T]]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types", "default.object")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[`object`[T]]
  
  def withProps[T](p: KnobControlProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
