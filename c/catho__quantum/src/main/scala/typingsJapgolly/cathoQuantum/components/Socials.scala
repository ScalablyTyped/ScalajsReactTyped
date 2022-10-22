package typingsJapgolly.cathoQuantum.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.Name
import typingsJapgolly.cathoQuantum.anon.`17`
import typingsJapgolly.cathoQuantum.socialsMod.NonEmptyArray
import typingsJapgolly.cathoQuantum.socialsMod.SocialsProps
import typingsJapgolly.cathoQuantum.socialsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Socials {
  
  inline def apply(items: NonEmptyArray[Name]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SocialsProps]))
  }
  
  @JSImport("@catho/quantum/Socials", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def theme(value: `17`): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def withBox(value: Boolean): this.type = set("withBox", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SocialsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
