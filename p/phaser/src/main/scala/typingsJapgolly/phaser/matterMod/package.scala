package typingsJapgolly.phaser.matterMod

import typingsJapgolly.phaser.matterMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


//  --------------------------------------------------------------
//  Modules
//  --------------------------------------------------------------
/**
  * Installs the given plugins on the `Matter` namespace.
  * This is a short-hand for `Plugin.use`, see it for more information.
  * Call this function once at the start of your code, with all of the plugins you wish to install as arguments.
  * Avoid calling this function multiple times unless you intend to manually control installation order.
  * @method use
  * @param ...plugin {Function} The plugin(s) to install on `base` (multi-argument).
  */
inline def use(plugins: (typingsJapgolly.phaser.MatterJS.Plugin | String)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(plugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
