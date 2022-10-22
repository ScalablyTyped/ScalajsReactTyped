package typingsJapgolly.playcanvas.global.pc

import typingsJapgolly.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../framework/components/camera/component.js').CameraComponent} CameraComponent */
/** @typedef {import('../framework/app-base.js').AppBase} AppBase */
/** @typedef {import('../framework/entity.js').Entity} Entity */
/**
  * Callback used by {@link XrManager#endXr} and {@link XrManager#startXr}.
  *
  * @callback XrErrorCallback
  * @param {Error|null} err - The Error object or null if operation was successful.
  */
/**
  * Manage and update XR session and its states.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.XrManager")
@js.native
open class XrManager protected ()
  extends typingsJapgolly.playcanvas.mod.XrManager {
  /**
    * Create a new XrManager instance.
    *
    * @param {AppBase} app - The main application.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
}
