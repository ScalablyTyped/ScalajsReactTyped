package typingsJapgolly.iamportReactNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.iamportReactNative.mod.CallbackRsp
import typingsJapgolly.iamportReactNative.mod.CertificationData
import typingsJapgolly.iamportReactNative.mod.CertificationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Certification {
  
  inline def apply(callback: CallbackRsp => Callback, data: CertificationData, userCode: String): Builder = {
    val __props = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: CallbackRsp) => callback(t0).runNow()), data = data.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CertificationProps]))
  }
  
  @JSImport("iamport-react-native", "default.Certification")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def loading(value: js.Object): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def tierCode(value: String): this.type = set("tierCode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CertificationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
