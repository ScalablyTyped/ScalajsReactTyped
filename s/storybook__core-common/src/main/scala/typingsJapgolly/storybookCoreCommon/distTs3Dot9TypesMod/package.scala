package typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod

import typingsJapgolly.std.Record
import typingsJapgolly.storybookCoreCommon.anon.Disable
import typingsJapgolly.storybookCoreCommon.anon.Name
import typingsJapgolly.storybookCoreCommon.anon.NameOptions
import typingsJapgolly.storybookCoreCommon.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.BuilderName
  - typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.BuilderConfigObject
  - typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.Webpack4BuilderConfig
  - typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.Webpack5BuilderConfig
*/
type BuilderConfig = _BuilderConfig | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.webpack4
  - typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.webpack5
  - java.lang.String
*/
type BuilderName = _BuilderName | String

type Entry = String

type Preset = String | Name

type PresetConfig = String | NameOptions

type StoriesEntry = String | StoriesSpecifier

type StorybookRefs = Record[String, Title | Disable]
