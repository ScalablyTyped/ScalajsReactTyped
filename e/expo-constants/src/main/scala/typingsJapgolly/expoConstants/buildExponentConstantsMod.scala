package typingsJapgolly.expoConstants

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.expoModulesCore.buildNativeModulesProxyDottypesMod.ProxyNativeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildExponentConstantsMod extends Shortcut {
  
  @JSImport("expo-constants/build/ExponentConstants", JSImport.Default)
  @js.native
  val default: ProxyNativeModule = js.native
  
  type _To = ProxyNativeModule
  
  /* This means you don't have to write `default`, but can instead just say `buildExponentConstantsMod.foo` */
  override def _to: ProxyNativeModule = default
}
