package typingsJapgolly.reduxLocalstorageFilter

import typingsJapgolly.reduxLocalstorage.mod.StorageAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-localstorage-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[/* adapter */ StorageAdapter[Any], StorageAdapter[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* adapter */ StorageAdapter[Any], StorageAdapter[Any]]]
  inline def default(paths: String): js.Function1[/* adapter */ StorageAdapter[Any], StorageAdapter[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(paths.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* adapter */ StorageAdapter[Any], StorageAdapter[Any]]]
  inline def default(paths: js.Array[String]): js.Function1[/* adapter */ StorageAdapter[Any], StorageAdapter[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(paths.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* adapter */ StorageAdapter[Any], StorageAdapter[Any]]]
  
  inline def getSubset(obj: Any, paths: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubset")(obj.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[Any]
}
