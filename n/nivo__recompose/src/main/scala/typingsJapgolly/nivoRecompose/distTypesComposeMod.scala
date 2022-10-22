package typingsJapgolly.nivoRecompose

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComposeMod {
  
  @JSImport("@nivo/recompose/dist/types/compose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compose[TInner, TOuter](funcs: js.Function*): ComponentEnhancer[TInner, TOuter] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ComponentEnhancer[TInner, TOuter]]
  
  type ComponentEnhancer[TInner, TOuter] = js.Function1[/* component */ ComponentType[TInner], ComponentClassP[TOuter & js.Object]]
}
