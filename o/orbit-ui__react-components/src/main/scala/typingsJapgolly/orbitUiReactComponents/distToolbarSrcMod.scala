package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distToolbarSrcToolbarContextMod.ClearToolbarProps
import typingsJapgolly.orbitUiReactComponents.distToolbarSrcToolbarContextMod.ToolbarContextType
import typingsJapgolly.orbitUiReactComponents.distToolbarSrcToolbarContextMod.UseToolbarPropsReturn
import typingsJapgolly.orbitUiReactComponents.distToolbarSrcToolbarMod.InnerToolbarProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToolbarSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/toolbar/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ClearToolbar(hasChildren: ClearToolbarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearToolbar")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerToolbar(
    hasAutoFocusOrientationAlignVerticalAlignGapWrapDisabledAsChildrenForwardedRefRest: InnerToolbarProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerToolbar")(hasAutoFocusOrientationAlignVerticalAlignGapWrapDisabledAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/toolbar/src", "Toolbar")
  @js.native
  val Toolbar: OrbitComponent[HTMLElement, InnerToolbarProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/toolbar/src", "ToolbarContext")
  @js.native
  val ToolbarContext: Context[ToolbarContextType] = js.native
  
  inline def useToolbarContext(): js.Tuple2[ToolbarContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useToolbarContext")().asInstanceOf[js.Tuple2[ToolbarContextType, Boolean]]
  
  inline def useToolbarProps(): js.Tuple2[UseToolbarPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useToolbarProps")().asInstanceOf[js.Tuple2[UseToolbarPropsReturn, Boolean]]
}
