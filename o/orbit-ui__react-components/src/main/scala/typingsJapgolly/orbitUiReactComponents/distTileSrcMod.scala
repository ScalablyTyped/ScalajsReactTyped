package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distTileSrcTileGroupMod.InnerTileGroupProps
import typingsJapgolly.orbitUiReactComponents.distTileSrcTileLinkMod.InnerTileLinkProps
import typingsJapgolly.orbitUiReactComponents.distTileSrcTileMod.InnerTileProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTileSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/tile/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTile(props: InnerTileProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTile")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTileGroup(
    hasValueDefaultValueSelectionModeRowSizeOnChangeOrientationDisabledChildrenForwardedRefRest: InnerTileGroupProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTileGroup")(hasValueDefaultValueSelectionModeRowSizeOnChangeOrientationDisabledChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTileLink(hasOrientationDisabledActiveFocusHoverChildrenForwardedRefRest: InnerTileLinkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTileLink")(hasOrientationDisabledActiveFocusHoverChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tile/src", "Tile")
  @js.native
  val Tile: OrbitComponent[HTMLElement, InnerTileProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tile/src", "TileGroup")
  @js.native
  val TileGroup: OrbitComponent[HTMLElement, InnerTileGroupProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tile/src", "TileLink")
  @js.native
  val TileLink: OrbitComponent[HTMLElement, InnerTileLinkProps] = js.native
}
