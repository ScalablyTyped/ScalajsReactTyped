package typingsJapgolly.ngPackagr

import typingsJapgolly.ngPackagr.libNgPackageEntryPointEntryPointMod.NgEntryPoint
import typingsJapgolly.ngPackagr.ngPackageDotschemaMod.AssetPattern
import typingsJapgolly.ngPackagr.ngPackagrStrings.css
import typingsJapgolly.ngPackagr.ngPackagrStrings.less
import typingsJapgolly.ngPackagr.ngPackagrStrings.sass
import typingsJapgolly.ngPackagr.ngPackagrStrings.scss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackagePackageMod {
  
  @JSImport("ng-packagr/lib/ng-package/package", "NgPackage")
  @js.native
  open class NgPackage protected () extends StObject {
    def this(basePath: String, /**
      * A reference to the primary entry point.
      */
    primary: NgEntryPoint) = this()
    def this(
      basePath: String,
      /**
      * A reference to the primary entry point.
      */
    primary: NgEntryPoint,
      /**
      * An array of secondary entry points.
      */
    secondaries: js.Array[NgEntryPoint]
    ) = this()
    
    def allowedNonPeerDependencies: js.Array[String] = js.native
    
    def assets: js.Array[AssetPattern] = js.native
    
    /* private */ val basePath: Any = js.native
    
    /** Delete output path before build */
    def deleteDestPath: Boolean = js.native
    
    /** Absolute path of the package's destination directory. */
    def dest: String = js.native
    
    def entryPoint(moduleId: String): NgEntryPoint = js.native
    
    def inlineStyleLanguage: js.UndefOr[css | less | sass | scss] = js.native
    
    def keepLifecycleScripts: Boolean = js.native
    
    /**
      * A reference to the primary entry point.
      */
    val primary: NgEntryPoint = js.native
    
    /**
      * An array of secondary entry points.
      */
    val secondaries: js.Array[NgEntryPoint] = js.native
    
    /** Absolute path of the package's source folder, derived from the user's (primary) package location. */
    def src: String = js.native
  }
}
