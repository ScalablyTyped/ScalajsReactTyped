package typingsJapgolly.snyk

import typingsJapgolly.snyk.distLibPackageManagersMod.SupportedPackageManagers
import typingsJapgolly.snyk.distLibPolicyFindAndLoadPolicyMod.Policy
import typingsJapgolly.snyk.distLibTypesMod.PolicyOptions
import typingsJapgolly.snyk.snykStrings.cpp
import typingsJapgolly.snyk.snykStrings.docker
import typingsJapgolly.snyk.snykStrings.iac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPolicyMod {
  
  @JSImport("snyk/dist/lib/policy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findAndLoadPolicy(root: String, scanType: docker | iac | cpp, options: PolicyOptions): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(
    root: String,
    scanType: docker | iac | cpp,
    options: PolicyOptions,
    pkg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageExpanded */ Any
  ): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(
    root: String,
    scanType: docker | iac | cpp,
    options: PolicyOptions,
    pkg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageExpanded */ Any,
    scannedProjectFolder: String
  ): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any], scannedProjectFolder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(
    root: String,
    scanType: docker | iac | cpp,
    options: PolicyOptions,
    pkg: Unit,
    scannedProjectFolder: String
  ): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any], scannedProjectFolder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(root: String, scanType: SupportedPackageManagers, options: PolicyOptions): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(
    root: String,
    scanType: SupportedPackageManagers,
    options: PolicyOptions,
    pkg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageExpanded */ Any
  ): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(
    root: String,
    scanType: SupportedPackageManagers,
    options: PolicyOptions,
    pkg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageExpanded */ Any,
    scannedProjectFolder: String
  ): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any], scannedProjectFolder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(
    root: String,
    scanType: SupportedPackageManagers,
    options: PolicyOptions,
    pkg: Unit,
    scannedProjectFolder: String
  ): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any], scannedProjectFolder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  
  inline def pluckPolicies(
    pkg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageExpanded */ Any
  ): js.Array[String] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("pluckPolicies")(pkg.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | String]
}
