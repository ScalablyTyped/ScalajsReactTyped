package typingsJapgolly.expoModulesAutolinking

import typingsJapgolly.expoModulesAutolinking.buildTypesMod.SupportedPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoModulesAutolinkingStrings {
  
  @js.native
  sealed trait android
    extends StObject
       with SupportedPlatform
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait ios
    extends StObject
       with SupportedPlatform
  inline def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait web
    extends StObject
       with SupportedPlatform
  inline def web: web = "web".asInstanceOf[web]
}
