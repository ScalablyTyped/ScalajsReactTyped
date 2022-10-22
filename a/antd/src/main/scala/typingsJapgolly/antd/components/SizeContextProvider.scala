package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libAvatarSizeContextMod.AvatarSize
import typingsJapgolly.antd.libAvatarSizeContextMod.SizeContextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SizeContextProvider {
  
  @JSImport("antd/lib/avatar/SizeContext", "SizeContextProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def size(value: AvatarSize): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SizeContextProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SizeContextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
