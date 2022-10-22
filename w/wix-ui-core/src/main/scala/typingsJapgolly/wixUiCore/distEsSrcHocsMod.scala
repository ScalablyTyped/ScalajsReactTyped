package typingsJapgolly.wixUiCore

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.wixUiCore.anon.ShouldLoadAsync
import typingsJapgolly.wixUiCore.distEsSrcHocsEllipsedTooltipWithEllipsedTooltipMod.WrapperComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcHocsMod {
  
  @JSImport("wix-ui-core/dist/es/src/hocs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withEllipsedTooltip(): js.Function1[/* Comp */ Any, FunctionComponent[WrapperComponentProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withEllipsedTooltip")().asInstanceOf[js.Function1[/* Comp */ Any, FunctionComponent[WrapperComponentProps]]]
  inline def withEllipsedTooltip(hasShowTooltipShouldLoadAsyncTooltipProps: ShouldLoadAsync): js.Function1[/* Comp */ Any, FunctionComponent[WrapperComponentProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withEllipsedTooltip")(hasShowTooltipShouldLoadAsyncTooltipProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Comp */ Any, FunctionComponent[WrapperComponentProps]]]
  
  inline def withFocusable(Component: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withFocusable")(Component.asInstanceOf[js.Any]).asInstanceOf[Any]
}
