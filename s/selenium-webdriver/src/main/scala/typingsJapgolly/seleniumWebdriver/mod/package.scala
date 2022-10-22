package typingsJapgolly.seleniumWebdriver.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.IBrowser
import typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.ICapability
import typingsJapgolly.seleniumWebdriver.libInputMod.IKey
import typingsJapgolly.seleniumWebdriver.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Browser: IBrowser = ^.asInstanceOf[js.Dynamic].selectDynamic("Browser").asInstanceOf[IBrowser]

inline def Capability: ICapability = ^.asInstanceOf[js.Dynamic].selectDynamic("Capability").asInstanceOf[ICapability]

inline def Key: IKey = ^.asInstanceOf[js.Dynamic].selectDynamic("Key").asInstanceOf[IKey]

inline def checkedLocator(locator: Locator): typingsJapgolly.seleniumWebdriver.libByMod.By | js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("checkedLocator")(locator.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.seleniumWebdriver.libByMod.By | js.Function]

inline def escapeCss(css: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeCss")(css.asInstanceOf[js.Any]).asInstanceOf[String]

inline def locateWith(by: Locator): typingsJapgolly.seleniumWebdriver.libByMod.RelativeBy = ^.asInstanceOf[js.Dynamic].applyDynamic("locateWith")(by.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.seleniumWebdriver.libByMod.RelativeBy]

inline def withTagName(tagName: typingsJapgolly.seleniumWebdriver.libByMod.By): typingsJapgolly.seleniumWebdriver.libByMod.RelativeBy = ^.asInstanceOf[js.Dynamic].applyDynamic("withTagName")(tagName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.seleniumWebdriver.libByMod.RelativeBy]

type ConditionFn[T] = js.Function1[/* webdriver */ WebDriver, T | Null | (js.Promise[T | Null])]

type IWebElementId = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.seleniumWebdriver.libByMod.By
  - js.Function
  - typingsJapgolly.seleniumWebdriver.libByMod.ByHash
  - typingsJapgolly.seleniumWebdriver.libByMod.RelativeBy
*/
type Locator = _Locator | js.Function
