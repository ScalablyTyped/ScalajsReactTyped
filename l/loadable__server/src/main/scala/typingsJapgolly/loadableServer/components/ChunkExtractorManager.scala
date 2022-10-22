package typingsJapgolly.loadableServer.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.loadableServer.mod.ChunkExtractor
import typingsJapgolly.loadableServer.mod.ChunkExtractorManagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChunkExtractorManager {
  
  inline def apply(extractor: ChunkExtractor): Default[typingsJapgolly.loadableServer.mod.ChunkExtractorManager] = {
    val __props = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any])
    new Default[typingsJapgolly.loadableServer.mod.ChunkExtractorManager](js.Array(this.component, __props.asInstanceOf[ChunkExtractorManagerProps]))
  }
  
  @JSImport("@loadable/server", "ChunkExtractorManager")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ChunkExtractorManagerProps): Default[typingsJapgolly.loadableServer.mod.ChunkExtractorManager] = new Default[typingsJapgolly.loadableServer.mod.ChunkExtractorManager](js.Array(this.component, p.asInstanceOf[js.Any]))
}
