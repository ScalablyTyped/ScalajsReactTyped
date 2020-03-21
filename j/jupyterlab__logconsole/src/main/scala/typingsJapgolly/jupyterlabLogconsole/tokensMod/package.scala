package typingsJapgolly.jupyterlabLogconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tokensMod {
  type ILoggerRegistryChange = typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.append
  type IStateChange = typingsJapgolly.jupyterlabCoreutils.interfacesMod.IChangedArgs[
    typingsJapgolly.jupyterlabRendermime.tokensMod.IRenderMimeRegistry | typingsJapgolly.jupyterlabLogconsole.tokensMod.LogLevel, 
    typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.rendermime | typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.level
  ]
}
