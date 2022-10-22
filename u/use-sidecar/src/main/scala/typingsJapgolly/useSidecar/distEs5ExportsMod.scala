package typingsJapgolly.useSidecar

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.useSidecar.distEs5TypesMod.SideCarComponent
import typingsJapgolly.useSidecar.distEs5TypesMod.SideCarMedium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5ExportsMod {
  
  @JSImport("use-sidecar/dist/es5/exports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exportSidecar[T](medium: SideCarMedium[T], exported: ComponentType[T]): SideCarComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("exportSidecar")(medium.asInstanceOf[js.Any], exported.asInstanceOf[js.Any])).asInstanceOf[SideCarComponent[T]]
}
