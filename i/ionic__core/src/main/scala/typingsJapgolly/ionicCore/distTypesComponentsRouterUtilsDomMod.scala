package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.anon.Ids
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteChain
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRouterUtilsDomMod {
  
  @JSImport("@ionic/core/dist/types/components/router/utils/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readNavState(): js.Promise[Ids] = ^.asInstanceOf[js.Dynamic].applyDynamic("readNavState")().asInstanceOf[js.Promise[Ids]]
  inline def readNavState(root: HTMLElement): js.Promise[Ids] = ^.asInstanceOf[js.Dynamic].applyDynamic("readNavState")(root.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Ids]]
  
  inline def waitUntilNavNode(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilNavNode")().asInstanceOf[js.Promise[Unit]]
  
  inline def writeNavState(root: HTMLElement, chain: RouteChain, direction: RouterDirection, index: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeNavState")(root.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def writeNavState(root: HTMLElement, chain: RouteChain, direction: RouterDirection, index: Double, changed: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeNavState")(root.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], index.asInstanceOf[js.Any], changed.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def writeNavState(
    root: HTMLElement,
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: Boolean,
    animation: AnimationBuilder
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeNavState")(root.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], index.asInstanceOf[js.Any], changed.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def writeNavState(
    root: HTMLElement,
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: Unit,
    animation: AnimationBuilder
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeNavState")(root.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], index.asInstanceOf[js.Any], changed.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def writeNavState(root: Unit, chain: RouteChain, direction: RouterDirection, index: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeNavState")(root.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def writeNavState(root: Unit, chain: RouteChain, direction: RouterDirection, index: Double, changed: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeNavState")(root.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], index.asInstanceOf[js.Any], changed.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def writeNavState(
    root: Unit,
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: Boolean,
    animation: AnimationBuilder
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeNavState")(root.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], index.asInstanceOf[js.Any], changed.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def writeNavState(
    root: Unit,
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: Unit,
    animation: AnimationBuilder
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeNavState")(root.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], index.asInstanceOf[js.Any], changed.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
