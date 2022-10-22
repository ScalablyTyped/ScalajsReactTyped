package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableConnectableMod.ConnectableConfig
import typingsJapgolly.rxjs.distTypesInternalTypesMod.Connectable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservableConnectableMod {
  
  @JSImport("rxjs/internal/observable/connectable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectable[T](source: ObservableInput[T]): Connectable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectable")(source.asInstanceOf[js.Any]).asInstanceOf[Connectable[T]]
  inline def connectable[T](source: ObservableInput[T], config: ConnectableConfig[T]): Connectable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("connectable")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Connectable[T]]
}
