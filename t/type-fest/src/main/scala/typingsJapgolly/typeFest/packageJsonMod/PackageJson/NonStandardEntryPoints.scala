package typingsJapgolly.typeFest.packageJsonMod.PackageJson

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.typeFest.AnonDictmoduleName
import typingsJapgolly.typeFest.typeFestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonStandardEntryPoints extends js.Object {
  /**
  		A hint to JavaScript bundlers or component tools when packaging modules for client side use.
  		*/
  var browser: js.UndefOr[String | (StringDictionary[String | `false`])] = js.undefined
  /**
  		A module ID with untranspiled code that is the primary entry point to the program.
  		*/
  var esnext: js.UndefOr[String | AnonDictmoduleName] = js.undefined
  /**
  		An ECMAScript module ID that is the primary entry point to the program.
  		*/
  var module: js.UndefOr[String] = js.undefined
}

object NonStandardEntryPoints {
  @scala.inline
  def apply(
    browser: String | (StringDictionary[String | `false`]) = null,
    esnext: String | AnonDictmoduleName = null,
    module: String = null
  ): NonStandardEntryPoints = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (esnext != null) __obj.updateDynamic("esnext")(esnext.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonStandardEntryPoints]
  }
}

