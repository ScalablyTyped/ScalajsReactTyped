package typingsJapgolly.rcResizeObserver.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcResizeObserver.esCollectionMod.ResizeInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CollectionProps103484790 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def onBatchResize(value: /* resizeInfo */ js.Array[ResizeInfo] => Callback): this.type = set("onBatchResize", js.Any.fromFunction1((t0: /* resizeInfo */ js.Array[ResizeInfo]) => value(t0).runNow()))
}
