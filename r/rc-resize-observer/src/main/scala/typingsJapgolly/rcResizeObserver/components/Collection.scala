package typingsJapgolly.rcResizeObserver.components

import typingsJapgolly.rcResizeObserver.esCollectionMod.CollectionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collection {
  
  @JSImport("rc-resize-observer/es/Collection", "Collection")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Collection.type): SharedBuilder_CollectionProps103484790 = new SharedBuilder_CollectionProps103484790(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollectionProps): SharedBuilder_CollectionProps103484790 = new SharedBuilder_CollectionProps103484790(js.Array(this.component, p.asInstanceOf[js.Any]))
}
