package typingsJapgolly.recompose

import typingsJapgolly.recompose.mod.ComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#compose
object composeMod {
  
  @JSImport("recompose/compose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TInner, TOutter](functions: js.Function*): ComponentEnhancer[TInner, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(functions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ComponentEnhancer[TInner, TOutter]]
}
