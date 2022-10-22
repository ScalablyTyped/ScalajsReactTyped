package typingsJapgolly.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.snyk.anon.Issues
import typingsJapgolly.snyk.anon.Patched
import typingsJapgolly.snyk.anon.Paths
import typingsJapgolly.snyk.distLibSnykTestLegacyMod.^
import typingsJapgolly.snyk.distLibTypesMod.Options
import typingsJapgolly.snyk.distLibTypesMod.SupportedProjectTypes
import typingsJapgolly.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convertTestDepGraphResultToLegacy(
  res: TestDepGraphResponse,
  depGraph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify depGraphLib.DepGraph */ Any,
  packageManager: Unit,
  options: Options & TestOptions
): LegacyVulnApiResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTestDepGraphResultToLegacy")(res.asInstanceOf[js.Any], depGraph.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LegacyVulnApiResult]
inline def convertTestDepGraphResultToLegacy(
  res: TestDepGraphResponse,
  depGraph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify depGraphLib.DepGraph */ Any,
  packageManager: SupportedProjectTypes,
  options: Options & TestOptions
): LegacyVulnApiResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTestDepGraphResultToLegacy")(res.asInstanceOf[js.Any], depGraph.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LegacyVulnApiResult]

type AffectedPackages = StringDictionary[Issues]

type CallPath = js.Array[String]

type DependencyPins = StringDictionary[PinRemediation]

type DependencyUpdates = StringDictionary[UpgradeRemediation]

type Ignores = StringDictionary[Paths]

type PatchObject = StringDictionary[Patched]
