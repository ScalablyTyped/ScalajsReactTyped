package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsSetRefMod {
  
  @JSImport("@material-ui/core/utils/setRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  inline def default[T](ref: RefHandle[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default[T](ref: RefHandle[T], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](ref: js.Function1[/* instance */ T | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default[T](ref: js.Function1[/* instance */ T | Null, Unit], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](ref: Null, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](ref: Unit, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
