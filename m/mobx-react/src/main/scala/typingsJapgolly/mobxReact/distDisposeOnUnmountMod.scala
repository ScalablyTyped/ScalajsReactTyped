package typingsJapgolly.mobxReact

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisposeOnUnmountMod {
  
  @JSImport("mobx-react/dist/disposeOnUnmount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disposeOnUnmount(target: Component[Any & js.Object, js.Object], propertyKey: PropertyKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disposeOnUnmount")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def disposeOnUnmount_TF_TF[TF /* <: Disposer | js.Array[Disposer] */](target: Component[Any & js.Object, js.Object], fn: TF): TF = (^.asInstanceOf[js.Dynamic].applyDynamic("disposeOnUnmount")(target.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[TF]
  
  type Disposer = js.Function0[Unit]
}
