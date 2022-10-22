package typingsJapgolly.storybookApi

import typingsJapgolly.react.mod.Context
import typingsJapgolly.storybookApi.anon.Api
import typingsJapgolly.storybookApi.mod.Combo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ContextMod {
  
  @JSImport("@storybook/api/dist/ts3.9/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContext(hasApiState: Combo): Context[Api] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(hasApiState.asInstanceOf[js.Any]).asInstanceOf[Context[Api]]
}
