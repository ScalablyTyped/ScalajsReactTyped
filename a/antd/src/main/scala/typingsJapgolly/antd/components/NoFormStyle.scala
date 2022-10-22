package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libFormContextMod.NoFormStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoFormStyle {
  
  @JSImport("antd/lib/form/context", "NoFormStyle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `override`(value: Boolean): this.type = set("override", value.asInstanceOf[js.Any])
    
    inline def status(value: Boolean): this.type = set("status", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NoFormStyle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NoFormStyleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
