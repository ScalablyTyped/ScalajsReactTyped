package typingsJapgolly.cathoQuantum.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.`14`
import typingsJapgolly.cathoQuantum.gridMod.HideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hide {
  
  @JSImport("@catho/quantum/Grid", "Hide")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.cathoQuantum.gridMod.Hide] {
    
    inline def large(value: Boolean): this.type = set("large", value.asInstanceOf[js.Any])
    
    inline def medium(value: Boolean): this.type = set("medium", value.asInstanceOf[js.Any])
    
    inline def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
    
    inline def theme(value: `14`): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def xsmall(value: Boolean): this.type = set("xsmall", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Hide.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HideProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
