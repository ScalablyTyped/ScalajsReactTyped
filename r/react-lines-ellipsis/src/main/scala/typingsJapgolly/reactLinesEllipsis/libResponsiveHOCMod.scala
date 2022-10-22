package typingsJapgolly.reactLinesEllipsis

import typingsJapgolly.lodash.mod.DebounceSettings
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactLinesEllipsis.anon.InnerRef
import typingsJapgolly.reactLinesEllipsis.mod.CommonReactLinesEllipsisProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResponsiveHOCMod {
  
  inline def apply(): js.Function1[
    /* WrappedComponent */ ComponentType[CommonReactLinesEllipsisProps], 
    ComponentType[CommonReactLinesEllipsisProps & InnerRef]
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function1[
    /* WrappedComponent */ ComponentType[CommonReactLinesEllipsisProps], 
    ComponentType[CommonReactLinesEllipsisProps & InnerRef]
  ]]
  inline def apply(wait: Double): js.Function1[
    /* WrappedComponent */ ComponentType[CommonReactLinesEllipsisProps], 
    ComponentType[CommonReactLinesEllipsisProps & InnerRef]
  ] = ^.asInstanceOf[js.Dynamic].apply(wait.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* WrappedComponent */ ComponentType[CommonReactLinesEllipsisProps], 
    ComponentType[CommonReactLinesEllipsisProps & InnerRef]
  ]]
  inline def apply(wait: Double, debounceOptions: DebounceSettings): js.Function1[
    /* WrappedComponent */ ComponentType[CommonReactLinesEllipsisProps], 
    ComponentType[CommonReactLinesEllipsisProps & InnerRef]
  ] = (^.asInstanceOf[js.Dynamic].apply(wait.asInstanceOf[js.Any], debounceOptions.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* WrappedComponent */ ComponentType[CommonReactLinesEllipsisProps], 
    ComponentType[CommonReactLinesEllipsisProps & InnerRef]
  ]]
  inline def apply(wait: Unit, debounceOptions: DebounceSettings): js.Function1[
    /* WrappedComponent */ ComponentType[CommonReactLinesEllipsisProps], 
    ComponentType[CommonReactLinesEllipsisProps & InnerRef]
  ] = (^.asInstanceOf[js.Dynamic].apply(wait.asInstanceOf[js.Any], debounceOptions.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* WrappedComponent */ ComponentType[CommonReactLinesEllipsisProps], 
    ComponentType[CommonReactLinesEllipsisProps & InnerRef]
  ]]
  
  @JSImport("react-lines-ellipsis/lib/responsiveHOC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
