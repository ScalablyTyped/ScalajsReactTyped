package typingsJapgolly.snyk

import typingsJapgolly.snyk.distLibEcosystemsTypesMod.Ecosystem
import typingsJapgolly.snyk.distLibErrorsCustomErrorMod.CustomError
import typingsJapgolly.snyk.distLibPackageManagersMod.SupportedPackageManagers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsNotSupportedByEcosystemMod {
  
  @JSImport("snyk/dist/lib/errors/not-supported-by-ecosystem", "FeatureNotSupportedByEcosystemError")
  @js.native
  open class FeatureNotSupportedByEcosystemError protected () extends CustomError {
    def this(feature: String, ecosystem: Ecosystem) = this()
    def this(feature: String, ecosystem: SupportedPackageManagers) = this()
    
    val feature: String = js.native
  }
}
