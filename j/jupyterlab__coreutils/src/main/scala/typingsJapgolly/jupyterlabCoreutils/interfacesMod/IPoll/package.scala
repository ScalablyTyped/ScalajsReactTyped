package typingsJapgolly.jupyterlabCoreutils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IPoll {
  /**
    * The phase of the poll when the current tick was scheduled.
    *
    * @typeparam T - A type for any additional tick phases a poll supports.
    */
  /* Rewritten from type alias, can be one of: 
    - T
    - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.constructed
    - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.disposed
    - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.reconnected
    - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.refreshed
    - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.rejected
    - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.resolved
    - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.standby
    - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.started
    - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stopped
  */
  type Phase[T /* <: java.lang.String */] = typingsJapgolly.jupyterlabCoreutils.interfacesMod.IPoll._Phase[T] | T
}
