package typingsJapgolly.appBuilderLib.fileMatcherMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileMatchersOptions extends js.Object {
  val customBuildOptions: PlatformSpecificBuildOptions
  val defaultSrc: String
  val globalOutDir: String
  def macroExpander(pattern: String): String
}

object GetFileMatchersOptions {
  @scala.inline
  def apply(
    customBuildOptions: PlatformSpecificBuildOptions,
    defaultSrc: String,
    globalOutDir: String,
    macroExpander: String => CallbackTo[String]
  ): GetFileMatchersOptions = {
    val __obj = js.Dynamic.literal(customBuildOptions = customBuildOptions.asInstanceOf[js.Any], defaultSrc = defaultSrc.asInstanceOf[js.Any], globalOutDir = globalOutDir.asInstanceOf[js.Any])
    __obj.updateDynamic("macroExpander")(js.Any.fromFunction1((t0: java.lang.String) => macroExpander(t0).runNow()))
    __obj.asInstanceOf[GetFileMatchersOptions]
  }
}

