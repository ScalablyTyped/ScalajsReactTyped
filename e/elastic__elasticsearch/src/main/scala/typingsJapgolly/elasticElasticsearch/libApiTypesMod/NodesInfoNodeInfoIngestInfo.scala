package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoIngestInfo extends StObject {
  
  var downloader: NodesInfoNodeInfoIngestDownloader
}
object NodesInfoNodeInfoIngestInfo {
  
  inline def apply(downloader: NodesInfoNodeInfoIngestDownloader): NodesInfoNodeInfoIngestInfo = {
    val __obj = js.Dynamic.literal(downloader = downloader.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoIngestInfo]
  }
  
  extension [Self <: NodesInfoNodeInfoIngestInfo](x: Self) {
    
    inline def setDownloader(value: NodesInfoNodeInfoIngestDownloader): Self = StObject.set(x, "downloader", value.asInstanceOf[js.Any])
  }
}
