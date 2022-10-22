package typingsJapgolly.nteractTransformVdom.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nteractTransformVdom.anon.PartialProps
import typingsJapgolly.nteractTransformVdom.libEventToObjectMod.SerializedEvent
import typingsJapgolly.nteractTransformVdom.libObjectToReactMod.VDOMEl
import typingsJapgolly.nteractTransformVdom.mod.default
import typingsJapgolly.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TransformVdom {
  
  @JSImport("@nteract/transform-vdom", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def data(value: VDOMEl): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def mediaType(value: applicationSlashvdomDotv1Plussignjson): this.type = set("mediaType", value.asInstanceOf[js.Any])
    
    inline def onVDOMEvent(value: (/* targetName */ String, /* event */ SerializedEvent[Any]) => Callback): this.type = set("onVDOMEvent", js.Any.fromFunction2((t0: /* targetName */ String, t1: /* event */ SerializedEvent[Any]) => (value(t0, t1)).runNow()))
  }
  
  implicit def make(companion: TransformVdom.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
