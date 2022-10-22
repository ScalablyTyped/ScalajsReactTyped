package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesFilesMod.DateTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesFilesMod.FileTypeKnob
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesFilesMod.FilesTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Files {
  
  inline def apply(knob: FileTypeKnob, onChange: DateTypeKnobValue => DateTypeKnobValue): Default[js.Object] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[FilesTypeProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Files", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FilesTypeProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
