package typingsJapgolly.recompose

import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#componentfromprop
object componentFromPropMod {
  
  @JSImport("recompose/componentFromProp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(propName: String): FunctionComponent[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propName.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[Any]]
}
