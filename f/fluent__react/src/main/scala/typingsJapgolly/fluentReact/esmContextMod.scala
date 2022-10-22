package typingsJapgolly.fluentReact

import typingsJapgolly.fluentReact.esmLocalizationMod.ReactLocalization
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmContextMod {
  
  @JSImport("@fluent/react/esm/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluent/react/esm/context", "FluentContext")
  @js.native
  def FluentContext: Context[ReactLocalization | Null] = js.native
  inline def FluentContext_=(x: Context[ReactLocalization | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FluentContext")(x.asInstanceOf[js.Any])
}
