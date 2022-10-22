package typingsJapgolly.playcanvas.global.pc

import typingsJapgolly.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../framework/app-base.js').AppBase} AppBase */
/**
  * Container for all {@link ScriptType}s that are available to this application. Note that
  * PlayCanvas scripts can access the Script Registry from inside the application with
  * {@link AppBase#scripts}.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.ScriptRegistry")
@js.native
open class ScriptRegistry protected ()
  extends typingsJapgolly.playcanvas.mod.ScriptRegistry {
  /**
    * Create a new ScriptRegistry instance.
    *
    * @param {AppBase} app - Application to attach registry to.
    */
  def this(app: AppBase) = this()
}
