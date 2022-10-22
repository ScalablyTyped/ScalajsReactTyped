package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.uifabricUtilities.anon.ReadonlyICustomizerContex
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.libCustomizationsCustomizationsMod.ISettings
import typingsJapgolly.uifabricUtilities.libCustomizationsCustomizationsMod.ISettingsFunction
import typingsJapgolly.uifabricUtilities.libCustomizationsCustomizerContextMod.ICustomizerContext
import typingsJapgolly.uifabricUtilities.libCustomizationsCustomizerDottypesMod.ICustomizerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Customizer {
  
  @JSImport("office-ui-fabric-react", "Customizer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.Customizer] {
    
    inline def componentRef(value: IRefObject[Any]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ Any | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ Any | Null) => value(t0).runNow()))
    
    inline def contextTransform(value: /* context */ ReadonlyICustomizerContex => ICustomizerContext): this.type = set("contextTransform", js.Any.fromFunction1(value))
    
    inline def scopedSettings(value: ISettings | ISettingsFunction): this.type = set("scopedSettings", value.asInstanceOf[js.Any])
    
    inline def scopedSettingsFunction1(value: /* settings */ ISettings => ISettings): this.type = set("scopedSettings", js.Any.fromFunction1(value))
    
    inline def settings(value: ISettings | ISettingsFunction): this.type = set("settings", value.asInstanceOf[js.Any])
    
    inline def settingsFunction1(value: /* settings */ ISettings => ISettings): this.type = set("settings", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: Customizer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ICustomizerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
