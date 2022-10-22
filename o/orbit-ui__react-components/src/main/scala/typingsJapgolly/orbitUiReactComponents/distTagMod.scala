package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distTagSrcTagListMod.InnerTagListProps
import typingsJapgolly.orbitUiReactComponents.distTagSrcTagMod.InnerTagProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTagMod {
  
  @JSImport("@orbit-ui/react-components/dist/tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTag(hasVariantOnRemoveDisabledFluidSizeActiveFocusHoverAsChildrenForwardedRefRest: InnerTagProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTag")(hasVariantOnRemoveDisabledFluidSizeActiveFocusHoverAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTagList(hasSizeOnRemoveOnClearReadOnlyAsForwardedRefChildrenRest: InnerTagListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTagList")(hasSizeOnRemoveOnClearReadOnlyAsForwardedRefChildrenRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tag", "Tag")
  @js.native
  val Tag: OrbitComponent[HTMLElement, InnerTagProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tag", "TagList")
  @js.native
  val TagList: OrbitComponent[HTMLElement, InnerTagListProps] = js.native
}
