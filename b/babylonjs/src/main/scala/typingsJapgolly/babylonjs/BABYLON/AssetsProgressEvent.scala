package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetsProgressEvent
  extends StObject
     with IAssetsProgressEvent
object AssetsProgressEvent {
  
  inline def apply(remainingCount: Double, task: AbstractAssetTask, totalCount: Double): AssetsProgressEvent = {
    val __obj = js.Dynamic.literal(remainingCount = remainingCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetsProgressEvent]
  }
}
