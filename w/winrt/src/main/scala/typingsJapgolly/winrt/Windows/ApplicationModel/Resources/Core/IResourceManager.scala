package typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceManager extends js.Object {
  var allResourceMaps: IMapView[String, ResourceMap]
  var defaultContext: ResourceContext
  var mainResourceMap: ResourceMap
  def loadPriFiles(files: IIterable[IStorageFile]): Unit
  def unloadPriFiles(files: IIterable[IStorageFile]): Unit
}

object IResourceManager {
  @scala.inline
  def apply(
    allResourceMaps: IMapView[String, ResourceMap],
    defaultContext: ResourceContext,
    loadPriFiles: IIterable[IStorageFile] => Callback,
    mainResourceMap: ResourceMap,
    unloadPriFiles: IIterable[IStorageFile] => Callback
  ): IResourceManager = {
    val __obj = js.Dynamic.literal(allResourceMaps = allResourceMaps.asInstanceOf[js.Any], defaultContext = defaultContext.asInstanceOf[js.Any], mainResourceMap = mainResourceMap.asInstanceOf[js.Any])
    __obj.updateDynamic("loadPriFiles")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[typingsJapgolly.winrt.Windows.Storage.IStorageFile]) => loadPriFiles(t0).runNow()))
    __obj.updateDynamic("unloadPriFiles")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[typingsJapgolly.winrt.Windows.Storage.IStorageFile]) => unloadPriFiles(t0).runNow()))
    __obj.asInstanceOf[IResourceManager]
  }
}

