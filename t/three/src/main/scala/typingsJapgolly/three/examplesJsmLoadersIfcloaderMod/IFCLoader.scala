package typingsJapgolly.three.examplesJsmLoadersIfcloaderMod

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/loaders/IFCLoader", "IFCLoader")
@js.native
open class IFCLoader () extends Loader {
  def this(manager: LoadingManager) = this()
  
  var ifcManager: IFCManager = js.native
  
  def load(url: Any, onLoad: js.Function1[/* ifc */ IFCModel_, Unit]): Unit = js.native
  def load(
    url: Any,
    onLoad: js.Function1[/* ifc */ IFCModel_, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit]
  ): Unit = js.native
  def load(
    url: Any,
    onLoad: js.Function1[/* ifc */ IFCModel_, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): Unit = js.native
  def load(
    url: Any,
    onLoad: js.Function1[/* ifc */ IFCModel_, Unit],
    onProgress: Unit,
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): Unit = js.native
  
  def parse(buffer: js.typedarray.ArrayBuffer): js.Promise[IFCModel_] = js.native
}
