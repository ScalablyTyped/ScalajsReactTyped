package typingsJapgolly.reactNativeAndroidTaskdescription.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeAndroidTaskdescription.mod.ReactNativeAndroidTaskDescriptionProps
import typingsJapgolly.reactNativeAndroidTaskdescription.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeAndroidTaskdescription {
  
  @JSImport("react-native-android-taskdescription", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeAndroidTaskdescription.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactNativeAndroidTaskDescriptionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
