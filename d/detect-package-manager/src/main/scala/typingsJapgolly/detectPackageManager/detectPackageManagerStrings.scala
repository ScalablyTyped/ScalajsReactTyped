package typingsJapgolly.detectPackageManager

import typingsJapgolly.detectPackageManager.mod.PM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detectPackageManagerStrings {
  
  @js.native
  sealed trait npm
    extends StObject
       with PM
  inline def npm: npm = "npm".asInstanceOf[npm]
  
  @js.native
  sealed trait pnpm
    extends StObject
       with PM
  inline def pnpm: pnpm = "pnpm".asInstanceOf[pnpm]
  
  @js.native
  sealed trait yarn
    extends StObject
       with PM
  inline def yarn: yarn = "yarn".asInstanceOf[yarn]
}
