package typingsJapgolly.egg.mod

import typingsJapgolly.eggCore.mod.EggCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("egg", "AppWorkerLoader")
@js.native
open class AppWorkerLoader protected ()
  extends typingsJapgolly.eggCore.mod.EggLoader[
      EggCore[typingsJapgolly.eggCore.mod.PlainObject[Any]], 
      Any, 
      typingsJapgolly.eggCore.mod.EggLoaderOptions
    ] {
  /**
    * @constructor
    * @param {Object} options - options
    * @param {String} options.baseDir - the directory of application
    * @param {EggCore} options.app - Application instance
    * @param {Logger} options.logger - logger
    * @param {Object} [options.plugins] - custom plugins
    * @since 1.0.0
    */
  def this(options: typingsJapgolly.eggCore.mod.EggLoaderOptions) = this()
  
  def load(): Unit = js.native
}
