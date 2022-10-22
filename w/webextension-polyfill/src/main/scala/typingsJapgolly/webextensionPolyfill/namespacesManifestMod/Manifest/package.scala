package typingsJapgolly.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.ImageData
import typingsJapgolly.std.Record
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.Lessthansignall_urlsGreaterthansign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ExtensionFileUrl = String

type ExtensionID = String

type ExtensionURL = String

type HttpURL = String

type IconImageData = (Record[String, ImageData]) | ImageData

type IconPath = (Record[String, ExtensionFileUrl]) | ExtensionFileUrl

type ImageDataOrExtensionURL = String

type KeyName = String

type MatchPattern = Lessthansignall_urlsGreaterthansign | MatchPatternRestricted | MatchPatternUnestricted

/**
  * Same as MatchPattern above, but excludes <all_urls>
  */
type MatchPatternRestricted = String

/**
  * Mostly unrestricted match patterns for privileged add-ons. This should technically be rejected for unprivileged add-ons,
  * but, reasons. The MatchPattern class will still refuse privileged schemes for those extensions.
  */
type MatchPatternUnestricted = String

type OptionalPermissionOrOrigin = OptionalPermission | MatchPattern

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webextensionPolyfill.namespacesManifestMod.Manifest.PermissionNoPrompt
  - typingsJapgolly.webextensionPolyfill.namespacesManifestMod.Manifest.OptionalPermission
  - java.lang.String
*/
type Permission = _Permission | String

type PermissionOrOrigin = Permission | MatchPattern

type Static = StringDictionary[Any]

type ThemeColor = String | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])

type ThemeExperimentColorsType = StringDictionary[Any]

type ThemeExperimentImagesType = StringDictionary[Any]

type ThemeExperimentPropertiesType = StringDictionary[Any]
