package typingsJapgolly.terraContentContainer.components

import typingsJapgolly.terraContentContainer.libContentContainerMod.ContentContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContentContainer {
  
  @JSImport("terra-content-container/lib/ContentContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ContentContainer.type): SharedBuilder_ContentContainerProps1145292616 = new SharedBuilder_ContentContainerProps1145292616(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ContentContainerProps): SharedBuilder_ContentContainerProps1145292616 = new SharedBuilder_ContentContainerProps1145292616(js.Array(this.component, p.asInstanceOf[js.Any]))
}
