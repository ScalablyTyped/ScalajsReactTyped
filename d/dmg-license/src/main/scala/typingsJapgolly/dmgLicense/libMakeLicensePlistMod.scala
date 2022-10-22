package typingsJapgolly.dmgLicense

import typingsJapgolly.dmgLicense.libAssembleLicensesMod.AssembledLicenseSet
import typingsJapgolly.plist.mod.PlistObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMakeLicensePlistMod {
  
  @JSImport("dmg-license/lib/makeLicensePlist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(licenses: AssembledLicenseSet, context: typingsJapgolly.dmgLicense.libContextMod.default): PlistObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(licenses.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[PlistObject]
}
