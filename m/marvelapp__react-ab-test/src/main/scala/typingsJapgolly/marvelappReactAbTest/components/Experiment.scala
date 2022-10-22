package typingsJapgolly.marvelappReactAbTest.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.marvelappReactAbTest.mod.ExperimentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Experiment {
  
  inline def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ExperimentProps]))
  }
  
  @JSImport("@marvelapp/react-ab-test", "Experiment")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def defaultVariantName(value: String): this.type = set("defaultVariantName", value.asInstanceOf[js.Any])
    
    inline def userIdentifier(value: String): this.type = set("userIdentifier", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ExperimentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
