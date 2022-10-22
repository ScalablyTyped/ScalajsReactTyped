package typingsJapgolly.next.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.next.distPagesDocumentMod.OriginProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NextScript {
  
  @JSImport("next/document", "NextScript")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.next.documentMod.NextScript] {
    
    inline def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NextScript.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OriginProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
