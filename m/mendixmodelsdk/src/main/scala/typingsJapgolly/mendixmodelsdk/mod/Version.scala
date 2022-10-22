package typingsJapgolly.mendixmodelsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "Version")
@js.native
open class Version protected ()
  extends typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Version {
  def this(major: Double, minor: Double, patch: Double) = this()
}
/* static members */
object Version {
  
  @JSImport("mendixmodelsdk", "Version")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mendixmodelsdk", "Version.memoisMap")
  @js.native
  def memoisMap: Any = js.native
  inline def memoisMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memoisMap")(x.asInstanceOf[js.Any])
  
  /**
    * Parses and @returns the given string as a Version object.
    *
    * This function is memoised to keep memory and time consumption low,
    * given that only a handful of versions exist at any time anyway.
    */
  inline def parse(versionString: String): typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.Version = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(versionString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.Version]
}
