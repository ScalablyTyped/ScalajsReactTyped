package typingsJapgolly.nightwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EnhancedPageObject[Commands, Elements, Sections /* <: typingsJapgolly.nightwatch.mod.EnhancedPageObjectSections */] = typingsJapgolly.nightwatch.mod.Nightwatch with typingsJapgolly.nightwatch.mod.SharedCommands with typingsJapgolly.nightwatch.mod.NightwatchCustomCommands with Commands with typingsJapgolly.nightwatch.AnonElements[Sections]
  type EnhancedSectionInstance[Commands, Elements, Sections] = typingsJapgolly.nightwatch.mod.EnhancedPageObject[Commands, Elements, Sections]
  type NightwatchAssert = js.Function6[
    /* passed */ scala.Boolean, 
    /* receivedValue */ js.UndefOr[js.Any], 
    /* expectedValue */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    /* abortOnFailure */ js.UndefOr[scala.Boolean], 
    /* originalStackTrace */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type NightwatchTest = js.Function1[/* browser */ typingsJapgolly.nightwatch.mod.NightwatchBrowser, scala.Unit]
  type NightwatchTestHook = (js.Function2[
    /* browser */ typingsJapgolly.nightwatch.mod.NightwatchBrowser, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]) | (js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], scala.Unit])
  type NightwatchTestSettings = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.nightwatch.mod.NightwatchTestSettingScreenshots]
}
