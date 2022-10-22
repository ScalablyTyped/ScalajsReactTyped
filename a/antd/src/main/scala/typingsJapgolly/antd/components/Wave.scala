package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libUtilWaveMod.InternalWave
import typingsJapgolly.antd.libUtilWaveMod.WaveProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wave {
  
  @JSImport("antd/lib/_util/wave", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[InternalWave] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def insertExtraNode(value: Boolean): this.type = set("insertExtraNode", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Wave.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WaveProps & RefAttributes[InternalWave]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
