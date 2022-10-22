package typingsJapgolly.useSidecar

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import typingsJapgolly.useSidecar.anon.PartialIConfig
import typingsJapgolly.useSidecar.distEs5RenderPropMod.CombinedProps
import typingsJapgolly.useSidecar.distEs5TypesMod.Importer
import typingsJapgolly.useSidecar.distEs5TypesMod.MiddlewareCallback
import typingsJapgolly.useSidecar.distEs5TypesMod.SideCarComponent
import typingsJapgolly.useSidecar.distEs5TypesMod.SideCarHOC
import typingsJapgolly.useSidecar.distEs5TypesMod.SideCarMedium
import typingsJapgolly.useSidecar.distEs5TypesMod.SideCarMediumOptions
import typingsJapgolly.useSidecar.distEs5TypesMod.SideMedium
import typingsJapgolly.useSidecar.useSidecarStrings.sideCar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-sidecar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMedium[T](): SideMedium[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMedium")().asInstanceOf[SideMedium[T]]
  inline def createMedium[T](defaults: T): SideMedium[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMedium")(defaults.asInstanceOf[js.Any]).asInstanceOf[SideMedium[T]]
  inline def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMedium")(defaults.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[SideMedium[T]]
  inline def createMedium[T](defaults: Unit, middleware: MiddlewareCallback[T]): SideMedium[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMedium")(defaults.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[SideMedium[T]]
  
  inline def createSidecarMedium[T](): SideCarMedium[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSidecarMedium")().asInstanceOf[SideCarMedium[T]]
  inline def createSidecarMedium[T](options: SideCarMediumOptions): SideCarMedium[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSidecarMedium")(options.asInstanceOf[js.Any]).asInstanceOf[SideCarMedium[T]]
  
  inline def exportSidecar[T](medium: SideCarMedium[T], exported: ComponentType[T]): SideCarComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("exportSidecar")(medium.asInstanceOf[js.Any], exported.asInstanceOf[js.Any])).asInstanceOf[SideCarComponent[T]]
  
  inline def renderCar[T /* <: js.Array[Any] */, K, C](WrappedComponent: C, defaults: js.Function1[/* props */ K, T]): js.Function1[/* props */ CombinedProps[T, K], Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCar")(WrappedComponent.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ CombinedProps[T, K], Element]]
  
  inline def setConfig(conf: PartialIConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(conf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sidecar[T](importer: Importer[T]): FunctionComponent[(Omit[T, sideCar]) & (SideCarHOC[Omit[T, sideCar]])] = ^.asInstanceOf[js.Dynamic].applyDynamic("sidecar")(importer.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[(Omit[T, sideCar]) & (SideCarHOC[Omit[T, sideCar]])]]
  inline def sidecar[T](importer: Importer[T], errorComponent: Node): FunctionComponent[(Omit[T, sideCar]) & (SideCarHOC[Omit[T, sideCar]])] = (^.asInstanceOf[js.Dynamic].applyDynamic("sidecar")(importer.asInstanceOf[js.Any], errorComponent.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[(Omit[T, sideCar]) & (SideCarHOC[Omit[T, sideCar]])]]
  
  inline def useSidecar[T](importer: Importer[T]): js.Tuple2[ComponentType[T] | Null, js.Error | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSidecar")(importer.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[ComponentType[T] | Null, js.Error | Null]]
  inline def useSidecar[T](importer: Importer[T], effect: SideMedium[Any]): js.Tuple2[ComponentType[T] | Null, js.Error | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSidecar")(importer.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ComponentType[T] | Null, js.Error | Null]]
}
