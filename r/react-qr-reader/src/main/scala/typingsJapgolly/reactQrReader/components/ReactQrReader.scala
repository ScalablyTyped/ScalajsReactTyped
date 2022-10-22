package typingsJapgolly.reactQrReader.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactQrReader.mod.^
import typingsJapgolly.reactQrReader.mod.props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactQrReader {
  
  inline def apply(onError: Any => Callback, onScan: js.UndefOr[String] => Callback): SharedBuilder_props_762593117[^] = {
    val __props = js.Dynamic.literal(onError = js.Any.fromFunction1((t0: Any) => onError(t0).runNow()), onScan = js.Any.fromFunction1((t0: js.UndefOr[String]) => onScan(t0).runNow()))
    new SharedBuilder_props_762593117[^](js.Array(this.component, __props.asInstanceOf[props]))
  }
  
  @JSImport("react-qr-reader", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: props): SharedBuilder_props_762593117[^] = new SharedBuilder_props_762593117[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
